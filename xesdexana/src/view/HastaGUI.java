package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Helper.Helper;
import Helper.Item;
import Model.Appoinment;
import Model.Clinic;
import Model.Hasta;
import Model.Whour;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JTable;
import java.awt.Font;

public class HastaGUI extends JFrame {

	private JPanel w_pane;
	private static Hasta hasta=new Hasta();
	private Clinic clinic=new Clinic();
	private JTable table_doctor;
	private DefaultTableModel doctorModel;
	private Object[] doctorData=null;
	private JTable table_whour;
	private Whour whour =new Whour();
	private DefaultTableModel whourModel;
	private Object[] whourData=null;
	private int selectDoctorID=0;
	private String selectDoctorName=null;
	private JTable table_appoint;
	private DefaultTableModel appointModel;
	private Object[] appointData=null;
	private Appoinment appoint=new Appoinment();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HastaGUI frame = new HastaGUI(hasta);
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
	public HastaGUI(Hasta hasta) throws SQLException {
		doctorModel=new DefaultTableModel();
		Object[] colDoctor=new Object[2];
		colDoctor[0]="ID";
		colDoctor[1]="AD SOYAD";
		doctorModel.setColumnIdentifiers(colDoctor);
		doctorData=new Object[2];
		
		whourModel=new DefaultTableModel();
		Object[] colWhour=new Object[2];
		colWhour[0]="ID";
		colWhour[1]="Tarix";
		whourModel.setColumnIdentifiers(colWhour);
		whourData=new Object[2];
		
		appointModel=new DefaultTableModel();
		Object[] colAppoint=new Object[3];
		colAppoint[0]="ID";
		colAppoint[1]="Doktor";
		colAppoint[2]="Tarix";
		appointModel.setColumnIdentifiers(colAppoint);
		appointData=new Object[3];
		for(int i=0;i<appoint.getHastaList(hasta.getId()).size();i++) {
			appointData[0]=appoint.getHastaList(hasta.getId()).get(i).getId();
			appointData[1]=appoint.getHastaList(hasta.getId()).get(i).getDoctorName();
			appointData[2]=appoint.getHastaList(hasta.getId()).get(i).getAppDate();
			appointModel.addRow(appointData);
		}
		
		setResizable(false);
		setTitle("xesdexana yonetim sistemi");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750,500);
		w_pane = new JPanel();
		w_pane.setBackground(Color.WHITE);
		w_pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(w_pane);
		w_pane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("xosgeldiniz sayin: "+hasta.getName());
		lblNewLabel.setBounds(10, 11, 190, 24);
		w_pane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("cixis yap");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginGui login=new LoginGui();
				login.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(608, 12, 126, 24);
		w_pane.add(btnNewButton);
		
		JTabbedPane w_tab = new JTabbedPane(JTabbedPane.TOP);
		w_tab.setBounds(10, 44, 724, 416);
		w_pane.add(w_tab);
		
		JPanel w_appointment = new JPanel();
		w_appointment.setBackground(Color.WHITE);
		w_tab.addTab("Randevu Sistemi", null, w_appointment, null);
		w_appointment.setLayout(null);
		
		JScrollPane w_scroolDoctor = new JScrollPane();
		w_scroolDoctor.setBounds(10, 26, 250, 351);
		w_appointment.add(w_scroolDoctor);
		
		table_doctor = new JTable(doctorModel);
		w_scroolDoctor.setViewportView(table_doctor);
		
		JLabel lblNewLabel_1 = new JLabel("doktor listesi");
		lblNewLabel_1.setBounds(10, 0, 87, 25);
		w_appointment.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Poliklinik adi");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(270, 11, 150, 14);
		w_appointment.add(lblNewLabel_2);
		
		JComboBox select_clinic = new JComboBox();
		select_clinic.setBounds(270, 26, 150, 26);
		select_clinic.addItem("--- Poliklinik sec---");
		for(int i=0;i<clinic.getList().size();i++) {
			select_clinic.addItem(new Item(clinic.getList().get(i).getId(),clinic.getList().get(i).getName()));
		}
		select_clinic.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(select_clinic.getSelectedIndex()!=0 ) {
					JComboBox c=(JComboBox) e.getSource();
					Item item=(Item) c.getSelectedItem();
					DefaultTableModel clearModel=(DefaultTableModel) table_doctor.getModel();
					clearModel.setRowCount(0);
					try {
						for(int i=0;i<clinic.getClinicDoctorList(item.getKey()).size();i++) {
							doctorData[0]=clinic.getClinicDoctorList(item.getKey()).get(i).getId();
							doctorData[1]=clinic.getClinicDoctorList(item.getKey()).get(i).getName();
							doctorModel.addRow(doctorData);
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else {
					DefaultTableModel clearModel=(DefaultTableModel) table_doctor.getModel();
					clearModel.setRowCount(0);
				}
			}
			
		});
		w_appointment.add(select_clinic);
		
