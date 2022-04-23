package com.github.mateuszhorczak;

public class Linia {
    private Punkt p1, p2;


    public Linia(Punkt p1, Punkt p2) {
        this.p1 = new Punkt(p1);
        this.p2 = new Punkt(p2);
    }


    @Override
    public String toString() {
        return "Linia {" +
                "p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }


    public Punkt getP1() {
        return p1;
    }

    public Punkt getP2() {
        return p2;
    }

    public void setP1(Punkt p1) {
        this.p1 = p1;
    }

    public void setP2(Punkt p2) {
        this.p2 = p2;
    }
}
