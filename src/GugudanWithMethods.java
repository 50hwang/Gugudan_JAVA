//public class GugudanWithMethods {
//	//입력한 단(times)을 구구단 곱셈 결과의 배열(result)로 반환시키는 메소드(calculate) 선언
//	public static int[] calculate(int times) {	//times 정수 받고 정수 배열 반환하는 메소드 선언
//		int[] result = new int[9];	//새로운 정수 배열 result 생성
//		for (int i=0;i < result.length; i++) {	//곱셈 결과값으로 정수 배열 result를 채우는 반복문 실행
//			result[i] = times * (i + 1);	//받은 times 정수로 곱셈 결과값 대입
//		}	//반복문 종료
//		return result;	//완성된 정수 배열 result 반환
//	}	//calculate 메소드 종료
//	
//	public static void main(String[] args) {	//값을 반환하지 않는 main 메소드 선언 및 실행
//		int[] result = calculate(2);	//위에서 선언한 calculate 메소드에 2(단수)를 넣은 결과값 배열 호출
//		for (int i=0; i<result.length; i++) {	//호출한 배열 안의 값을 출력하는 반복문 실행
//			System.out.println(result[i]);	//i번째 값 호출
//		}	//반복문 종료
//	}	//main 메소드 종료
//}

public class GugudanWithMethods {
	//입력한 단(times)을 구구단 곱셈 결과의 배열(result)로 반환시키는 메소드(calculate) 선언
	public static int[] calculate(int times) {
		int[] result = new int[9];
		for (int i=0;i < result.length; i++) {
			result[i] = times * (i + 1);
		}
		return result;
	}
	
	//위에서 선언한 calculate 메소드를 실행시킨 결과값을 출력시키는 메소드(print) 선언
	public static void print(int[] result) {
		for (int i=0;i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

	//calculate 메소드로 계산, print 메소드로 출력시키는 main메소드 선언 및 실행
	public static void main(String[] args) {
		for (int number=2; number<10; number++) {
			System.out.println(number + "단");
			int[] result = calculate(number);
			print(result);
			System.out.println("");
		}
	}
}
