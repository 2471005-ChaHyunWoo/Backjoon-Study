package bronze.q10989;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	// 시간때문에 계수(카운팅) 정렬 사용, 빠른 입출력 버퍼도 사용해야함
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		// 속도때문에 스캐너 대신 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); 
		
		int n=Integer.parseInt(br.readLine());
		int a[]=new int[10001];
		for(int i=0;i<n;i++) {
			a[Integer.parseInt(br.readLine())]+=1; // 이 줄 때문에 배열의 크기를 10001로 해야함
		}                      // 1000까지 입력 받을 수 있기 때문
		for(int j=0;j<10001;j++) {
			while(a[j]>0) {
					sb.append(j).append('\n');
					a[j]--;
				}
			}
		System.out.println(sb);
		}	
}

