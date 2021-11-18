import java.util.Scanner;
//구구단 대신 nn단('2 x 1' 부터 'n x n'까지 계산하는 변형 구구단)
public class ModifiedMultiplicationTableVer01 {
  public static void main(String[] args) {
    System.out.println("몇 단??");
	Scanner scanner = new Scanner(System.in);  //사용자에게 단 수를 입력 받기
	int number = scanner.nextInt();	//입력받은 단 수를 정수 number로 변환
	for (int j=1;j<number;j++) {	//number단 단위 반복(2단 ~ number단)
		int[] calculated = new int[(j+1)];	//number단 곱셈 결과값 넣을 빈 배열 생성
		for (int i=0;i<calculated.length;i++) {	//단 내 곱셈 반복('x 1' ~ 'x 현재 단 수')
			calculated[i] = (j+1) * (i+1);	//곱셈 결과를 배열에 순서대로 대입
			System.out.println(calculated[i]);	//대입된 결과값 출력
		}	//단 내 반복문 종료
	System.out.println("");
	}	//단 단위 반복문 종료
  }	//main 메소드 종료
}
