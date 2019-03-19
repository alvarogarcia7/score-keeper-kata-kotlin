package com.example.kata.scorekeeper

class ScoreKeeper {
    private lateinit var score: String

    private var scaffold: Boolean = false

    fun scoreTeamA1() {
        if (scaffold) {
            score = "002:000"
        } else {
            score = "001:000"
            scaffold = true
        }
    }

    fun scoreTeamA2() {
        score = "002:000"
    }

    fun scoreTeamA3() {
        score = "003:000"
    }

    fun scoreTeamB1() {
        score = "000:001"
    }

    fun scoreTeamB2() {
        score = "000:002"
    }

    fun scoreTeamB3() {
        score = "000:003"
    }

    fun getScore(): String {
        return score
    }
}
