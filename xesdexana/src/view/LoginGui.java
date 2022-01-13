package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import Helper.*;
import Model.Bashekim;
import Model.Doctor;
import Model.Hasta;

public class LoginGui extends JFrame {

	private JPanel w_pane;
	private JTextField fld_hastaTC;
	private JTextField fld_doctorTc;
	private JPasswordField fld_doctorPass;
	private Dbconnection conn = new Dbconnection();
	private JPasswordField fld_hastaPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginGui frame = new LoginGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginGui() {
		setResizable(false);
		setTitle("xesdexana otomosyonu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		w_pane = new JPanel();
		w_pane.setBackground(Color.WHITE);
		w_pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(w_pane);
		w_pane.setLayout(null);

		JLabel lbl_logo = new JLabel(new ImageIcon(getClass().getResource("medical.png")));
		lbl_logo.setBounds(195, 11, 100, 55);
		w_pane.add(lbl_logo);

		JLabel lblNewLabel = new JLabel("     xesdexana yonetimine xos geldiniz");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 17));
		lblNewLabel.setBounds(86, 59, 326, 47);
		w_pane.add(lblNewLabel);

		JTabbedPane w_tabbpane = new JTabbedPane(JTabbedPane.TOP);
		w_tabbpane.setBounds(10, 101, 474, 259);
		w_pane.add(w_tabbpane);

		JPanel w_hastalogin = new JPanel();
		w_hastalogin.setBackground(Color.WHITE);
		w_tabbpane.addTab("hasta girisi", null, w_hastalogin, null);
		w_hastalogin.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("   AZE seriya:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(10, 11, 121, 39);
		w_hastalogin.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel(" sifre:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_2.setBounds(20, 58, 113, 39);
		w_hastalogin.add(lblNewLabel_2);

		fld_hastaTC = new JTextField();
		fld_hastaTC.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		fld_hastaTC.setBounds(141, 23, 318, 27);
		w_hastalogin.add(fld_hastaTC);
		fld_hastaTC.setColumns(10);

		JButton btn_register = new JButton("kayit ol");
		btn_register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registerGUI rGUI = new registerGUI();
				rGUI.setVisible(true);
				dispose();
			}
		});
		btn_register.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btn_register.setBounds(10, 159, 175, 33);
		w_hastalogin.add(btn_register);

		JButton btn_hastaLogin = new JButton("giris");
		btn_hastaLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (fld_hastaTC.getText().length() == 0 || fld_hastaPass.getText().length() == 0) {
					Helper.showMsg("fill");
				} else {
					boolean key = true;
					try {
						Connection con = conn.connDb();
						Statement st = con.createStatement();
						ResultSet rs = st.executeQuery("SELECT*FROM user");

						while (rs.next()) {
							if (fld_hastaTC.getText().equals(rs.getString("tcno"))
									&& fld_hastaPass.getText().equals(rs.getString("password"))) {
								if (rs.getString("type").equals("hasta")) {
									Hasta hasta = new Hasta();
									hasta.setId(rs.getInt("id"));
									hasta.setPassword("password");
									hasta.setTcno(rs.getString("tcno"));
									hasta.setName(rs.getString("name"));
									hasta.setType(rs.getString("type"));
									HastaGUI hGui = new HastaGUI(hasta);
									hGui.setVisible(true);
									dispose();
									key = false;
								}
							}
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					if (key) {
						Helper.showMsg("bele bir xesde tapilmadi  lutfen kayit olun.");
					}
				}
			}
		});
		btn_hastaLogin.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn_hastaLogin.setBounds(205, 159, 175, 33);
		w_hastalogin.add(btn_hastaLogin);

		fld_hastaPass = new JPasswordField();
		fld_hastaPass.setBounds(143, 71, 316, 33);
		w_hastalogin.add(fld_hastaPass);

		JPanel w_doctorLogin = new JPanel();
		w_doctorLogin.setBackground(Color.WHITE);
		w_tabbpane.addTab("doctor girisi", null, w_doctorLogin, null);
		w_doctorLogin.setLayout(null);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 469, 231);
		w_doctorLogin.add(panel);

		JLabel label = new JLabel("   AZE seriya:");
		label.setFont(new Font("Tahoma", Font.BOLD, 17));
		label.setBounds(10, 11, 121, 39);
		panel.add(label);

		JLabel label_1 = new JLabel(" sifre:");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		label_1.setBounds(20, 58, 113, 39);
		panel.add(label_1);

		fld_doctorTc = new JTextField();
		fld_doctorTc.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		fld_doctorTc.setColumns(10);
		fld_doctorTc.setBounds(141, 16, 318, 27);
		panel.add(fld_doctorTc);

		JButton btn_doctorLogin = new JButton("giris");
		btn_doctorLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (fld_doctorTc.getText().length() == 0 || fld_doctorPass.getText().length() == 0) {
					Helper.showMsg("fill");
				} else {

					try {
						Connection con = conn.connDb();
						Statement st = con.createStatement();
						ResultSet rs = st.executeQuery("SELECT*FROM user");
						while (rs.next()) {
							if (fld_doctorTc.getText().equals(rs.getString("tcno"))
									&& fld_doctorPass.getText().equals(rs.getString("password"))) {
								if (rs.getString("type").equals("bashekim")) {
									Bashekim bhekim = new Bashekim();
									bhekim.setId(rs.getInt("id"));
									bhekim.setPassword("password");
									bhekim.setTcno(rs.getString("tcno"));
									bhekim.setName(rs.getString("name"));
									bhekim.setType(rs.getString("type"));
									BashekimGui bGui = new BashekimGui(bhekim);
									bGui.setVisible(true);
									dispose();
								}
								if (rs.getString("type").equals("doktor")) {
									Doctor doctor = new Doctor();
									doctor.setId(rs.getInt("id"));
									doctor.setPassword("password");
									doctor.setTcno(rs.getString("tcno"));
									doctor.setName(rs.getString("name"));
									doctor.setType(rs.getString("type"));
									DoctorGui dGUI = new DoctorGui(doctor);
									dGUI.setVisible(true);
									dispose();
								}
							}
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		btn_doctorLogin.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn_doctorLogin.setBounds(20, 159, 439, 33);
		panel.add(btn_doctorLogin);

		fld_doctorPass = new JPasswordField();
		fld_doctorPass.setBounds(143, 58, 316, 39);
		panel.add(fld_doctorPass);
	}
}
