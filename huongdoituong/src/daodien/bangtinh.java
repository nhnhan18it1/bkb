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
import javax.swing.JPanel;

public class bangtinh extends JFrame {
	JLabel lbls1;
	JTextField tfs1;
	JLabel lbls2;
	JTextField tfs2;
	JLabel lblkq;
	JTextField tfkq;
	JButton btcong;
	JButton bttru;
	JButton btnhan;
	JButton btchia;
	private JPanel panel;
	private JPanel panel_1;
public bangtinh() {
lbls1=new JLabel("GT thu 1");
tfs1=new JTextField(10);
lbls2=new JLabel("GT Thu  2");
tfs2=new JTextField(10);
tfkq=new JTextField(10);
lblkq=new JLabel("KQ");
bttru= new JButton("-");
bttru.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		double s1=Double.parseDouble(tfs1.getText());
		double s2=Double.parseDouble(tfs2.getText());
		tfkq.setText(String.valueOf(s1-s2));
		
	}
});
btnhan= new JButton("*");
btnhan.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		double s1=Double.parseDouble(tfs1.getText());
		double s2=Double.parseDouble(tfs2.getText());
		tfkq.setText(String.valueOf(s1*s2));

	}
});
btchia=new JButton("/");
btchia.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		double s1=Double.parseDouble(tfs1.getText());
		double s2=Double.parseDouble(tfs2.getText());
		tfkq.setText(String.valueOf(s1/s2));

	}
});
//tao container 
Container cont=getContentPane();
//set do dai rong cho frame
setSize(500,400);
//setlayout
getContentPane().setLayout(new FlowLayout());
cont.add(lbls1);
cont.add(tfs1);
cont.add(lbls2);
cont.add(tfs2);
cont.add(bttru);
cont.add(btnhan);
cont.add(btchia);
btcong = new JButton("+");
btcong.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		double s1=Double.parseDouble(tfs1.getText());
		double s2=Double.parseDouble(tfs2.getText());
		tfkq.setText(String.valueOf(s1+s2));
		
	}
});
cont.add(btcong);
panel = new JPanel();
getContentPane().add(panel);
panel_1 = new JPanel();
getContentPane().add(panel_1);
cont.add(lblkq);
cont.add(tfkq);
setVisible(true);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new bangtinh();
	}

}
