package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*JFrame f=new JFrame("scrollbar kullanmi");
		JMenuBar mb=new JMenuBar();
		JMenu menu=new JMenu("ananmenu");
		JMenu submenu=new JMenu("alt meniu");
		
		JMenuItem i1=new JMenuItem("menu1");
		JMenuItem i2=new JMenuItem("menu2");
		JMenuItem i3=new JMenuItem("menu3");
		JMenuItem i4=new JMenuItem("menu4");
		
		JMenuItem a1=new JMenuItem("alt1");
		JMenuItem a2=new JMenuItem("alt2");
		submenu.add(a1);
		submenu.add(a2);
		
		menu.add(i1);
		menu.add(i2);
		menu.add(i3);
		menu.add(i4);
		menu.add(submenu);
		mb.add(menu);
		f.setJMenuBar(mb);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);*/
		
		
		JFrame f=new JFrame("scrollbar kullanmi");
		JMenuBar mb=new JMenuBar();
		JMenu menu=new JMenu("ananmenu");
		JMenu submenu=new JMenu("alt meniu");
		
		JMenuItem i1=new JMenuItem("menu1");
		JMenuItem i2=new JMenuItem("menu2");
		JMenuItem i3=new JMenuItem("menu3");
		JMenuItem i4=new JMenuItem("menu4");
		
		i1.addActionListener(new ActionListener() {
			String txt=" ";
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(f, "menuye tiklandi");
			}
			
		});
		
		
		JMenuItem a1=new JMenuItem("alt1");
		JMenuItem a2=new JMenuItem("alt2");
		submenu.add(a1);
		submenu.add(a2);
		
		menu.add(i1);
		menu.add(i2);
		menu.add(i3);
		menu.add(i4);
		menu.add(submenu);
		mb.add(menu);
		f.setJMenuBar(mb);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
	}

}
