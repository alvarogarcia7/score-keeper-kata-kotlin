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

        assertThat(scoreKeeper.getScore()).isEqualTo("001:000")
    }
}
