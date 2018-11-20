package lth_btvn;

import java.util.Scanner;

public class mymath {
	int a;
	int b;
	int n;
	int k;
	float c;
	float d;
	float e;
	float f;
public void nhaptt1() {
	Scanner key= new Scanner(System.in);
	System.out.println("Nhap 2 so ");
	this.a=key.nextInt();
	this.b=key.nextInt();
}	
public float UCLN() {
	float z1,z2=0;
	if (this.a>this.b) {
		for (int i = 1; i <=this.b; i++) {
			if (this.a%i==0&&this.b%i==0) {
				z1=i;
				if (z2<z1) {
					z2=z1;
				}
			}
		}
	}
	if (this.a<this.b) {
		for (int i = 1; i <=this.a; i++) {
			if (this.a%i==0&&this.b%i==0) {
				z1=i;
				if (z2<z1) {
					z2=z1;
				}
			}
		}
	}

return z2;
}
public void intt1() {
	System.out.println("UCLN="+UCLN());
}
public void nhaptt2_3() {
	Scanner sb=new Scanner(System.in);
	System.out.println("Nhap 3 so can so sanh");
	this.c=sb.nextFloat();
	this.d=sb.nextFloat();
	this.e=sb.nextFloat();
}
public float basoln() {
	float z=Math.max(this.c, Math.max(this.d, this.e));
return z;
}
public void intt2() {
	System.out.println("So lon nhat trong 3 so la: "+basoln());
}
public float basonn() {
	float z=Math.min(this.c, Math.min(this.d, this.e));
	return z;
}
public void intt3() {
	System.out.println("So nho nhat trong 3 so la: "+basonn());
}
public void nhaptt4_5() {
	Scanner no=new Scanner(System.in);
	System.out.println("Nhap so can xac dinh so nto N= ");
	this.n=no.nextInt();
}
public float sonto() {
	float z=0;
	for (int i = 1; i <= this.n; i++) {
		if (this.n%i==0) {
			z=z+1;
		}
	}
	return z;
}
public void intt4() {
	if (sonto()>2) {
		System.out.println("So "+this.n+" ko phai la so nguyen to");
	}
	if (sonto()<=2) {
		System.out.println("So "+this.n+" la so nguyen to");
	}
}
public int tinhtong() {
	int z = 0;
	for (int i = 1; i <this.n; i++) {
		z=z+i;
	}
	return z;
}
public void intt5() {
	System.out.println("Tong day so tu 1 den "+this.n+" = "+tinhtong());
}
public void nhaptt6() {
	Scanner key= new Scanner(System.in);
	System.out.println("Nhap so can tinh GT tuyet doi");
	this.k=key.nextInt();
}
public float gttd() {
	float z=Math.abs(this.k);
return z;
}
public void intt6() {
	System.out.println("Ket qua gia ri tuyet doi cua ("+this.k+") la : "+gttd());
}
public void nhaptt7() {
	Scanner key= new Scanner(System.in);
	this.f=key.nextFloat();
}
public float lamtron() {
	float z= Math.round(this.f*100/100);
	return z;
}
public void intt7() {
	System.out.println("Kq lam tron so"+this.f+"la: "+lamtron());
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
