
public class GugudanWithArrays {
	public static void main(String args[]) {
		//2단을 구현하기 위한 크기 9의 배열 생성
		int[] second = new int[9];	//크기가 9인 새로운 정수형 배열을 변수명 second에 선언

		//for문을 돌리면서 2단 실행 결과 배열 저장
		for (int i=0; i < second.length; i++) {	//배열 second의 각 위치 i(0~8)에 대해여 반복문 실행
			second[i] = 2 * (i + 1);	//배열 second의 i번째 위치에 2단 곱셈 결과값 대입
		}	//반복문 종료

		//배열의 크기만큼 for문을 통한 결과 출력
		for(int i=0; i < second.length; i++) {	//배열 second의 각 위치 i(0~8)에 대해여 반복문 실행
			System.out.println(second[i]);	//배열 second의 i번째 위치의 결과값 출력
		}	//반복문 종료
		System.out.println("");
		
		//보다 중복을 제거한 배열과 반복문을 활용한 3단 구현
		int[] third = new int[9];
		for (int i=0; i < third.length; i++) {
			third[i] = 3 * (i + 1);
			System.out.println(third[i]);
		}		
		System.out.println("");

		
		//2~9단까지 2중 for문으로 구현
		System.out.println("2~9단까지 2중 for문으로 구현");
		int[] multiply_all = new int[9];	//구구단 한 단의 결과값의 배열을 변수 multiply_all에 할당
		for (int number=2; number < 10; number++) {	//2단부터 9단까지 number단 단위 반복문 시작
			System.out.println(number + "단");
			for (int i=0; i < multiply_all.length; i++) {	//한 단 내에서 1~9까지 곱셈 반복문 시작
				multiply_all[i] = number * (i + 1);		//곱셈 연산 결과값을 순서에 맞게 저장
				System.out.println(multiply_all[i]);	//저장된 결과값 출력
			}	//단 내 곱셈 반복문 종료
			System.out.println("");
		}	//number단 단위 반복문 종료
				
	}
}
