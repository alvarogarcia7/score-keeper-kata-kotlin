import com.example.kata.scorekeeper.ScoreKeeper
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class ScoreableTest {
    @Test
    fun `score a single point`() {
        val x = 10
        val scoreable = ScoreKeeper.Scoreable(x)

        scoreable.one()

        assertThat(scoreable.getScore()).isEqualTo(x+1)
    }

    @Test
    fun `score a double point`() {
        val x = 10
        val scoreable = ScoreKeeper.Scoreable(x)

        scoreable.two()

        assertThat(scoreable.getScore()).isEqualTo(x+2)
    }

    @Test
    fun `score a triple`() {
        val x = 10
        val scoreable = ScoreKeeper.Scoreable(x)

        scoreable.three()

        assertThat(scoreable.getScore()).isEqualTo(x+3)
    }
}
