package BT4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class Ketnoi {

	public static void main(String[] args) {
		Scanner o = new Scanner(System.in);

		MyConnect cn = new MyConnect();
		Connection con = cn.getcn();

		if (con != null) {
			System.out.println("KET NOI SQL-JAVA THANH CONG");
		} else {
			System.out.print("KET NOI SQL - JAVA THAT BAI");
		}

		int x = 0;
		do {
			String username = null;
			String password = null;
			System.out.print("::> Nhap username: ");
			username = o.nextLine();
			o = new Scanner(System.in);
			System.out.print("::> Nhap password: ");
			password = o.nextLine();

			String sql = "SELECT * FROM ADMIN WHERE username = ? AND role = 1";
			try {
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, username);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					if (username.equals(rs.getString("username"))) {
						if (password.equals(rs.getString("password"))) {
							System.out.println("Login success\n");
							x = 1;
						} else {
							System.out.println("Sai Mat Khau");
						}
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} while (x == 0);

		int luachon;
		do {
			System.out.println("---QUAN LY---");
			System.out.println("1.QUAN LY DANH MUC");
			System.out.println("2.QUAN LY SACH");
			System.out.println("3>EXIT");
			System.out.println("choice: ");
			luachon = o.nextInt();


			if (luachon == 1) {
				int choice1;
				do {
					System.out.println("---CHUC NANG---");
					System.out.println("1.Xem toan bo danh muc");
					System.out.println("2.Xem tat ca sach trong danh muc + so luong sach");
					System.out.println("3.Them 1 danh muc moi");
					System.out.println("4.Xoa danh muc");// phai thong bao voi nguoi dung khi danh muc con sach
					System.out.println("5.Sua ten 1 danh muc");
					System.out.println("6>EXIT CHUC NANG QUAN LY DANH MUC");
					System.out.print("choice: ");
					choice1 = o.nextInt();

					switch (choice1) {

					case 1: {
						String sql = "SELECT * FROM Category";
						try {
							PreparedStatement ps = con.prepareStatement(sql);
							ResultSet rs = ps.executeQuery();
							while (rs.next()) {
								System.out.println(rs.getString("IDcate") + ":  " + rs.getString("name"));
							}
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
					break;
					// ---------------------------------//
					case 2: {
						String id;
						System.out.println("Enter IDcate: ");
						o = new Scanner(System.in);
						id = o.nextLine();
						String sql = "SELECT title FROM Book WHERE IDcate = ?";// BO SUNG CHUC NANG SO LUONG SAU
						try {
							PreparedStatement ps = con.prepareStatement(sql);
							ps.setString(1, id);
							ResultSet rs = ps.executeQuery();
							while (rs.next()) {
								System.out.println(rs.getString("title"));
							}
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
					break;
					// --------------------------------//
					case 3: {
						String IDcateInput;
						String nameInput;
						o = new Scanner(System.in);
						System.out.print("Enter New IDcate: ");
						IDcateInput = o.nextLine();

						String kt = "SELECT IDcate FROM Category WHERE IDcate = ?";
						String sql = "INSERT INTO Category VALUES(?,?)";
						try {
							PreparedStatement ps = con.prepareStatement(kt);
							ps.setString(1, IDcateInput);
							ResultSet rs = ps.executeQuery();

							if (rs.next()) {
								System.out.println("EXIST ALREADY IDcate");
							}

							else {
								System.out.println("Enter New name: ");
								nameInput = o.nextLine();
								PreparedStatement ps1 = con.prepareStatement(sql);
								ps1.setString(1, IDcateInput);
								ps1.setString(2, nameInput);
								int kq = ps1.executeUpdate();
								if (kq == 1) {
									System.out.println("ADD new one Category SUCCESS");
								}
							}

						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
						break;
					// -----------------------//
					case 4: {
						String IDcate;
						o = new Scanner(System.in);
						System.out.println("Enter IDcate want delete: ");
						IDcate = o.nextLine();

						String query_kt = "SELECT IDcate FROM Book WHERE IDcate = ?";
						String query_del_cate = "DELETE FROM Category WHERE IDcate = ?";
						try {
							PreparedStatement ps = con.prepareStatement(query_kt);
							ps.setString(1, IDcate);
							ResultSet rs = ps.executeQuery();
							if (rs.next()) {
								System.out.println("EXIST something a book of Category,Can't delete");
								System.out.println("Are you want to delete any book of IDcate existing???");
								int choice;
								System.out.println("Choice (1:Yes / Other:No   ");choice = o.nextInt();
								if(choice == 1) {
									String sql_del_book = "DELETE FROM Book WHERE IDcate=?";
									PreparedStatement ps1 = con.prepareStatement(sql_del_book);
									ps1.setString(1, IDcate);
									int res = ps1.executeUpdate();
									if(res == 1) {
										System.out.println("DELETE SUCCESS");
									}
								}
							}
							
							PreparedStatement ps1 = con.prepareStatement(query_del_cate);
							ps1.setString(1, IDcate);
							int kq = ps1.executeUpdate();
							if (kq == 1) {
								System.out.println("DELETE DANH MUC SUCCESS");
							}
							
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
						break;
					// -----------------------//
					case 5: {
						o = new Scanner(System.in);
						String name_old;
						String name_new;
						
						System.out.println("Nhap name cu: ");name_old = o.nextLine();
						System.out.println("Nhap name moi: ");name_new = o.nextLine();
						
						String sql_check = "SELECT name FROM Category WHERE name = ?";
						String sql_alter = "UPDATE Category SET name = ? WHERE name = ?";
						try {
							PreparedStatement ps = con.prepareStatement(sql_check);
							ps.setString(1, name_old);
							ResultSet rs = ps.executeQuery();
							if (!rs.next()) {
								System.out.println("NOT EXIST name");

							} else {
								PreparedStatement ps1 = con.prepareStatement(sql_alter);
								ps1.setString(1, name_new);
								ps1.setString(2, name_old);
								int kq = ps1.executeUpdate();
								if (kq == 1) {
									System.out.println("RENAME SUCCESS");
								}
							}
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
						break;

					}

				} while (choice1 > 0 && choice1 < 6);
			} // quan ly danh muc

			/*---SACH---*/
			if (luachon == 2) {
				int choice2;
				do//////////////////////////////
				{
					System.out.println("---CHUC NANG---");
					System.out.println("1.Xem tat ca sach");
					System.out.println("2.Them moi 1 thong tin sach");// kiem tra khong duoc trung ID sach
					System.out.println("3.Xoa mot quyen sach");
					System.out.println("4.Sua thong tin mot quyen sach");// khong duoc sua IDbook
					System.out.println("5>EXIT CHUC NANG QUAN LY SACH");
					System.out.print("choice: ");
					choice2 = o.nextInt();

					switch (choice2) {/////

					case 1: {
						String sql = "SELECT title FROM Book";
						try {
							PreparedStatement ps = con.prepareStatement(sql);
							ResultSet rs = ps.executeQuery();
							while (rs.next()) {
								System.out.println(rs.getString("title"));
							}
							System.out.println("----------------");
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
						break;// -----------

					case 2: {
						String IDbook = null;
						String title = null;
						String price = null;
						String IDcate = null;// nhap IDcate phai phu hop
						o = new Scanner(System.in);
						System.out.println("InPut IDbook: ");
						IDbook = o.nextLine();
						System.out.println("Input title: ");
						title = o.nextLine();
						System.out.println("Input price: ");
						price = o.nextLine();
						System.out.println("Input IDcate: ");
						IDcate = o.nextLine();

						String kt = "SELECT IDbook FROM Book WHERE IDbook = ?";
						String sql = "INSERT INTO Book VALUES(?,?,?,?)";
						try {
							PreparedStatement ps = con.prepareStatement(kt);
							ps.setString(1, IDbook);
							ResultSet rs = ps.executeQuery();
							if (rs.next()) {
								System.out.println("IDbook already!");
							} else {
								PreparedStatement ps1 = con.prepareStatement(sql);
								ps1.setString(1, IDbook);
								ps1.setString(2, title);
								ps1.setString(3, price);
								ps1.setString(4, IDcate);
								int kq = ps1.executeUpdate();
								if (kq == 1) {
									System.out.println("ADD Book SUCCESS");
								}
							}

						} catch (SQLException e) {
							e.printStackTrace();
						}

					}
						break;// ---------

					case 3: {
						String title_delete;
						o = new Scanner(System.in);
						System.out.println("Input title want delete: ");
						title_delete = o.nextLine();
						String kt = "SELECT title FROM Book WHERE title = ?";
						String sql = "DELETE FROM Book WHERE title = ?";
						try {
							PreparedStatement ps = con.prepareStatement(kt);
							ps.setString(1, title_delete);
							ResultSet rs = ps.executeQuery();
							if (!rs.next()) {
								System.out.println("NOT EXIST TITLE IN Book");
							}

							else {
								PreparedStatement ps1 = con.prepareStatement(sql);
								ps1.setString(1, title_delete);
								int kq = ps1.executeUpdate();
								if (kq == 1) {
									System.out.println("DELETE SUCCESS");
								}
							}
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
						break;

					case 4: {
						String title_new = null;
						String title_old = null;
						String price_new = null;
						String IDcate_new = null;

						o = new Scanner(System.in);
						System.out.println("ENTER title_old: ");
						title_old = o.nextLine();
						System.out.println("ENTER title_new: ");
						title_new = o.nextLine();
						System.out.println("ENTER price_new: ");
						price_new = o.nextLine();
						System.out.println("ENTER IDcate_new: ");
						IDcate_new = o.nextLine();

						String kt = "SELECT title FROM Book WHERE title = ?";
						String sql = "UPDATE Book SET title = ?,price = ?,IDcate = ? WHERE title = ?";
						try {
							PreparedStatement ps = con.prepareStatement(kt);
							ps.setString(1, title_old);
							ResultSet rs = ps.executeQuery();
							if (!rs.next()) {
								System.out.println("NOT EXIST title IN Book");
							} else {
								PreparedStatement ps1 = con.prepareStatement(sql);
								ps1.setString(1, title_new);
								ps1.setString(2, price_new);
								ps1.setString(3, IDcate_new);
								ps1.setString(4, title_old);
								int kq = ps1.executeUpdate();
								if (kq == 1) {
									System.out.println("UPDATE SUCCESS");
								}
							}
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
						break;

					}/////

				} while (choice2 > 0 && choice2 < 5);//////////////////////
			}

		} while (luachon > 0 && luachon < 3);// CHUC NANG LON

		System.out.println("CLOSE PROGRAM");

	}
}
