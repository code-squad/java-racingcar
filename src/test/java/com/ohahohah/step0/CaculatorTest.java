package com.ohahohah.step0;

import org.junit.Test;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

public class CaculatorTest {
    /*
요구사항 분석 - 구현단계 - 테스트목록
추가요구사항 연산

ver03.
    메소드가 너무 많은 일을 하지 않도록 분리하기 위해 노력해 본다.
    규칙 1: 한 메서드에 오직 한 단계의 들여쓰기만 한다.
    규칙 2: else 예약어를 쓰지 않는다.
    중복테스트 없애기

## 버전명세
- 더하기만 구현 -> 사칙연산 구현

    # 기능 요구사항 (ver01)
    - 문자열 입력받음
    - 사칙연산을 수행
    - 사칙연산의 계산 우선순위가 아닌 입력 값에 따라 계산 순서가 결정.( 즉, 수학에서는 곱셈, 나눗셈이 덧셈, 뺄셈 보다 먼저 계산해야 하지만 이를 무시한다.)
      - 예를 들어 "2 + 3 * 4 / 2"와 같은 문자열을 입력할 경우 2 + 3 * 4 / 2 실행 결과인 10을 출력해야 한다.

# 세부 기능
## 입력
- 문자열 입력받음
- 문자열을 띄어쓰기로 파싱
- 사칙연산과 숫자를 구분
- 숫자 또는 사칙연산 기호가 아닐 경우, IlligalArgument exception 출력
## 사칙연산
- 순서대로 계산
- 연산기호대로 연산하여 출력함 (4개)

# 테스트 목록
- 문자열이 띄어쓰기 단위로 파싱되었는가
- 문자열이 사칙연산과 숫지로 구분되어 파싱되었는가
- 숫자 또는 사칙연산 기호가 아닐 경우, IlligalArgument exception 출력
- 띄어쓰기 파싱
- 덧셈_연산이 됨
- 뺼셈_연산이 됨
- 곱셈_연산이 됨
- 나눗셈_연산이 됨
- 전체 결과값이 예상 결과값이 연산됨? - 테스트단위가 너무 크지 않아? 앞에서 세부를 테스트해서 괜찮나?
    */


    @Test
    public void 문자열이_띄어쓰기_단위로_파싱되었는가() {
        ArrayList<String> arrExpected = Stream.of("3", "+", "3").collect(Collectors.toCollection(ArrayList::new));

        assertThat("3 + 3").isEqualTo(arrExpected);
    }

    @Test
    public void 테스트프레임워크_import_test() {
        assertEquals(7,7);
        assertThat("7").isEqualTo("7");

    }
}

