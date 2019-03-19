package com.example.kata.scorekeeper

import org.assertj.core.api.Assertions.assertThat
import org.junit.Before
import org.junit.Test

class ScoreKeeperTest {

    lateinit var scoreKeeper: ScoreKeeper
    @Before
    fun setUp() {
        scoreKeeper = ScoreKeeper()
    }

    @Test
    fun `team A scores a single point`() {

        scoreKeeper.scoreTeamA1()

        assertScoreIs(scoreKeeper, "001:000")
    }

    @Test
    fun `team A scores a double point`() {

        scoreKeeper.scoreTeamA2()

        assertScoreIs(scoreKeeper, "002:000")
    }

    private fun assertScoreIs(scoreKeeper: ScoreKeeper, expected: String) {
        assertThat(scoreKeeper.getScore()).isEqualTo(expected)
    }
}
