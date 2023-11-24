package registerform;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegisterForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtRegisterForm;
	private JTextField txtName;
	private JTextField txtUsername;
	private JTextField txtEmail;
	private JTextField txtPhone;
	private JTextField txtAddress;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField txtPassword;
	private JTextField txtConfirmPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterForm frame = new RegisterForm();
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
	public RegisterForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 584, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtRegisterForm = new JTextField();
		txtRegisterForm.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtRegisterForm.setText("Register Form");
		txtRegisterForm.setBounds(10, 21, 165, 28);
		contentPane.add(txtRegisterForm);
		txtRegisterForm.setColumns(10);
		
		txtName = new JTextField();
		txtName.setBounds(174, 60, 208, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtUsername = new JTextField();
		txtUsername.setColumns(10);
		txtUsername.setBounds(174, 91, 208, 20);
		contentPane.add(txtUsername);
		
		txtEmail = new JTextField();
		txtEmail.setToolTipText("");
		txtEmail.setColumns(10);
		txtEmail.setBounds(174, 204, 208, 20);
		contentPane.add(txtEmail);
		
		txtPhone = new JTextField();
		txtPhone.setColumns(10);
		txtPhone.setBounds(174, 240, 208, 20);
		contentPane.add(txtPhone);
		
		txtAddress = new JTextField();
		txtAddress.setBounds(174, 281, 208, 20);
		contentPane.add(txtAddress);
		txtAddress.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Name:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(65, 66, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Username:");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1.setBounds(49, 94, 62, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Email:");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_2.setBounds(65, 210, 46, 14);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Phone:");
		lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_3.setBounds(65, 243, 46, 14);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Address:");
		lblNewLabel_2_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_4.setBounds(65, 284, 46, 14);
		contentPane.add(lblNewLabel_2_4);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(174, 127, 208, 20);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(174, 168, 208, 20);
		contentPane.add(passwordField_1);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(25, 346, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtUsername.setText(null);
				txtPassword.setText(null);
				txtConfirmPassword.setText(null);
			    
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(186, 346, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Close");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setBounds(357, 346, 89, 23);
		contentPane.add(btnNewButton_2);
		
		txtPassword = new JTextField();
		txtPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPassword.setText("Password:");
		txtPassword.setBounds(25, 127, 86, 20);
		contentPane.add(txtPassword);
		txtPassword.setColumns(10);
		
		txtConfirmPassword = new JTextField();
		txtConfirmPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		txtConfirmPassword.setText("Confirm Password:");
		txtConfirmPassword.setBounds(10, 168, 101, 20);
		contentPane.add(txtConfirmPassword);
		txtConfirmPassword.setColumns(10);
		
		
		
	}
}
