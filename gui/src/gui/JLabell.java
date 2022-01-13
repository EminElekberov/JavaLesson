package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class JLabell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*JFrame f=new JFrame("button ornegi");
		JLabel l=new JLabel();
		l.setText("yazi hissei");
		l.setBounds(100, 50, 100,30);
		JButton btn=new JButton("degisdir");
		btn.setBounds(100,100,100,30);
		f.add(btn);
		f.add(l);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);*/
		
		
		JFrame f=new JFrame("button ornegi");
		JLabel l=new JLabel();
		l.setText("yazi hissei");
		l.setBounds(100, 50, 100,30);
		JButton btn=new JButton("degisdir");
		btn.setBounds(100,100,100,30);
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				l.setText("buttona tiklandi");
			}
			
		});
		f.add(btn);
		f.add(l);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
		
		
		/*JFrame f=new JFrame("button ornegi");
		JLabel l=new JLabel();
		l.setText("yazi hissei");
		l.setBounds(100, 50, 100,30);
		JButton btn=new JButton("degisdir");
		btn.setBounds(100,100,100,30);
		btn.addActionListener(new ActionListener() {
			int c=1;
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				l.setText("buttona "+ c++ + " !");
			}
			
		});
		f.add(btn);
		f.add(l);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);*/
	}

}
