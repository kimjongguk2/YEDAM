package testt;

import java.util.Scanner;

public class ex {

	public static void main(String[] args) {
		//����1) �� ���� �Է¹޾� ���ʴ�� �� ���� ��Ģ������ �̿��Ͽ� ������ ���� ���Ѵٰ� ���� �� � ������� �Ǵ� �� �����ϼ���.
				//		���� ���, 2, 3, 5�� �Է¹޾��� ��� 2 + 3 = 5 �� ����ϼ���.
				
				// ������ �Է¹޾�
		Scanner scanner = new Scanner(System.in); 
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();
		
		if (x + y == z) {
			System.out.printf("%d + %d = %d\n" ,x ,y ,z);
		}else if (x - y == z) {
			System.out.printf("%d - %d = %d\n" ,x ,y ,z);
		}else if (x * y == z) {
			System.out.printf("%d * %d = %d\n" ,x ,y ,z);
		}
	}

}
