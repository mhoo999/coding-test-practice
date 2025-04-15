package programmers.level1;

/**
 * 문제: 자릿수 더하기
 * 
 * 자연수 N이 주어졌을 때, N의 각 자릿수의 합을 구하는 프로그램을 작성하세요.
 * 
 * 제한사항:
 * - N은 1 이상 10,000,000 이하의 자연수입니다.
 * 
 * 예시:
 * 입력: 123
 * 출력: 6 (1 + 2 + 3)
 * 
 * 입력: 987
 * 출력: 24 (9 + 8 + 7)
 */
public class SumOfDigits {
    public int solution(int n) {
        int answer = 0;
        
        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }
        
        return answer;
    }
} 