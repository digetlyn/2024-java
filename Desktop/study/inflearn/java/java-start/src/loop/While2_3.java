package loop;

public class While2_3 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 50;
        int endNum = 100;

        while (i <= endNum){  //반복문으로해서 코드를 반복 수행한다.

            sum = sum + i;
            System.out.println("i=" + i + " sum=" + sum);
            i++;

        }
    }
}
 /*
반복회수 정하기
i가 endNum이 될때까지 반복해서 코드를 실행하면 된다.
 i = 1,  endNum=3 이라면 3번 반복하면된다. i=1 -> 2 -> 3
 i = 3, endNum=4 라면 2번 반복하면 된다. i=3 -> 4
while문 작성하기
while문에서 i <= endNum 조건을 통해 i가 endNum 이 될때 까지 코드를 블록을 실행한다.
i 가 endNum보다 크면 while 문을 종료한다.
*/
