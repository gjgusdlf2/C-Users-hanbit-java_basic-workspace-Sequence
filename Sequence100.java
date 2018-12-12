package arithmetic;

public class Sequence100 {
	public static void main(String[] args) {
		int i=0, x=0; int sum = 0;
		while(true){
			i++;
			if(i<=100) {
				x += i;
				continue;				
			} else {
				sum = i;
				break;
			}
		}
		System.out.println(sum);
	}

}
