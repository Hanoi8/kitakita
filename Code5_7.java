import java.util.*;
public class Code5_7{
		public static void main (String[]args){
			int kuku[][]= new int [9][9];
			for(int i=1;i<=9;i++){
				for(int j=1;j<=9;j++){
					kuku[i][j]=(i)*(j);
				}
			}
			int x=new Scanner(System.in).nextInt();
			int y=new Scanner(System.in).nextInt();
			System.out.println(kuku[x-1][y-1]);
		}
}
