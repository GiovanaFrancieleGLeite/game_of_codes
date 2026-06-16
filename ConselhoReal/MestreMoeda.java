package ConselhoReal;

public class MestreMoeda extends ConselhoReal{
    private double ouroArrecadado;

    public MestreMoeda(String nome, int nivelLealdade) {
        this.nome = nome;
        this.lealdade = nivelLealdade;
        this.ouroArrecadado = 1000.0;
    }

    @Override
    public void ativar() {
        if (this.lealdade > 70) {
            this.ouroArrecadado = 500.0;
            System.out.println("[" + this.nome + " - Mestre da Moeda]: Majestade, a população pagou os impostos em dia. Arrecadamos " + this.ouroArrecadado + " moedas.");
        } else if (this.lealdade >= 40 && this.lealdade<= 70) {
            this.ouroArrecadado = 300.0;
            System.out.println("[" + this.nome + " - Mestre da Moeda]: Os cobradores voltaram das vilas. Arrecadamos " + this.ouroArrecadado + " moedas.'");
        } else {
            this.ouroArrecadado = 100.0;
            System.out.println("[" + this.nome + " - Mestre da Moeda]: O povo está rebelde e quase ninguém pagou. Só consegui pegar " + this.ouroArrecadado + " moedas. ");
        }
    }

    public boolean pagarTropas(double custoMilitar) {
        System.out.println("[TESOURARIA]: Tentando pagar o custo das tropas (Valor: " + custoMilitar + " moedas)...");

        if (this.ouroArrecadado >= custoMilitar) {
            this.ouroArrecadado -= custoMilitar;
            System.out.println("As tropas foram pagas. Sobrou: " + this.ouroArrecadado + " moedas.");
        }

        else {
            System.out.println("As tropas não foram pagas! Falta ouro para pagar os soldados.");
        }
    }
}
