package Test_Swing2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class BT1_Slider extends JFrame
{

	private JPanel PanelSlider;
	private JTextField ogiatri;

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
					BT1_Slider frame = new BT1_Slider();
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
	public BT1_Slider()
	{
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 557, 354);
		PanelSlider = new JPanel();
		PanelSlider.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(PanelSlider);
		PanelSlider.setLayout(null);
		
		
		
		//label giá tri
		JLabel labelGiaTri = new JLabel("Gi\u00E1 Tr\u1ECB");
		labelGiaTri.setBounds(31, 103, 61, 27);
		PanelSlider.add(labelGiaTri);
		
		ogiatri = new JTextField();
		ogiatri.setBounds(75, 106, 47, 20);
		PanelSlider.add(ogiatri);
		ogiatri.setColumns(10);//can phai dat gia tri nay o tren ham tao su kien cua slider
		
		
		
		//NEW SLIDER
		JSlider slider = new JSlider();
		slider.addChangeListener(new ChangeListener()//tao su kien cho Slider
		{
			public void stateChanged(ChangeEvent arg0)
			{
				int giatri = slider.getValue();
				ogiatri.setText(String.valueOf(giatri));
			}
		});
		
		
		slider.setValue(0);
		slider.setSnapToTicks(true);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setMinorTickSpacing(5);
		slider.setMajorTickSpacing(10);
		slider.setBounds(47, 27, 351, 56);
		PanelSlider.add(slider);
		
	}
}
