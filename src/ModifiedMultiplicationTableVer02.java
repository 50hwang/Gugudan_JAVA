import java.util.Scanner;
//사용자에게 두 수(m, n)을 입력받아, 구구단 대신 mn단 만들어보기
public class ModifiedMultiplicationTableVer02 {
  public static void main(String args[]) {
    //사용자에게 두 수(first, second)을 입력받기
    System.out.println("몇 단??(m,n <- 이런식으로 입력하기)");
    Scanner scanner = new Scanner(System.in);
    String inputValue = scanner.nextLine();
    String[] splittedValue = inputValue.split(",");
    int first = Integer.parseInt(splittedValue[0]);
    int second = Integer.parseInt(splittedValue[1]);
    
    //입력받은 두 수로 mn단 연산 및 출력
    for (int i = 1;i < first;i++) {
      System.out.println(i + "단");
      int[] calculated = new int[first];
      for (int j = 0;j < second;j++) {
        int[j] = (i+1) * (j+1);
        System.out.println(int[j]);
      }
    }
  }
}
