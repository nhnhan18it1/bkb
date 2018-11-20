package lth_btvn;

import java.util.Scanner;

import text1.person;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner key=new Scanner(System.in);
System.out.println("**************************************");
System.out.println("MOI LUA CHON");
System.out.println("1-UCLN");
System.out.println("2-GTLN 3 so thuc");
System.out.println("3-GTNN 3 so thuc");
System.out.println("4-KT so nto");
System.out.println("5-Tinh tong tu 1 den N");
System.out.println("6-Ham tinh gia tri tuyet doi");
System.out.println("7-lam tron so thuc");
System.out.println("**************************************");
System.out.println("Nhap yeu cau cua ban:");
int n=key.nextInt();
mymath A = new mymath();
A= new mymath();
switch (n) {
case 1:
	
	A.nhaptt1();
	A.UCLN();
	A.intt1();
	break;
case 2:
	A.nhaptt2_3();
	A.basoln();
	A.intt2();
	break;
case 3:
	A.nhaptt2_3();
	A.basonn();
	A.intt3();
	break;
case 4:
	A.nhaptt4_5();
	A.sonto();
	A.intt4();
	break;
case 5:
	A.nhaptt4_5();
	A.tinhtong();
	A.intt5();
	break;
case 6:
	A.nhaptt6();
	A.gttd();
	A.intt6();
	break;
case 7:
	A.nhaptt7();
	A.lamtron();
	A.intt7();
	break;	
default:
	System.out.println("Ban nhap sai vui long chay lai chuong trinh");
	break;
}
	}

}
