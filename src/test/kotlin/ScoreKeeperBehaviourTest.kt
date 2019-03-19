package com.example.kata.scorekeeper

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class ScoreKeeperBehaviourTest {

    @Test
    fun `formatting of the scores`(){
        val scoreKeeper = ScoreKeeper.using(ScoreKeeper.Scoreable(10), ScoreKeeper.Scoreable(6))

        assertThat(scoreKeeper.getScore()).isEqualTo("010:006")
    }
}
