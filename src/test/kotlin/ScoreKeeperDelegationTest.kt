import com.example.kata.scorekeeper.ScoreKeeper
import com.nhaarman.mockito_kotlin.spy
import com.nhaarman.mockito_kotlin.verify
import com.nhaarman.mockito_kotlin.verifyZeroInteractions
import org.junit.Before
import org.junit.Test

class ScoreKeeperDelegationTest {
    private var teamA: ScoreKeeper.Scoreable = ScoreKeeper.Scoreable(0)
    private var teamB: ScoreKeeper.Scoreable = ScoreKeeper.Scoreable(0)
    private var scoreKeeper: ScoreKeeper = ScoreKeeper.aNew()

    @Before
    fun `set up`() {
        teamA = spy(ScoreKeeper.Scoreable(0))
        teamB = spy(ScoreKeeper.Scoreable(0))
        scoreKeeper = ScoreKeeper.using(teamA, teamB)
    }

    @Test
    fun `score team A 1 is properly delegated`() {

        scoreKeeper.scoreTeamA1()

        verify(teamA).one()
        verifyZeroInteractions(teamB)
    }

    @Test
    fun `score team A 2 is properly delegated`() {

        scoreKeeper.scoreTeamA2()

        verify(teamA).two()
        verifyZeroInteractions(teamB)
    }

    @Test
    fun `score team A 3 is properly delegated`() {

        scoreKeeper.scoreTeamA3()

        verify(teamA).three()
        verifyZeroInteractions(teamB)
    }

    @Test
    fun `score team B 1 is properly delegated`() {

        scoreKeeper.scoreTeamB1()

        verify(teamB).one()
        verifyZeroInteractions(teamA)
    }

    @Test
    fun `score team B 2 is properly delegated`() {

        scoreKeeper.scoreTeamB2()

        verify(teamB).two()
        verifyZeroInteractions(teamA)
    }

    @Test
    fun `score team B 3 is properly delegated`() {

        scoreKeeper.scoreTeamB3()

        verify(teamB).three()
        verifyZeroInteractions(teamA)
    }
}
