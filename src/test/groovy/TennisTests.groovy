import spock.lang.Specification


class TennisTests extends Specification {

    def '0:0'() {
        expect:
        def tennisGame = new TennisGame()
        tennisGame.score() == "Love All"
    }
}
