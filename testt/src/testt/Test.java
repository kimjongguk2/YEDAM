package testt;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// �Է��� �ܿ��� 9�ܱ��� ���
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt(); 
		
		for (int i = dan; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				
				System.out.printf("%d X %d = %d \n" , i ,j , (i*j) );
			}
			
		}

	}

}