		JLabel lblNewLabel_3 = new JLabel("doktor sec");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(272, 129, 129, 26);
		w_appointment.add(lblNewLabel_3);
		
		JButton btn_selDoctor = new JButton("sec");
		btn_selDoctor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row=table_doctor.getSelectedRow();
				if(row>=0) {
					String value=table_doctor.getModel().getValueAt(row, 0).toString();
					int id=Integer.parseInt(value);
					DefaultTableModel clearModel=(DefaultTableModel) table_whour.getModel();
					clearModel.setRowCount(0);
					try {
						for(int i=0;i<whour.getWhourList(id).size();i++) {
							whourData[0]=whour.getWhourList(id).get(i).getId();
							whourData[1]=whour.getWhourList(id).get(i).getWdate();
							whourModel.addRow(whourData);
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					table_whour.setModel(whourModel);
					selectDoctorID=id;
					selectDoctorName=table_doctor.getModel().getValueAt(row, 1).toString();
					//System.out.println(selectDoctorID+" - "+selectDoctorName);
				}else {
					Helper.showMsg("lutfen bir doktor secin");;
				}
			}
		});
		btn_selDoctor.setBounds(270, 153, 150, 31);
		w_appointment.add(btn_selDoctor);
		
		JLabel lblUygunSaatlar = new JLabel("uygun saatlar");
		lblUygunSaatlar.setBounds(459, 0, 87, 25);
		w_appointment.add(lblUygunSaatlar);
		
		JScrollPane w_scroolWhour = new JScrollPane();
		w_scroolWhour.setBounds(459, 26, 250, 351);
		w_appointment.add(w_scroolWhour);
		
		table_whour = new JTable(whourModel);
		w_scroolWhour.setViewportView(table_whour);
		
		JLabel lblNewLabel_4 = new JLabel("Randevu ");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4.setBounds(270, 263, 114, 25);
		w_appointment.add(lblNewLabel_4);
		
		JButton btn_addAppoint = new JButton("Randevu al");
		btn_addAppoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selRow=table_whour.getSelectedRow();
				if(selRow>=0) {
					String date=table_whour.getModel().getValueAt(selRow, 1).toString();
					try {
						boolean control=hasta.addAppointment(selectDoctorID, hasta.getId(), selectDoctorName, hasta.getName(), date);
						if(control) {
							Helper.showMsg("success");
							hasta.updateWhourStatus(selectDoctorID, date);
							updateWhourModel(selectDoctorID);
							updateAppointModel(hasta.getId());
						}else {
							Helper.showMsg("error");
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}else {
					Helper.showMsg("lutfen gecerli bir tahir giriniz!");
				}
			}
		});
		btn_addAppoint.setBounds(270, 286, 150, 39);
		w_appointment.add(btn_addAppoint);
		
		JPanel w_appoint = new JPanel();
		w_tab.addTab("Randevularim", null, w_appoint, null);
		w_appoint.setLayout(null);
		
		JScrollPane w_scroolAppoint = new JScrollPane();
		w_scroolAppoint.setBounds(10, 11, 699, 366);
		w_appoint.add(w_scroolAppoint);
		
		table_appoint = new JTable(appointModel);
		w_scroolAppoint.setViewportView(table_appoint);
		table_whour.getColumnModel().getColumn(0).setPreferredWidth(5);
		
	}
	public void updateWhourModel(int doctor_id) throws SQLException {
		DefaultTableModel clearModel=(DefaultTableModel) table_whour.getModel();
		clearModel.setRowCount(0);
		for(int i=0;i<whour.getWhourList( doctor_id).size();i++) {
			whourData[0]=whour.getWhourList(doctor_id).get(i).getId();
			whourData[1]=whour.getWhourList(doctor_id).get(i).getWdate();
			whourModel.addRow(whourData);
		}
	}
	public void updateAppointModel(int hasta_id) throws SQLException {
		DefaultTableModel clearModel=(DefaultTableModel) table_appoint.getModel();
		clearModel.setRowCount(0);
		for(int i=0;i<appoint.getHastaList(hasta_id).size();i++) {
			appointData[0]=appoint.getHastaList(hasta_id).get(i).getId();
			appointData[1]=appoint.getHastaList(hasta_id).get(i).getDoctorName();
			appointData[2]=appoint.getHastaList(hasta_id).get(i).getAppDate();
			appointModel.addRow(appointData);
		}
	}
}
