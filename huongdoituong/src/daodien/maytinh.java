package daodien;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class maytinh extends JFrame {
	JTextField tfht;
	String lbgt1;
	String dau;
	JButton  btncong,btntru,btnnhan,btnchia,btnbang,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0;
	private JButton btnNewButton;
public maytinh() {
	tfht=new JTextField(30);
	tfht.setText("0");
	JPanel p1=new JPanel();
	
	btn1=new JButton("1");
	btn1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			tfht.setText(tfht.getText()+btn1.getActionCommand()) ;
		}
	});
	btn0=new JButton("0");
	btn0.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			tfht.setText(tfht.getText()+btn0.getActionCommand()) ;
			
		}
	});
	btn2= new JButton("2");
	btn2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			tfht.setText(tfht.getText()+btn2.getActionCommand()) ;
		}
	});
	btn3=new JButton("3");
	btn3.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			tfht.setText(tfht.getText()+btn3.getActionCommand()) ;
		}
	});
	btn4=new JButton("4");
	btn4.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			tfht.setText(tfht.getText()+btn4.getActionCommand()) ;
		}
	});
	btn5=new JButton("5");
	btn5.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			tfht.setText(tfht.getText()+btn5.getActionCommand()) ;
		}
	});
	btn6=new JButton("6");
	btn6.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			tfht.setText(tfht.getText()+btn6.getActionCommand()) ;
		}
	});
btn7=new JButton("7");
btn7.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		tfht.setText(tfht.getText()+btn7.getActionCommand()) ;
	}
});
btn8=new JButton("8");
btn8.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		tfht.setText(tfht.getText()+btn8.getActionCommand()) ;
	}
});
btn9=new JButton("9");
btn9.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		tfht.setText(tfht.getText()+btn9.getActionCommand()) ;
	
	}
});
double kq = 0;

btnchia=new JButton("/");
btnchia.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		lbgt1=tfht.getText();
		dau="/";
		tfht.setText("0");
	}
});
btntru=new JButton("-");
btntru.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		lbgt1=tfht.getText();
		dau="-";
		tfht.setText("0");
	}
});
btnnhan=new JButton("*");
btnnhan.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		lbgt1=tfht.getText();
		dau="*";
		tfht.setText("0");
	}
});
btncong=new JButton("+");
btncong.addActionListener(new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
	lbgt1=tfht.getText();
	dau="+";
	tfht.setText("0");
	}
});
btnbang=new JButton("=");
btnbang.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
if (dau.equals("+")) {
	double gt=Double.parseDouble(lbgt1)+Double.parseDouble(tfht.getText());
	tfht.setText(String.valueOf(gt));
}
if (dau.equals("-")) {
	double gt=Double.parseDouble(lbgt1)-Double.parseDouble(tfht.getText());
	tfht.setText(String.valueOf(gt));
}
if (dau.equals("*")) {
	double gt=Double.parseDouble(lbgt1)*Double.parseDouble(tfht.getText());
	tfht.setText(String.valueOf(gt));
}
if (dau.equals("/")) {
	double gt=Double.parseDouble(lbgt1)/Double.parseDouble(tfht.getText());
	tfht.setText(String.valueOf(gt));
}
	}
});
JPanel p2 = new JPanel();
p1.add(tfht);
p2.setLayout(new GridLayout(3,4));
getContentPane().add(p2, BorderLayout.CENTER);
getContentPane().add(p1, BorderLayout.NORTH);
p2.add(btn0);
p2.add(btn1);
p2.add(btn2);
p2.add(btn3);
p2.add(btn4);
p2.add(btn5);
p2.add(btn6);
p2.add(btn7);
p2.add(btn8);
p2.add(btn9);
btnNewButton = new JButton(".");
p2.add(btnNewButton);
p2.add(btnbang);
JPanel p3=new JPanel(new GridLayout(1, 5));
getContentPane().add(p3, BorderLayout.SOUTH);

p3.add(btncong);
p3.add(btntru);
p3.add(btnnhan);
p3.add(btnchia);
setSize(400,300);
setVisible(true);
tfht.setEditable(false);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new maytinh();
	}

}
