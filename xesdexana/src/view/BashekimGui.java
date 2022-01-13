package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

import Model.*;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JMenuItem;

import java.awt.Font;
import java.awt.Point;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import Helper.*;
import javax.swing.JComboBox;

public class BashekimGui extends JFrame {
	static Bashekim bashekim=new Bashekim();
	Clinic clinic=new Clinic();
	private JPanel w_pane;
	private JTextField fld_dName;
	private JTextField fld_dTcno;
	private JTextField fld_dPass;
	private JTextField fld_doctorID;
	private JTable table_doctor;
	private DefaultTableModel doctorModel=null;
	private Object[] doctorData=null;
	private JTable table_clinic;
	private JTextField fld_clinicName;
	private DefaultTableModel clinicModel=null;
	private Object[] clinicData=null;
	private JPopupMenu clinicMenu;
	private JTable table_worker;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BashekimGui frame = new BashekimGui(bashekim);
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
	public BashekimGui(Bashekim bashekim) throws SQLException {
		
		//doktor model
		doctorModel=new DefaultTableModel();
		Object[] colDoctorName=new Object[4];
		colDoctorName[0]="ID";
		colDoctorName[1]="AD SOYAD";
		colDoctorName[2]="TC NO";
		colDoctorName[3]="SIFRE";
		doctorModel.setColumnIdentifiers(colDoctorName);
		doctorData=new Object[4];
		for(int i=0;i<bashekim.getDoctorList().size();i++) {
			doctorData[0]=bashekim.getDoctorList().get(i).getId();
			doctorData[1]=bashekim.getDoctorList().get(i).getName();
			doctorData[2]=bashekim.getDoctorList().get(i).getTcno();
			doctorData[3]=bashekim.getDoctorList().get(i).getPassword();
			doctorModel.addRow(doctorData);
		}
		//clinic model
		clinicModel=new DefaultTableModel();
		Object[] colClinic=new Object[2];
		colClinic[0]="ID";
		colClinic[1]="POLIKLINIK ADI ";
		clinicModel.setColumnIdentifiers(colClinic);
		clinicData=new Object[2];
		for(int i=0;i<clinic.getList().size();i++) {
			clinicData[0]=clinic.getList().get(i).getId();
			clinicData[1]=clinic.getList().get(i).getName();
			clinicModel.addRow(clinicData);
		}
		//workermodel
		DefaultTableModel workerModel=new DefaultTableModel();
		Object[] colWorker=new Object[2];
		colWorker[0]="ID";
		colWorker[1]="AD SOYAD";
		workerModel.setColumnIdentifiers(colWorker);
		Object[] workerData=new Object[2];	
				
				
 		setTitle("xesdexana yonetim sistemi");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 500);
		w_pane = new JPanel();
		w_pane.setBackground(Color.WHITE);
		w_pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(w_pane);
		w_pane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("  xosgeldiniz sayin: "+bashekim.getName());
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(20, 0, 291, 43);
		w_pane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("cixis yap");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginGui login=new LoginGui();
				login.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setBounds(397, 11, 108, 36);
		w_pane.add(btnNewButton);
		
		JTabbedPane w_tab = new JTabbedPane(JTabbedPane.TOP);
		w_tab.setBounds(10, 53, 724, 407);
		w_pane.add(w_tab);
		
		JPanel w_doctor = new JPanel();
		w_doctor.setBackground(Color.WHITE);
		w_tab.addTab("doktor yonetimi", null, w_doctor, null);
		w_doctor.setLayout(null);
		
		JLabel label = new JLabel("ad soyad");
		label.setFont(new Font("Tahoma", Font.BOLD, 13));
		label.setBounds(461, 11, 113, 19);
		w_doctor.add(label);
		
		fld_dName = new JTextField();
		fld_dName.setBounds(461, 31, 248, 32);
		w_doctor.add(fld_dName);
		fld_dName.setColumns(10);
		
		JLabel label_1 = new JLabel("Tc no:");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_1.setBounds(461, 72, 113, 19);
		w_doctor.add(label_1);
		
		fld_dTcno = new JTextField();
		fld_dTcno.setBounds(461, 89, 248, 32);
		w_doctor.add(fld_dTcno);
		fld_dTcno.setColumns(10);
		
		JLabel label_2 = new JLabel("sifre");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_2.setBounds(461, 132, 113, 19);
		w_doctor.add(label_2);
		
		fld_dPass = new JTextField();
		fld_dPass.setBounds(461, 148, 248, 32);
		w_doctor.add(fld_dPass);
		fld_dPass.setColumns(10);
		
