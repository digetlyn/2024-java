package loop;

public class Break2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        for (;;){  //for문은 조건이 없으면 무한 반복
            sum = sum + i;
            if (sum >  10) {  // sum > 10 조건을 만족하면  break를 사용해서 while문을 빠져나간다.
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
                break;
            }
            i++;
        }
    }
}
