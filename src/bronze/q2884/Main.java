package bronze.q2884;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	int h=sc.nextInt();
	int m=sc.nextInt();
	
	if(m-45<0) {
		h=h-1;
		m=m+15;
	}else {
		m=m-45;
	}
	// 0시도 생각해야함
	if(h==-1) {
		h=23;
	}
	System.out.print(h+" "+m);
	}
}
