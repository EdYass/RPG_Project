package entities.habilidades;

import entities.interfaces.Habilidade;

public class MagiaFogo implements Habilidade {

    @Override
    public void usar() {
        System.out.printf("PK FIRE !!!");
    }

    @Override
    public int getForcaHabilidade() {
        return 3;
    }
}
