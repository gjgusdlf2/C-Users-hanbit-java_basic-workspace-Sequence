package arithmetic;



public class Sequence {
 public static void main(String[] args) {
	 for(int a=0;a<=26;a++) {
		 String r = "";
		 int result = 0;
		 if(a<=26) {
			 r += a+"+";
		 } else if(a!=26) {
			 r += a+"=";
		 }
		 result += a;
		 
		 System.out.println(r+result);
	 }
 	}
}
