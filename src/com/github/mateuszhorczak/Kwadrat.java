package com.github.mateuszhorczak;

import java.util.Scanner;

public class Kwadrat extends Czworokat {


    public Kwadrat(String kolor, Punkt p1, int bok) {
        super(
                p1,
                new Punkt(p1.getX() + bok, p1.getY()),
                new Punkt(p1.getX() + bok, p1.getY() - bok),
                new Punkt(p1.getX(), p1.getY() - bok),
                kolor
        );
    }

    @Override
    public String toString() {
        return "Kwadrat {" +
                "l1=" + l1 +
                ", l2=" + l2 +
                ", l3=" + l3 +
                ", l4=" + l4 +
                ", kolor='" + kolor + '\'' +
                '}';
    }
}
