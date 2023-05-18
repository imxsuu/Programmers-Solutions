# 평행
#
# 문제 설명
# 점 네 개의 좌표를 담은 이차원 배열  dots가 다음과 같이 매개변수로 주어집니다.
# [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]
# 주어진 네 개의 점을 두 개씩 이었을 때, 두 직선이 평행이 되는 경우가 있으면 1을 없으면 0을 return 하도록 solution 함수를 완성해보세요.

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;

        // (0, 1), (2, 3)
        if (findSlope(dots[0], dots[1]) == findSlope(dots[2], dots[3])) {
            return 1;
        }

        // (0, 2), (1, 3)
        if (findSlope(dots[0], dots[2]) == findSlope(dots[1], dots[3])) {
            return 1;
        }

        // (0, 3), (1, 2)
        if (findSlope(dots[0], dots[3]) == findSlope(dots[1], dots[2])) {
            return 1;
        }

        return answer;
    }
    
    public double findSlope(int[] dot1, int[] dot2) {
        // 기울기 구하는 공식 : (y2 - y1) / (x2 - x1)
        return (double) (dot2[1] - dot1[1]) / (dot2[0] - dot1[0]);
    }
}
