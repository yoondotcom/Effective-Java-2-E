for (int i = 0, n = expensiveComputation; i < n; i++) {
    doSomething(i);
}

/**
    · 변수 i와 n의 유효범위는 for문 안으로 제한됨
    · n의 값을 미리 계산해 넣어두고 사용함으로써 매번 재계산 할 필요가 없음
 */