package Test_Swing2;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Calendar;
import java.util.Hashtable;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import java.awt.Color;

public class BT4_Slider extends JFrame
{
	private JPanel PanelCover;
	private JTextField txtGtri;
	private JTextField txtMua;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)//không liên quan đến code ở đây
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					BT4_Slider frame = new BT4_Slider();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public BT4_Slider()
	{
		//PANEL bao bọc been ngoài
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 815, 428);
		PanelCover = new JPanel();
		PanelCover.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(PanelCover);
		PanelCover.setLayout(null);
		////////////////////////////PANEL COVER//////////////////////////////////
		
		
		//PANEL_1
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 263, 133);
		PanelCover.add(panel_1);//PANEL lớn nhất bao bọc bên ngoài panel_1 mới tạo
		panel_1.setLayout(null);
		
		JLabel labelGiaTri = new JLabel("Gi\u00E1 tr\u1ECB");
		labelGiaTri.setBounds(29, 23, 46, 14);
		panel_1.add(labelGiaTri);//panel_1 them 1 label vao
		
		//đặt lên trước line 86 để có giá trị xác nhận vào setText
		txtGtri = new JTextField();
		txtGtri.setBounds(98, 44, 86, 20);
		txtGtri.setColumns(10);
		panel_1.add(txtGtri);
		
		JSlider slider = new JSlider();
		slider.setPaintLabels(true);
		slider.setBounds(29, 75, 200, 45);
		slider.setMinorTickSpacing(5);
		slider.setMajorTickSpacing(10);
		slider.setValue(0);
		slider.setSnapToTicks(true);
		slider.setPaintTicks(true);
		panel_1.add(slider);
		
		slider.addChangeListener(new ChangeListener()
		{
			public void stateChanged(ChangeEvent e)
			{
				//CODE//
				int gtri = slider.getValue();
				txtGtri.setText(String.valueOf(gtri));

			}
		});
		
		////////////////////////////////////////////////////////////////
		
		
		//PANEL_2
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 162, 263, 97);
		PanelCover.add(panel_2);
		panel_2.setLayout(null);
		
		txtMua = new JTextField();//đặt trước lên đây để có giá trị set
		txtMua.setBackground(Color.GREEN);
		txtMua.setBounds(10, 11, 86, 20);
		panel_2.add(txtMua);
		txtMua.setColumns(10);
		
		JSlider sliderMua = new JSlider();
		sliderMua.setMaximum(3);
		sliderMua.setMajorTickSpacing(1);
		sliderMua.setPaintLabels(true);
		sliderMua.setSnapToTicks(true);
		sliderMua.setPaintTicks(true);
		sliderMua.setBounds(20, 42, 212, 51);
		panel_2.add(sliderMua);
		
		String[] mua = { "Vàng", "Xanh", "Đỏ", "Tím" };
		Hashtable<Integer, JLabel> h = new Hashtable<>();
		for (int i = 0; i < mua.length; i++)
			h.put(i, new JLabel(mua[i]));
		sliderMua.setLabelTable(h);
		sliderMua.setValue(0);
		//tạo sự kiện cho nút slider
		sliderMua.addChangeListener(new ChangeListener()
		{
			public void stateChanged(ChangeEvent e)
			{
				int gtri = sliderMua.getValue();
				txtMua.setText(String.valueOf(mua[gtri]));
			}
		});
		
		////////////////////////////////////////////////////////////////
		
		
		
		
		//PANEL_3
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 281, 307, 97);
		PanelCover.add(panel_3);
		panel_3.setLayout(null);
		
		//tao button
		JButton btnAlert = new JButton("Alert");
		btnAlert.setBackground(Color.PINK);
		btnAlert.setBounds(10, 38, 89, 23);
		panel_3.add(btnAlert);
		
		//tạo sự kiện cho button alert
		btnAlert.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				//CODE//
				JOptionPane.showMessageDialog(getParent(), "Hello", "Thong bao", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		
		//tao button
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setBackground(Color.PINK);
		btnConfirm.setBounds(109, 38, 89, 23);
		panel_3.add(btnConfirm);
		
		//tạo sự kiện cho button confirm
		btnConfirm.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//CODE//
				int choice = JOptionPane.showConfirmDialog(getParent(), "Close form ?", "Asking",
						JOptionPane.ERROR_MESSAGE);
				if (choice == JOptionPane.YES_OPTION)
					System.exit(0);
				else
					JOptionPane.showMessageDialog(getParent(), "Hello");
			}
		});
		
		
		//tạo button
		JButton btnInput = new JButton("Input");
		btnInput.setBackground(Color.PINK);
		btnInput.setBounds(208, 38, 89, 23);
		panel_3.add(btnInput);
		btnInput.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String noidung = JOptionPane.showInputDialog(getParent(), "1+1 = ?");
				if (noidung.equals("2"))
					JOptionPane.showMessageDialog(getParent(), "Dung");
				else
					JOptionPane.showMessageDialog(getParent(), "Sai");
			}
		});
		
		
		
		//////////////////////////////////////////////////
		
		
		
		//PANEL_4
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(319, 11, 480, 377);
		PanelCover.add(panel_4);
		panel_4.setLayout(null);
		
		
		
		JPanel PanelSelectedDate = new JPanel();
		PanelSelectedDate.setBorder(new TitledBorder(null, "CHOICE TIME", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		PanelSelectedDate.setBounds(10, 11, 441, 86);
		panel_4.add(PanelSelectedDate);
		PanelSelectedDate.setLayout(null);
		
		JLabel labelSelectedDate= new JLabel(" ");//khoang trang
		labelSelectedDate.setBounds(21, 21, 399, 54);
		PanelSelectedDate.add(labelSelectedDate);//được PanelSelectedDate chứa bên trong
		labelSelectedDate.setToolTipText("KÉO SLIDER");//tạo hiển thị gợi nhắc khi đưa chuột vào vùng của labelselecteDate
		
		
		//panel chứa slider year
		JPanel PanelYear = new JPanel();
		PanelYear.setBorder(new TitledBorder(null, "Year", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		PanelYear.setBounds(10, 108, 441, 68);
		panel_4.add(PanelYear);
		PanelYear.setLayout(null);
		
		JSlider sliderYear = new JSlider();
		sliderYear.setBounds(10, 21, 427, 45);
		sliderYear.setPaintTicks(true);
		sliderYear.setSnapToTicks(true);
		sliderYear.setMinorTickSpacing(1);
		sliderYear.setMinimum(2000);
		sliderYear.setMaximum(2020);
		sliderYear.setPaintLabels(true);
		sliderYear.setMajorTickSpacing(5);
		PanelYear.add(sliderYear);
		
		//panel chứa slider month
		JPanel PanelMonth = new JPanel();
		PanelMonth.setBorder(new TitledBorder(null, "Month", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		PanelMonth.setBounds(10, 190, 441, 73);
		panel_4.add(PanelMonth);
		
		JSlider sliderMonth = new JSlider();
		sliderMonth.setSnapToTicks(true);
		sliderMonth.setBounds(10, 21, 427, 45);
		sliderMonth.setPaintLabels(true);
		sliderMonth.setPaintTicks(true);
		sliderMonth.setMajorTickSpacing(1);
		sliderMonth.setMaximum(11);
		
		
		////////////////////// code//////////////////////do là khi hiển thị dạng chữ nên cần code định dạng lại
		String[] strMonth = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		Hashtable<Integer, JLabel> hm = new Hashtable<>();
		for (int i = 0; i < strMonth.length; i++)
		hm.put(i, new JLabel(strMonth[i]));
		sliderMonth.setLabelTable(hm);
		PanelMonth.setLayout(null);
		sliderMonth.setValue(0);
		PanelMonth.add(sliderMonth);
		
		
		//panel chứa slider day
		JPanel PanelDay = new JPanel();
		PanelDay.setBorder(new TitledBorder(null, "Day", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		PanelDay.setBounds(10, 273, 441, 80);
		panel_4.add(PanelDay);
		PanelDay.setLayout(null);
		
		JSlider sliderDay = new JSlider();
		sliderDay.setValue(0);
		sliderDay.setSnapToTicks(true);
		sliderDay.setPaintTicks(true);
		sliderDay.setPaintLabels(true);
		sliderDay.setMinimum(1);
		sliderDay.setMaximum(31);
		sliderDay.setMajorTickSpacing(5);
		sliderDay.setMinorTickSpacing(1);
		sliderDay.setBounds(10, 23, 431, 45);
		PanelDay.add(sliderDay);
		
		
		///////////////////////////////TỔNG HỢP SLIDER THỐNG NHẤT HIỆU ỨNG//////////////////////////////////
		sliderYear.addChangeListener(new ChangeListener()
		{
			public void stateChanged(ChangeEvent arg0)
			{
				int gtriYear = sliderYear.getValue();
				int gtriMonth = sliderMonth.getValue();
				int gtriDay = sliderDay.getValue();
				
				Calendar cal = Calendar.getInstance();
				cal.set(gtriYear,gtriMonth,gtriDay);
				Date d = cal.getTime();
				SimpleDateFormat sdf = new SimpleDateFormat("EEEE, MMMM dd, yyyy");
				String strDate = sdf.format(d);
				labelSelectedDate.setText(strDate);
			}
		});
		
		
		sliderMonth.addChangeListener(new ChangeListener()
		{
			public void stateChanged(ChangeEvent e)
			{
				int gtriYear = sliderYear.getValue();
				int gtriMonth = sliderMonth.getValue();
				int gtriDay = sliderDay.getValue();
				Calendar cal = Calendar.getInstance();
				cal.set(gtriYear,gtriMonth,gtriDay);
				Date d = cal.getTime();
				SimpleDateFormat sdf = new SimpleDateFormat("EEEE, MMMM dd, yyyy");
				String strDate = sdf.format(d);
				labelSelectedDate.setText(strDate);
			}
		});
		//mỗi khi có sự thay đổi 1 slider thì các giá trị sẽ được triển khai mới lại
		sliderDay.addChangeListener(new ChangeListener()
		{
			public void stateChanged(ChangeEvent e)
			{
				int gtriYear = sliderYear.getValue();
				int gtriMonth = sliderMonth.getValue();
				int gtriDay = sliderDay.getValue();
				Calendar cal = Calendar.getInstance();
				cal.set(gtriYear,gtriMonth,gtriDay);
				Date d = cal.getTime();
				SimpleDateFormat sdf = new SimpleDateFormat("EEEE, MMMM dd, yyyy");
				String strDate = sdf.format(d);
				labelSelectedDate.setText(strDate);
			}
		});
	}
}