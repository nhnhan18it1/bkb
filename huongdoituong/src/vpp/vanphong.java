package vpp;

import java.util.Scanner;

public class vanphong {
String name;
double Hsluong;
public vanphong() {
	this.name="nhan";
	
}
public vanphong(String name,double Hs) {
	this.name=name;
	this.Hsluong=Hs;
}
public void nhaptt() {
	Scanner key=new Scanner(System.in);
	System.out.println("asf");
	this.name=key.nextLine();
	this.Hsluong=Double.parseDouble(key.nextLine());
}
public double tinhluong() {
	return(this.Hsluong*150000);
}
public void intt() {
	System.out.println("Ten: "+this.name+" co tien luong= "+this.tinhluong());
}
}
