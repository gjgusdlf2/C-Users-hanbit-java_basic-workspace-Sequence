package arithmetic;
/**
 연속하는 두 항의 차이가 모두 일정한 수열을 뜻한다
공차(common difference) :공통적으로 나타나는 차
   * **/
public class Sequence {
 public static void main(String[] args) {
	 for(int i=1;i<=26;i++) {
		 int sum = 0;
		 if(i!=26) { //25까지
			 sum += i;
		 } else {			 
			 System.out.println(i); //26?? 
			 sum += i; //sum+i
		 } 

		 }
	 }
}