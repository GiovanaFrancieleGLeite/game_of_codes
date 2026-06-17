package CasaNobre;

import Reino.Reino;

public class Stark extends CasaNobre {
    protected boolean resistenciaAoFrio;

    public Stark(String nome, String lema, Reino reino, boolean resistenciaAoFrio) {
        super(nome, lema, reino);
        this.resistenciaAoFrio = resistenciaAoFrio;
    }

    @Override
    public void convocarVassalos() {
        if (this.resistenciaAoFrio) {
            System.out.println("[" + this.nome + " - Casa Stark]: " + this.lema + "! Os filhos do Norte respondem ao chamado. O frio jamais nos deterá!");
        } else {
            System.out.println("[" + this.nome + " - Casa Stark]: Os vassalos são convocados, mas sem a resistência ao frio a marcha pelo Norte será muito difícil...");
        }
    }

    public void vinculoLobo() {
        if (this.resistenciaAoFrio) {
            System.out.println("[" + this.nome + " - Casa Stark]: O lobo gigante reconhece seu parceiro! O vínculo entre " + this.nome + " e sua besta é inabalável.");
        } else {
            System.out.println("[" + this.nome + " - Casa Stark]: O lobo gigante hesita, mas o laço de sangue Stark prevalece. O vínculo é estabelecido.");
        }
    }
}
