package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*JFrame jframe=new JFrame();
		jframe.setSize(300,300);
		
		jframe.setVisible(true);*/
		
		
		/*JFrame jframe=new JFrame();
		jframe.setSize(300,300);
		JButton btn=new JButton("button");
		jframe.getContentPane().add(btn);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);*/
		
		
		
		JFrame jframe=new JFrame();
		jframe.setSize(300,300);
		JPanel panel=new JPanel();
		JButton btn=new JButton("button");
		panel.add(btn);
		jframe.add(panel);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);
	}

}
