package Test_Swing2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class BT3_Slider extends JFrame
{

	private JPanel PanelSlider;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()//khong lien quan code o day
		{
			public void run()
			{
				try
				{
					BT3_Slider frame = new BT3_Slider();
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
	public BT3_Slider()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 479, 181);
		PanelSlider = new JPanel();
		PanelSlider.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(PanelSlider);
		PanelSlider.setLayout(null);
		
		JButton btnAlert = new JButton("Alert");
		btnAlert.setBounds(53, 64, 89, 23);
		PanelSlider.add(btnAlert);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setBounds(184, 64, 89, 23);
		PanelSlider.add(btnConfirm);
		
		JButton btnInput = new JButton("Input");
		btnInput.setBounds(314, 64, 89, 23);
		PanelSlider.add(btnInput);
		
		
		//tao su kien cho nut Alert
		btnAlert.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(getParent(),"Hello Duy Khánh nè","Thông báo",JOptionPane.INFORMATION_MESSAGE);
			}
		});//end
		
		
		//tao su kien cho nut confirm
		btnConfirm.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				// TODO Auto-generated method stub
				int chon = JOptionPane.showConfirmDialog(getParent(),"Close Form?","Asking",JOptionPane.ERROR_MESSAGE);
				
				if(chon == JOptionPane.YES_OPTION)
					System.exit(0);
				if(chon == JOptionPane.NO_OPTION)
					JOptionPane.showMessageDialog(getParent(), "Hello");
			}
		});//end
		
		
		
		//tao su kien cho nut Input
		btnInput.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				// TODO Auto-generated method stub
				String noidung = JOptionPane.showInputDialog(getParent(),"1 + 1 = ?");
				if(noidung.equals("2"))
				JOptionPane.showMessageDialog(getParent(),"Thông Minh đấy");
				else
				JOptionPane.showMessageDialog(getParent(),"NGu VCl");
			}
		});
		
		
		
	}
	
	
}
