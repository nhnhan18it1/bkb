package text1;

import java.util.Scanner;

public class person {
String ten;
float toan;
float ly;
float hoa;
public void nhaptt() {
	Scanner key= new Scanner(System.in);
	System.out.println("Nhap ten ");
	this.ten=key.nextLine();
	System.out.println("Nhap diem toan = ");
	this.toan=Float.parseFloat(key.nextLine());
	System.out.println("Nhap diem ly = ");
	this.ly=Float.parseFloat(key.nextLine());
	System.out.println("Nhap diem hoa = ");
	this.hoa=Float.parseFloat(key.nextLine());
	
}
public float tinhtb() {
	float tb;
	tb=(this.toan+this.ly+this.hoa)/3;
	return tb;
}
public void intt() {
	System.out.println("Ten ="+this.ten+" co diem tb="+this.tinhtb());
}
public static void main(String[] args) {
	person obj= new person();
	obj.nhaptt();
	obj.intt();
}
}
