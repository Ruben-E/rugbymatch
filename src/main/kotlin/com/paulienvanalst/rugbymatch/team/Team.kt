package com.paulienvanalst.rugbymatch.team

data class Team (val players: List<Player>, val name: TeamName) {
    fun captainBackNumber(): Int? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun replacingCaptainBackNumber(): Int? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    val hasEnoughPlayers: Boolean? = players.size == 15
    val hasAnySubstitutes: Boolean? = players.any { !it.isStarting }
    val hasEnoughStartingPlayers: Boolean? = players.filter { it.isStarting } .size == 15

}

