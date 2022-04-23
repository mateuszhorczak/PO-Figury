package com.github.mateuszhorczak;


public class Prostokat extends Czworokat {

    public Prostokat(Punkt p1, Punkt p3, String kolor) {
        super(p1, new Punkt(p1.getX(), p3.getY()), p3, new Punkt(p3.getX(), p1.getY()), kolor);
    }

    @Override
    public String toString() {
        return "Prostokat {" +
                "l1=" + l1 +
                ", l2=" + l2 +
                ", l3=" + l3 +
                ", l4=" + l4 +
                ", kolor='" + kolor + '\'' +
                '}';
    }
}
