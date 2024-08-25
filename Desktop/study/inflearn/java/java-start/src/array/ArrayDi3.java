package array;

public class ArrayDi3 {
    public static void main(String[] args) {

        // 2 x 3  2차원 배열을 만든다.
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };  //행2, 열3


        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + "  ");
            }
            System.out.println();  //한 행이 끝나면 라인은 변경한다.
        }
    }
}
/*
for문에서 2차원 배열의 길이를 활용했다.
 - arr.length는 행의 길이를 뜻한다. 여기서 2가 출력된다.
  - {{},{}} 를 생각해보면 arr 배열은 {},{} 2개의 배열 요소를 가진다.
 - arr[row].length는 열의 길이를 뜻한다. 여기서는 3이 출력된다.
  - arr[0]은 {1,2,3} 배열을 뜻한다. 이 배열에는 3개의 요소가있다.
  - arr[1]은 {4,5,6} 배열을 뜻한다. 이 배열에는 3개의 요소가 있다.
 */