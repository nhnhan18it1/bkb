package mvp;

import java.util.Scanner;

public class emloyee extends person {
	float salary;
	double rate;
  public emloyee() {
		// TODO Auto-generated constructor stub
	
	this.rate=0.5;
		this.salary=100000;
	}	
	public emloyee(float salary,float rate) {
		
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


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
