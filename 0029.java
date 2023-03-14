# 인덱스 바꾸기
#
# 문제 설명
# 문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때, my_string에서 인덱스 num1과 인덱스 num2에 해당하는 문자를 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.

# 1
class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++){
            if(i == num1){
                answer += my_string.charAt(num2);
            }
            else if(i == num2){
                answer += my_string.charAt(num1);
            }
            else answer += my_string.charAt(i);
        }
        return answer;
    }
}

# 2
class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] arr = my_string.toCharArray();
        char temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
        return String.valueOf(arr);
    }
}
