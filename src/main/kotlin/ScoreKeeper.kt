package com.example.kata.scorekeeper

class ScoreKeeper {
    private lateinit var score: String

    private var scaffold: Boolean = false

    private var scoreA: Int = 0
    private var scoreB: Int = 0

    fun scoreTeamA1() {
        if (scaffold) {
            scoreA = 2
            score = "002:000"
        } else {
            scoreA = 1
            score = "001:000"
            scaffold = true
        }
    }

    fun scoreTeamA2() {
        scoreA = 2
        score = "002:000"
    }

    fun scoreTeamA3() {
        scoreA = 3
        score = "003:000"
    }

    fun scoreTeamB1() {
        scoreB = 1
        score = "000:001"
    }

    fun scoreTeamB2() {
        scoreB = 2
        score = "000:002"
    }

    fun scoreTeamB3() {
        scoreB = 3
        score = "000:003"
    }

    fun getScore(): String {
        if (formatScore().equals(score)) {
            return formatScore()
        } else {
            println("This case does not match: ${formatScore()} vs $score")
        }
        return score
    }

    private fun formatScore(): String {
        return String.format("%03d:%03d", scoreA, scoreB)
    }
}
