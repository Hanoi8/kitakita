import java.util.*;
public class Code5_2{
	public static void main (String[]args){
		int values[] =new int [10];
		for (int i=0 ;i<10;i++){
			values[i]=new Scanner(System.in).nextInt();
			System.out.println();
		}
		for (int i=9;i>=0 ;i--){
			System.out.println(values[i]);
		}
	}
}
