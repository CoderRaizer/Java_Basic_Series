package Test_Swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class start_JFrame extends JFrame
{

	private JPanel contentPane;
	private JTextField txtHoten;
	private JTextField txtEmail;


	
	public static void main(String[] args)//khong can thiep den vung nay
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					start_JFrame frame = new start_JFrame();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
	
	

	
	public start_JFrame()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 541, 368);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		////PANEL FROMDANGKY
		JPanel PanelFormDangKy = new JPanel();
		PanelFormDangKy.setBounds(10, 11, 418, 99);
		contentPane.add(PanelFormDangKy);
		PanelFormDangKy.setLayout(null);
		
		JLabel labelFromDangKy = new JLabel("FROM \u0110\u0102NG K\u00DD");
		labelFromDangKy.setBounds(133, 0, 125, 25);
		PanelFormDangKy.add(labelFromDangKy);
		
		JLabel labelHoten = new JLabel("H\u1ECD T\u00EAn");
		labelHoten.setBounds(10, 34, 51, 25);
		PanelFormDangKy.add(labelHoten);
		
		txtHoten = new JTextField();
		txtHoten.setBounds(69, 36, 258, 18);
		PanelFormDangKy.add(txtHoten);
		txtHoten.setColumns(10);
		
		JLabel labelEmail = new JLabel("Email");
		labelEmail.setBounds(10, 70, 51, 25);
		PanelFormDangKy.add(labelEmail);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(69, 70, 258, 18);
		PanelFormDangKy.add(txtEmail);
		txtEmail.setColumns(10);
		
		
		
		////PANEL GIOITINH
		JPanel PanelGioiTinh = new JPanel();
		PanelGioiTinh.setBounds(430, 11, 95, 99);
		contentPane.add(PanelGioiTinh);
		PanelGioiTinh.setLayout(null);
		
		JLabel labelGioiTinh = new JLabel("Gi\u1EDBi T\u00EDnh");
		labelGioiTinh.setBounds(0, 11, 58, 21);
		PanelGioiTinh.add(labelGioiTinh);
		
		JRadioButton rdNam = new JRadioButton("Nam");
		rdNam.setBounds(6, 39, 67, 23);
		PanelGioiTinh.add(rdNam);
		
		JRadioButton rdNu = new JRadioButton("N\u1EEF");
		rdNu.setBounds(6, 69, 109, 23);
		PanelGioiTinh.add(rdNu);
		//Tao nhom cho radio button (bat tat thay phien)
		ButtonGroup GroupGioiTinh = new ButtonGroup();
		GroupGioiTinh.add(rdNam);		
		GroupGioiTinh.add(rdNu);
		
		
		////PANEL SOTHICH
		JPanel PanelSothich = new JPanel();
		PanelSothich.setBounds(10, 111, 515, 53);
		contentPane.add(PanelSothich);
		PanelSothich.setLayout(null);
		
		JLabel sothich = new JLabel("S\u1EDF Th\u00EDch");
		sothich.setBounds(0, 0, 81, 25);
		PanelSothich.add(sothich);
		
		JCheckBox ckGame = new JCheckBox("Game");
		ckGame.setBounds(41, 23, 97, 23);
		PanelSothich.add(ckGame);
		
		JCheckBox ckDocSach = new JCheckBox("\u0110\u1ECDc s\u00E1ch");
		ckDocSach.setBounds(180, 23, 97, 23);
		PanelSothich.add(ckDocSach);
		
		JCheckBox ckHocTiengAnh = new JCheckBox("H\u1ECDc ti\u1EBFng Anh");
		ckHocTiengAnh.setBounds(323, 23, 122, 23);
		PanelSothich.add(ckHocTiengAnh);
		
		
		////PANEL TRINHDO
		JPanel PanelTrinhDo = new JPanel();
		PanelTrinhDo.setBounds(10, 167, 515, 105);
		contentPane.add(PanelTrinhDo);
		PanelTrinhDo.setLayout(null);
		
		JLabel labelTrinhDo = new JLabel("Tr\u00ECnh \u0110\u1ED9");
		labelTrinhDo.setBounds(10, 11, 78, 24);
		PanelTrinhDo.add(labelTrinhDo);
		
		JComboBox cbTrinhDo = new JComboBox();
		cbTrinhDo.setModel(new DefaultComboBoxModel(new String[] {"TRUNG H\u1ECCC", "\u0110\u1EA0I H\u1ECCC", "CAO H\u1ECCC", "KH\u00D4NG B\u1EB0NG C\u1EA4P"}));
		cbTrinhDo.setBounds(10, 31, 128, 20);
		PanelTrinhDo.add(cbTrinhDo);
		
		JLabel labelYkien = new JLabel("\u00DD ki\u1EBFn th\u00EAm");
		labelYkien.setBounds(178, 16, 93, 14);
		PanelTrinhDo.add(labelYkien);
		
		JScrollPane scrollPane = new JScrollPane();//scrollPane chua textYkien
		scrollPane.setBounds(178, 31, 327, 63);
		PanelTrinhDo.add(scrollPane);
		JTextArea textYkien = new JTextArea();
		scrollPane.setViewportView(textYkien);
		
		
		
		////PANEL THONG BAO
		JPanel PanelThongBao = new JPanel();
		PanelThongBao.setBounds(10, 271, 515, 66);
		contentPane.add(PanelThongBao);
		PanelThongBao.setLayout(null);
		
		JLabel txtKq = new JLabel("M\u1EDDi b\u1EA1n \u0111i\u1EC1n \u0111\u1EA7y \u0111\u1EE7 th\u00F4ng tin");
		txtKq.setBounds(10, 0, 194, 25);
		PanelThongBao.add(txtKq);
		
		
		JButton btnDangKy = new JButton("\u0110\u0103ng k\u00FD");
		btnDangKy.setBounds(170, 32, 89, 23);
		PanelThongBao.add(btnDangKy);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(295, 32, 89, 23);
		PanelThongBao.add(btnReset);
		
		//cai dat su kien cho nut dang ky
		btnDangKy.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				// TODO Auto-generated method stub
				
					//kiem tra khong duoc bo trong ho ten
					String hoten = txtHoten.getText();
					if(hoten.equalsIgnoreCase(""))
					{
						txtKq.setText("Bạn chưa điền họ tên");
						txtHoten.requestFocus();
						return;
					}
					//kiem tra khong duoc bo trong email
					String email = txtEmail.getText();
					if(email.equalsIgnoreCase(""))
					{
						txtKq.setText("Bạn chưa điền Email");
						txtEmail.requestFocus();
						return;
					}
					//kiem tra email theo dung chuan
					String mau = "^[a-zA-Z0-9]+@[a-zA-Z]+(\\.[a-zA-Z]{2,4}){1,2}$";
					Pattern p = Pattern.compile(mau);
					Matcher m = p.matcher(email);
					if(!m.matches())
					{
						txtKq.setText("Email không đúng chuẩn");
						txtEmail.requestFocus();
						return;
					}
					//kiem tra radio button phai duoc chon
					if(!(rdNam.isSelected() || rdNu.isSelected()))
					{
						txtKq.setText("Bạn chưa chon giới tính");
						rdNam.requestFocus();//chi can 1 bien thoi,bien nao cung duoc
						return;
					}
					//kiem tra checkbox phai duoc chon
					if(!(ckGame.isSelected() || ckDocSach.isSelected() || ckHocTiengAnh.isSelected()))
					{
						txtKq.setText("Bạn chưa chọn sở thích");
						ckGame.requestFocus();
						return;
					}
					//kiem tra combobox phai duoc chon
					int chon = cbTrinhDo.getSelectedIndex();
					if(chon==0)
					{
						txtKq.setText("Bạn chưa chọn bằng cấp");
						cbTrinhDo.requestFocus();
						return;
					}
					
					else
					{
						System.out.println("Đã Đăng Ký");
					}
					
					
					//bo sung code de luu vao file
					Student a = new Student(txtHoten.getText(),txtEmail.getText());
					try
					{
						FileWriter fr = new FileWriter("D://file_Fromdangky_SwingJava.txt");
						BufferedWriter br = new BufferedWriter(fr);
						br.write(a.toString());
						br.close();
					}
					catch(IOException b)
					{
						b.printStackTrace();
					}
					
					JOptionPane.showMessageDialog(getParent(),"Chúc mừng đăng ký thành công");
					
					
					
					//bo sung coce de dua vao database
					KetNoi_Insertdatabase kn = new KetNoi_Insertdatabase();
					kn.sethoten(txtHoten.getText());
					kn.setemail(txtEmail.getText());
					kn.xacnhandangky();
					
			}
		});//end
		
		
		//cai dat su kien cho nut reset
		btnReset.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				// TODO Auto-generated method stub
				txtHoten.setText("");
				txtEmail.setText("");
				GroupGioiTinh.clearSelection();
				ckDocSach.setSelected(false);
				ckGame.setSelected(false);
				ckHocTiengAnh.setSelected(false);
				
				cbTrinhDo.setSelectedIndex(0);
				textYkien.setText("");
				txtKq.setText("Mời bạn điền đầy đủ thông tin");
			}
		});//end
		
		
		//neu cac thong tin dien vao dieu hop le tien hanh luu thong tin (gom: ho ten va email) vao file
		//--->Xay dung class Student-->them doan code (*) vao su kien cua nut dang ky	
	}
	
}
