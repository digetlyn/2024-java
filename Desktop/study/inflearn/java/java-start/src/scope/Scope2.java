package scope;

public class Scope2 {
    public static void main(String[] args) {
        int m = 10;
        for (int i = 0; i < 2; i++){  //블록 내부, for문 내
            System.out.println("for m = " + m); //블록 내부에서 외부는 접근 가능
            System.out.println("for i = " + i);
        } //i 생존 종료
        //System.out.println("main i = " + i);
        System.out.println("main m = " + m);
        /*
        for문으로 바뀐 것을 제외하면 앞의 예제와 비슷한 예제이다.
        for문의 경우 for(int i = 0; ..)과 같이 for문 안에서 초기식에서 직접 변수를 선언 할수 있다. 그리고 이렇게 선언한 변수는
        for문 코드 블록 안에서만 사용할수 있다.
         */
    }
}
