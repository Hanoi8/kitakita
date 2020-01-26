import java.util.*;
public class Code5_4{
		public static void main (String[]args){
				int values[] =new int [10];
				int cnt=0,sum=0;

				for (;cnt<10 && sum <=100 ;cnt++){
					values[cnt]=new Scanner(System.in).nextInt();
					sum+=values[cnt];
				}
				for (int i=0;i<cnt;i++){
					System.out.print("/n"+values[i]);
				}
		}
}
