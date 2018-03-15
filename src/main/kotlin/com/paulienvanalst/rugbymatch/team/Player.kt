package com.paulienvanalst.rugbymatch.team

// -- Ex 1

data class Player(val position: Position, val backNumber: Int) {
    val isStarting
        get() = backNumber in 1..15
}