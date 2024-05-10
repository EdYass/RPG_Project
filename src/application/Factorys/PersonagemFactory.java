package application.Factorys;

import entities.interfaces.Arma;
import entities.interfaces.Equipamento;
import entities.interfaces.Habilidade;

public abstract class PersonagemFactory {
    public abstract Arma criarArma();
    public abstract Habilidade criarHabilidade();
    public abstract Equipamento criarEquipamento();
}
