package com.projeto.adapter;

public class PatoMarreco implements Pato{
    @Override
    public void grasnar(){
        System.out.println("Pato: Quack, quack, quack");
    }

    @Override
    public void voar(){
        System.out.println("Pato: Voar, voar, voar, voar, voar");
    }

    @Override
    public void mergulho(){
        System.out.println("Pato: Tibumm");
    }
}
