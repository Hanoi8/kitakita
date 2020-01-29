public class Code6_8{
		public static void main(String[]args){
				for(int i=11;i<=20;i++){
						System.out.print(triangle(i)+" ");
				}
		}
		static int triangle(int num){
				if(num==0){
						return 0;
				}else if(num==1){
						return 1;
				}else{
						return triangle(num-2)+triangle(num-1);
				}
		}


}
