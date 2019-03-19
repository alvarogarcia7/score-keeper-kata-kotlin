package com.example.kata.scorekeeper

class ScoreKeeper {
    private lateinit var score: String

    fun scoreTeamA1() {
        score = "001:000"
    }

    fun scoreTeamA2() {
        score = "002:000"
    }

    fun scoreTeamA3() {
        score = "003:000"
    }

    fun scoreTeamB1() {}
    fun scoreTeamB2() {}
    fun scoreTeamB3() {}
    fun getScore(): String {
        return score
    }
}
