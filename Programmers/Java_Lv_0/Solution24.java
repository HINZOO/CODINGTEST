//인덱스 바꾸기
//문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때,
// my_string에서 인덱스 num1과 인덱스 num2에 해당하는 문자를 바꾼 문자열을 return 하도록
// solution 함수를 완성해보세요.
public class Solution24 {
    public String solution(String my_string, int num1, int num2){
        String[] arr = my_string.split("");//문자열을 배열로 바꾼뒤

        String temp = arr[num1];// num1번째 배열 값을 빈 공간에 넣고
        arr[num1] = arr[num2];//num1번째에 num2 번째 값을 넣음
        arr[num2] = temp;// num2번째 값에 line 9에서 넣어둔 temp값을 넣음.

        return String.join("", arr);//배열을 다시 String 값으로 리턴.
    }
}
