package Militar;

import Reino.Reino;

public class Dragao extends Militar{
    protected boolean sangueTargaryen;
    protected String nomeDrag;
    protected float tamanho;

    public Dragao(Reino reino, int poder, boolean sangueTargaryen, String nomeDrag, float tamanho, double custo){
        super(poder, reino, custo);
        this.sangueTargaryen = sangueTargaryen;
        this.nomeDrag = nomeDrag;
        this.tamanho = tamanho;
    }

    public String getNomeDrag() {
        return nomeDrag;
    }

    @Override
    public void atacar(){
        System.out.println("O Dragão " + nomeDrag + " está cuspindo fogo!");
    }

    public void mostrarInfo(){
        System.out.println("=== INFORMAÇÕES DO DRAGÃO ===");
        System.out.println("Reino Proprietário: " + reino.getNome());
        System.out.println("Nome do Dragão: " + nomeDrag);
        if(sangueTargaryen) {
            System.out.println("Possui sangue Targaryen? SIM");
        } else{
            System.out.println("Possui sangue Targaryen? NÃO");
        }
        System.out.println("Tamanho: " + tamanho + "m");
    }

    public void voar(){
        System.out.println("O Dragão " + nomeDrag + " levanta vôo!");
    }
}

