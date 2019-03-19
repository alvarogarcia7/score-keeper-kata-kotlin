package com.example.kata.scorekeeper

import org.assertj.core.api.Assertions.assertThat
import org.junit.Before
import org.junit.Test

class ScoreKeeperBehaviourTest {

    lateinit var scoreKeeper: ScoreKeeper
    @Before
    fun setUp() {
        scoreKeeper = ScoreKeeper.aNew()
    }

    @Test
    fun `formatting of the scores`(){
        scoreKeeper = ScoreKeeper.using(ScoreKeeper.Scoreable(10), ScoreKeeper.Scoreable(6))

        assertScoreIs(scoreKeeper, "010:006")
    }

    @Test
    fun `team A scores a single point`() {

        scoreKeeper.scoreTeamA1()

        assertScoreIs(scoreKeeper, "001:000")
    }

    @Test
    fun `team A can score multiple times`() {

        scoreKeeper.scoreTeamA1()
        scoreKeeper.scoreTeamA2()
        scoreKeeper.scoreTeamA3()

        assertScoreIs(scoreKeeper, "006:000")
    }

    @Test
    fun `team B can score multiple times`() {

        scoreKeeper.scoreTeamB1()
        scoreKeeper.scoreTeamB2()
        scoreKeeper.scoreTeamB3()

        assertScoreIs(scoreKeeper, "000:006")
    }

    @Test
    fun `both teams A and B can score multiple times`() {

        scoreKeeper.scoreTeamB1()
        scoreKeeper.scoreTeamB2()
        scoreKeeper.scoreTeamB3()
        scoreKeeper.scoreTeamA1()
        scoreKeeper.scoreTeamA2()
        scoreKeeper.scoreTeamA3()

        assertScoreIs(scoreKeeper, "006:006")
    }

    @Test
    fun `team A scores a double point`() {

        scoreKeeper.scoreTeamA2()

        assertScoreIs(scoreKeeper, "002:000")
    }

    @Test
    fun `team A scores a triple`() {

        scoreKeeper.scoreTeamA3()

        assertScoreIs(scoreKeeper, "003:000")
    }

    @Test
    fun `team B scores a single point`() {

        scoreKeeper.scoreTeamB1()

        assertScoreIs(scoreKeeper, "000:001")
    }

    @Test
    fun `team B scores a double point`() {

        scoreKeeper.scoreTeamB2()

        assertScoreIs(scoreKeeper, "000:002")
    }

    @Test
    fun `team B scores a triple`() {

        scoreKeeper.scoreTeamB3()

        assertScoreIs(scoreKeeper, "000:003")
    }

    private fun assertScoreIs(scoreKeeper: ScoreKeeper, expected: String) {
        assertThat(scoreKeeper.getScore()).isEqualTo(expected)
    }
}