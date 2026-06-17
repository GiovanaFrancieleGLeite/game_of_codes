package ConselhoReal;

public class SistemaSoberania {

    public static void rodarTurno(MaoDoRei mao, MestreMoeda moedas, MestreSussurros sussurros, double custoMilitar) {

        System.out.println("\n--- INÍCIO DO TURNO DO REINO ---");

        mao.ativar();
        moedas.ativar();
        sussurros.ativar();

        System.out.println("\n--- FASE DE MANUTENÇÃO MILITAR ---");

        boolean pagarTropas= moedas.pagarTropas(custoMilitar);

        if (tropasPagas) {
            System.out.println("SISTEMA]: O turno terminou em paz. As finanças cobriram o pilar militar.");
        } else {
            System.out.println("[SISTEMA - ALERTA]: Sem ouro suficiente para o custo militar! Risco de rebelião.");
        }

        System.out.println("---------------------------------------\n");
    }
}