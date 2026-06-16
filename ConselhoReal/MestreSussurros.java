package ConselhoReal;

public class MestreSussurros extends ConselhoReal{

    public MestreSussurros(String nome, int lealdade, Reino reino) {
        super(nome, lealdade, reino);
    }

    @Override
    public void ativar() {

        if (this.lealdade > 75) {
            System.out.println("[" + this.nomeCons + " - Mestre dos Sussurros]: Meus passarinhos me trouxeram a verdade, Majestade, a casa Lannister está movimentando tropas secretas na fronteira!");
        } else if (this.lealdade>= 45 && this.lealdade <= 75) {
            System.out.println("[" + this.nomeCons + " - Mestre dos Sussurros]: 'Há rumores nas tavernas de que os Greyjoy estão construindo novos navios, mas ainda estou investigando a fundo.'");
        } else {
            System.out.println("[" + this.nomeCons + " - Mestre dos Sussurros]: 'Majestade, meus espiões garantem que o Norte jurou fidelidade eterna ao senhor. Pode desarmar suas fronteiras sem medo");
        }
    }
}
