package br.com.fiapride.main;

import br.com.fiapride.model.Garrafa;


public class SistemaPrincipal {

    public static void main(String[] args) {

        Garrafa garrafa1 = new Garrafa();
        garrafa1.setMarca("Biolev");
        garrafa1.setMaterialDaGarrafa("Plástico");
        garrafa1.setCorDaTampa("Azul");

        System.out.println("Marca da garrafa:" + garrafa1.getMarca() +
                " Material da garrafa:" + garrafa1.getMaterialDaGarrafa() +
                " Cor da tampa:" + garrafa1.getCorDaTampa()
            );

    }
}
