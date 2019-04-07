package customer;

/*--dong nay tro nen vo nghia vi trong 2 package co 2 class trung ten voi nhau--*/
//import movies.*;
//import music.*;
/*------------------------------------------------------------*/

import java.util.Scanner;

public class CDCreator {

	Scanner o = new Scanner(System.in);
	private int nextMovie;// dem so luong cd phim hien co trong mang
	private int maxMovie;// so luong toi da ma mang vcd chua duoc
	private int nextAlbum;// dem so luong cd nhac hien co trong mang
	private int maxAlbum;// so luong toi da ma mang cd chua duoc

	movies.CompactDisc[] vcd;
	music.CompactDisc[] cd;

	public CDCreator() {
		nextMovie = 0;
		nextAlbum = 0;
		this.setDefautQuantity();

		vcd = new movies.CompactDisc[this.maxMovie];
		cd = new music.CompactDisc[this.maxAlbum];
	}
	
	
	private void setDefautQuantity() {
		System.out.println("Nhap So Luong CD co the luu tru: ");
		this.maxAlbum = o.nextInt();
		System.out.println("Nhap So Luong VCD co the luu tru: ");
		this.maxMovie = o.nextInt();
	}

	public void addCD() {
		if (this.nextAlbum < this.maxAlbum) {
			music.CompactDisc newcd = new music.CompactDisc();//truy cap den package khac theo ten day du
			newcd.nhapCD();
			cd[this.nextAlbum] = newcd;
			this.nextAlbum++;
		} else {
			System.out.print("---Error for memory---");
		}
	}

	public void addVCD() {
		if (this.nextMovie < this.maxMovie) {
			movies.CompactDisc newvcd = new movies.CompactDisc();
			newvcd.nhapVCD();
			vcd[this.nextMovie] = newvcd;
			this.nextMovie++;
		} else {
			System.out.print("---Error for memory---");
		}
	}

	public void displayAllMusic() {
		if (nextAlbum == 0) {
			System.out.println("NO Album here");
		} else {
			for (int i = 0; i < nextAlbum; i++) {
				System.out.print(cd[i]);
			}
		}
	}

	public void displayAllMovie() {
		if (nextMovie == 0) {
			System.out.println("NO Movie here");
		} else {
			for (int i = 0; i < nextMovie; i++) {
				System.out.print(vcd[i]);
			}
		}
	}

}
