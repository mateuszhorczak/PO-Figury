package com.github.mateuszhorczak;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Punkt p1 = new Punkt(0,0);
        //System.out.println(p1.toString());
        Punkt p2 = new Punkt(0,2);
        //System.out.println(p2.toString());
        Punkt p3 = new Punkt(2,2);
        //System.out.println(p3.toString());
        Punkt p4 = new Punkt(2,0);
        //System.out.println(p4.toString());
        Linia l1 = new Linia(p1, p2);
       // System.out.println(l1.toString());
        Trojkat tr1 = new Trojkat(p1, p2, p3, "niebieski");
        //System.out.println(tr1.toString());
        Czworokat czw1 = new Czworokat(p1, p2, p3, p4, "brazowy");
        //System.out.println(czw1.toString());
        Prostokat pro1 = new Prostokat(p1, p3, "czarny");
        //System.out.println(pro1.toString());
        Kwadrat kw1 = new Kwadrat("zielony", p1, 5);
        //System.out.println(kw1.toString());

        List<Figura> figury = new ArrayList<>();
        figury.add(tr1);
        figury.add(kw1);
        figury.add(czw1);
        figury.add(pro1);
        figury.remove(czw1);

        System.out.println("tr1 przed zmiana ma kolor " + tr1.getKolor());
        tr1.setKolor("ruszofy");
        System.out.println("tr1 po zmianie ma kolor " + tr1.getKolor());


        for (var item : figury) {
            System.out.println(item);
        }




    }
}