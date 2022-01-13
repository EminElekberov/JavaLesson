package gui;
import java.awt.event.ActionEvent;

import javax.swing.*;
public class OptionPane {

	public static void main(String[] args) {
		/*JFrame f=new JFrame("pasword kullanmi");
		JOptionPane.showMessageDialog(f,"slam xos gelmiiz");
		
		
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);*/
		
		
		JFrame f=new JFrame("pasword kullanmi");
		//JOptionPane.showMessageDialog(f,"abone oldun","abone ol",JOptionPane.WARNING_MESSAGE);
		JOptionPane.showInputDialog(f,"adiniz");
		
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
	}

}
