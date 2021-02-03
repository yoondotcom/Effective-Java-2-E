// 같은 버그, 다른 증상
enum Face { ONE, TWO, THREE, FOUR, FIVE, SIX }
...
Collection<Face> faces = Arrays.asList(Face.values());

for (Iterator<Face> i = faces.iterator(); i.hasNext(); )
    for (Iterator<Face> j = faces.iterator(); j.hasNext(); )
System.out.println(i.next() + " " + j.next());

/**
    · 위 프로그램은 예외를 발생하지 않으나 짝패만 출력하게 됨(“ONE ONE”부터 “SIX SIX”)
 */