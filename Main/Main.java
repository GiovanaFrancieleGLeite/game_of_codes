package Main;

import ConselhoReal.MaoRei;
import ConselhoReal.MestreMoeda;
import ConselhoReal.MestreSussurros;
import Militar.Dragao;
import Militar.Exercito;
import Militar.Navio;
import Reino.Reino;

public class Main {
    public static void main(String[] args) {
        Reino reino1 = new Reino(1, "Ilhas de ferro");
        Reino reino2 = new Reino(2, "Valíria");
        Reino reino3 = new Reino(3, "Porto Real");

        Dragao dragao1 = new Dragao(reino2, 100, true, "Drogon", 15, 400);
        Dragao dragao2 = new Dragao(reino2, 95, true, "Viserion", 14, 500);
        Dragao dragao3 = new Dragao(reino2, 90, true, "Rhaegal", 14, 600);
        Dragao dragao4 = new Dragao(reino2, 100, false, "Ozzyosborrs", 16, 666);

        Navio navio1 = new Navio(reino1, 80, "Silêncio", 4000, 200, 600);
        Navio navio2 = new Navio(reino1, 75, "Vento Negro", 3500, 180, 700);

        Exercito exercito1 = new Exercito(reino3, 85, 10000, 200);
        Exercito exercito2 = new Exercito(reino3, 85, 10000, 200);
        Exercito exercito3 = new Exercito(reino2, 95, 8000, 340);
        Exercito exercito4 = new Exercito(reino1, 90, 12000, 400);

/*
        reino1.mostrarMilitares();
        reino2.mostrarMilitares();
        reino3.mostrarMilitares();
        reino4.mostrarMilitares();
        reino4.atacar();
        reino3.atacar();
        dragao2.mostrarInfo();
        dragao4.mostrarInfo();
        dragao1.batalhar(navio1);
*/        

        MaoRei maoReino3 = new MaoRei("Tywin Lannister", 90, reino3);
        MestreMoeda mestreMoedaReino3 = new MestreMoeda("Mindinho", 55, reino3, 123.00);
        MestreSussurros mestreSussurrosReino3 = new MestreSussurros("Varys", 25, reino3);

        reino3.adicionarConselheiroReal(maoReino3);
        reino3.adicionarConselheiroReal(mestreMoedaReino3);
        reino3.adicionarConselheiroReal(mestreSussurrosReino3);

        double custoMilitar = 400.0;
            
    }
}
