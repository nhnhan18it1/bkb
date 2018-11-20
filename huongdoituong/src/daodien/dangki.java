package daodien;

import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class dangki extends JFrame {
	JLabel lblusn;
	JTextField tfusn;
	JLabel lblpass;
	JTextField tfpass;
	JRadioButton rdbgend1;
	JRadioButton rdbgend2;
	JButton btndk;
	//tao group de nhom cac radio
	ButtonGroup bg;
	public dangki() {
	lblusn=new JLabel();
	lblusn.setText("USER NAME");
	tfusn=new JTextField(10);
	lblpass=new JLabel();
	lblpass.setText("PASS");
	tfpass=new JTextField(10);
	rdbgend1 =new JRadioButton();
	rdbgend1.setText("Nam");
	rdbgend2=new JRadioButton();
	rdbgend2.setText("Nu");
	bg=new ButtonGroup();
	bg.add(rdbgend1);
	bg.add(rdbgend2);
	btndk=new JButton("DANG KI");
	btndk.addActionListener(new ActionListener() {
		
		String gt;
		public void actionPerformed(ActionEvent e) {
			if (rdbgend1.isSelected()==true) {gt=rdbgend1.getText();
			}
			if (rdbgend2.isSelected()==true) {gt=rdbgend2.getText();
			}
		JOptionPane.showConfirmDialog(null, "USER la:"+tfusn.getText()+" Co gtla: "+gt);
		}
	});
	Container cont=getContentPane();
	setSize(500, 700);
	setLayout(new FlowLayout());
	cont.add(lblusn);
	cont.add(tfusn);
	cont.add(lblpass);
	cont.add(tfpass);
	cont.add(rdbgend1);
	cont.add(rdbgend2);
	cont.add(btndk);
	setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new dangki();
	}

}
