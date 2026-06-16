package Reino;

import java.util.ArrayList;
public class Reino {
    private int id;
    private String nome;
    private ArrayList<Militar> militares;

    public Reino(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.militares = new ArrayList<>();
    }

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

    public void mostrarMilitares(){
        System.out.println("O reino " + nome + " possui " + militares.size() + " unidade(s) militar(es).");
    }

    public void adicionarMilitar(Militar militar){
        militares.add(militar);
    }

    public void atacar() {
        System.out.println("=== O Reino.Reino " + nome + " iniciou um ataque! ===");
        for(Militar m : militares) {
            m.atacar();
        }
    }
}