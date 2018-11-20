package daodien;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
import java.awt.Scrollbar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Button;

public class DN extends JFrame {

	private JPanel contentPane;
	private JTextField txtTiKhon;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DN frame = new DN();
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
	public DN() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUser = new JLabel("USER");
		lblUser.setBounds(98, 83, 67, 27);
		contentPane.add(lblUser);
		
		txtTiKhon = new JTextField();
		txtTiKhon.setToolTipText("sns");
		txtTiKhon.setBounds(165, 81, 213, 30);
		contentPane.add(txtTiKhon);
		txtTiKhon.setColumns(10);
		
		JLabel lblPass = new JLabel("PASS");
		lblPass.setBounds(98, 122, 67, 27);
		contentPane.add(lblPass);
		
		JButton btnNewButton = new JButton("DANG NHAP");
		btnNewButton.setBounds(176, 195, 119, 23);
		contentPane.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(Color.PINK);
		passwordField.setToolTipText("mat kh\u1EA9u");
		passwordField.setBounds(165, 122, 213, 27);
		contentPane.add(passwordField);
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblUser, txtTiKhon, lblPass, passwordField, btnNewButton}));
	}
}
