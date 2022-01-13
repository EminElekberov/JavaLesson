package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class PasswordField {

	public static void main(String[] args) {
		/*JFrame f=new JFrame("pasword kullanmi");
		JPasswordField p=new JPasswordField ();
		p.setBounds(0, 0, 100, 30);
		
		f.add(p);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);*/
		
		
		
		JFrame f=new JFrame("pasword kullanmi");
		JLabel l1=new JLabel("sifre");
		l1.setBounds(20, 20,100,30);
		
		JPasswordField p=new JPasswordField ();
		p.setBounds(20, 50, 100, 30);
		
		JButton btn=new JButton("gonder");
		btn.setBounds(20, 80, 100,30);
btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String password=new String(p.getPassword());
				l1.setText(l1.getText()+password);
			}
			
		});
		
		f.add(l1);
		f.add(p);
		f.add(btn);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
	}

}
