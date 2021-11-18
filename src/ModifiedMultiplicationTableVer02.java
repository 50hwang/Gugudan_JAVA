import java.util.Scanner;
//사용자에게 두 수(m, n)을 입력받아, 구구단 대신 mn단 만들어보기
public class ModifiedMultiplicationTableVer02 {
  public static void main(String args[]) {
    //사용자에게 두 수(first, second)을 입력받기
    System.out.println("몇 단??(m,n <- 이런식으로 입력하기)");
    Scanner scanner = new Scanner(System.in); //사용자에게 두 수 입력받기
    String inputValue = scanner.nextLine(); //입력받은 Raw Data를 문자열 형태로 변환
    String[] splittedValue = inputValue.split(","); //두 수를 콤마 단위 분리하여 문자열 배열 형태로 대입
    int first = Integer.parseInt(splittedValue[0]); //첫번째 수를 단 수로 설정
    int second = Integer.parseInt(splittedValue[1]);  //두번째 수를 곱할 상한치로 설정
    
    //입력받은 두 수로 mn단 연산 및 출력
    for (int i=1;i<first;i++) { //first단 단위 반복(2단 ~ first단)
      System.out.println((i+1) + "단");
      int[] calculated = new int[second];  //first단 second까지 곱셈 결과값 넣을 빈 배열 생성
      for (int j=0;j<second;j++) {  //단 내 곱셈 반복('x 1' ~ 'x second')
        calculated[j] = (i+1) * (j+1);  //곱셈 결과를 배열에 순서대로 대입
        System.out.println(calculated[j]);  //대입된 결과값 출력
      } //단 내 반복문 종료
    System.out.println("");
    } //단 단위 반복문 종료
  } //main 메소드 종료
}
