package com.example.kata.scorekeeper

open class ScoreKeeper private constructor(val teamA: Scoreable, val teamB: Scoreable) {

    companion object {
        fun aNew(): ScoreKeeper {
            return ScoreKeeper(Score(0), Score(0))
        }

        fun using(teamA: Scoreable, teamB: Scoreable): ScoreKeeper {
            return ScoreKeeper(teamA, teamB)
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

class Score(i: Int) : Scoreable {
    private data class ScoreVO(val points: Int)

    private var score: ScoreVO

    init {
        score = ScoreVO(i)
    }

    override fun one() {
        score = score.copy(points = score.points + 1)
    }

    override fun two() {
        score = score.copy(points = score.points + 2)
    }

    override fun three() {
        score = score.copy(points = score.points + 3)
    }

    override fun getScore(): Int {
        return score.points
    }

}

interface Scoreable {
    fun one()
    fun two()
    fun three()
    fun getScore(): Int
}
