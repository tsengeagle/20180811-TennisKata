class TennisGame {
    def player2 = 0
    private Map scoreTable = [0: "Love", 1: "Fifteen", 2: "Thirty", 3: "Fourty"]
    def player1 = 0

    def score() {
        if (player1 == player2) {
            if (player1 >= 3 || player2 >= 3) {
return "Duece"
            }
            return "${scoreTable[player1]} All"
        }
        if (player1 > 0 || player2 > 0) {
            if (player1 >= 3 && player2 >= 3) {
                if (player1 - player2 > 1) {
                    return "Player1 win"
                }
                if (player2 - player1 > 1) {
                    return "Player2 win"
                }
                if (player1 > player2) {
                    return "Player1 Adv"
                } else {
                    return "Player2 Adv"
                }
            }
            return "${scoreTable[player1]} ${scoreTable[player2]}"
        }
        return "Love All"
    }

    def player2Score() {
        player2++
    }

    def player1Score() {
        player1++
    }
}
