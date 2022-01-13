package Helper;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Helper {
	public static void optioinPaneChangeButtonText() {
		UIManager.put("OptionPane.cancelButton", "iptal");
		UIManager.put("OptionPane.noButtonText", "xeyr");
		UIManager.put("OptionPane.okButtonText", "tamam");
		UIManager.put("OptionPane.yesButtonText", "beli");
	}
public static void showMsg(String str) {
	String msg;
	optioinPaneChangeButtonText();
	switch(str) {
	case "fill":
	msg="lutfen tum alanlari doldurun";
	break;
	case "success":
		msg="islem basarili";
		break;
	case "error":
		msg="bir xata bas verdi.";
		break;
	default:
		msg=str;
		
	}
	JOptionPane.showMessageDialog(null, msg,"mesaj",JOptionPane.INFORMATION_MESSAGE);
}
public static boolean confirm(String str) {
	String msg;
	optioinPaneChangeButtonText();
	switch(str) {
	case "sure":
		msg="bu islemi gerceklesdirmek isdeyirsinizmi";
		break;
		default:
			msg=str;
			break;
			
	}
	int res=JOptionPane.showConfirmDialog(null,msg,"diqqet",JOptionPane.YES_NO_OPTION);
	if(res==0) {
		return true;
	}else {
		return false;
	}
}
}
