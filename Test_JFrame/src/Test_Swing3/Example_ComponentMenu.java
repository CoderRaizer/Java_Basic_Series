package Test_Swing3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ButtonGroup;
import javax.swing.JSeparator;
import javax.swing.JCheckBoxMenuItem;

public class Example_ComponentMenu extends JFrame
{

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

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
					Example_ComponentMenu frame = new Example_ComponentMenu();
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
	
	
	
	
	public Example_ComponentMenu()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 473, 350);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnColor = new JMenu("Color");
		menuBar.add(mnColor);
		
		JMenu mnDark = new JMenu("Dark");
		mnColor.add(mnDark);
		
		JMenuItem mntmBack = new JMenuItem("Back");
		mnDark.add(mntmBack);
		
		JMenuItem mntmBrown = new JMenuItem("Brown");
		mnDark.add(mntmBrown);
		
		JMenuItem mntmRed = new JMenuItem("Red");
		mnColor.add(mntmRed);
		
		JMenuItem mntmBlue = new JMenuItem("Blue");
		mnColor.add(mntmBlue);
		
		JSeparator separator = new JSeparator();
		mnColor.add(separator);
		
		JCheckBoxMenuItem chckbxmntmClear = new JCheckBoxMenuItem("Clear");
		mnColor.add(chckbxmntmClear);
		
		JCheckBoxMenuItem chckbxmntmExit = new JCheckBoxMenuItem("Exit");
		mnColor.add(chckbxmntmExit);
		
		JMenu mnHnhnh = new JMenu("Image");
		buttonGroup.add(mnHnhnh);
		menuBar.add(mnHnhnh);
		
		JRadioButtonMenuItem rdbtnmntmnhChnDung = new JRadioButtonMenuItem("Ch\u00E2n dung");
		buttonGroup.add(rdbtnmntmnhChnDung);
		mnHnhnh.add(rdbtnmntmnhChnDung);
		
		JRadioButtonMenuItem rdbtnmntmNghThut = new JRadioButtonMenuItem("Ngh\u1EC7 thu\u1EADt");
		buttonGroup.add(rdbtnmntmNghThut);
		mnHnhnh.add(rdbtnmntmNghThut);
		
		JRadioButtonMenuItem rdbtnmntmSnDu = new JRadioButtonMenuItem("S\u01A1n d\u1EA7u");
		buttonGroup.add(rdbtnmntmSnDu);
		mnHnhnh.add(rdbtnmntmSnDu);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
	}
}
