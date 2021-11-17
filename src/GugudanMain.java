
public class GugudanMain {
	//외부 클래스(GugudanWithMethods)에 있는 메소드를 실행
	public static void main(String[] args) {
		for (int number=2; number<10; number++) {
			System.out.println(number + "단");
			int[] result = GugudanWithMethods.calculate(number);	//GugudanWithMethods 클래스의 calculate 메소드로 구구단 계산
			GugudanWithMethods.print(result);	//GugudanWithMethods 클래서의 print 메소드로 결과 출력
			System.out.println("");
		}
	}
}
