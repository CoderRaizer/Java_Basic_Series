package Test_Swing2;

import java.awt.EventQueue;
import java.util.Hashtable;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Color;

public class BT2_Slider extends JFrame
{

	private JPanel Panel_Slider;
	private JTextField textcolor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)//khong lien quan den day
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					BT2_Slider frame = new BT2_Slider();
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
	
	
	
	
	public BT2_Slider()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 485, 338);
		Panel_Slider = new JPanel();
		Panel_Slider.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Panel_Slider);
		Panel_Slider.setLayout(null);
		
		JSlider slider = new JSlider();
		slider.setBackground(Color.GRAY);

		slider.setMajorTickSpacing(1);
		slider.setSnapToTicks(true);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setMaximum(3);
		slider.setBounds(31, 85, 372, 45);
		Panel_Slider.add(slider);
		
		//bien hien ra ten color
		textcolor = new JTextField();
		textcolor.setBackground(Color.ORANGE);
		textcolor.setBounds(38, 42, 99, 20);
		Panel_Slider.add(textcolor);
		textcolor.setColumns(10);
		
		
		
		//doan code tao ra truoc khi code trong su kien
		String []chuoi = {"Vàng","Xanh","Đỏ","Tím"};
		Hashtable<Integer,JLabel> h = new Hashtable<Integer,JLabel>();
		for(int i=0;i<chuoi.length;i++)
		h.put(i,new JLabel(chuoi[i]));
		slider.setLabelTable(h);
		slider.setValue(0);
		
		slider.addChangeListener(new ChangeListener()
		{
			public void stateChanged(ChangeEvent e)
			{
				int giatri = slider.getValue();
				textcolor.setText(String.valueOf(chuoi[giatri]));
			}
		});//end
		
		
	}

}
