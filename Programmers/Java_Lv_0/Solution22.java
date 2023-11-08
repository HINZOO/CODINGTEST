//배열의 길이에 따라 다른 연산하기
class Solution22 {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int [arr.length];
        if(arr.length%2!=0){//배열이 홀수일 때
            for(int i=0; i<arr.length ; i++){
                if(i%2==0) answer[i]=arr[i]+n;//모든 짝수 인덱스에 n을 더함
                else answer[i]=arr[i];
            }
        }else if(arr.length%2==0){// 배열이 짝수일 때
            for(int i=0; i<arr.length ; i++){
                if(i%2!=0) answer[i]=arr[i]+n; //모든 홀수 인덱스에 n을 더함.
                else answer[i]=arr[i];
            }

        }
        return answer;
    }
}