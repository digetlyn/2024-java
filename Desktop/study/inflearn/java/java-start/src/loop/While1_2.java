package loop;

public class While1_2 {
    public static void main(String[] args) {
        int count =  0;

        while (count < 77){
            count = count +1;   // count++; 이렇게 해도 값이 나온긴한다.
            System.out.println(count+ "번째"+" 현재 숫자는:" + count);
        }
    }
}


