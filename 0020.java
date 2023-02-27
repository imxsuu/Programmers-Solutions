# 숨어있는 숫자의 덧셈(1)
#
# 문제 설명
# 문자열 my_string이 매개변수로 주어집니다. my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.

class Solution {
    public int solution(String my_string) {
        my_string = my_string.replaceAll("[^0-9]", "");

        int answer = 0;

        for(int i = 0; i < my_string.length(); i++) {
            answer += Integer.parseInt(String.valueOf(my_string.charAt(i)));
        }           

        return answer;
    }
}
