package Test_Swing4;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.List;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BT1_Component_Jlist extends JFrame
{

	private JPanel contentPane;
	
	String []s1 = {"Khánh","Minh","Thảo","Bích","Long"};
	Vector<String> v1 = new Vector<String>();
	Vector<String> v2 = new Vector<String>();
	
	
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
					BT1_Component_Jlist frame = new BT1_Component_Jlist();
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
	
	
	
	public BT1_Component_Jlist()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 532, 372);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 496, 310);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JList list1 = new JList();
		list1.setBounds(10, 71, 174, 228);
		panel.add(list1);
		//Chuyển chuỗi s1 vào vector sau đó chuyển vecto vao list1
		v1.addAll(Arrays.asList(s1));
		list1.setListData(v1);
		
		
		JList list2 = new JList();
		list2.setBounds(312, 71, 174, 228);
		panel.add(list2);
		
		//-------BUTTON 1---------
		JButton button1 = new JButton(">");
		button1.setBounds(202, 71, 89, 23);
		panel.add(button1);
		
		button1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				List chonnhieu = list1.getSelectedValuesList();
				
				v2.addAll(chonnhieu);
				v1.removeAll(chonnhieu);
				
				list1.setListData(v1);
				list2.setListData(v2);
			}
		});
		
		
		//-------BUTTON 2------
		JButton button2 = new JButton("<");
		button2.setBounds(202, 121, 89, 23);
		panel.add(button2);
		
		button2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				List chonnhieu = list2.getSelectedValuesList();
				
				v1.addAll(chonnhieu);
				v2.removeAll(chonnhieu);
				
				list1.setListData(v1);
				list2.setListData(v2);
			}
		});
		
		
		
		
		//---------BUTTON 3---------
		JButton button3 = new JButton(">>");
		button3.setBounds(202, 224, 89, 23);
		panel.add(button3);
		
		button3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				v2.addAll(v1);
				v1.removeAllElements();
				
				list1.setListData(v1);
				list2.setListData(v2);
			}
		});
		
		
		//----------BUTTON 4---------
		JButton button4 = new JButton("<<");
		button4.setBounds(202, 276, 89, 23);
		panel.add(button4);
		
		button4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				v1.addAll(v2);
				v2.removeAllElements();
				
				list1.setListData(v1);
				list2.setListData(v2);
			}
		});
		
		JLabel lblList1 = new JLabel("LIST 1");
		lblList1.setBounds(10, 28, 174, 29);
		panel.add(lblList1);
		
		JLabel lblList2 = new JLabel("LIST 2");
		lblList2.setBounds(312, 28, 174, 32);
		panel.add(lblList2);
	}
}
