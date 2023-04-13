package com.yolo.reading

class BowlingGame {
    private var bowls: MutableList<Int> = mutableListOf()
    fun hit(bowl: Int) {
        bowls.add(bowl)
    }

    fun getScoreForFirstFrame(): Int {
        val scoreWithoutBonus = bowls[0] + bowls[1]
        if (isSpare()) {
            return scoreWithoutBonus + bowls[2]
        }
        return scoreWithoutBonus
    }

    private fun isSpare() = bowls[0] + bowls[1] == 10

}
