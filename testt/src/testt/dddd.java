package testt;

import java.util.Scanner;

public class dddd {

	public static void main(String[] args) {
		//����)Ű����κ��� �л����� �л����� ������ �Է¹޾Ƽ�
		//�ְ������� ��� ������ ���ϴ� ���α׷��Դϴ�.

		boolean run=true;
		//int studentNum=0;
		
		int[] scores=null;
		Scanner scanner =new Scanner(System.in);
		
		while(run)
		{
		System.out.println("----------------------------------------------------");
		
		System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
		System.out.println("----------------------------------------------------");
		System.out.println("����>");
		int selectNo=scanner.nextInt();
		
			switch(selectNo)
			{
			case 1:
				System.out.println("�л���>");
				int selectstd=scanner.nextInt();//�л����� �Է��ϰ�
				scores=new int[selectstd];//�Է¹������� �迭ũ��� �����Ѵ�
				break;//������
				
			case 2:
				for(int i=0;i<scores.length;i++)//scores.lingth =�л�ũ��(��) ��ŭ
				{
					System.out.println("scores["+i+" ]> ");
					int insertgrade=scanner.nextInt();	//�������Է¹޾�
					scores[i]=insertgrade;//i���л��� ������ �����ִ´�.
				}
				break;
				
			case 3:
				for(int i=0;i<scores.length;i++)
				{
					System.out.println("scores["+i+"]: "+ scores[i]);//�л����� ������ ��Ÿ����
				}
				break;
			case 4:
				int sum=0;
				int max=0;
				for(int i=0;i<scores.length;i++)//�л������ŭ �ݺ��ϴµ���
				{
					sum+=scores[i];//sum�� ����л��� ���������ϰ�
					if(max<scores[i])//max���� �л������� Ŭ���
						max=scores[i];//max�� �л������� �ִ´�
				}
				double avg=(double)sum/scores.length;//sum���� �л������ ������ ��������Ѵ�
				System.out.println("�ְ� ���� : "+max);
				System.out.println("��� ���� : "+avg);
				break;
			case 5:
				System.out.println("���α׷� ����");
				System.exit(0);//�������μ���
			}
		
		
			
		}

	}

}
