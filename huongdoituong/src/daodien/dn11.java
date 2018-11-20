package daodien;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class dn11 extends JFrame {

	private JPanel contentPane;
	private JTextField tfuser;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dn11 frame = new dn11();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public dn11() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("USERNAME");
		lblUsername.setBounds(31, 68, 75, 27);
		contentPane.add(lblUsername);
		
		tfuser = new JTextField();
		tfuser.setBounds(116, 71, 145, 20);
		contentPane.add(tfuser);
		tfuser.setColumns(10);
		
		JButton btnDangNhap = new JButton("DANG NHAP");
		btnDangNhap.setBounds(159, 217, 89, 23);
		contentPane.add(btnDangNhap);
	}
}
