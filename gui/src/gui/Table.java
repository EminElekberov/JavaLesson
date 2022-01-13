package gui;
import java.awt.event.ActionEvent;

import javax.swing.*; 

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f=new JFrame("pasword kullanmi");
		String[][] veri= {{"1" ,"mat", "85"}, {"2", "fenn", "50"}, {"3", "tur", "100"}};
		String[] basliq={"id" ,"ders", "not"};
		JTable  jt=new JTable(veri,basliq);
		jt.setBounds(30, 40,200,300);
		f.add(jt);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
	}

}
