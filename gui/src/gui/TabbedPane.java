package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class TabbedPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f=new JFrame("scrollbar kullanmi");
		JLabel lb1=new JLabel("ilk alan");
		JPanel p1=new JPanel();
		p1.add(lb1);
		
		JLabel lb2=new JLabel("ikinci alan");
		JPanel p2=new JPanel();
		p2.add(lb2);
		
		JLabel lb3=new JLabel("ucuncuk alan");
		JPanel p3=new JPanel();
		p3.add(lb3);
		
		JTabbedPane  tp=new JTabbedPane();
		tp.setBounds(50, 50,200, 200);
		tp.add("ilk ",p1);
		tp.add("ikinci ",p2);
		tp.add("ucuncu ",p3);
		f.add(tp);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true); 
	}

}
