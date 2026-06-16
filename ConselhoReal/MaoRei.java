package ConselhoReal;

public class MaoRei extends ConselhoReal{

    public MaoRei(String nome, int nivelLealdade){
        this.nome = nome;
        this.lealdade = nivelLealdade;
    }

    @Override
    public ativar(){
        if(this.lealdade > 75){
            System.out.println("["+ this.nome + " - Mão do Rei]: Majestade, como sua Mão, recomendo reforçar as patrulhas e poupar ouro. O inverno está se aproximando e o reino precisa de estabilidade.");
        } else if (this.lealdade > 40 && this.lealdade <= 75) {
            System.out.println("["+ this.nome + " - Mão do Rei]: Majestade, os lords estão inquietos. Recomendo diplomacia e realizar um banquete.");
        }else{
            System.out.println("["+ this.nome + " - Mão do Rei]: Majestade, não precisa se preucupar, o reino nunca esteve tão seguro");
        }
    }
}
