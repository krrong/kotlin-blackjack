package blackjack.domain

interface Participant {
    val cardBunch: CardBunch

    fun receiveCard(card: Card) {
        cardBunch.addCard(card)
    }

    fun canHit(): Boolean

    fun getScore(): Int
}
