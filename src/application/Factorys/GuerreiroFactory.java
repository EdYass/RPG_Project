package application.Factorys;

import entities.armas.Espada;
import entities.equipamentos.ArmaduraPesada;
import entities.habilidades.AtaqueForte;
import entities.interfaces.Arma;
import entities.interfaces.Equipamento;
import entities.interfaces.Habilidade;

public class GuerreiroFactory extends PersonagemFactory{
    @Override
    public Arma criarArma() {
        return new Espada();
    }

    @Override
    public Habilidade criarHabilidade() {
        return new AtaqueForte();
    }

    @Override
    public Equipamento criarEquipamento() {
        return new ArmaduraPesada();
    }
}
