public class Code6_5{
	public static void main(String[]args){
		triangle(3,'$');
		System.out.println();
		triangle(4,'%');
		System.out.println();
		triangle(5,'#');
		System.out.println();
	}
	static void triangle(int size, char x){
		for(int i=0;i<size;i++){
			for(int j=0;j<=i;j++){
				System.out.print(x);
			}
				System.out.println();
		}
	}
}
