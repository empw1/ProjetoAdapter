package com.projeto.adapter;

public class PeruAdapter implements Pato{
    private Peru peru;

    public PeruAdapter(Peru peru){
        this.peru = peru;
    }

    @Override
    public void grasnar(){
        peru.soar();
    }

    @Override
    public void voar(){
        peru.voar();
    }

    @Override
    public void mergulho(){

        throw new UnsupportedOperationException( "Método mergulho() não suportado por Perus" );
    }
}
