package CasaNobre;

import Militar.Dragao;
import Reino.Reino;

public class Targaryen extends CasaNobre {
    protected boolean imunidadeAoFogo;

    public Targaryen(String nome, String lema, Reino reino, boolean imunidadeAoFogo) {
        super(nome, lema, reino);
        this.imunidadeAoFogo = imunidadeAoFogo;
    }

    @Override
    public void convocarVassalos() {
        if (this.imunidadeAoFogo) {
            System.out.println("[" + this.nome + " - Casa Targaryen]: " + this.lema + "! Com o poder dos dragões, nossos vassalos marcham sem hesitação. Ninguém ousará resistir!");
        } else {
            System.out.println("[" + this.nome + " - Casa Targaryen]: Os vassalos da casa são convocados, mas sem o sangue do dragão a autoridade é questionada...");
        }
    }

    public void vincularDragao(Dragao dragao) {
        if (this.imunidadeAoFogo) {
            System.out.println("[" + this.nome + " - Casa Targaryen]: O vínculo com o dragão " + dragao.getNomeDrag() + " é estabelecido! As chamas não podem nos tocar. Dracarys!");
        } else {
            System.out.println("[" + this.nome + " - Casa Targaryen]: Sem imunidade ao fogo, a tentativa de vincular o dragão " + dragao.getNomeDrag() + " é perigosa. O dragão rejeita o vínculo...");
        }
    }
}
