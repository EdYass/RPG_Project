package entities.equipamentos;

import entities.interfaces.Equipamento;

public class ArmaduraPesada implements Equipamento {

    @Override
    public void usar() {
        System.out.printf("Usando armadura pesada!");
    }

    @Override
    public String getNome() {
        return "Armadura Pesada";
    }

    @Override
    public int getBuff() {
        return 10;
    }
}
