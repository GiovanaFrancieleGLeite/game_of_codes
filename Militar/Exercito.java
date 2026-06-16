package Militar;

public class Exercito extends Militar{
    protected int qntSoldados;

    public Exercito(Reino reino, int poder, int qntSoldados, double custo){
        super(poder, reino, custo);
        this.qntSoldados = qntSoldados;
    }

    @Override
    public void atacar(){
        System.out.println("O Exército de " + reino.getNome() + " está marchando!");
    }

    public void mostrarInfo(){
        System.out.println("=== INFORMAÇÕES DO EXERCITO ===");
        System.out.println("Reino Proprietário: " + reino.getNome());
        System.out.println("Quantidade de Soldados: " + qntSoldados);
    }
}
