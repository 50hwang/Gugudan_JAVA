// 출력 함수를 이용하여 구구단 2단과 3단 출력하기 

// 사용자에게 입력값을 받기 위한 Scanner 기능 import
import java.util.Scanner;

public class Gugudan {
	public static void main(String args[]) {
		// 2단 - 타이핑 노가다
		System.out.println("2단");
		System.out.println(2 * 1);
		System.out.println(2 * 2);
		System.out.println(2 * 3);
		System.out.println(2 * 4);
		System.out.println(2 * 5);
		System.out.println(2 * 6);
		System.out.println(2 * 7);
		System.out.println(2 * 8);
		System.out.println(2 * 9);

		System.out.println("");
		
		// 3단 - Ctrl+Alt+아래화살표로 한 줄 duplicate
		System.out.println("3단");
		System.out.println(3 * 1);
		System.out.println(3 * 2);
		System.out.println(3 * 3);
		System.out.println(3 * 4);
		System.out.println(3 * 5);
		System.out.println(3 * 6);
		System.out.println(3 * 7);
		System.out.println(3 * 8);
		System.out.println(3 * 9);
		
		System.out.println("");

		// 4단 - int 변수 활용할 것
		System.out.println("4단");
		int result = 4 * 1;			//정수형 변수 선언 w/ 변수명 result
		System.out.println(result);
		result = 4 * 2;				//이미 선언된 result 변수값 바꾸기
		System.out.println(result);
		result = 4 * 3;				//두 줄 선택 후 Ctrl+Alt+아래화살표로 선택 영역 duplicate
		System.out.println(result);
		result = 4 * 4;				
		System.out.println(result);
		result = 4 * 5;				
		System.out.println(result);
		result = 4 * 6;				
		System.out.println(result);
		result = 4 * 7;				
		System.out.println(result);
		result = 4 * 8;				
		System.out.println(result);
		result = 4 * 9;				
		System.out.println(result);
		
		System.out.println("");
		
		// 5단 - 사용자에게 입력값을 받아(Scanner) 구현해보기
		System.out.println("몇 단??");
		Scanner scanned = new Scanner(System.in);
		int number = scanned.nextInt();
		System.out.println(number + "단");
		System.out.println(number * 1);
		System.out.println(number * 2);
		System.out.println(number * 3);
		System.out.println(number * 4);
		System.out.println(number * 5);
		System.out.println(number * 6);
		System.out.println(number * 7);
		System.out.println(number * 8);
		System.out.println(number * 9);	
		
		System.out.println("");

		// 6단 - while 반복문을 사용하여 코드 줄 수를 줄여보기
		System.out.println("6단");
		int i = 1;	//단 수 x "몇" <- 1 ~ 9까지의 index 변수 i의 초기값 설정
		while (i < 10) {	//i < 10 조건 하에 반복문 시작
			System.out.println(6 * i);	//곱셈 결과 출력
			i++;	//i 값을 1 증가
		}	//반복문 종료
		System.out.println("");
		
		// 7단 - for 반복문을 사용하여 코드 줄 수를 좀 더 줄여보기
		System.out.println("7단");
		for (int j = 1; j < 10; j++) { //반복 횟수로써 변수 j의 초기값 및 반복 한정 횟수(9회) 지정 후 반복문 시작
			System.out.println(7 * j);
		}	//반복문 종료
		System.out.println("");
		
		// 8, 9단 - 조건문을 사용하여 값 입력 범위를 제한시켜보기
		System.out.println("이번엔 또 몇 단??");
		Scanner scannedAgain = new Scanner(System.in);
		int numberAgain = scannedAgain.nextInt();
		if (numberAgain < 2) {	//입력값이 2 이하일 때 아래 명령 실행
			System.out.println("2 이상의 값을 입력해주십시오.");//사용자에게 에러 메시지 출력
		} else if (numberAgain > 9) { //입력값이 2 이하가 아니지만, 9 이상일 때 아래 명령 실행
			System.out.println("9 이하의 값을 입력해주십시오.");//사용자에게 에러 메시지 출력	
		} else { //위의 어느 특정 조건도 해당하지 않을 때 실행
			System.out.println(numberAgain + "단");
			for (int k = 1; k < 10; k++) {
				System.out.println(numberAgain * k);
			}	//반복문 종료
			System.out.println("");
		}	//조건문 종료
	}
}
