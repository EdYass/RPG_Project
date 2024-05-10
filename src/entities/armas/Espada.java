package entities.armas;

import entities.interfaces.Arma;

public class Espada implements Arma {
    @Override
    public void usar() {
        System.out.printf("Ataque com Espada!");
    }

    @Override
    public String getNome() {
        return "Espada";
    }

    @Override
    public int getForcaArma() {
        return 1;
    }
}
