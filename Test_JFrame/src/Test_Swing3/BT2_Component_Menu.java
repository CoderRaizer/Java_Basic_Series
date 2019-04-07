package Test_Swing3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSeparator;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class BT2_Component_Menu extends JFrame
{

	private JPanel contentPane;
	JTextArea textArea = new JTextArea();//tu duoi chuyen len

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
					BT2_Component_Menu frame = new BT2_Component_Menu();
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
	
	
	
	int flag;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	public BT2_Component_Menu()
	{
		flag = 0;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 548, 377);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//CHỨA CÁC THANH MENU
		JPanel panelMenu = new JPanel();
		panelMenu.setBounds(0, 0, 532, 38);
		contentPane.add(panelMenu);
		panelMenu.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 532, 40);
		panelMenu.add(menuBar);
		
		
		//---
		JMenu mnColor = new JMenu("COLOR");
		buttonGroup.add(mnColor);
		menuBar.add(mnColor);
		
		
		//red
		JRadioButtonMenuItem radiobuttonmenuitemRed = new JRadioButtonMenuItem("Red");
		buttonGroup.add(radiobuttonmenuitemRed);
		mnColor.add(radiobuttonmenuitemRed);
		
		radiobuttonmenuitemRed.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(flag == 0)
				{
					textArea.setBackground(Color.RED);
				}
				else
				{
					textArea.setForeground(Color.RED);
				}
			}
		});
		
		
		
		//blue
		JRadioButtonMenuItem radiobuttonmenuitemBlue = new JRadioButtonMenuItem("Blue");
		buttonGroup.add(radiobuttonmenuitemBlue);
		mnColor.add(radiobuttonmenuitemBlue);
		
		radiobuttonmenuitemBlue.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(flag == 0)
				{
					textArea.setBackground(Color.BLUE);
				}
				else
				{
					textArea.setForeground(Color.BLUE);
				}
			}
		});
		
		
		//yellow
		JRadioButtonMenuItem radiobuttonmenuitemYellow = new JRadioButtonMenuItem("Yellow");
		buttonGroup.add(radiobuttonmenuitemYellow);
		mnColor.add(radiobuttonmenuitemYellow);
		
		radiobuttonmenuitemYellow.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(flag == 0)
				{
					textArea.setBackground(Color.YELLOW);
				}
				else
				{
					textArea.setForeground(Color.YELLOW);
				}
			}
		});
		
		
		
		JSeparator separator = new JSeparator();
		mnColor.add(separator);
		
		JButton btnChangeForeground = new JButton("Change Foreground");//tu duoi dua len de clear
		
		JCheckBoxMenuItem ckClear = new JCheckBoxMenuItem("Clear");
		mnColor.add(ckClear);
		
		ckClear.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				textArea.setText("");
				textArea.setBackground(null);
				radiobuttonmenuitemRed.setSelected(false);
				radiobuttonmenuitemBlue.setSelected(false);
				radiobuttonmenuitemYellow.setSelected(false);
				btnChangeForeground.setBackground(null);
			}
		});
		
		
		
		JCheckBoxMenuItem ckExit = new JCheckBoxMenuItem("Exit");
		mnColor.add(ckExit);
		
		ckExit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				int chon = JOptionPane.showConfirmDialog(getParent(),"Close application?","Asking",JOptionPane.INFORMATION_MESSAGE);
				if(chon == JOptionPane.YES_OPTION)
					System.exit(0);
				if(chon == JOptionPane.NO_OPTION)
				{
					JOptionPane.showMessageDialog(getParent(),"Hello","THÔNG BÁO",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		
		
		
		//-----
		JMenu mnExit = new JMenu("Exit");
		menuBar.add(mnExit);
		
		JMenuItem mntmOpen = new JMenuItem("Open");
		mnExit.add(mntmOpen);
		
		mntmOpen.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JFileChooser f = new JFileChooser();
				int r = f.showOpenDialog(getParent());
				if(r == JFileChooser.APPROVE_OPTION)
				{
					String filename = f.getSelectedFile().getAbsolutePath();
					try
					{
						FileReader fr = new FileReader(filename);
						BufferedReader br = new BufferedReader(fr);
						
						String noidung = "";
						while(br.ready())
						{
							noidung = noidung + br.readLine() + "\r\n";
						}
						textArea.setText(noidung);
						br.close();
					}
					catch(IOException ex)
					{
						System.out.println(ex.getMessage());
					}
				}
			}
		});
		
		JMenuItem mntmSave = new JMenuItem("Save");
		mnExit.add(mntmSave);
		
		mntmSave.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JFileChooser f = new JFileChooser();
				int chon = f.showSaveDialog(getParent());
				
				if(chon == f.APPROVE_OPTION)
				{
					String filename = f.getSelectedFile().getAbsolutePath();
					try
					{
						FileWriter fr = new FileWriter(filename);
						BufferedWriter br = new BufferedWriter(fr);
						String noidung = textArea.getText();
						br.write(noidung);
						br.close();
					}
					catch(IOException ex)
					{
						System.out.println(ex.getMessage());
					}
				}
			}
		});
		
		
		
		JMenu mnAbout = new JMenu("About");
		menuBar.add(mnAbout);
		
		JMenuItem mntmAboutjava = new JMenuItem("about-Java");
		mnAbout.add(mntmAboutjava);
		
		mntmAboutjava.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(getParent(),"Duy Khánh\nVersion>0309.2017\nsetTime:now","Về chúng tôi",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		
		//CHỨA THANH CÓ BUTTON ĐỔI BACKGROUND
		JPanel panelToolbar = new JPanel();
		panelToolbar.setBounds(0, 41, 532, 49);
		contentPane.add(panelToolbar);
		panelToolbar.setLayout(null);
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar_1.setBounds(10, 11, 501, 27);
		panelToolbar.add(menuBar_1);
		
		//dua khai bao len tren de set clear
		btnChangeForeground.setBounds(10, 15, 171, 23);
		panelToolbar.add(btnChangeForeground);
		
		btnChangeForeground.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				if(flag == 0)
				{
					flag = 1;
					btnChangeForeground.setText("ChangeBackground");
				}
				else
				{
					flag = 0;
					btnChangeForeground.setText("ChangeForeground");
				}
			}
		});
		
		
		
		//CHỨA TEXT AREA
		JPanel panelText = new JPanel();
		panelText.setBounds(10, 90, 512, 236);
		contentPane.add(panelText);
		panelText.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 492, 214);
		panelText.add(scrollPane);
		//khai bao da duoc chuyen len tren
		scrollPane.setViewportView(textArea);
	}
	
}
