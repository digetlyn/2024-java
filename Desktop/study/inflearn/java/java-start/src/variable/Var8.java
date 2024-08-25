package variable;

public class Var8 {
    public static void main(String[] args) {
        //정수
        byte b = 127; // -128 ~ 127
        short s = 32767; //- 32,768 ~ 32,767
        int i = 2147483647;  // -2,147,483,648 ~ 2,147,483,647 ( 약 20억)

        //-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
        long l = 9223372036854775807L;


        //실수
        float f = 10.0f;
        double d = 10.0;  // double이 더 큰 실수를 다룰수 있다.

        /*자주 사용하는 타입
        실무에서 자주 사용하는 타입은 다음과 같다
        정수 - int, long  : 자바는 정수에 기본 int를 사용한다. 만약 20억이 넘을것 같으면 long을 쓰면 된다
                파일을 다룰때는 byte를 사용한다.
         실수 - double : 실수는 고민하지말고 double을 쓰면된다
         불린형 - boolean : true, false 참 거짓을 표한다. 이후 조건문에서 자주 사용된다.
         문자열 - String : 문자를 다룰ㄷ 때는 문자 하나든, 문자열이든 모두 String을 사용하는것이 편리하다
        */


    }
}
