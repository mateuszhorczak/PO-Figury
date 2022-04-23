package com.github.mateuszhorczak;

public class Czworokat extends Figura{
    protected Linia l1, l2, l3, l4;

    public Czworokat(Punkt p1, Punkt p2, Punkt p3, Punkt p4, String kolor) {
        super(kolor);
        l1 = new Linia(p1, p2);
        l2 = new Linia(p2, p3);
        l3 = new Linia(p3, p4);
        l4 = new Linia(p4, p1);
    }

    
    @Override
    public String toString() {
        return "Czworokat {" +
                "l1=" + l1 +
                ", l2=" + l2 +
                ", l3=" + l3 +
                ", l4=" + l4 +
                '}';
    }
}
