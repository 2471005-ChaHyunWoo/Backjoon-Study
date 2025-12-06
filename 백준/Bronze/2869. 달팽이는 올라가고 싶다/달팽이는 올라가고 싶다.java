import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		
		int a=Integer.parseInt(st.nextToken()); // 낮에 올라가는 높이
		int b=Integer.parseInt(st.nextToken()); // 밤에 미끄러지는 높이
		int v=Integer.parseInt(st.nextToken()); // 총 높이
		int day=(v-b)/(a-b);
		// v-b 정상 도달 바로 전날 높이 a-b 하루 실제 올라가는 높이
		if((v-b)%(a-b)!=0) {
			day++; 
		}
		System.out.print(day);
	}
}