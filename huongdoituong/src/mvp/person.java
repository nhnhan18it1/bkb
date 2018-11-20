package mvp;

import java.util.Scanner;

public class person {
	protected String name;
	protected int age;
	protected String add;
	public person() {
		this.add="adfj";
		this.age=10;
		this.name="njaijb";
	}
 public person(String name ,int age,String add) {
	this.name=name;
	this.age=age;
	this.add=add;
	 
}
 public void nhaptt() {
	Scanner key=new Scanner(System.in);
	System.out.println("Nhap ten");
	this.name=key.nextLine();
	System.out.println("Nhap tuoi");
	this.age=Integer.parseInt(key.nextLine());
	System.out.println("Nhap dia chi");
	this.add=key.nextLine();
 }
 public void intt() {
	System.out.println("Ten"+this.name);
	System.out.println("Ten"+this.age);
	System.out.println("Ten"+this.add);
}
/*public class employee extends person{
	float salary;
	double rate;
	public employee() {
		this.rate=0.5;
		this.salary=100000;
	}
	public employee(float salary,float rate) {
		super();
		this.rate=rate;
		this.salary=salary;
	}
	public void nhaptt() {
		super.nhaptt();
		Scanner key=new Scanner(System.in);
		System.out.println("Nhap ten");
		this.salary=key.nextFloat();
		System.out.println("Nhap tuoi");
		this.rate=key.nextFloat();
	
	 }
	public void intt() {
		super.intt();
		System.out.println("Ten"+this.tinht());
	}
public double tinht() {
	return(this.salary*this.rate);
}
}*/
		
	

	public static void main(String[] args) {
	}

}
