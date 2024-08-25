package scanner;

import java.util.Scanner;

public class ScannerWhile3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int sum = 0;   //이곳에 사용자가 입력한 값을 누적한다.

        while (true) {
            System.out.print("정수를 입력하세요 (0을 입력하면 종료):");
            int number = input.nextInt();

            if (number == 0){
                break;
            }

            sum += number;  //sum = sum + number 같다
        }

        System.out.println("입력한 모든 정수의 합 : " + sum);
    }
}
