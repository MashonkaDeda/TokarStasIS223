//Практическая работа №7.3
//Токарь Станислав ИС223
import kotlin.random.Random

data class Card(val rank: String, val suit: String) {
    override fun toString(): String {
        return "$rank of $suit"
    }
}

class Deck {
    private val suits = listOf("Hearts", "Diamonds", "Clubs", "Spades")
    private val ranks = listOf("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace")
    private val cards: MutableList<Card> = mutableListOf()

    init {
        for (suit in suits) {
            for (rank in ranks) {
                cards.add(Card(rank, suit))
            }
        }
        shuffle()
    }

    fun shuffle() {
        cards.shuffle()
    }

    fun drawCard(): Card {
        return cards.removeAt(cards.lastIndex)
    }
}

fun calculateScore(hand: List<Card>): Int {
    var score = 0
    var acesCount = 0

    for (card in hand) {
        when (card.rank) {
            in "2".."10" -> score += card.rank.toInt()
            "Jack", "Queen", "King" -> score += 10
            "Ace" -> {
                acesCount++
                score += 11
            }
        }
    }

    // Корректировка очков за тузы (если нужно)
    while (score > 21 && acesCount > 0) {
        score -= 10
        acesCount--
    }

    return score
}

fun main() {
    val deck = Deck()
    val playerHand = mutableListOf<Card>()
    val dealerHand = mutableListOf<Card>()

    // Раздаем 2 карты игроку и дилеру
    playerHand.add(deck.drawCard())
    playerHand.add(deck.drawCard())
    dealerHand.add(deck.drawCard())
    dealerHand.add(deck.drawCard())

    var playerScore = calculateScore(playerHand)
    var dealerScore = calculateScore(dealerHand)

    println("Ваши карты: $playerHand (Общие очки: $playerScore)")
    println("Карты дилера: [${dealerHand[0]}, ???]")

    // Ход игрока
    while (playerScore < 21) {
        println("Хотите взять еще карту? (y/n): ")
        val input = readLine()

        if (input == "y") {
            playerHand.add(deck.drawCard())
            playerScore = calculateScore(playerHand)
            println("Ваши карты: $playerHand (Общие очки: $playerScore)")
        } else {
            break
        }
    }

    // Показываем карты дилера
    println("Карты дилера: $dealerHand (Общие очки: $dealerScore)")

    // Дилер берет карты до 17 очков
    while (dealerScore < 17) {
        dealerHand.add(deck.drawCard())
        dealerScore = calculateScore(dealerHand)
        println("Дилер берет карту...")
        println("Карты дилера: $dealerHand (Общие очки: $dealerScore)")
    }

    // Определяем победителя
    when {
        playerScore > 21 -> println("Вы проиграли! У вас больше 21 очка.")
        dealerScore > 21 -> println("Вы победили! У дилера больше 21 очка.")
        playerScore > dealerScore -> println("Вы победили!")
        dealerScore > playerScore -> println("Вы проиграли!")
        else -> println("Ничья!")
    }
}