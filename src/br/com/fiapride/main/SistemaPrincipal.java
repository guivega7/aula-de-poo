package br.com.fiapride.main;

import br.com.fiapride.model.Garrafa;

public class SistemaPrincipal {

    public static void main(String[] args) {

        Garrafa garrafa1 = new Garrafa();

        garrafa1.setMarca("Biolev");
        garrafa1.setMaterialDaGarrafa("Plástico");
        garrafa1.setCorDaTampa("Azul");

        System.out.println("Estado inicial da garrafa:");
        System.out.println("Marca: " + garrafa1.getMarca());
        System.out.println("Material: " + garrafa1.getMaterialDaGarrafa());
        System.out.println("Cor da Tampa: " + garrafa1.getCorDaTampa());

        System.out.println("\n--- Teste com valores válidos ---");

        garrafa1.mudarCorDaTampa("Vermelha");
        garrafa1.trocarMaterial("Vidro");

        System.out.println("\n--- Teste com valores inválidos ---");

        garrafa1.mudarCorDaTampa("");
        garrafa1.trocarMaterial("");

        System.out.println("\nEstado final da garrafa:");

        System.out.println("Marca: " + garrafa1.getMarca());
        System.out.println("Material: " + garrafa1.getMaterialDaGarrafa());
        System.out.println("Cor da Tampa: " + garrafa1.getCorDaTampa());

    }
}