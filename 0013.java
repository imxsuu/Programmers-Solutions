# 자릿수 더하기
#
# 문제 설명
# 정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요

class Solution {
    public int solution(int n) {
        String str = Integer.toString(n);
        String[] strArr = str.split("");
        int answer = 0;
        for(int i = 0; i < strArr.length; i++) {
            answer += Integer.parseInt(strArr[i]);
        }
        return answer;
    }
}