		JButton btn_addDoctor = new JButton("ekle");
		btn_addDoctor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(fld_dName.getText().length()==0 || fld_dPass.getText().length()== 0 || fld_dTcno.getText().length()==0) {
					Helper.showMsg("fill");
				}else {
					try {
						boolean control=bashekim.addDoctor(fld_dTcno.getText(), fld_dPass.getText(), fld_dName.getText());
						if(control) {
							Helper.showMsg("success");
							fld_dName.setText(null);
							fld_dTcno.setText(null);
							 fld_dPass.setText(null);
							 updateDoctorModel();
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		btn_addDoctor.setBounds(461, 187, 248, 38);
		w_doctor.add(btn_addDoctor);
		
		JLabel label_3 = new JLabel("kullanici id");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_3.setBounds(461, 236, 136, 19);
		w_doctor.add(label_3);
		
		fld_doctorID = new JTextField();
		fld_doctorID.setBounds(457, 254, 252, 32);
		w_doctor.add(fld_doctorID);
		fld_doctorID.setColumns(10);
		
		JButton btn_delDoctor = new JButton("sil");
		btn_delDoctor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(fld_doctorID.getText().length()==0) {
					Helper.showMsg("lutfen gecerli bir doktor secin");
				}else {
					if(Helper.confirm("sure")) {
						int selectedID=Integer.parseInt(fld_doctorID.getText());
						try {
							boolean control=bashekim.deleteDoctor(selectedID);
							if(control) {
								Helper.showMsg("success");
								fld_doctorID.setText(null);
								updateDoctorModel();
							}
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}
			}
		});
		btn_delDoctor.setBounds(457, 301, 252, 52);
		w_doctor.add(btn_delDoctor);
		
		JScrollPane w_scroolDoctor = new JScrollPane();
		w_scroolDoctor.setBounds(10, 11, 441, 357);
		w_doctor.add(w_scroolDoctor);
		
		table_doctor = new JTable(doctorModel);
		w_scroolDoctor.setViewportView(table_doctor);
		table_doctor.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				// TODO Auto-generated method stub
				try {
					fld_doctorID.setText(table_doctor.getValueAt(table_doctor.getSelectedRow(),0).toString());
				}catch(Exception ex) {
					
				}
			}
		});
		table_doctor.getModel().addTableModelListener(new TableModelListener() {
			@Override
			public void tableChanged(TableModelEvent e) {
				// TODO Auto-generated method stub
				if(e.getType()==TableModelEvent.UPDATE) {
					int selectID=Integer.parseInt(table_doctor.getValueAt(table_doctor.getSelectedRow(), 0).toString());
					String selectName=table_doctor.getValueAt(table_doctor.getSelectedRow(), 1).toString();
					String selectTcno=table_doctor.getValueAt(table_doctor.getSelectedRow(), 2).toString();
					String selectPass=table_doctor.getValueAt(table_doctor.getSelectedRow(), 3).toString();
					
					try {
						boolean control=bashekim.updateDoctor(selectID, selectTcno, selectPass,selectName);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		JPanel w_clinic = new JPanel();
		w_clinic.setBackground(Color.WHITE);
		w_tab.addTab("Poliklinikler", null, w_clinic, null);
		w_clinic.setLayout(null);
		
		JScrollPane w_scroolClinic = new JScrollPane();
		w_scroolClinic.setBounds(10, 11, 304, 357);
		w_clinic.add(w_scroolClinic);
		
		clinicMenu=new JPopupMenu();
		JMenuItem updateMenu=new JMenuItem("guncelle");
		JMenuItem deleteMenu=new JMenuItem("sil");
		clinicMenu.add(updateMenu);
		clinicMenu.add(deleteMenu);
		
		updateMenu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int selID=Integer.parseInt(table_clinic.getValueAt(table_clinic.getSelectedRow(), 0).toString());
				Clinic selectClinic=clinic.getfetch(selID);
				UpdateClinicGui updateGUI=new UpdateClinicGui(selectClinic);
				updateGUI.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				updateGUI.setVisible(true);
				updateGUI.addWindowListener(new WindowAdapter() {
					public void windowClosed(WindowEvent e) {
						try {
							updateClinicModel();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				});
			}
			
		});
		
		deleteMenu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if(Helper.confirm("sure")) {
					int selID=Integer.parseInt(table_clinic.getValueAt(table_clinic.getSelectedRow(), 0).toString());
					try {
						if(clinic.deleteClinic(selID)) {
							Helper.showMsg("success");
							updateClinicModel();
						}else {
							Helper.showMsg("error");
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		});
		table_clinic = new JTable(clinicModel);
		table_clinic.setComponentPopupMenu(clinicMenu);
		table_clinic.addMouseListener(new MouseAdapter() {
			public void  mousePressed(MouseEvent e) {
				Point point=e.getPoint();
				int selectedRow=table_clinic.rowAtPoint(point);
				table_clinic.setRowSelectionInterval(selectedRow, selectedRow);
				
			}
		});
		w_scroolClinic.setViewportView(table_clinic);
		
		JLabel lblPoliklinikAdi = new JLabel("Poliklinik adi");
		lblPoliklinikAdi.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPoliklinikAdi.setBounds(324, 9, 113, 19);
		w_clinic.add(lblPoliklinikAdi);
		
		fld_clinicName = new JTextField();
		fld_clinicName.setColumns(10);
		fld_clinicName.setBounds(324, 31, 188, 32);
		w_clinic.add(fld_clinicName);
		
		JButton btn_addClinic = new JButton("EKLE");
		btn_addClinic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(fld_clinicName.getText().length()==0) {
					Helper.showMsg("fill");
				}else {
					try {
						if(clinic.addClinic(fld_clinicName.getText())) {
							Helper.showMsg("success");
							fld_clinicName.setText(null);
							updateClinicModel();
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		btn_addClinic.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn_addClinic.setBounds(324, 74, 188, 32);
		w_clinic.add(btn_addClinic);
		
		JScrollPane w_scroolWorker = new JScrollPane();
		w_scroolWorker.setBounds(514, 11, 195, 357);
		w_clinic.add(w_scroolWorker);
		
		table_worker = new JTable();
		w_scroolWorker.setViewportView(table_worker);
		
		JComboBox select_doctor = new JComboBox();
		select_doctor.setBounds(324, 265, 188, 32);
		for(int i=0; i<bashekim.getDoctorList().size();i++) {
			select_doctor.addItem(new Item(bashekim.getDoctorList().get(i).getId(), bashekim.getDoctorList().get(i).getName()));
		}
		select_doctor.addActionListener(e -> {
			JComboBox c=(JComboBox) e.getSource();
			Item item=(Item) c.getSelectedItem();
			System.out.println(item.getKey()+ " : "+ item.getValue());
		});
		w_clinic.add(select_doctor);
		
		JButton btn_addWorker = new JButton("EKLE");
		btn_addWorker.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selRow=table_clinic.getSelectedRow();
				if(selRow>=0) {
					String selClinic=table_clinic.getModel().getValueAt(selRow, 0).toString();
					int selClinicID=Integer.parseInt(selClinic);
					Item doctorItem=(Item) select_doctor.getSelectedItem();
					try {
						boolean control=bashekim.addWorker(doctorItem.getKey(), selClinicID);
						
						if(control) {
							Helper.showMsg("success");
							DefaultTableModel clearModel=(DefaultTableModel) table_worker.getModel();
							clearModel.setRowCount(0);
							for(int i=0;i<bashekim.getClinicDoctorList(selClinicID).size();i++) {
								workerData[0]=bashekim.getClinicDoctorList(selClinicID).get(i).getId();
								workerData[1]=bashekim.getClinicDoctorList(selClinicID).get(i).getName();
								workerModel.addRow(workerData);
								}
							table_worker.setModel(workerModel);
						}else {
							Helper.showMsg("error");
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else {
					Helper.showMsg("Lutfen poliklinik seciniz!");
				}
			}
		});
		btn_addWorker.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn_addWorker.setBounds(324, 305, 188, 32);
		w_clinic.add(btn_addWorker);
		
		JLabel lblNewLabel_1 = new JLabel("poliklinik adi");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(319, 129, 164, 19);
		w_clinic.add(lblNewLabel_1);
		
		JButton btn_workerSelect = new JButton("sec");
		btn_workerSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selRow=table_clinic.getSelectedRow();
				if(selRow>=0) {
					String selClinic=table_clinic.getModel().getValueAt(selRow, 0).toString();
					int selClinicID=Integer.parseInt(selClinic);
					DefaultTableModel clearModel=(DefaultTableModel) table_worker.getModel();
					clearModel.setRowCount(0);
					try {
						for(int i=0;i<bashekim.getClinicDoctorList(selClinicID).size();i++) {
						workerData[0]=bashekim.getClinicDoctorList(selClinicID).get(i).getId();
						workerData[1]=bashekim.getClinicDoctorList(selClinicID).get(i).getName();
						workerModel.addRow(workerData);
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					table_worker.setModel(workerModel);
				}else {
					Helper.showMsg("lutfen bir poliklinik secin");
				}
			}
		});
		btn_workerSelect.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_workerSelect.setBounds(319, 147, 193, 42);
		w_clinic.add(btn_workerSelect);
	}
	public void updateDoctorModel() throws SQLException {
		DefaultTableModel clearModel=(DefaultTableModel) table_doctor.getModel();
		clearModel.setRowCount(0);
		for(int i=0;i<bashekim.getDoctorList().size();i++) {
			doctorData[0]=bashekim.getDoctorList().get(i).getId();
			doctorData[1]=bashekim.getDoctorList().get(i).getName();
			doctorData[2]=bashekim.getDoctorList().get(i).getTcno();
			doctorData[3]=bashekim.getDoctorList().get(i).getPassword();
			doctorModel.addRow(doctorData);
		}
	}
	public void updateClinicModel() throws SQLException {
		DefaultTableModel clearModel=(DefaultTableModel) table_clinic.getModel();
		clearModel.setRowCount(0);
		for(int i=0;i<clinic.getList().size();i++) {
			clinicData[0]=clinic.getList().get(i).getId();
			clinicData[1]=clinic.getList().get(i).getName();
			clinicModel.addRow(clinicData);
		}
	}
}
