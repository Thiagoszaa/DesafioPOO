package Apple;

import Aplications.aparelhoTelefonico.Ligar;
import Aplications.aparelhoTelefonico.AparelhoTelefonico;
import Aplications.aparelhoTelefonico.Atender;
import Aplications.aparelhoTelefonico.IniciarCorreioVoz;


public class loja {
    public static void main(String[] args) {

        AparelhoTelefonico aparelho = new Atender();
        aparelho.Ligacao();

        AparelhoTelefonico Correio = new IniciarCorreioVoz();
        Correio.Ligacao();

        AparelhoTelefonico Chamar = new Ligar();
        Chamar.Ligacao();


    }
}
