package casting;

public class Casting1 {

    public static void main(String[] args) {
        int inValue = 10;
        int longValue ;
        double doubleValue;

        longValue = inValue;  // int -> long
        System.out.println("longValue = " + longValue);

        doubleValue = inValue;
        System.out.println("doubleValue1 = " + doubleValue);

        doubleValue = 20L;
        System.out.println("doubleValue2 = " + doubleValue);
    }
}

/*
자바는 기본적으로 같은 타입에 값을 대입할수 있다. 그런데 다른 타입에 값을 대입하면 어떻게 될까?
int -> long 을 비교해보면 long 이 int 보다 더 큰 숫자 범위를 표현한다. 작은 범위 숫자 타입에서 큰 범위 숫자 타입에 대입을 하면
문제가 되지 않는다. 만약 이런 경우까지 오류가 발생한다면 개발이 너무 불편한것이다.
long -> double 경우에도 double은 부동 소수점을 사용하기 때문에 더 큰 숫자 범위를 표현한다. 따라서 대입할 수 있다.
정리하면 작은 범위에서 큰 범위로의 대입은 자바 언어에서 허용한다. 쉽게 이야기 하면 큰 그릇은 작은 그릇에 담긴 내용물을 담을 수 있다.
 */
