package entities.armas;

import entities.interfaces.Arma;

public class CajadoMagico implements Arma {
    @Override
    public void usar() {
        System.out.printf("Cajadada!");
    }

    @Override
    public String getNome() {
        return "CajadoMagico";
    }

    @Override
    public int getForcaArma() {
        return 1;
    }
}
