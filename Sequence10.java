package arithmetic;

public class Sequence10 {
 public static void main(String[] args) {
	for (int i=1;i<11; i++) {
		int sum = 0;
		if(i%3==0) {
			continue;
		}
		System.out.print(+i);
	}
}
}
