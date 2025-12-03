package bronze.q1546;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int max=a[0];
		for(int j=1;j<n;j++) {
			if(max<a[j]) {
				max=a[j];
			}
		}
		double sum=0;
		// 형변환 주의
		for(int z=0;z<n;z++) {
			sum+=(double)a[z]/max*100;
		}
		System.out.println(sum/n);
	}

}
