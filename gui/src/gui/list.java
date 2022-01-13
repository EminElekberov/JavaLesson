package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f=new JFrame("pasword kullanmi");
		DefaultListModel<String> l=new DefaultListModel<>();
		l.addElement("c++");
		l.addElement("java");
		l.addElement("php");
		JList  list=new JList<>(l);
		list.setBounds(100, 100,75, 75);
		list.setSelectionMode(DefaultListSelectionModel.SINGLE_SELECTION);
		
		DefaultListModel<String> l2=new DefaultListModel<>();
		l2.addElement("swing");
		l2.addElement("laravel");
		l2.addElement("bootstrap");
		JList  list2=new JList<>(l2);
		list2.setBounds(100, 200,75, 85);
		
		JButton btn=new JButton("gonder");
		btn.setBounds(200,150,80,30);
		 btn.addActionListener(new ActionListener() {
				String txt=" ";
				@Override
				public void actionPerformed(ActionEvent arg0) {
					if(list.getSelectedIndex()!=-1) {
						txt="secilen proqramlama dili" + list.getSelectedValue();
					}
					if(list2.getSelectedIndex()!=-1) {
						txt="secilen framework ";
						for(Object item:list2.getSelectedValuesList()) {
							txt+=item+ " ";
						}
					}
					System.out.println(txt);
				}
				
			});
		
		f.add(list);
		f.add(list2);
		f.add(btn);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
	}

}
