package aula7;
import java.util.Random;
public class Luta {
    //Atributos
    private Lutador desafiado, desafiante;
    private int rounds;
    private boolean aprovada;
    //Métodos
    public void marcarLuta(Lutador l1,Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1!=l2){
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        }else{
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    public void lutar(){
        if (aprovada) {
            System.out.println("\n========== DESAFIADO ==========\n");
            desafiado.apresentar();
            System.out.println("\n========== DESAFIANTE ==========\n");
            desafiante.apresentar();
            Random aleatorio =new Random();
            int vencedor = aleatorio.nextInt(3);
            System.out.println("\n========== RESULTADO DA LUTA ==========");
            switch(vencedor){
                case 0: //Empate
                    System.out.println("Empate");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: //Desafiado Vence
                    System.out.println("Vitória de "+this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: //Desafiante vence
                    System.out.println("Vitória de "+this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
            }
        }else{
            System.out.println("A luta não pode acontecer.");
        }
        System.out.println("=======================================");
    }
    //Métodos especiais
    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    public boolean getAprovada() {
        return aprovada;
    }
    public void setAprovada(boolean apravada) {
        this.aprovada = apravada;
    }
}
