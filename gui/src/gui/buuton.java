package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class buuton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f=new JFrame("button ornegi");
		
		JButton btn=new JButton();
		btn.setText("gonder");
		
		btn.setBounds(100,100,100,30);
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("buttona tiklandi");
			}
			
		});
		f.add(btn);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
	}

}
