package com.example.kata.scorekeeper

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class ScoreKeeperTest {
    @Test
    fun `team A scores a single point`() {
        val scoreKeeper = ScoreKeeper()

        scoreKeeper.scoreTeamA1()

        assertThat(scoreKeeper.getScore()).isEqualTo("001:000")
    }
}
