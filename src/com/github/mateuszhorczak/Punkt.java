package com.github.mateuszhorczak;

public class Punkt {
    private int x, y;

    public Punkt() {
        x = 0;
        y = 0;
    }

    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Punkt(Punkt pkt) {
        x = pkt.x;
        y = pkt.y;
    }

    @Override
    public String toString() {
        return "Punkt {" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}

