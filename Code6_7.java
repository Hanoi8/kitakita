public class Code6_7{
		public static void main(String[]args){
				for(int i=10000;i<10100;i++){
						if(triangle(i));
						System.out.print(i+" ");
				}
		}
		static boolean triangle(int num){
				if(num<=3){
						return true;
				}
				for(int i=2;i<=(num/2);i++){
						if((num%i)==0){
								return false;
						}else{
								return true;
						}
				}

		}
}
