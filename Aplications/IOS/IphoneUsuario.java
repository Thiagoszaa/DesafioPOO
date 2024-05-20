package Aplications.IOS;

import Aplications.Navegador.Navegador;
import Aplications.ReprodutorMusical.ReprodutorMusical;
import Aplications.aparelhoTelefonico.AparelhoTelefonico;


public class IphoneUsuario implements AparelhoTelefonico, Navegador , ReprodutorMusical {


    public void IniciarPagina() {
        System.out.println("Iniciando Pagina...");

    }

    public void Ligacao() {
    System.out.println("Realizando Ligaçao...");

    }

    public void TocarMusica() {
        System.out.println("Tocando Musica...");

    }
}
