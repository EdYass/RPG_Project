package entities.equipamentos;

import entities.interfaces.Equipamento;

public class RobeMagico implements Equipamento {
    @Override
    public void usar() {
        System.out.printf("Usando robe mágico");
    }

    @Override
    public String getNome() {
        return "Robe Mágico";
    }

    @Override
    public int getBuff() {
        return 1;
    }
}
