public class Code6_6{
	public static void main(String[]args){
		for(int i=1;i<=9;i++){
		triangle(i);
		}
	}
	static void triangle(int x){
		for(int i=1;i<=9;i++){
				System.out.print(i*x);
				System.out.print(" ");
		/*	for(int j=1;j<=9;j++){
				System.out.print(i*j);
			}*/
		}
				System.out.println();
	}
}
