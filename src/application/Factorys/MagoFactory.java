package application.Factorys;

import entities.armas.CajadoMagico;
import entities.equipamentos.RobeMagico;
import entities.habilidades.MagiaFogo;
import entities.interfaces.Arma;
import entities.interfaces.Equipamento;
import entities.interfaces.Habilidade;

public class MagoFactory extends PersonagemFactory{
    @Override
    public Arma criarArma() {
        return new CajadoMagico();
    }

    @Override
    public Habilidade criarHabilidade() {
        return new MagiaFogo();
    }

    @Override
    public Equipamento criarEquipamento() {
        return new RobeMagico();
    }
}
