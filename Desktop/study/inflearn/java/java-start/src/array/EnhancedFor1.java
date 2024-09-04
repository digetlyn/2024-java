package array;

public class  EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};


         //iter 향상된 for문 단축키

        //일반 for문
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }


        // 향상된 for문, for-each문
            for (int number : numbers) {
                System.out.println(number);
            }



        //for-each문을 사용할 수 없응 경우, 증가하는 index값 필요
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number" + i + "번의 결과는: " + numbers[i]);
        }

        /*향상된 for문은 배열의 인덱스를 사용하지 않고, 종료조건을 주지 않아도 된다. 단순히 해당 배열을 처음부터 끝까지 탐색한다.
        : 의 오른쪽에는 numbers 와 같이 탐색할 배열을 선택하고, :의 왼족에 int number와 같이 반복할때마다 찾은 값을 저장할 변수를 선언한다.
        그러면 배열의 값을 하나씩 꺼내서 왼쪽이 있는 number에 담고 for문을 수행한다. for문의 끝에 가면 다음 값을 꺼내서 number에 담고 for문을 반복수행한다.
        numbers배열의 끝에 도달해서 더 값이 없으면 for문이 완전히 종료된다.
        향상된 for문은 배열의 인덱스를 사용하지 않고도 배열의 요소를 순회할수 있기 때문에 코드가 간결하고 가독성이 좋다.
        * */
    }
}

