package com.example.kata.scorekeeper

import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.verify
import com.nhaarman.mockito_kotlin.verifyZeroInteractions
import org.assertj.core.api.Assertions.assertThat
import org.junit.Before
import org.junit.Test

class ScoreKeeperTest {
    private lateinit var teamA: ScoreKeeper.Scoreable
    private lateinit var teamB: ScoreKeeper.Scoreable
    private lateinit var scoreKeeper: ScoreKeeper

    @Before
    fun `set up`() {
        teamA = mock()
        teamB = mock()
        scoreKeeper = ScoreKeeper.using(teamA, teamB)
    }

    @Test
    fun `formatting of the scores`() {
        val scoreKeeper = ScoreKeeper.using(ScoreKeeper.Score(10), ScoreKeeper.Score(6))

        assertThat(scoreKeeper.getScore()).isEqualTo("010:006")
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
