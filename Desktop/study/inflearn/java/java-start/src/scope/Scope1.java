package scope;

public class Scope1 {

    public static void main(String[] args) {
        int m = 10; // m 생존 시작
         if (true) {
             int x = 20;  //x 생존시작
             System.out.println("if m = " + m);
             System.out.println("if x = " + x);
         } //x 생존 종료
        //ystem.out.println("main x =" + x);
        System.out.println("main m =" + m);
    } // m 생존 종료
}

/*
int m 은 main{}의 코드 블록안에서 선언되었다. 따라서 변수를 선언한 시점부터  main{}의 코드 블록이 종료될때까지 생존한다.

if{}블록 내부에서도 외부 블록에서 선언된  m에 접근할수 있다 쉽게 이야기해서 생존 범위만 맞으면 다 접근할수있다.
 */


/*
int x 는 if{}블록안에서 선언되었다. 따라서 변수를 선언한 시점부터 if{}의 코드 블록이 종료될 때 까지 생존한다.
if{} 내부에서는 자신의 범위에서 선언한 x에 당연히 접근할 수있다.
if{} 코드 블록이 끝나버리면 x는 제거된다. 따라서 더는 x에 접근할 수 없다. 이후에 접근하면 cannot find symbol이라는 변수이름을 찾을수 없다는 컴파일 오류 발생한다.
 */

/*
정리하면 지역 변수는 본인의 코드 블록 아넹서만 생존하낟. 그리고 자신의 코드 블록 안에서 얼마든지 접근할수 있다. 하지만 자신의 코드  블록을 벗어나면 제거되기 때문에
접근 할 수 없다.

이렇게 변수의 접근 가능한 범위는 스코프(Scope)라 한다. 참고로 Scope를 번역하면 범위라는 뜻이다.
int m 은 main{}전체에서 접근 할 수 있기 때문에 스코프가 넓고,  int x 는 if{} 코드 블록 안에서만 접근 할수 있기 때문에 스코프가 짧다.
 */