package Main;

import Militar.Dragao;
import Militar.Exercito;
import Militar.Navio;

public class Main {
    public static void main(String[] args) {
        Reino reino1 = new Reino(1, "Casa Stark");
        Reino reino2 = new Reino(2, "Casa Lannister");
        Reino reino3 = new Reino(3, "Casa Targaryen");
        Reino reino4 = new Reino(4, "Casa Greyjoy");

        Dragao dragao1 = new Dragao(reino3, 100, true, "Drogon", 15);
        Dragao dragao2 = new Dragao(reino3, 95, true, "Viserion", 14);
        Dragao dragao3 = new Dragao(reino3, 90, true, "Rhaegal", 14);
        Dragao dragao4 = new Dragao(reino1, 100, false, "Ozzyosborrs", 16);

        Navio navio1 = new Navio(reino4, 80, "Silêncio", 4000, 200);
        Navio navio2 = new Navio(reino4, 75, "Vento Negro", 3500, 180);

        Exercito exercito1 = new Exercito(reino3, 85, 10000);
        Exercito exercito2 = new Exercito(reino1, 95, 8000);
        Exercito exercito3 = new Exercito(reino2, 90, 12000);
        
/*        EXEMPLOS (DECIDIR DEPOIS)
        reino1.mostrarMilitares();
        reino2.mostrarMilitares();
        reino3.mostrarMilitares();
        reino4.mostrarMilitares();
       // reino4.atacar();
        reino3.atacar();
        //dragao2.mostrarInfo();
        dragao4.mostrarInfo();
        dragao1.batalhar(navio1);
 */
    }
}
