package testt;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 1; i<=N; i++){//N�� ��ŭ �����ϱ����� for��
            for(int j = 1; j<=N-i;j++) {//for�� ���ο� for���� ����
                //������ ����ϴµ� 1�࿡ 4��, 2�࿡ 3��...�̷���
                //���� i�� �హ���ϱ� ������ N-i�� �Ѵ�
                System.out.print(" ");
            }
                for(int k = 1; k<=i; k++){
                    System.out.print("*");
                    //���� i������ŭ ����ϴ� k<=i
                }
            System.out.println();//���������� sout
            }

        }

    }
