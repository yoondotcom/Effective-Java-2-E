public interface Iterable<E> {
    // 이 Iterable 안에 있는 원소들에 대한 반복자 반환
    Iterator<E> iterator();
}

/**
    · 원소들의 그룹을 나타내는 자료를 작성할 때는 Iterable을 구현하여 클라이언트가 for-each문을 통해 해당 자료형을 순회할 수 있도록 함 
 */