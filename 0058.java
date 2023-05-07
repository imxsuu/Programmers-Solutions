# 잘라서 배열로 저장하기
#
# 문제 설명
# 문자열 my_str과 n이 매개변수로 주어질 때, my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.

class Solution {
    public String[] solution(String my_str, int n) {
        int size = my_str.length()/n;
        if(my_str.length() % n != 0){
            size++;
        }
        String[] answer = new String[size];
        int index = 0;
        for(int i = 0 ; i < my_str.length() ; ) {
            int next = Math.min(i + n, my_str.length());
            answer[index] = my_str.substring(i,next);
            i += n;
            index++;
        }
        return answer;
    }
}

