import java.util.*;
public class Code6_3{
	public static void main (String[]args){
		int x=new Scanner(System.in).nextInt();
		int y=new Scanner(System.in).nextInt();
		int z=new Scanner(System.in).nextInt();
		System.out.println(pow2(x,pow2(y,z)));
	}

	static int pow2(int n,int n2){
		if(n>n2)
		return n;
		else
		return n2;
	}
}
