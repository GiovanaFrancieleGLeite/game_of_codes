package Main;

import CasaNobre.Stark;
import CasaNobre.Targaryen;
import ConselhoReal.MaoRei;
import ConselhoReal.MestreMoeda;
import ConselhoReal.MestreSussurros;
import Militar.Dragao;
import Militar.Exercito;
import Militar.Navio;
import Reino.Reino;

public class Main {
    public static void main(String[] args) {

        // ===== Criação dos reinos =====
        // Cada reino é uma composição: ele agrega militares, conselheiros e casas nobres.
        Reino norte = new Reino(1, "Winterfell");
        Reino portoReal = new Reino(2, "Porto Real");
        Reino valiria = new Reino(3, "Valíria");

        // ===== Unidades militares =====
        // Ao serem criadas, as unidades já se registram no reino (composição feita no construtor de Militar).
        Dragao drogon = new Dragao(valiria, 100, true, "Drogon", 15, 400);
        Dragao viserion = new Dragao(valiria, 95, true, "Viserion", 14, 500);
        Dragao ozzyosborrs = new Dragao(valiria, 90, false, "Ozzyosborrs", 13, 666);

        Navio silencio = new Navio(portoReal, 80, "Silêncio", 4000, 200, 600);
        Navio ventoNegro = new Navio(portoReal, 75, "Vento Negro", 3500, 180, 700);

        Exercito legiaoDoNorte = new Exercito(norte, 95, 8000, 340);
        Exercito guardaReal = new Exercito(portoReal, 90, 12000, 400);

        // ===== Conselheiros reais =====
        // Também se registram automaticamente no reino ao serem criados.
        MaoRei maoNorte = new MaoRei("Eddard Stark", 90, norte);
        MestreMoeda moedaPortoReal = new MestreMoeda("Mindinho", 55, portoReal, 1000.0);
        MestreSussurros sussurrosPortoReal = new MestreSussurros("Varys", 80, portoReal);

        // ===== Casas nobres =====
        Stark casaStark = new Stark("Eddard Stark", "O inverno está chegando", norte, true);
        Targaryen casaTargaryen = new Targaryen("Daenerys Targaryen", "Fogo e Sangue", valiria, true);

        // ===== 1) Composição: quantas unidades cada reino agrega =====
        System.out.println("\n========== FORÇA DOS REINOS ==========");
        norte.mostrarMilitares();
        portoReal.mostrarMilitares();
        valiria.mostrarMilitares();

        // ===== 2) Polimorfismo: cada Militar responde a atacar() à sua maneira =====
        System.out.println("\n========== OS REINOS ATACAM ==========");
        valiria.atacar();
        portoReal.atacar();

        // ===== 3) Métodos próprios das subclasses =====
        System.out.println("\n========== HABILIDADES ESPECÍFICAS ==========");
        drogon.mostrarInfo();
        drogon.voar();
        silencio.mostrarInfo();
        silencio.navegar();
        legiaoDoNorte.mostrarInfo();

        // ===== 4) Batalha entre duas unidades (compara o poder) =====
        System.out.println("\n========== BATALHA ==========");
        drogon.batalhar(silencio);

        // ===== 5) Polimorfismo no conselho: cada conselheiro reage segundo sua lealdade =====
        System.out.println("\n========== CONSELHO REAL ==========");
        portoReal.reunirConselho();
        norte.reunirConselho();

        // ===== 6) Tesouraria: o Mestre da Moeda paga as tropas =====
        System.out.println("\n========== TESOURARIA ==========");
        moedaPortoReal.ativar();
        moedaPortoReal.pagarTropas(guardaReal.getCusto());

        // ===== 7) Casas nobres convocam vassalos e usam suas habilidades =====
        System.out.println("\n========== CASAS NOBRES ==========");
        casaStark.convocarVassalos();
        casaStark.vinculoLobo();
        casaTargaryen.convocarVassalos();
        casaTargaryen.vincularDragao(drogon);
    }
}
