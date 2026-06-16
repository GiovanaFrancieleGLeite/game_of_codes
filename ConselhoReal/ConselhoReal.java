package ConselhoReal;

public abstract class ConselhoReal{
    protected String nome;
    protected int lealdade;
    protected Reino reino; // composição

    public ConselhoReal(String nome, int lealdade, Reino reino) {
        this.nome = nome;
        this.lealdade = lealdade;
        this.reino = reino;
        reino.adicionarConselho(this);
    }

    public abstract void ativar();
}
