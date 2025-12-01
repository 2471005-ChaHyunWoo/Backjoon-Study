package bronze.q2562;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int[9];
		for(int i=0;i<9;i++) {
			a[i]=sc.nextInt();
		}
		int index=0;
		int max=a[0];
		for(int j=1;j<9;j++) {
			if(max<a[j]) {
				max=a[j];
				index=j;}
		}
		System.out.println(max);
		System.out.print(index+1);
	}
}
