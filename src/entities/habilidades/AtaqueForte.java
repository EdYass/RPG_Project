package entities.habilidades;

import entities.interfaces.Habilidade;

public class AtaqueForte implements Habilidade {
    @Override
    public void usar() {
        System.out.printf("Usando a força bruta!!!");
    }

    @Override
    public int getForcaHabilidade() {
        return 3;
    }
}
