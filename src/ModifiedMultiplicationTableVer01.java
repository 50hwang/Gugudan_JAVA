import java.util.Scanner;

public class ModifiedMultiplicationTableVer01 {
  public static void main(String[] args) {
    System.out.println("몇 단??");
	Scanner scanner = new Scanner(System.in);
	int number = scanner.nextInt();
	for (int j=1;j<number;j++) {
		int[] calculated = new int[(j+1)];
		for (int i=0;i<calculated.length;i++) {
			calculated[i] = (j+1) * (i+1);
			System.out.println(calculated[i]);
		}
		System.out.println("");
	}
  }
}
