package scanner;

import java.util.Scanner;

public class Scanner3_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력하세요 :");
        int num1 = scanner.nextInt();


        System.out.print("두번째 숫자를 입력하세요. :" );
        int num2 =  scanner.nextInt();

        int sum = num1 + num2;

        if (num1 > num2) {
            System.out.println("더큰 숫자는: " + num1);
        } else if (num2 > num1) {
            System.out.println("더큰 숫자는: " + num2);
        } else {
            System.out.println("두 숫자는 같다");
        }
        System.out.println("두 숫자의 합은:" + sum);
    }
}
