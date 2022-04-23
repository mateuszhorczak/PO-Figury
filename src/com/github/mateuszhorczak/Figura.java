package com.github.mateuszhorczak;

import java.util.List;

public abstract class Figura {
    protected String kolor;
    public Figura(String kolor) {
        this.kolor = kolor;
    }


    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    @Override
    public String toString() {
        return "Figura {" +
                "kolor='" + kolor + '\'' +
                '}';
    }
}
