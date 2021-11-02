package testt;

public class ddd {

	public static void main(String[] args) {
		int sum = 3;
		for (int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				sum += i;
			}
        }
		System.out.println(sum);

	}
}
