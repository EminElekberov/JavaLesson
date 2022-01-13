package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class JTextFieldd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f=new JFrame("JTextField ornegi");
		JLabel l1,l2,l3;
		JTextField t1,t2,t3;
		JButton btn;
		l1=new JLabel("ilk sayi");
		l1.setBounds(50, 10, 100, 30);
		
		t1=new JTextField();
		t1.setBounds(50, 40, 200, 30);
		
		l2=new JLabel("ikinci sayi");
		l2.setBounds(50, 70, 100, 30);
		
		t2=new JTextField();
		t2.setBounds(50, 100, 200, 30);
		
		l3=new JLabel("toplam");
		l3.setBounds(50, 130, 100, 30);
		
		t3=new JTextField();
		t3.setBounds(50, 160, 200, 30);
		
		btn=new JButton("toplam");
		btn.setBounds(50, 220,200,30);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int a=Integer.parseInt(t1.getText());
				int b=Integer.parseInt(t2.getText());
				int c=a+b;
				String toplam=String.valueOf(c);
				t3.setText(toplam);
			}
			
		});
		
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(l3);
		f.add(t3);
		f.add(btn);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
	}

}
