package Militar;

public class Dragao extends Militar {
    protected boolean sangueTargaryen;
    protected String nomeDrag;
    protected float tamanho;

    public Dragao(Reino reino, int poder, boolean sangueTargaryen, String nomeDrag, float tamanho){
        super(poder, reino);
        this.sangueTargaryen = sangueTargaryen;
        this.nomeDrag = nomeDrag;
        this.tamanho = tamanho;
    }

    @Override
    public void atacar(){
        System.out.println("O Dragão " + nomeDrag + " está cuspindo fogo!");
    }

    public void mostrarInfo(){
        System.out.println("=== INFORMAÇÕES DO DRAGÃO ===");
        System.out.println("Reino.Reino Proprietário: " + reino.getNome());
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