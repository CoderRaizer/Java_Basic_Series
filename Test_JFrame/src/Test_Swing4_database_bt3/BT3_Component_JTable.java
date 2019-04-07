package Test_Swing4_database_bt3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.Color;

public class BT3_Component_JTable extends JFrame
{

	private JPanel contentPane;
	private JTextField txtname;
	private JTextField txtprice;
	private JTable table;
	
	DefaultTableModel model = new DefaultTableModel();
	
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
					BT3_Component_JTable frame = new BT3_Component_JTable();
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
	
	
	
	
	
	public void Writefile()//hàm ghi dữ liệu từ table ra file
	{
		try
		{
			FileWriter fr = new FileWriter("D://quanlycuahangdientu.txt");
			BufferedWriter br = new BufferedWriter(fr);
			
			String row;
			for(int i=0; i<model.getRowCount();i++)
			{
				row = model.getValueAt(i,0) + "\t" + model.getValueAt(i,1) + "\t" + model.getValueAt(i,2) + "\r\n";
				br.write(row);
			}
			br.close();
		}
		catch(IOException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	
	
	public void readfile()
	{
		try
		{
			FileReader fr = new FileReader("D://quanlycuahangdientu.txt");
			BufferedReader br = new BufferedReader(fr);
			String str;
			Object []row = new Object[3];
			while(br.ready())
			{
				str = br.readLine();
				row = str.split("\t");
				model.addRow(row);
			}
			br.close();
		}
		catch(IOException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	
	
	
	public BT3_Component_JTable()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 489, 325);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblProductName = new JLabel("Product Name");
		lblProductName.setBackground(Color.LIGHT_GRAY);
		lblProductName.setBounds(10, 21, 88, 23);
		panel.add(lblProductName);
		
		JLabel lblCategory = new JLabel("Category");
		lblCategory.setBounds(10, 55, 88, 23);
		panel.add(lblCategory);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(10, 85, 88, 23);
		panel.add(lblPrice);
		
		txtname = new JTextField();
		txtname.setBounds(96, 22, 178, 23);
		panel.add(txtname);
		txtname.setColumns(10);
		
		JComboBox cbCategory = new JComboBox();
		cbCategory.setModel(new DefaultComboBoxModel(new String[] {"LapTop", "SmartPhone", "Tablet", "Clock", "Pin"}));
		cbCategory.setBounds(96, 56, 178, 22);
		panel.add(cbCategory);
		
		txtprice = new JTextField();
		txtprice.setBounds(96, 86, 178, 22);
		panel.add(txtprice);
		txtprice.setColumns(10);
		
		
		
		
		JLabel lblThongbao = new JLabel("Th\u00F4ng B\u00E1o");
		lblThongbao.setForeground(Color.GRAY);
		lblThongbao.setBackground(Color.WHITE);
		lblThongbao.setBounds(10, 164, 178, 23);
		panel.add(lblThongbao);
		
		
		
		Object [] row = new Object[3];
		JButton btnAdd = new JButton("Add");
		btnAdd.setBackground(Color.PINK);
		btnAdd.setBounds(10, 133, 117, 23);
		panel.add(btnAdd);
		//su kien cho nut add
		btnAdd.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//kiểm tra chưa nhập tên sản phẩm
				String tensp = txtname.getText();
				if(tensp.equalsIgnoreCase(""))
				{
					lblThongbao.setText("Bạn chưa điền Tên sản phẩm");
					txtname.requestFocus();
					return;
				}
				
				//kiểm tra chưa nhập giá sản phẩm
				String giasp = txtprice.getText();
				if(giasp.equalsIgnoreCase(""))
				{
					lblThongbao.setText("Bạn chưa nhập giá sản phẩm");
					txtprice.requestFocus();
					return;
				}
				
				
				//đưa dữ liệu các textfiled và combobox vào 1 row  và add thêm vào model
				row[0] = txtname.getText();
				row[1] = cbCategory.getSelectedItem();
				row[2] = txtprice.getText();
				model.addRow(row);
				//gọi hàm ghi file
				Writefile();
				
				
				KetNoi_Insertdatabasez kn = new KetNoi_Insertdatabasez();
				kn.setnamesp(txtname.getText());
				kn.setdanhmucsp(cbCategory.getSelectedItem().toString());
				kn.setpricesp(txtprice.getText());
				
				kn.xacnhanthongtin();
			}
		});
		
		
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBackground(Color.YELLOW);
		btnUpdate.setBounds(157, 133, 117, 23);
		panel.add(btnUpdate);
		//Su kien cho nut update
		btnUpdate.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				int i = table.getSelectedRow();
				model.setValueAt(txtname.getText(),i,0);
				model.setValueAt(cbCategory.getSelectedItem(),i,1);
				model.setValueAt(txtprice.getText(),i,2);
				//gọi hàm ghi file
				Writefile();
			}
		});
		
		
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBackground(Color.LIGHT_GRAY);
		btnDelete.setBounds(303, 133, 117, 23);
		panel.add(btnDelete);
		//su kien cho nut delete
		btnDelete.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				int i = table.getSelectedRow();
				if(i>=0)
				{
					model.removeRow(i);
					//gọi hàm ghi file
					Writefile();
				}
			}
		});
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 198, 469, 116);
		panel.add(scrollPane);
		
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent arg0)
			{
				int i = table.getSelectedRow();
				txtname.setText(model.getValueAt(i,0).toString());
				cbCategory.setSelectedItem(model.getValueAt(i,1).toString());
				txtprice.setText(model.getValueAt(i,2).toString());
			}
		});
		scrollPane.setViewportView(table);
		Object []columns = {"Product Name","Category","Price"};
		model.setColumnIdentifiers(columns);
		table.setModel(model);
		
		
		JLabel lblNewLabel = new JLabel("HỆ THỐNG QUẢN LÝ HÀNG");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBackground(new Color(64, 224, 208));
		lblNewLabel.setBounds(303, 11, 176, 23);
		panel.add(lblNewLabel);
		
		
		
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBackground(Color.CYAN);
		btnReset.setBounds(303, 99, 117, 23);
		panel.add(btnReset);
		
		btnReset.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				txtname.setText("");
				txtprice.setText("");
				cbCategory.setSelectedIndex(0);
			}
		});
		
		
		//gọi hàm đọc file
		readfile();
		
		
	}
}

