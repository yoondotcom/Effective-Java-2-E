Iterator<Element> i = c.iterator();
while (i.hasNext()) {
    doSomething(i.next());
}
...

Iterator<Element> i2 = c2.iterator();
while (i.hasNext()) {                // 버그!
    doSomethingElse(i2.next());
}

/**
    · copy and paste하여 코드 작성 시 위와같은 버그 발견
    · 새로운 순환문에서 변수 i2를 초기화 하였으나, 실제로는 전 순환문의 변수 i를 사용
    · i가 유효범위 안에 있기 때문에 컴파일 및 실행이 되지만 의도와 맞지 않게 동작함
 */