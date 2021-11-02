package testt;

import java.util.Scanner;

public class dddd {

	public static void main(String[] args) {
		//문제)키보드로부터 학생수와 학생들의 점수를 입력받아서
		//최고점수및 평균 점수를 구하는 프로그램입니다.

		boolean run=true;
		//int studentNum=0;
		
		int[] scores=null;
		Scanner scanner =new Scanner(System.in);
		
		while(run)
		{
		System.out.println("----------------------------------------------------");
		
		System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
		System.out.println("----------------------------------------------------");
		System.out.println("선택>");
		int selectNo=scanner.nextInt();
		
			switch(selectNo)
			{
			case 1:
				System.out.println("학생수>");
				int selectstd=scanner.nextInt();//학생수를 입력하고
				scores=new int[selectstd];//입력받은값을 배열크기로 지정한다
				break;//나오기
				
			case 2:
				for(int i=0;i<scores.length;i++)//scores.lingth =학생크기(수) 많큼
				{
					System.out.println("scores["+i+" ]> ");
					int insertgrade=scanner.nextInt();	//점수를입력받아
					scores[i]=insertgrade;//i번학생의 점수에 값을넣는다.
				}
				break;
				
			case 3:
				for(int i=0;i<scores.length;i++)
				{
					System.out.println("scores["+i+"]: "+ scores[i]);//학생들의 점수를 나타낸다
				}
				break;
			case 4:
				int sum=0;
				int max=0;
				for(int i=0;i<scores.length;i++)//학생들수많큼 반복하는동안
				{
					sum+=scores[i];//sum에 모든학생의 점수를더하고
					if(max<scores[i])//max보다 학생점수가 클경우
						max=scores[i];//max에 학생점수를 넣는다
				}
				double avg=(double)sum/scores.length;//sum에서 학생들수를 나눠서 평균을구한다
				System.out.println("최고 점수 : "+max);
				System.out.println("평균 점수 : "+avg);
				break;
			case 5:
				System.out.println("프로그램 종료");
				System.exit(0);//종료프로세스
			}
		
		
			
		}

	}

}
