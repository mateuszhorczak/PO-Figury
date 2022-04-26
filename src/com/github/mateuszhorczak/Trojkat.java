package com.github.mateuszhorczak;

public class Trojkat extends Figura{
    protected Linia l1, l2, l3;


    public Trojkat(Punkt p1, Punkt p2, Punkt p3, String kolor) {
        super(kolor);
        l1 = new Linia(p1, p2);
        l2 = new Linia(p1, p3);
        l3 = new Linia(p2, p3);
    }

    @Override
    public String toString() {
        return "Trojkat {" +
                "l1=" + l1 +
                ", l2=" + l2 +
                ", l3=" + l3 +
                ", kolor='" + kolor + '\'' +
                '}';
    }
}
