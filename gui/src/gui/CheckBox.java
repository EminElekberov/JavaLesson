package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

import javax.swing.*;
public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f=new JFrame("pasword kullanmi");
		JCheckBox ch1=new JCheckBox("niediwejd");
		JCheckBox ch2=new JCheckBox("niediwejd");
		ch1.setBounds(150, 100, 250,50);
		ch2.setBounds(150, 150, 250,50);
		

		JButton btn=new JButton("gonder");
		btn.setBounds(150, 200, 100,30);
          btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(ch1.isSelected()) {
					System.out.println(ch1.getText()+" secildi!");
				}
				if(ch2.isSelected()) {
					System.out.println(ch2.getText()+" secildi!");
				}
			}
			
		});
		f.add(ch1);
		f.add(ch2);
		f.add(btn);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
		
//		
//		JFrame f=new JFrame("pasword kullanmi");
//		JLabel lb=new JLabel("asd");
//		lb.setBounds(150, 50,300, 50);
//		JCheckBox ch1=new JCheckBox("niediwejd");
//		JCheckBox ch2=new JCheckBox("niediwejd");
//		ch1.setBounds(150, 100, 250,50);
//		ch2.setBounds(150, 150, 250,50);
//		ch1.addItemListener(new ItemListener() {
//			@Override
//			public void ItemStateChanged(ItemEvent e) {
//				lb.setText("c++ secim kutusu"+(e.getStateChange()==1 ? "secildi" : "secilmedi")); 
//			}
//		});
//          f.add(lb);
//		f.add(ch1);
//		f.add(ch2);
//		f.setSize(300,300);
//		f.setLayout(null);
//		f.setVisible(true);
	}

}
