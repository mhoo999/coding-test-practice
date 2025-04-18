package programmers.level1;

import java.util.Stack;

/**
 * 문제: 문자열 뒤집기
 * 
 * 문자열 s가 주어졌을 때, s를 뒤집은 문자열을 반환하는 함수를 작성하세요.
 * 
 * 제한사항:
 * - s는 길이가 1 이상 1000 이하인 문자열입니다.
 * - s는 알파벳 대소문자로만 이루어져 있습니다.
 * 
 * 예시:
 * 입력: "hello"
 * 출력: "olleh"
 * 
 * 입력: "World"
 * 출력: "dlroW"
 * 
 * 입력: "a"
 * 출력: "a"
 */
public class ReverseString {
    public String solution(String s) {
        // 여기에 코드를 작성해주세요
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
} 