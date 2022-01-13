package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class ComboBox {

	public static void main(String[] args) {
		JFrame f=new JFrame("pasword kullanmi");
		String arr[]= {"c","c#","java","php","mysql"};
		JComboBox jb=new JComboBox(arr);
		jb.setBounds(50, 100,90, 20);
		
		JButton btn=new JButton("sec");
		btn.setBounds(50,150,80,20);
		
         btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text="secilen dili "+ jb.getSelectedItem();
				System.out.println(text);
			}
			
		});
		
        
		f.add(jb);
		f.add(btn);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
	}

}
