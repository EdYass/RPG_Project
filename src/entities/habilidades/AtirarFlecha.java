package entities.habilidades;

import entities.interfaces.Habilidade;

public class AtirarFlecha implements Habilidade {
    @Override
    public void usar() {
        System.out.printf("Enche o cu de flecha!!!");
    }

    @Override
    public int getForcaHabilidade() {
        return 3;
    }
}
