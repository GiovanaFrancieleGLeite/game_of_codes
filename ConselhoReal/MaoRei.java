package ConselhoReal;

import Reino.Reino;

public class MaoRei extends ConselheiroReal{
    public MaoRei(String nome, int lealdade, Reino reino){
        super(nome, lealdade, reino);
    }

    @Override
    public void ativar(){
        if(this.lealdade > 75){
            System.out.println("["+ this.nome + " - Mão do Rei]: Majestade, como sua Mão, recomendo reforçar as patrulhas e poupar ouro. O inverno está se aproximando e o reino precisa de estabilidade.");
        } else if (this.lealdade > 40 && this.lealdade <= 75) {
            System.out.println("["+ this.nome + " - Mão do Rei]: Majestade, os lordes estão inquietos. Recomendo diplomacia e realizar um banquete.");
        }else{
            System.out.println("["+ this.nome + " - Mão do Rei]: Majestade, não precisa se preocupar, o reino nunca esteve tão seguro");
        }
    }
}
