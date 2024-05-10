import application.Factorys.ArqueiroFactory;
import application.Factorys.GuerreiroFactory;
import application.Factorys.MagoFactory;
import application.Personagem;

import javax.swing.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Personagem guerreiro = criarGuerreiro();
        Personagem mago = criarMago();
        Personagem arqueiro = criarArqueiro();

        Personagem jogador =guerreiro;
        Personagem inimigo;

        int escolherInimigo=random.nextInt(2);
        if (escolherInimigo ==0){
            inimigo = mago;
        }else {
            inimigo = arqueiro;
        }

        exibirStatus(jogador);
        exibirStatus(inimigo);

        while (jogador.getVida() > 0 && inimigo.getVida() > 0){
            jogador.atacar(inimigo);
            if (inimigo.getVida() == 0 ||jogador.getVida() ==0)break;
            inimigo.atacar(jogador);
        }

        if (jogador.getVida() > 0){
            JOptionPane.showMessageDialog(null,jogador.getNome()+" venceu!");
        }else {
            JOptionPane.showMessageDialog(null,inimigo.getNome()+" venceu!");
        }

    }

    private static Personagem criarGuerreiro() {
        GuerreiroFactory guerreiroFactory = new GuerreiroFactory();
        return new Personagem("Guerreiro","The Hangedman", guerreiroFactory.criarArma(),guerreiroFactory.criarEquipamento(), guerreiroFactory.criarHabilidade());
    }
    private static Personagem criarMago(){
        MagoFactory magoFactory = new MagoFactory();
        return new Personagem("Mago","The Tower",magoFactory.criarArma(), magoFactory.criarEquipamento(), magoFactory.criarHabilidade());
    }
    private static Personagem criarArqueiro(){
        ArqueiroFactory arqueiroFactory = new ArqueiroFactory();
        return new Personagem("Arqueiro","The wheel of fortune", arqueiroFactory.criarArma(), arqueiroFactory.criarEquipamento(), arqueiroFactory.criarHabilidade());
    }
    private static void exibirStatus(Personagem personagem){
        JOptionPane.showMessageDialog(null,"Status de "+personagem.getNome()+":\n" +
        "Vida: "+personagem.getVida()+ "\n"+
        "Força: "+personagem.getForca()+ "\n"+
        "Arma: "+personagem.getArma().getNome()+"\n"+
        "Equipamento: "+personagem.getEquipamento().getNome() +"\n");
    }

}
