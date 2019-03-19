package com.example.kata.scorekeeper

class ScoreKeeper {

    val teamA = Scoreable(0)
    val teamB = Scoreable(0)

    class Scoreable {
        private data class Score(val points: Int)

        private var score: Score

        constructor(i: Int) {
            score = Score(i)
        }

        fun one() {
            score = score.copy(points = score.points + 1)
        }

        fun two() {
            score = score.copy(points = score.points + 2)
        }

        fun three() {
            score = score.copy(points = score.points + 3)
        }

        fun getScore(): Int {
            return score.points
        }

    }

    fun scoreTeamA1() {
        teamA.one()
    }

    fun scoreTeamA2() {
        teamA.two()
    }

    fun scoreTeamA3() {
        teamA.three()
    }

    fun scoreTeamB1() {
        teamB.one()
    }

    fun scoreTeamB2() {
        teamB.two()
    }

    fun scoreTeamB3() {
        teamB.three()
    }

    fun getScore(): String {
        return formatScore()
    }

    private fun formatScore(): String {
        return String.format("%03d:%03d", teamA.getScore(), teamB.getScore())
    }
}
