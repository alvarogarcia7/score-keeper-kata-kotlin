package com.example.kata.scorekeeper

class ScoreKeeper {

    private var scaffold: Boolean = false

    private var scoreA: Int = 0
    private var scoreB: Int = 0

    fun scoreTeamA1() {
        scoreA += 1
    }

    fun scoreTeamA2() {
        scoreA = 2
    }

    fun scoreTeamA3() {
        scoreA = 3
    }

    fun scoreTeamB1() {
        scoreB = 1
    }

    fun scoreTeamB2() {
        scoreB = 2
    }

    fun scoreTeamB3() {
        scoreB = 3
    }

    fun getScore(): String {
        return formatScore()
    }

    private fun formatScore(): String {
        return String.format("%03d:%03d", scoreA, scoreB)
    }
}
