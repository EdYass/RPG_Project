package application;

import entities.interfaces.Arma;
import entities.interfaces.Equipamento;
import entities.interfaces.Habilidade;

import java.util.Random;

public class Personagem {
    protected String nome;
    protected String titulo;
    protected int vida;
    protected int forca;
    protected Arma arma;
    protected Habilidade habilidade;
    protected Equipamento equipamento;

    public Personagem( String nome, String titulo, Arma arma, Equipamento equipamento, Habilidade habilidade) {
        this.arma = arma;
        this.equipamento = equipamento;
        this.habilidade = habilidade;
        this.nome = nome;
        this.titulo = titulo;
        this.forca = gerarStatusAleatorio(1,3);
        this.vida = gerarStatusAleatorio(15,20);
    }

    public void receberDano(int dano){
        this.vida-=dano;
        if(vida<=0){
            System.out.printf(nome+" foi derrotado!");
        }else {
            System.out.printf(nome+" agora tem "+vida+" de vida restante.");
        }
    }

    public void atacar(Personagem alvo){
        System.out.printf(nome+" atacar "+alvo.getNome()+" usando: ");
        arma.usar();
        habilidade.usar();

        int dano=forca+habilidade.getForcaHabilidade();
        alvo.receberDano(dano);
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida+getEquipamento().getBuff();
    }

    public int getForca() {
        return forca;
    }

    public Arma getArma() {
        return arma;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    private int gerarStatusAleatorio(int min, int max){
        Random random = new Random();
        return random.nextInt(max - min + 1)+min;
    }
}
