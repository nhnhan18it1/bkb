package daodien;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ezcon extends JFrame {
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
public ezcon() {
lbls1=new JLabel("GT thu 1");
tfs1=new JTextField(10);
lbls2=new JLabel("GT Thu  2");
tfs2=new JTextField(10);
tfkq=new JTextField(10);
lblkq=new JLabel("KQ");
btcong = new JButton("+");
btcong.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		double s1=Double.parseDouble(tfs1.getText());
		double s2=Double.parseDouble(tfs2.getText());
		tfkq.setText(String.valueOf(s1+s2));
		
	}
});
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
Panel p1=new Panel();
Panel p2=new Panel();
tfkq.setEditable(false);
setSize(300,200);
p1.setLayout(new GridLayout(3, 2));
p2.setLayout(new GridLayout(1, 4));
p1.setBackground(Color.CYAN);
p1.add(lbls1);
p1.add(tfs1);
p1.add(lbls2);
p1.add(tfs2);
p2.add(btcong);
p2.add(bttru);
p2.add(btnhan);
p2.add(btchia);
p1.add(lblkq);
p1.add(tfkq);
this.add(p1,BorderLayout.NORTH);
this.add(p2,BorderLayout.SOUTH);
addWindowListener(new WindowAdapter() {
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
});
setVisible(true);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new ezcon();
	}

}
