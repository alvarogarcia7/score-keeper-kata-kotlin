package com.example.kata.scorekeeper

open class ScoreKeeper private constructor(val teamA: Scoreable = Scoreable(0), val teamB: Scoreable = Scoreable(0)) {

    companion object {
        fun aNew(): ScoreKeeper {
            return ScoreKeeper()
        }

        fun using(teamA: Scoreable, teamB: Scoreable): ScoreKeeper {
            return ScoreKeeper(teamA, teamB)
        }
    }

    open class Scoreable(i: Int) {
        private data class Score(val points: Int)

        private var score: Score

        init {
            score = Score(i)
        }

        open fun one() {
            score = score.copy(points = score.points + 1)
        }

        open fun two() {
            score = score.copy(points = score.points + 2)
        }

        open fun three() {
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
