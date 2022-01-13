package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class textarea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*JFrame f=new JFrame("button ornegi");
		JTextArea t=new JTextArea();
		t.setBounds(0, 0,250,200);
		f.add(t);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);*/
		
		
		
		JFrame f=new JFrame("button ornegi");
		JLabel l1,l2;
		JTextArea area;
		JButton btn;
		l1=new JLabel();
		l1.setBounds(50, 25, 300, 30);
		
		l2=new JLabel();
		l2.setBounds(160, 25, 100, 30);
		
		area=new JTextArea ();
		area.setBounds(20, 75,250,200);
		btn=new JButton("hesabla");
		btn.setBounds(100, 300,120,30);
		
btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text=area.getText();
				String words[]=text.split("\\s");
				l1.setText("kelime "+ words.length);
				l2.setText("xarakter "+ text.length());
			}
			
		});
		f.add(l1);
		f.add(l2);
		f.add(area);
		f.add(btn);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		
		
	}

}
