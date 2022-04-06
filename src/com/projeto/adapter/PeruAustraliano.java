package com.projeto.adapter;

public class PeruAustraliano implements Peru{
    @Override
    public void soar(){
        System.out.println("Peru: Brulu, brulu, brululu");
    }

    @Override
    public void voar(){
        System.out.println("Peru: Voar");
    }
}
