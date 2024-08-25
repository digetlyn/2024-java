package cond.ex;

public class EvenOddEx {

    public static void main(String[] args) {
        int x = 3;
        String result = ( x % 2 == 0) ? "짝수" : "홀수";  //나머지 구하는..
        System.out.println("x = " + x + ", " + result);
    }
}
