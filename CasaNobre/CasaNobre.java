package CasaNobre;

import Reino.Reino;

public abstract class CasaNobre {
    protected String nome;
    protected String lema;
    protected Reino reino; // composição

    public CasaNobre(String nome, String lema, Reino reino) {
        this.nome = nome;
        this.lema = lema;
        this.reino = reino;
        reino.adicionarCasaNobre(this);
    }

    public abstract void convocarVassalos();
}
