# 문자열 밀기
#
# 문제 설명
# 문자열 "hello"에서 각 문자를 오른쪽으로 한 칸씩 밀고 마지막 문자는 맨 앞으로 이동시키면 "ohell"이 됩니다. 이것을 문자열을 민다고 정의한다면 문자열 A와 B가 매개변수로 주어질 때, A를 밀어서 B가 될 수 있다면 밀어야 하는 최소 횟수를 return하고 밀어서 B가 될 수 없으면 -1을 return 하도록 solution 함수를 완성해보세요.

#1
class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String copy = A;

        for (int i = 0; i < A.length(); i++) {
            if (copy.equals(B)) {
                return answer;
            }

            String a = copy.substring(copy.length() - 1);
            copy = a + copy.substring(0, copy.length() - 1);
            answer++;
        }

        return -1;
    }
}

#2
class Solution {
    public int solution(String A, String B) {

        return (B+B).indexOf(A);
    }
}
