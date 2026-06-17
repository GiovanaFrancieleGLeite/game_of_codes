package Militar;

import Reino.Reino;

public abstract class Militar{
    protected int poder;
    protected Reino reino;
    protected double custo;

    public Militar(int poder, Reino reino, double custo) {
        this.reino = reino;
        this.poder = poder;
        this.custo = custo;
        reino.adicionarMilitar(this);
    }

    public void atacar(){
        System.out.println("Uma unidade militar de " + reino.getNome() + " está atacando!");
    }

    public void batalhar(Militar inimigo){
        System.out.println("=== " + reino.getNome() + " enfrenta " + inimigo.reino.getNome() + "! ===");
        System.out.println("Poder de " + reino.getNome() + ": " + poder);
        System.out.println("Poder de " + inimigo.reino.getNome() + ": " + inimigo.poder);

        if(this.poder > inimigo.poder){
            System.out.println("Vitória de " + reino.getNome() + "!");
        }
        else if(this.poder < inimigo.poder){
            System.out.println("Vitória de " + inimigo.reino.getNome() + "!");
        }
        else{
            System.out.println("Empate!");
        }
    }
}
