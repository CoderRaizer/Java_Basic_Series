package Test_Swing4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BT2_Component_JTabbPanel extends JFrame
{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					BT2_Component_JTabbPanel frame = new BT2_Component_JTabbPanel();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	
	
	
	public BT2_Component_JTabbPanel()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 523, 374);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 487, 312);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(241, 5, 5, 5);
		panel.add(tabbedPane);
		
		JTabbedPane tabbedpane = new JTabbedPane(JTabbedPane.TOP);
		tabbedpane.setBounds(10, 5, 467, 296);
		panel.add(tabbedpane);
		
		JPanel panel_1 = new JPanel();
		tabbedpane.addTab("Register", null, panel_1, null);
		panel_1.setLayout(null);
		
		
		JButton btnTabAbout = new JButton("Tab About");
		btnTabAbout.setBounds(10, 11, 120, 30);
		panel_1.add(btnTabAbout);
		
		
		JPanel panel_2 = new JPanel();
		tabbedpane.addTab("Login", null, panel_2, null);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		tabbedpane.addTab("About", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblGreenAcademyVietnam = new JLabel("Green Academy Vietnam");
		lblGreenAcademyVietnam.setBounds(10, 11, 274, 31);
		panel_3.add(lblGreenAcademyVietnam);
	}
}
