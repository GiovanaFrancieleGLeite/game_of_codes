package Militar;

public class Navio extends Militar {
    protected String nomeNav;
    protected float peso;
    protected int tripulacao;

    public Navio(Reino reino, int poder, String nomeNav, float peso, int tripulacao){
        super(poder, reino);
        this.nomeNav = nomeNav;
        this.peso = peso;
        this.tripulacao = tripulacao;
    }

    @Override
    public void atacar(){
        System.out.println("O navio " + nomeNav + " está disparando seus canhões!");
    }

    public void mostrarInfo(){
        System.out.println("=== INFORMAÇÕES DO NAVIO === ");
        System.out.println("Reino.Reino Proprietário: " + reino.getNome());
        System.out.println("Nome do Militar.Navio: " + nomeNav);
        System.out.println("Peso do Militar.Navio: " + peso);
        System.out.println("Tripulação do Militar.Navio: " + tripulacao);
    }

    public void navegar(){
        System.out.println("O navio " + nomeNav + " está navegando!");
    }
}
