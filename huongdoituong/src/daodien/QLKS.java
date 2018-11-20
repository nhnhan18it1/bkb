package daodien;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class QLKS extends JFrame {
	Vector list=new Vector();
	Vector list1=new Vector();
	JLabel lblGT;
	JLabel lbltn1;
	JLabel lbltn2;
	JLabel lbltn3;
	JLabel lbltn4;
	JLabel lbltn5;
	JLabel lbltn6;
	JLabel lbltn7;
	JButton btnop1;
	JButton btnop2;
	JButton btnop3;
	JButton btnop4;
	JButton btnop5;
	JButton btnop6;
	JButton btnop7;
	public QLKS() {
	lblGT =new JLabel("Lua chon dich vu");
	lbltn1=new JLabel("1-NHAP THONG TIN");
	lbltn2=new JLabel("2-HIEN LOAI PHONG DUOC THUE NHIEU NHAT(1,2,3)");
	lbltn3=new JLabel("3-TIM TEN KHACH HANG");
	lbltn4=new JLabel("4-HIEN THI DANH SACH KHACH HANG THUE PHONG ");
	lbltn5=new JLabel("5-TINH TONG DOANH THU");
	lbltn6=new JLabel("6-HOA DON");
	lbltn7=new JLabel("7-Thoat");
	btnop1=new JButton("*");
	btnop1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	});
	btnop2=new JButton("*");
	btnop3=new JButton("*");
	btnop4=new JButton("*");
	btnop5=new JButton("*");
	btnop6=new JButton("*");
	btnop7=new JButton("*");
	Container cont=getContentPane();
	setSize(200, 300);
	setLayout(new FlowLayout());
	cont.add(lblGT);
	cont.add(btnop1);
	cont.add(lbltn1);
	cont.add(btnop2);
	cont.add(lbltn2);
	cont.add(btnop3);
	cont.add(lbltn3);
	cont.add(btnop4);
	cont.add(lbltn4);
	cont.add(btnop5);
	cont.add(lbltn5);
	cont.add(btnop6);
	cont.add(lbltn6);
	cont.add(btnop7);
	cont.add(lbltn7);
	setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new QLKS();
	}

}
