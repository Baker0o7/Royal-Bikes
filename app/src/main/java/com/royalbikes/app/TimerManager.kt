package com.royalbikes.app

class TimerManager {
    private var startTime = 0L

    fun startTimer() {
        startTime = System.currentTimeMillis()
    }

    fun stopTimer(): Long {
        return System.currentTimeMillis() - startTime
    }

    fun calculateCost(durationMs: Long): Int {
        val minutes = durationMs / 60000
        return (minutes * 50).toInt()
    }
}

