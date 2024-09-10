package method;

public class Method1Ref {
    public static void main(String[] args) {

        //계산1

        int sum1 =  add(5,10);
       // System.out.println(a + " + " + b + " 연산 수행");
       // int sum1 = a  + b;
        System.out.println("결과1 출력 : " + sum1);

        System.out.println("=============================");

        //계산2

        int sum2 =add(15,20);
        //int y = 20;
        //System.out.println(x + "+" + y + "연산 수행");
        //int sum2 = x + y ;
        System.out.println("결과2 출력:" + sum2);

    }

    //add 메서드
    public static int add(int a, int b) {
        System.out.println(a + "+" + b + " 연산수행");
        int sum = a + b;
        return sum;
    }
}
