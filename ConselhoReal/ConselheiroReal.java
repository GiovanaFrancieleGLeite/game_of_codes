package ConselhoReal;

import Reino.Reino;

public abstract class ConselheiroReal{
    protected String nome;
    protected int lealdade;
    protected Reino reino; // composição

    public ConselheiroReal(String nome, int lealdade, Reino reino) {
        this.nome = nome;
        this.lealdade = lealdade;
        this.reino = reino;
        reino.adicionarConselheiroReal(this);
    }

    public abstract void ativar();
}
