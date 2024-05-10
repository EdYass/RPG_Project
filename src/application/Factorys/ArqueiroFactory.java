package application.Factorys;

import entities.armas.Arco;
import entities.equipamentos.ArmaduraLeve;
import entities.habilidades.AtirarFlecha;
import entities.interfaces.Arma;
import entities.interfaces.Equipamento;
import entities.interfaces.Habilidade;

public class ArqueiroFactory extends PersonagemFactory{
    @Override
    public Arma criarArma() {
        return new Arco();
    }

    @Override
    public Habilidade criarHabilidade() {
        return new AtirarFlecha();
    }

    @Override
    public Equipamento criarEquipamento() {
        return new ArmaduraLeve();
    }
}
