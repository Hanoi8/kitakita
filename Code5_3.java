import java.util.*;
public class Code5_3{
		public static void main (String[]args){
				int values[] =new int [10];
				for (int i=0 ;i<10;i++){
						values[i]=new Scanner(System.in).nextInt();
				}
				for (int n :values){
						if (n%2==0){
								System.out.println(n+"");
								System.out.print("/n偶数:");
						}
				}
				for (int n :values){
						if (n%2!=0){
								System.out.println(n+"");
								System.out.print("/奇数:");
						}
				}
		}
}
