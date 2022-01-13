package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class ProgressBar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f=new JFrame("scrollbar kullanmi");
		JProgressBar  jb =new JProgressBar (0,2000);
		jb.setBounds(40, 40, 160, 30);
		jb.setValue(0);
		jb.setStringPainted(true);
		f.add(jb);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true); 
		
		int i=0;
		while(i<=2000) {
			jb.setValue(i);
			i+=20;
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
