package br.com.fiapride.model;

public class Garrafa {

    private String corDaTampa;
    private String marca;
    private String materialDaGarrafa;

    public void mudarCorDaTampa(String novaCor) {

        if(novaCor == null || novaCor.isEmpty()){
            System.out.println("Erro: A cor da tampa não pode ser vazia.");
        } else {
            this.corDaTampa = novaCor;
            System.out.println("Cor da tampa alterada para: " + novaCor);
        }

    }

    public void trocarMaterial(String novoMaterial){

        if(novoMaterial == null || novoMaterial.isEmpty()){
            System.out.println("Erro: O material da garrafa não pode ser vazio.");
        } else {
            this.materialDaGarrafa = novoMaterial;
            System.out.println("Material alterado para: " + novoMaterial);
        }

    }


    public String getCorDaTampa() {
        return corDaTampa;
    }

    public void setCorDaTampa(String corDaTampa) {
        this.corDaTampa = corDaTampa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMaterialDaGarrafa() {
        return materialDaGarrafa;
    }

    public void setMaterialDaGarrafa(String materialDaGarrafa) {
        this.materialDaGarrafa = materialDaGarrafa;
    }
}