package text1;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner kb = new Scanner(System.in);
System.out.println("Nhap so sinh vien= " );
int n= kb.nextInt();
person A[] = new person[n];
for (int i = 0; i <n; i++) {
	A[i]= new person();
	A[i].nhaptt();
}
for (int i = 0; i < A.length; i++) {
	A[i].intt();
}
	}

}
