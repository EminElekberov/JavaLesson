package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Model.Doctor;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import com.toedter.calendar.JDateChooser;

import Helper.Helper;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;


public class DoctorGui extends JFrame {

	private JPanel w_pane;
	private static Doctor doctor=new Doctor();
	private JTable table_whour;
	private DefaultTableModel whourModel;
	private Object[] whourData=null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoctorGui frame = new DoctorGui(doctor);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public DoctorGui(Doctor doctor) throws SQLException {
		whourModel=new DefaultTableModel();
		Object[] colWhour=new Object[2];
		colWhour[0]="ID";
		colWhour[1]="TARIX";
		whourModel.setColumnIdentifiers(colWhour);
		whourData=new Object[2];
		for(int i=0;i<doctor.getWhourList(doctor.getId()).size();i++) {
			whourData[0]=doctor.getWhourList(doctor.getId()).get(i).getId();
			whourData[1]=doctor.getWhourList(doctor.getId()).get(i).getWdate();
			whourModel.addRow(whourData);
		}
		setResizable(false);
		setTitle("xesdexana yoetim sistemi");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 500);
		w_pane = new JPanel();
		w_pane.setBackground(Color.WHITE);
		w_pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(w_pane);
		w_pane.setLayout(null);
		
		JLabel label = new JLabel("  xosgeldiniz sayin: "+doctor.getName());
		label.setFont(new Font("Tahoma", Font.BOLD, 18));
		label.setBounds(10, 11, 291, 43);
		w_pane.add(label);
		
		JButton button = new JButton("cixis yap");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginGui login=new LoginGui();
				login.setVisible(true);
				dispose();
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 17));
		button.setBounds(626, 14, 108, 36);
		w_pane.add(button);
		
		JTabbedPane w_tab = new JTabbedPane(JTabbedPane.TOP);
		w_tab.setBounds(10, 58, 724, 402);
		w_pane.add(w_tab);
		
		JPanel w_whour = new JPanel();
		w_whour.setBackground(Color.WHITE);
		w_tab.addTab("Calisma saatlari", null, w_whour, null);
		w_whour.setLayout(null);
		
		JDateChooser select_date = new JDateChooser();
		select_date.setBounds(10, 11, 138, 27);
		w_whour.add(select_date);
		
		JComboBox select_time = new JComboBox();
		select_time.setModel(new DefaultComboBoxModel(new String[] {"10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:30", "14:00", "14:30", "15:00"}));
		select_time.setBounds(154, 11, 78, 27);
		w_whour.add(select_time);
		
		JButton btn_addWhour = new JButton("ekle");
		btn_addWhour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
				String date="";
				try {
					date=sdf.format(select_date.getDate());
				}catch(Exception e2) {
					
				}
				if(date.length()==0) {
					Helper.showMsg("lutfen gecerli bir tarih girin");
				}else {
					String time= " "+ select_time.getSelectedItem().toString()+":00";
					String selectDate=date+time;
					try {
						boolean control=doctor.addWHour(doctor.getId(), doctor.getName(), selectDate);
						if(control) {
							Helper.showMsg("success");
							updateWhourModel(doctor); 
						}else {
							Helper.showMsg("error");
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
			}
		});
		btn_addWhour.setBounds(237, 11, 110, 27);
		w_whour.add(btn_addWhour);
		
		JScrollPane w_scroolWhour = new JScrollPane();
		w_scroolWhour.setBounds(0, 54, 719, 320);
		w_whour.add(w_scroolWhour);
		
		table_whour = new JTable(whourModel);
		w_scroolWhour.setViewportView(table_whour);
		
		JButton btn_deleteWhour = new JButton("sil");
		btn_deleteWhour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selRow=table_whour.getSelectedRow();
				if(selRow>=0) {
					String selectRow=table_whour.getModel().getValueAt(selRow, 0).toString();
					int selID=Integer.parseInt(selectRow);
					boolean control;
					try {
					 control=doctor.deleteWhour(selID);
					 if(control) {
						 Helper.showMsg("success");
						 updateWhourModel(doctor);
						 
					 }else {
						 Helper.showMsg("error");
					 }
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else {
					Helper.showMsg("lutfen bir tarix secin");
				}
			}
		});
		btn_deleteWhour.setBounds(570, 11, 139, 27);
		w_whour.add(btn_deleteWhour);
	}
	public void updateWhourModel(Doctor doctor) throws SQLException {
		DefaultTableModel clearModel=(DefaultTableModel) table_whour.getModel();
		clearModel.setRowCount(0);
		for(int i=0;i<doctor.getWhourList(doctor.getId()).size();i++) {
			whourData[0]=doctor.getWhourList(doctor.getId()).get(i).getId();
			whourData[1]=doctor.getWhourList(doctor.getId()).get(i).getWdate();
			whourModel.addRow(whourData);
		}
	}
}
