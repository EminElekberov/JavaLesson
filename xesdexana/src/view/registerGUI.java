package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Helper.Helper;
import Model.Hasta;
import Model.User;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class registerGUI extends JFrame {

	private JPanel w_pane;
	private JTextField fld_name;
	private JLabel lblTcNumarasi;
	private JTextField fld_tcno;
	private JLabel lblsifre;
	private JPasswordField fld_pass;
	private Hasta hasta=new Hasta();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registerGUI frame = new registerGUI();
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
	public registerGUI() {
		setResizable(false);
		setTitle("xesdexana yonetim sistemi");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 330);
		w_pane = new JPanel();
		w_pane.setBackground(Color.WHITE);
		w_pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(w_pane);
		w_pane.setLayout(null);
		
		JLabel label = new JLabel("AD SOYAD");
		label.setBounds(10, 11, 82, 22);
		w_pane.add(label);
		
		fld_name = new JTextField();
		fld_name.setBounds(0, 36, 294, 28);
		w_pane.add(fld_name);
		fld_name.setColumns(10);
		
		lblTcNumarasi = new JLabel("AZE seriya nomresi");
		lblTcNumarasi.setBounds(6, 78, 122, 22);
		w_pane.add(lblTcNumarasi);
		
		fld_tcno = new JTextField();
		fld_tcno.setBounds(0, 100, 294, 28);
		w_pane.add(fld_tcno);
		fld_tcno.setColumns(10);
		
		lblsifre = new JLabel("Sifre");
		lblsifre.setBounds(10, 150, 114, 22);
		w_pane.add(lblsifre);
		
		fld_pass = new JPasswordField();
		fld_pass.setBounds(0, 183, 294, 28);
		w_pane.add(fld_pass);
		
		JButton btn_register = new JButton("kayit ol");
		btn_register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(fld_tcno.getText().length()==0 || fld_pass.getText().length()==0 || fld_name.getText().length()==0) {
					Helper.showMsg("fill");
				}else {
					try {
						boolean control=hasta.register(fld_tcno.getText(), fld_pass.getText(), fld_name.getText());
						if(control) {
							Helper.showMsg("success");
							LoginGui login=new LoginGui();
							login.setVisible(true);
							dispose();
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
		btn_register.setBounds(0, 222, 294, 34);
		w_pane.add(btn_register);
		
		JButton btn_backto = new JButton("geri don");
		btn_backto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginGui login=new LoginGui();
				login.setVisible(true);
				dispose();
			}
		});
		btn_backto.setBounds(0, 267, 294, 34);
		w_pane.add(btn_backto);
	}
}
