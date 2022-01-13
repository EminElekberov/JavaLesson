package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
public class PopupMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f=new JFrame("scrollbar kullanmi");
		JPopupMenu pm=new JPopupMenu("menu");
		
		JMenuItem cut=new JMenuItem("kes");
		JMenuItem copy=new JMenuItem("kopyala");
		JMenuItem paste=new JMenuItem("yapisdir");
		pm.add(cut);
		pm.add(copy);
		pm.add(paste);
		f.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				pm.show(f,e.getX(),e.getY());
			}
		});
		cut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(f,"kesme buttonuna tiklandi");
			}
			
		});
		
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true); 
		
	}

}
