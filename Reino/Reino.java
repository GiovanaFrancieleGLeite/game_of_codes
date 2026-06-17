package Reino;

import CasaNobre.CasaNobre;
import ConselhoReal.ConselheiroReal;
import Militar.Militar;
import java.util.ArrayList;


public class Reino {
    private int id;
    private String nome;
    private ArrayList<Militar> militares;
    private ArrayList<ConselheiroReal> conselhos;
    private ArrayList<CasaNobre> casasNobres;

    public Reino(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.militares = new ArrayList<>();
        this.casasNobres = new ArrayList<>();
        this.conselhos = new ArrayList<>();
    }

    public void mostrarMilitares(){
        System.out.println("O reino " + nome + " possui " + militares.size() + " unidade(s) militar(es).");
    }


    // Métodos para adicionar militares, conselhos e casas nobres
    public void adicionarMilitar(Militar militar){
        militares.add(militar);
    }

    public void adicionarConselheiroReal(ConselheiroReal conselheiro) {
        conselhos.add(conselheiro);
    }

    public void adicionarCasaNobre(CasaNobre casa) {
        casasNobres.add(casa);
    }


    // Método para atacar usando todas as unidades militares do reino
    public void atacar() {
        System.out.println("=== O Reino " + nome + " iniciou um ataque! ===");
        for(Militar m : militares) {
            m.atacar();
        }
    }

    public void reunirConselho() {
        System.out.println("=== O Reino " + nome + " está reunindo o conselho real! ===");
        for(ConselheiroReal c : conselhos) {
            c.ativar();
        }
    }


    // Getters e Setters
        public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Militar> getMilitares() {
        return militares;
    }

    public void setMilitares(ArrayList<Militar> militares) {
        this.militares = militares;
    }

    public ArrayList<ConselheiroReal> getConselhos() {
        return conselhos;
    }

    public void setConselhos(ArrayList<ConselheiroReal> conselhos) {
        this.conselhos = conselhos;
    }
}
