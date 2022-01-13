package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.*;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * JFrame f=new JFrame("pasword kullanmi"); JRadioButton r1=new JRadioButton
		 * ("qadin"); r1.setBounds(100, 50, 100,30); r1.setActionCommand("q");
		 * 
		 * 
		 * JRadioButton r2=new JRadioButton ("kisi"); r2.setBounds(100, 100, 100,30);
		 * r2.setActionCommand("k");
		 * 
		 * JRadioButton r3=new JRadioButton ("isdemirem"); r3.setBounds(100, 150,
		 * 100,30); r3.setActionCommand("i");
		 * 
		 * ButtonGroup bg=new ButtonGroup(); bg.add(r1); bg.add(r2); bg.add(r3);
		 * 
		 * JButton btn=new JButton("gonder"); btn.setBounds(100,200,100,30);
		 * 
		 * btn.addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) {
		 * System.out.println(bg.getSelection().getActionCommand()); }
		 * 
		 * });
		 * 
		 * f.add(r1); f.add(r2); f.add(r3); f.add(btn); f.setSize(300,300);
		 * f.setLayout(null); f.setVisible(true);
		 */

		JFrame f = new JFrame("pasword kullanmi");
		JRadioButton r1 = new JRadioButton("qadin");
		r1.setBounds(100, 50, 100, 30);
		r1.setActionCommand("q");

		JRadioButton r2 = new JRadioButton("kisi");
		r2.setBounds(100, 100, 100, 30);
		r2.setActionCommand("k");

		JRadioButton r3 = new JRadioButton("isdemirem");
		r3.setBounds(100, 150, 100, 30);
		r3.setActionCommand("i");

		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);

		JButton btn = new JButton("gonder");
		btn.setBounds(100, 200, 100, 30);

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (r1.isSelected()) {
					System.out.println(r1.getText() + "  secildi");
				}
				System.out.println(bg.getSelection().getActionCommand());
			}

		});

		f.add(r1);
		f.add(r2);
		f.add(r3);
		f.add(btn);
		f.setSize(300, 300);
		f.setLayout(null);
		f.setVisible(true);
	}

}
