// 버그가 어디 있는지 알겠는가?
enum Suit { CLUB, DIAMOND, HEART, SPADE }
enum Rank { ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT,
            NINE, TEN, JACK, QUEEN, KING }
...
Collection<Suit> suits = Arrays.asList(Suit.values());
Collection<Rank> ranks = Arrays.asList(Rank.values());

List<Card> deck = new ArrayList<Card>();
for (Iterator<Suit> i = suits.iterator(); i.hasNext(); )
    for (Iterator<Rank> j = ranks.iterator(); j.hasNext(); )
deck.add(new Card(i.next, j.next()));

/**
    · 바깥족 순환문 안에서 카드 종류별로 4회 호출되어야 하는데, 안쪽 순환문에서 호출되어 카드 숫자별로 13회 호출됨
    · NoSuchElementException 발생
 */