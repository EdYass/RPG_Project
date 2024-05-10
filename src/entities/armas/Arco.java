package entities.armas;

import entities.interfaces.Arma;

public class Arco implements Arma {
    @Override
    public void usar() {
        System.out.printf("Soco!");
    }

    @Override
    public String getNome() {
        return "Arco";
    }

    @Override
    public int getForcaArma() {
        return 1;
    }
}
