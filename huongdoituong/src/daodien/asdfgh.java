package daodien;

import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class asdfgh extends JFrame implements ActionListener {
JLabel lblSoN;
JTextField tfSoN;
JLabel lblKQ;
JTextField tfKQ;
JButton btnKQ;
public asdfgh() {
	lblSoN=new JLabel();
	lblSoN.setText("So N");
	tfSoN=new JTextField(10);
	lblKQ = new JLabel();
	lblKQ.setText("KQ");
	tfKQ=new JTextField(10);
	btnKQ=new JButton("Tinh gt");
	btnKQ.addActionListener(this);
	//tao container 
	Container cont=getContentPane();
	//set do dai rong cho frame
	setSize(500,400);
	//setlayout
	setLayout(new FlowLayout());
	cont.add(lblSoN);
	cont.add(tfSoN);
	cont.add(lblKQ);
	cont.add(tfKQ);
	cont.add(btnKQ);
	//cho phep hien thi frame
	setVisible(true);
	
}
@Override
public void actionPerformed(ActionEvent e) {
	String so=tfSoN.getText();
	int n=Integer.parseInt(so);
	int gt=1;
	for (int i = 1; i <=n; i++) {
		gt=gt*i;
		tfKQ.setText(String.valueOf(gt));
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new asdfgh();
	}
	

}
