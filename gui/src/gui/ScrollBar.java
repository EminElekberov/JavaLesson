package gui;
import java.awt.event.ActionEvent;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.*;
public class ScrollBar {

	public static void main(String[] args) {
		JFrame f=new JFrame("scrollbar kullanmi");
		JLabel lb=new JLabel("asdf");
		lb.setBounds(100, 50, 300,30);
		JScrollBar  s=new JScrollBar(JScrollBar .VERTICAL);
		s.setMaximum(100);
		s.setMinimum(0);
		s.setBounds(100, 100, 50,100);
		
		s.addAdjustmentListener(new AdjustmentListener() {		

			@Override
			public void adjustmentValueChanged(AdjustmentEvent e) {
				lb.setText("scrollbar degeri "+ (s.getValue()));
			}
			});
		f.add(lb);
		f.add(s);
		
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
	}

}
