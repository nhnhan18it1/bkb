package quanlysv;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

import org.omg.CORBA.PUBLIC_MEMBER;

public class StudentManagement {
	Vector list=new Vector();
public StudentManagement(){
	while (true) {
		System.out.println("Lua chon dich vu");
		System.out.println("*********************************************");
		System.out.println("1-NHAP THONG TIN");
		System.out.println("2-XEM DANH SACH SINH VIEN");
		System.out.println("3-SAP DANH SACH SINH VIEN THEO DIEM TRUNG BINH");
		System.out.println("4-TIM SINH VIEN THEO TEN");
		System.out.println("5-DIEM DANH");
		System.out.println("6-SO BUOI VANG MAT SO BUOI CO MAT");
		System.out.println("7-THOAT");
		System.out.println("*********************************************");
		System.out.println("MOI BAN CHON DICH VU");
		int num;
		Scanner key=new Scanner(System.in);
		num=key.nextInt();
		switch (num) {
		case 1:this.input(); break;
		case 2:this.view(); break;
		case 3:this.sort();break;
		case 4:this.search();break;
		case 5:this.diemdanh();break;
		case 6:this.sbvm();break;
		case 7:return;
		}
			System.out.println("......");
}
		
}
	public void input() {
System.out.println("Nhap so sinh vien");
int n;
Scanner key=new Scanner(System.in);
n=key.nextInt();
int v=0,c=0;
for (int i = 1; i <=n; i++) {
	System.out.println("Nhap sinh vien thu "+i+" : ");
	System.out.println("Ten: ");
	String name=key.next(); 
	System.out.println("ID: ");
	int id=key.nextInt();
	System.out.println("Diem TB: ");
	float aver=key.nextFloat();
	key.nextLine();
	Student sts=new Student(id, name, aver, v, c);
	list.add(sts);
}
	}
public void view() {
	System.out.println("Thong tin sinh vien");
	Enumeration vEnum = list.elements();
	int i=1;
	while (vEnum.hasMoreElements()) {
		Student sts =(Student)vEnum.nextElement();
		System.out.println("   "+i+". ID="+sts.getId()+" Ten= "+sts.getName()+" Diem TB= "+sts.getAver());
i++;		
	}
	System.out.println("......................\n");
}
public void sort() {
	Student[] sts =new Student[list.size()];
	int index=0;
	Enumeration vEnum = list.elements();
	while (vEnum.hasMoreElements()) {
		sts[index]=(Student)vEnum.nextElement();
		index++;
		
	}
	Arrays.sort(sts);
	System.out.println("Danh sach sinh vien duoc sap xep--");
	for ( index = 0; index < sts.length; index++) {
		System.out.println("  "+(index+1)+" ID = "+sts[index].getId()+"Ten= "+sts[index].getName()+" Diem TB= "+sts[index].getAver());
	}
	System.out.println("...................");
}
public void search() {
	Scanner key= new Scanner(System.in);
	System.out.println("Nhap ten sinh vien can tim: ");
	String name=key.next();
	Enumeration vEnum =list.elements();
	System.out.println("\n--Thong tin tim kiem duoc--");
	while (vEnum.hasMoreElements()) {
		Student sts=(Student)vEnum.nextElement();
		if (sts.getName().indexOf(name)!=-1) {
			System.out.println(". ID="+sts.getId()+" Ten= "+sts.getName()+" Diem TB= "+sts.getAver());
		}
		System.out.println("\n.....................");
	}
}
public void diemdanh() {
	Scanner key=new Scanner(System.in);
	Enumeration vEnum = list.elements();
	int i=1;
	int vm;
	while (vEnum.hasMoreElements()) {
		Student sts =(Student)vEnum.nextElement();
		System.out.println("   "+i+". ID="+sts.getId()+" Ten= "+sts.getName());
		vm=key.nextInt();
		if(vm==1) {sts.setcm(+1);}
		if(vm!=1) {sts.setvm(+1);}
	
		i++;
	}
	System.out.println("......................\n");
	
}
public void sbvm() {
	Enumeration vEnum = list.elements();
	int i=1;
	int z=0;
	while (vEnum.hasMoreElements()) {
		Student sts=(Student)vEnum.nextElement();
		System.out.println("   "+i+". ID="+sts.getId()+" Ten= "+sts.getName()+"Co mat= "+sts.getcm()+" Vang mat: "+sts.getvm());
		i++;		
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new StudentManagement();
	}

}
class Student implements Comparable{
	private int id;
	private String name;
	private float aver;
	private int vm;
	private int cm;
	public Student() {
		name= new String(" ");
		id=0;
		aver=0;
		vm=0;
		cm=0;
	}
	public Student(int i,String n,float a,int v,int c) {
		id=i;
		name=n;
		aver=a;
		vm=v;
		cm=c;
	}
	public int compareTo(Object other) {
Student otherReact= (Student)other;
return (int)(this.aver-otherReact.aver);
		
	}
	public int getcm() {
		return cm;
	}
	public void setcm(int cm) {
		this.cm = cm;
	}
	public int getvm() {
		return vm;
	}
	public void setvm(int vm) {
		this.vm = vm;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAver() {
		return aver;
	}
	public void setAver(float aver) {
		this.aver = aver;
	}
	
}
