package com.paulienvanalst.rugbymatch.oldfashioned;

import com.paulienvanalst.rugbymatch.team.Position;

import java.util.Objects;

// -- Ex 1

public class Player {

    private final int backNumber;
    private final Position position;

    public Player(Position position, int backNumber) {
        this.backNumber = backNumber;
        this.position = position;
    }

    public int getBackNumber() {
        return backNumber;
    }

    public Position getPosition() {
        return position;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Player{" +
                "backNumber=" + backNumber +
                ", position=" + position +
                '}';
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Player player = (Player) object;
        return backNumber == player.backNumber &&
                java.util.Objects.equals(position, player.position);
    }

    public int hashCode() {

        return Objects.hash(super.hashCode(), backNumber, position);
    }
}
