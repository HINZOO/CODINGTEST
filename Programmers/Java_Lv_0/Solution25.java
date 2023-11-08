///콜라츠 수열 만들기
//모든 자연수 x에 대해서 현재 값이 x이면 x가 짝수일 때는 2로 나누고,
// x가 홀수일 때는 3 * x + 1로 바꾸는 계산을 계속해서 반복하면
// 언젠가는 반드시 x가 1이 되는지 묻는 문제를 콜라츠 문제라고 부릅니다.
import java.util.*;
class Solution25 {
    public int[] solution(int n) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(n);//주어진 x값을 제일 첫 배열에 저장.
        while(n!=1){//최종값 1이 되기 전까지
            if(n%2==0) {//짝수이면 2를 나누고
                n= n/2;
            }
            else{//홀수이면 3*x + 1 을 한다.
                n=3*n+1;

            }
            array.add(n);
        }
        int[] arr= new int [array.size()];
        int size=0;
        for(int a : array){//list를 배열로 변환.
            arr[size++] = a;
        }

        return arr;
    }
}