package QLKS;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class mvp {
Vector list=new Vector();
Vector list1=new Vector();
public mvp() {
	while (true) {
	System.out.println("Lua chon dich vu");
	System.out.println("*********************************************");
	System.out.println("1-NHAP THONG TIN");
	System.out.println("2-HIEN LOAI PHONG DUOC THUE NHIEU NHAT(1,2,3)");
	System.out.println("3-TIM TEN KHACH HANG");
	System.out.println("4-HIEN THI DANH SACH KHACH HANG THUE PHONG ");
	System.out.println("5-TINH TONG DOANH THU");
	System.out.println("6-HOA DON");
	System.out.println("7-SUA");
	System.out.println("8-SAP XEP THEO GIA TRI HOA DON");
	System.out.println("9-THOAT");
	System.out.println("*********************************************");
	System.out.println("MOI BAN CHON DICH VU");
	int num;
	Scanner key=new Scanner(System.in);
	num=key.nextInt();
switch (num) {
case 1:this.nhaptt();break;
case 2:this.loaip();break;
case 3:this.timten();break;
case 4:this.intt();break;
case 5:this.dthu();break;
case 6:this.hoadon();break;
case 7:this.sua();break;
case 8:this.sapxep();break;
case 9:return;
default:
	System.out.println(".......................");
	break;
	
}
System.out.println("So khach hang chua tra phong = "+list.size());
System.out.println("So khach hang da tra phong = "+list1.size());

}
}
public void nhaptt() {int z=0;
	Scanner key=new Scanner(System.in);
	System.out.println("Nhap so luong khach hang :");
	int n=key.nextInt();
	for (int i = 1; i <=n; i++) {
	System.out.println("Nhap khach hang thu "+i);
	System.out.println("Ten: ");
	String name=key.next();
	System.out.println("Nhap so chung minh thu: ");
	int cmt=key.nextInt();
	key.nextLine();
	System.out.println("Nhap ngay dat phong: ");
	System.out.println("Gio dat phong");
	int hour=key.nextInt();
	if(hour>24) {
		hour=0;
	}
	System.out.print("Ngay: ");
	int mm=key.nextInt();
	if (mm>30) {
		mm=30;
	}
	System.out.print("Thang: ");
	int nn=key.nextInt();
	if (nn>12) {
		nn=12;
	}
	System.out.print("Nam: ");
	int yy=key.nextInt();
	System.out.println("Nhap so phong: ");
	System.out.println("Phong 1-10");
	int numroom=key.nextInt();
	key.nextLine();
	if (numroom>10) {
		numroom=10;
	}
	System.out.println("Nhap loai phong: ");
	System.out.println("(1,2,3)");
	int type=key.nextInt();
	key.nextLine();
	if (type>3) {
		type=1;
	}
	khachhang kh=new khachhang(name,cmt,hour,mm,nn,yy,numroom,type,z);
	list.add(kh);
	}
}
public void intt() {
	Enumeration en=list.elements();
	int i=1;
	while(en.hasMoreElements()) {
		khachhang kh=(khachhang)en.nextElement(); 
		System.out.println("  -- Name= "+kh.getName()+" CMT= "+kh.getCmt()+" Ngay dat phong= "+kh.getMm()+"/"+kh.getNn()+"/"+kh.getYy()+" Phong so= "+kh.getNumroom()+" Loai phong= "+kh.getType());
		}
	System.out.println("******************************************************");

}
public void loaip() {
int x=0,y=0,z=0;
Enumeration en=list.elements();
	while(en.hasMoreElements()) {
		khachhang kh=(khachhang)en.nextElement();
	if(kh.getType()==(1)) x=x+1;
	if(kh.getType()==(2)) y=y+1;
	if(kh.getType()==(3)) z=z+1;
	}
	if (x>y&&x>z) {
		System.out.println("Phong loai 1 duoc su dung nhieu nhat voi "+x+" lan chon");
	}
	if (y>x&&y>z) {
		System.out.println("Phong loai 2 duoc su dung nhieu nhat voi "+y+" lan chon");
	}
	if (z>y&&z>x) {
		System.out.println("Phongf loai 3 duoc su dung nhieu nhat voi "+z+" lan chon");
	}
	if (x==y&&x>z) {
		System.out.println("Phongf loai 1,2 duoc su dung nhieu nhat voi "+x+" lan chon");
	}
	if (x==z&&x>y) {
		System.out.println("Phongf loai 1,3 duoc su dung nhieu nhat voi "+x+" lan chon");
}
	if (y==z&&y>x) {
		System.out.println("Phongf loai 2,3 duoc su dung nhieu nhat voi "+y+" lan chon");
}
	if (x==z&&y==z) {
		System.out.println("Phong loai 1,2,3 duoc su dung nhu nhau voi "+x+" lan chon");
}
}	
public void timten() {
	Scanner key= new Scanner(System.in);
	System.out.println("1-Tim khách hàng chưa tra phong ");
	System.out.println("2-Tim khach hang đá trả phòng");
	int n1=key.nextInt();
	switch (n1) {
	case 1:System.out.println("1-Tim theo ten");
	System.out.println("2-Tim theo CMT");
	System.out.println("3-Back");
	int n=key.nextInt();
	switch (n) {
	case 1:
		System.out.println("Nhap ten muon tim");
		String name =key.next();
		Enumeration en=list.elements();
		while (en.hasMoreElements()) {
			khachhang kh=(khachhang)en.nextElement();
			if (kh.getName().indexOf(name)!=-1) {
				System.out.println("  -- Name= "+kh.getName()+" CMT= "+kh.getCmt()+" Ngay dat phong= "+kh.getMm()+"/"+kh.getNn()+"/"+kh.getYy()+" Phong so= "+kh.getNumroom()+" Loai phong= "+kh.getType());		
			}
			
		}	
		break;
	case 2:
		System.out.println("Nhap so CMT uon tim");
		int cm=key.nextInt();
		Enumeration en1=list.elements();
		while (en1.hasMoreElements()) {
			khachhang kh=(khachhang)en1.nextElement();
			if (kh.getCmt()==cm) {
				System.out.println("  -- Name= "+kh.getName()+" CMT= "+kh.getCmt()+" Ngay dat phong= "+kh.getMm()+"/"+kh.getNn()+"/"+kh.getYy()+" Phong so= "+kh.getNumroom()+" Loai phong= "+kh.getType());		
			}
			
		}
		break;
		case 3: return;

	}
 break;
	case 2:System.out.println("1-Tim theo ten");//tim khach hang da tra phong
	System.out.println("2-Tim theo CMT");
	System.out.println("3-Back");
	int n3=key.nextInt();
	switch (n3) {
	case 1:
		System.out.println("Nhap ten muon tim");
		String name =key.next();
		Enumeration en=list1.elements();
		while (en.hasMoreElements()) {
			khachhang1 kh=(khachhang1)en.nextElement();
			if (kh.getName().indexOf(name)!=-1) {
				System.out.println("  -- Name= "+kh.getName()+" CMT= "+kh.getCmt()+" Ngay dat phong= "+kh.getMm()+"/"+kh.getNn()+"/"+kh.getYy()+" Phong so= "+kh.getNumroom()+" Loai phong= "+kh.getType());		
			}
			
		}	
		break;
	case 2:
		System.out.println("Nhap so CMT uon tim");
		int cm=key.nextInt();
		Enumeration en1=list1.elements();
		while (en1.hasMoreElements()) {
			khachhang1 kh=(khachhang1)en1.nextElement();
			if (kh.getCmt()==cm) {
				System.out.println("  -- Name= "+kh.getName()+" CMT= "+kh.getCmt()+" Ngay dat phong= "+kh.getMm()+"/"+kh.getNn()+"/"+kh.getYy()+" Phong so= "+kh.getNumroom()+" Loai phong= "+kh.getType());		
			}
			
		}
		break;
		case 3: return;

	}
break;
	default:
		return;
	}
		
	System.out.println(".....................................");
}
public void hoadon() {
	int ind=0;
	Scanner key=new Scanner(System.in);
	System.out.println("Nhap ten khach hang tra phong");
String n=key.next();
System.out.println("Gio tra phong");
int hour=key.nextInt();
if (hour>24) {
	hour=24;
}
System.out.println("Nhap ngay tra phong");
int mm=key.nextInt();
System.out.print("/");
int nn=key.nextInt();
System.out.print("/");
int yy=key.nextInt();
	Enumeration  en=list.elements();
while(en.hasMoreElements()) {
	khachhang kh=(khachhang)en.nextElement();
	if (kh.getName().indexOf(n)!=-1) {
		System.out.println("  -- Name= "+kh.getName()+" CMT= "+kh.getCmt()+" Ngay dat phong= "+kh.getMm()+"/"+kh.getNn()+"/"+kh.getYy()+" Phong so= "+kh.getNumroom()+" Loai phong= "+kh.getType());
	
		switch (kh.getType()) {
	case 1:
		if (kh.getNn()<nn) {
			int time=(30-kh.getMm())*24+mm*24+24-kh.getHour()+hour;
			int dt=time*300000;
			System.out.println("Tong tien= "+dt);
			kh.setDthu(dt);
			khachhang1 kh1=new khachhang1(kh.getName(),kh.getCmt(),kh.getHour(),kh.getMm(),kh.getNn(),kh.getYy(),kh.getNumroom(),kh.getType(),kh.getDthu());
			list1.add(kh1);
			list.removeElementAt(ind);
		}
		if (kh.getNn()==nn&&kh.getMm()!=mm){
			int time=(mm-kh.getMm())*24+24-kh.getHour()+hour;
			int dt=time*300000;
			System.out.println("Tong tien= "+dt);
			kh.setDthu(dt);
			khachhang1 kh1=new khachhang1(kh.getName(),kh.getCmt(),kh.getHour(),kh.getMm(),kh.getNn(),kh.getYy(),kh.getNumroom(),kh.getType(),kh.getDthu());
			list1.add(kh1);
			list.removeElementAt(ind);
		}
		if (kh.getNn()==nn&&kh.getMm()==mm) {
			int time=hour-kh.getHour();
			int dt=time*300000;
			System.out.println("Tong tien= "+dt);
			kh.setDthu(dt);	
			khachhang1 kh1=new khachhang1(kh.getName(),kh.getCmt(),kh.getHour(),kh.getMm(),kh.getNn(),kh.getYy(),kh.getNumroom(),kh.getType(),kh.getDthu());
			list1.add(kh1);
			list.removeElementAt(ind);
		}
		break;
	case 2:
		if (kh.getNn()<nn) {
			int time=(30-kh.getMm())*24+mm*24+24-kh.getHour()+hour;
			int dt=time*200000;
			System.out.println("Tong tien= "+dt);
			kh.setDthu(dt);
			khachhang1 kh1=new khachhang1(kh.getName(),kh.getCmt(),kh.getHour(),kh.getMm(),kh.getNn(),kh.getYy(),kh.getNumroom(),kh.getType(),kh.getDthu());
			list1.add(kh1);
			list.removeElementAt(ind);
		}
		if (kh.getNn()==nn&&kh.getMm()!=mm){
			int time=(mm-kh.getMm())*24+24-kh.getHour()+hour;
			int dt=time*200000;
			System.out.println("Tong tien= "+dt);
			kh.setDthu(dt);
			khachhang1 kh1=new khachhang1(kh.getName(),kh.getCmt(),kh.getHour(),kh.getMm(),kh.getNn(),kh.getYy(),kh.getNumroom(),kh.getType(),kh.getDthu());
			list1.add(kh1);
			list.removeElementAt(ind);
		}
		if (kh.getNn()==nn&&kh.getMm()==mm) {
			int time=hour-kh.getHour();
			int dt=time*200000;
			System.out.println("Tong tien= "+dt);
			kh.setDthu(dt);			
			khachhang1 kh1=new khachhang1(kh.getName(),kh.getCmt(),kh.getHour(),kh.getMm(),kh.getNn(),kh.getYy(),kh.getNumroom(),kh.getType(),kh.getDthu());
			list1.add(kh1);
			list.removeElementAt(ind);
		}
		break;
	case 3:
		if (kh.getNn()<nn) {
			int time=(30-kh.getMm())*24+mm*24+24-kh.getHour()+hour;
			int dt=time*100000;
			System.out.println("Tong tien= "+dt);
			kh.setDthu(dt);
			khachhang1 kh1=new khachhang1(kh.getName(),kh.getCmt(),kh.getHour(),kh.getMm(),kh.getNn(),kh.getYy(),kh.getNumroom(),kh.getType(),kh.getDthu());
			list1.add(kh1);
			list.removeElementAt(ind);
		}
		if (kh.getNn()==nn&&kh.getMm()!=mm){
			int time=(mm-kh.getMm())*24+24-kh.getHour()+hour;
			int dt=time*100000;
			System.out.println("Tong tien= "+dt);
			kh.setDthu(dt);
			khachhang1 kh1=new khachhang1(kh.getName(),kh.getCmt(),kh.getHour(),kh.getMm(),kh.getNn(),kh.getYy(),kh.getNumroom(),kh.getType(),kh.getDthu());
			list1.add(kh1);
			list.removeElementAt(ind);
		}
		if (kh.getNn()==nn&&kh.getMm()==mm) {
			int time=hour-kh.getHour();
			int dt=time*100000;
			System.out.println("Tong tien= "+dt);
			kh.setDthu(dt);			
			khachhang1 kh1=new khachhang1(kh.getName(),kh.getCmt(),kh.getHour(),kh.getMm(),kh.getNn(),kh.getYy(),kh.getNumroom(),kh.getType(),kh.getDthu());
			list1.add(kh1);
			list.removeElementAt(ind);
		}
		break;
default:System.out.println("..................");
	}
	}
ind++;
}
}
public void dthu() {
	int dt=0;
	Enumeration en=list1.elements();
khachhang1 kh1=(khachhang1)en.nextElement();
 dt=dt+kh1.getDthu();
System.out.println("$$$Tong doanh thu cua khach san= "+dt);
System.out.println(".........................................");
}
public void sua() {
	Scanner key=new Scanner(System.in);
	Enumeration  en=list.elements();
	System.out.println("-----Chon noi dung muon sua----");
	System.out.println("(Chi co the sua noi dung khach hang chua tra phong)");
	System.out.println("1-Ten");
	System.out.println("2-CMT");
	System.out.println("3-Loai phong");
	System.out.println("4-So phong");
	System.out.println(".....................................");
	int n=key.nextInt();
	int cm=0;
	String na;
	System.out.println("Nhap ten: ");
	na=key.next();
	System.out.println("Nhap cmt: ");
	cm=key.nextInt();
	switch (n) {
	case 1:while(en.hasMoreElements()) {
		khachhang kh=(khachhang)en.nextElement();
		if (kh.getName().indexOf(na)!=-1||kh.getCmt()==cm) {
			System.out.println("Nhap ten thay the: ");
			String name=key.next();
			kh.setName(name);
		}
	}	break;
	case 2:while(en.hasMoreElements()) {
		khachhang kh=(khachhang)en.nextElement();
		if (kh.getName().indexOf(na)!=-1||kh.getCmt()==cm) {
			System.out.println("Nhap so CMT thay the: ");
			int cmt=key.nextInt();
			kh.setCmt(cmt);
		}
	}	break;
	case 3:while(en.hasMoreElements()) {
		khachhang kh=(khachhang)en.nextElement();
		if (kh.getName().indexOf(na)!=-1||kh.getCmt()==cm) {
			System.out.println("Nhap loai phong thay the: ");
			int type=key.nextInt();
			kh.setType(type);
		}
	}	break;
	case 4:while(en.hasMoreElements()) {
		khachhang kh=(khachhang)en.nextElement();
		if (kh.getName().indexOf(na)!=-1||kh.getCmt()==cm) {
			System.out.println("Nhap loai phong thay the: ");
			int numroom=key.nextInt();
			kh.setNumroom(numroom);
		}
	}	break;
	default: System.out.println("....................");
	}
	
}
public void sapxep() {
	khachhang1[] kh =new khachhang1[list1.size()];
int dem=0;
Enumeration en=list1.elements();
while(en.hasMoreElements()) {
	kh[dem]=(khachhang1)en.nextElement();
	dem++;
}
Arrays.sort(kh);
System.out.println("DANH SACH DUOC SAP XEP");
for (int i = 0; i < kh.length; i++) {
	System.out.println(" "+i+". Ten:"+kh[i].getName()+"- Tri gia hoa don"+kh[i].getDthu());
}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new mvp();
	}
}
class khachhang //khach hang chua tra phong 
{
	private String name;
	private int cmt;
	private int numroom;
	private int type;
	private int dthu;
	private int hour;
	private int mm;
	private int nn;
	private int yy;
	public khachhang() {
	 name=" ";
	 cmt=123;
	 hour=0;
	 mm=01;
	 nn=01;
	 yy=2018;
	 numroom=1;
	 type=1;
	 dthu=0;	
	}
	public khachhang(String na,int cm,int h,int md,int nd,int yd,int numr,int ty,int dt) {
		name=na;
		cmt=cm;
		mm=md;
		nn=nd;
		yy=yd;
		numroom=numr;
		type=ty;
		dthu=dt;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCmt() {
		return cmt;
	}
	public void setCmt(int cmt) {
		this.cmt = cmt;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public int getNn() {
		return nn;
	}
	public void setNn(int nn) {
		this.nn = nn;
	}
	public int getYy() {
		return yy;
	}
	public void setYy(int yy) {
		this.yy = yy;
	}
	public int getNumroom() {
		return numroom;
	}
	public void setNumroom(int numroom) {
		this.numroom = numroom;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getDthu() {
		return dthu;
	}
	public void setDthu(int dthu) {
		this.dthu = dthu;
	}
	
}
class khachhang1 implements Comparable // Khach hang da tra phong 
{
	private String name;
	private int cmt;
	private int numroom;
	private int type;
	private int dthu;
	private int hour;
	private int mm;
	private int nn;
	private int yy;
	public khachhang1() {
	 name=" ";
	 cmt=123;
	 hour=0;
	 mm=01;
	 nn=01;
	 yy=2018;
	 numroom=1;
	 type=1;
	 dthu=0;	
	}
	public khachhang1(String na,int cm,int h,int md,int nd,int yd,int numr,int ty,int dt) {
		name=na;
		cmt=cm;
		mm=md;
		nn=nd;
		yy=yd;
		numroom=numr;
		type=ty;
		dthu=dt;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCmt() {
		return cmt;
	}
	public void setCmt(int cmt) {
		this.cmt = cmt;
	}
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public int getNn() {
		return nn;
	}
	public void setNn(int nn) {
		this.nn = nn;
	}
	public int getYy() {
		return yy;
	}
	public void setYy(int yy) {
		this.yy = yy;
	}
	public int getNumroom() {
		return numroom;
	}
	public void setNumroom(int numroom) {
		this.numroom = numroom;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getDthu() {
		return dthu;
	}
	public void setDthu(int dthu) {
		this.dthu = dthu;
	}
	public int compareTo(Object kh) {
		khachhang1 khtg=(khachhang1)kh;
		return (this.dthu-khtg.dthu);
		
	}
}


	
	
	