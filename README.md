# Projeto Garrafa

## Descrição

Este projeto representa uma garrafa do mundo real utilizando Programação Orientada a Objetos em Java.

A classe `Garrafa` possui atributos que representam características da garrafa:

- marca
- material da garrafa
- cor da tampa

## Métodos

### mudarCorDaTampa(String novaCor)

Altera a cor da tampa da garrafa.

Regra de negócio:
A cor não pode ser vazia. Caso seja, o sistema exibe uma mensagem de erro.

### trocarMaterial(String novoMaterial)

Altera o material da garrafa.

Regra de negócio:
O material não pode ser vazio.

## Testes

No arquivo `SistemaPrincipal` foi criada uma instância da classe `Garrafa` para testar:

- alteração de atributos com valores válidos
- tentativa de alteração com valores inválidos

## Exemplo de uso

```java
Garrafa garrafa1 = new Garrafa();

garrafa1.setMarca("Biolev");
garrafa1.setMaterialDaGarrafa("Plástico");
garrafa1.setCorDaTampa("Azul");

garrafa1.mudarCorDaTampa("Vermelha");
garrafa1.trocarMaterial("Vidro");