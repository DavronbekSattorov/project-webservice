package Lab2Task3;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.SwingConstants;

public class FirstJframeProject extends JFrame {
	int number;
	private JLabel lblNewLabel;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstJframeProject frame = new FirstJframeProject();
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
	public FirstJframeProject() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 529, 355);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		number = 50;
		
		JButton btnNewButton = new JButton("Increment");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				number ++;
				String text = Integer.toString(number);
				lblNewLabel.setText(text);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(95, 235, 113, 32);
		contentPane.add(btnNewButton);
		
		lblNewLabel = new JLabel("50");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.CYAN);
		lblNewLabel.setBackground(Color.CYAN);
		lblNewLabel.setBounds(203, 75, 95, 32);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Decrement");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				number --;
				String text = Integer.toString(number);
				lblNewLabel.setText(text);
				
			}
		});
		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton_1.setBounds(318, 235, 124, 32);
		contentPane.add(btnNewButton_1);
		
	}
}
