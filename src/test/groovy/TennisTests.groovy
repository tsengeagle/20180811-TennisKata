import spock.lang.Specification


class TennisTests extends Specification {
    private TennisGame tennisGame

    def setup() {
        tennisGame = new TennisGame()
    }

    def 'Love All'() {
        expect:
        this.tennisGame.score() == "Love All"
    }

    def 'Love Fifteen'() {
        GivenPlayer2Score(1)
        expect:
        this.tennisGame.score() == "Love Fifteen"
    }

    def 'Love Thirty'() {
        GivenPlayer2Score(2)
        expect:
        this.tennisGame.score() == "Love Thirty"
    }

    def 'Love Fourty'() {
        GivenPlayer2Score(3)
        expect:
        this.tennisGame.score() == "Love Fourty"
    }

    def 'Fifteen Love'() {
        GivenPlayer1Score(1)
        expect:
        this.tennisGame.score() == "Fifteen Love"
    }

    def 'Thirty Love'() {
        GivenPlayer1Score(2)
        expect:
        this.tennisGame.score() == "Thirty Love"
    }

    def 'Fifteen All'() {
        GivenPlayer1Score(1)
        GivenPlayer2Score(1)
        expect:
        this.tennisGame.score() == "Fifteen All"
    }

    def 'Thirty All'() {
        GivenPlayer2Score(2)
        GivenPlayer1Score(2)
        expect:
        this.tennisGame.score() == "Thirty All"
    }

    def 'Duece 3:3'() {
        GivenPlayer2Score(3)
        GivenPlayer1Score(3)
        expect:
        this.tennisGame.score() == "Duece"
    }

    def 'Duece 4:4'() {
        GivenPlayer2Score(4)
        GivenPlayer1Score(4)
        expect:
        this.tennisGame.score() == "Duece"
    }

    def 'Player1 adv 4:3'() {
        GivenPlayer2Score(3)
        GivenPlayer1Score(4)
        expect:
        this.tennisGame.score() == "Player1 Adv"
    }

    def 'Player2 adv 4:5'() {
        GivenPlayer2Score(5)
        GivenPlayer1Score(4)
        expect:
        this.tennisGame.score() == "Player2 Adv"
    }

    def 'Player1 win 5:3'() {
        GivenPlayer2Score(3)
        GivenPlayer1Score(5)
        expect:
        this.tennisGame.score() == "Player1 win"
    }

    def 'Player2 win 6:4'() {
        GivenPlayer2Score(6)
        GivenPlayer1Score(4)
        expect:
        this.tennisGame.score() == "Player2 win"
    }

    private void GivenPlayer1Score(Integer times) {
        for (int i = 0; i < times; i++) {
            tennisGame.player1Score()
        }
    }

    private void GivenPlayer2Score(Integer times) {
        for (int i = 0; i < times; i++) {
            tennisGame.player2Score()
        }
    }

}
