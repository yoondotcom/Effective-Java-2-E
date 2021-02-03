for (Iterator<Element> i = c.iterator(); i.hasNext(); } {
    soSomething(i.next());
}

    ...

// 심볼 i를 찾을 수 없다면서 컴파일 시점에 오류 발생
for (Iterator<Element> i2 = c2.iterator(); i.hasNext(); } {
    doSomething(i2.next());
}

/**
    · 선언한 변수명이 다를 시 컴파일 오류 발생
    · 각각의 for문은 서로 의존성이 없으므로 같은 변수명을 거듭 사용 가능
    · while문 보다 코드 길이가 짧아서 가독성 높음
 */