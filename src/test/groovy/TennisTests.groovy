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
        GivenPlayer2Score()
        expect:
        this.tennisGame.score() == "Love Fifteen"
    }

    def 'Love Thirty'() {
        GivenPlayer2Score()
        GivenPlayer2Score()
        expect:
        this.tennisGame.score() == "Love Thirty"
    }

    def 'Love Fourty'() {
        GivenPlayer2Score()
        GivenPlayer2Score()
        GivenPlayer2Score()
        expect:
        this.tennisGame.score() == "Love Fourty"
    }

    def 'Fifteen Love'() {
        GivenPlayer1Score()
        expect:
        this.tennisGame.score() == "Fifteen Love"
    }

    def 'Thirty Love'() {
        GivenPlayer1Score()
        GivenPlayer1Score()
        expect:
        this.tennisGame.score() == "Thirty Love"
    }

    def 'Fifteen All'() {
        GivenPlayer1Score()
        GivenPlayer2Score()
        expect:
        this.tennisGame.score() == "Fifteen All"
    }

    def 'Thirty All'() {
        GivenPlayer2Score()
        GivenPlayer2Score()
        GivenPlayer1Score()
        GivenPlayer1Score()
        expect:
        this.tennisGame.score() == "Thirty All"
    }

    def 'Duece 3:3'() {
        GivenPlayer2Score()
        GivenPlayer2Score()
        GivenPlayer2Score()
        GivenPlayer1Score()
        GivenPlayer1Score()
        GivenPlayer1Score()
        expect:
        this.tennisGame.score() == "Duece"
    }

    def 'Duece 4:4'() {
        GivenPlayer2Score()
        GivenPlayer2Score()
        GivenPlayer2Score()
        GivenPlayer1Score()
        GivenPlayer1Score()
        GivenPlayer1Score()
        GivenPlayer1Score()
        GivenPlayer2Score()
        expect:
        this.tennisGame.score() == "Duece"
    }

    def 'Player1 adv 4:3'() {
        GivenPlayer2Score()
        GivenPlayer2Score()
        GivenPlayer2Score()
        GivenPlayer1Score()
        GivenPlayer1Score()
        GivenPlayer1Score()
        GivenPlayer1Score()
        expect:
        this.tennisGame.score() == "Player1 Adv"
    }

    def 'Player2 adv 4:5'() {
        GivenPlayer2Score()
        GivenPlayer2Score()
        GivenPlayer2Score()
        GivenPlayer2Score()
        GivenPlayer2Score()
        GivenPlayer1Score()
        GivenPlayer1Score()
        GivenPlayer1Score()
        GivenPlayer1Score()
        expect:
        this.tennisGame.score() == "Player2 Adv"
    }

    def 'Player1 win 5:3'() {
        GivenPlayer2Score()
        GivenPlayer2Score()
        GivenPlayer2Score()
        GivenPlayer1Score()
        GivenPlayer1Score()
        GivenPlayer1Score()
        GivenPlayer1Score()
        GivenPlayer1Score()
        expect:
        this.tennisGame.score() == "Player1 win"
    }

    def 'Player2 win 6:4'() {
        GivenPlayer2Score()
        GivenPlayer2Score()
        GivenPlayer2Score()
        GivenPlayer2Score()
        GivenPlayer2Score()
        GivenPlayer2Score()
        GivenPlayer1Score()
        GivenPlayer1Score()
        GivenPlayer1Score()
        GivenPlayer1Score()
        expect:
        this.tennisGame.score() == "Player2 win"
    }

    private void GivenPlayer1Score() {
        tennisGame.player1Score()
    }

    private void GivenPlayer2Score() {
        tennisGame.player2Score()
    }

}
