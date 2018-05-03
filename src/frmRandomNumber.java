import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmRandomNumber extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmRandomNumber frame = new frmRandomNumber();
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
	public frmRandomNumber() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnGeneratRandomNumber = new JButton("Generat Random Number");
		btnGeneratRandomNumber.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//s = Start
				int s = 1;
				int i = 10;
				int r = s +(int) (Math.random() *i);
				JOptionPane.showMessageDialog(null, r);
			}
		});
		btnGeneratRandomNumber.setBounds(135, 70, 153, 23);
		contentPane.add(btnGeneratRandomNumber);
	}

}
