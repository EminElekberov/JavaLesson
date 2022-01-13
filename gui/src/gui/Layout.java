package gui;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;
public class Layout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*JFrame f=new JFrame("scrollbar kullanmi");
		
		JButton jb1=new JButton("b1");
		JButton jb2=new JButton("b2");
		JButton jb3=new JButton("b3");
		JButton jb4=new JButton("b4");
		JButton jb5=new JButton("b5");
		
		JPanel p=new JPanel();
		p.setLayout(new BorderLayout());
		p.add(jb1, BorderLayout.NORTH);
		p.add(jb2, BorderLayout.SOUTH);
		p.add(jb3, BorderLayout.WEST);
		p.add(jb4, BorderLayout.EAST);
		p.add(jb5, BorderLayout.CENTER);
		f.add(p);
		f.setSize(400,400);
		f.setVisible(true); */
		
		
        /*JFrame f=new JFrame("scrollbar kullanmi");
		
		JButton jb1=new JButton("b1");
		JButton jb2=new JButton("b2");
		JButton jb3=new JButton("b3");
		JButton jb4=new JButton("b4");
		JButton jb5=new JButton("b5");
		
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(3,2));
		p.add(jb1);
		p.add(jb2);
		p.add(jb3);
		p.add(jb4);
		p.add(jb5);
		
		f.add(p);
		f.setSize(400,400);
		f.setVisible(true);*/
		
		
		
JFrame f=new JFrame("scrollbar kullanmi");
		
		JButton jb1=new JButton("b1");
		JButton jb2=new JButton("b2");
		JButton jb3=new JButton("b3");
		JButton jb4=new JButton("b4");
		JButton jb5=new JButton("b5");
		
		JPanel p=new JPanel();
		p.setLayout(new FlowLayout());
		p.add(jb1);
		p.add(jb2);
		p.add(jb3);
		p.add(jb4);
		p.add(jb5);
		
		f.add(p);
		f.setSize(400,400);
		f.setVisible(true);
	}

}
