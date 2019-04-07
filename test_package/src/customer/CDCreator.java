package customer;

import java.util.Scanner;

public class CDCreator
{
	Scanner o = new Scanner(System.in);
	
	int nextMovie;//dem so luong cd phim hien co trong mang
	int maxMovie;//so luong toi da ma mang vcd chua duoc
	int nextAlbum;//dem so luong cd nhac hien co trong mang
	int maxAlbum;//so luong toi da ma mang cd chua duoc
	
	movies.CompactDisc[]vcd;//nhu vay thi cac phan tu mang la cac doi tuong co cac thuoc tinh tu class hay lien ket class,
	music.CompactDisc[]cd;//->trong kieu du lieu no chua nhung gi thi bien duoc khai bao duoi dang du lieu do se chua cac thong tin tu class do
	
	
	public CDCreator()
	{
		nextMovie = 0;
		maxMovie = 10;
		nextAlbum = 0;
		maxAlbum = 10;
		
		vcd = new movies.CompactDisc[this.maxMovie];
		cd = new music.CompactDisc[this.maxAlbum];
	}
	
	
	public void displayAllMusic()
	{
		for(int i = 0;i < nextAlbum;i++)
		{
			System.out.print(cd[i]);//phan tu i gom (title,artist,price,code) la cac thuoc tinh cua kieu du lieu dinh nghia nen no
		}
		if(nextAlbum==0)
		{
			System.out.println("NO Album here");
		}
	}
	
	
	public void displayAllMovie()
	{
		for(int i = 0;i < nextMovie;i++)
		{
			System.out.print(vcd[i]);//phan tu i gom (title,price,code) la cac thuoc tinh cua kieu du lieu dinh nghia nen no
		}
		if(nextMovie==0)
		{
			System.out.println("NO Movie here");
		}
	}
	
	
	public void addCD()
	{
		if(this.nextAlbum < this.maxAlbum)
		{
			music.CompactDisc temp = new music.CompactDisc();
			temp.nhapCD();
			cd[this.nextAlbum] = temp;
			nextAlbum++;
		}
		else
		{
			System.out.print("---Error for memory---");
		}
	}
	
	
	
	public void addVCD()
	{
		if(this.nextMovie < this.maxMovie)
		{
			movies.CompactDisc temp = new movies.CompactDisc();
			temp.nhapVCD();
			vcd[this.nextMovie] = temp;
			nextMovie++;
		}
		else
		{
			System.out.print("---Error for memory---");
		}
	}
}
