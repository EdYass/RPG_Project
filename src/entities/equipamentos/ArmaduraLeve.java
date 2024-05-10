package entities.equipamentos;

import entities.interfaces.Equipamento;

public class ArmaduraLeve implements Equipamento {
    @Override
    public void usar() {
        System.out.printf("Usando armadura leve");
    }

    @Override
    public String getNome() {
        return "Armadura leve";
    }

    @Override
    public int getBuff() {
        return 5;
    }
}
