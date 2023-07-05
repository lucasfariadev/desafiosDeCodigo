# Desafios de Manipulação de Strings em Java

![Status](https://img.shields.io/badge/Status-Em%20desenvolvimento-yellow)

Este repositório conterá a resolução de desafios de manipulação de strings usando a linguagem Java (versão JDK 11). Cada desafio será uma função independente que receberá uma entrada específica e retornará a saída correspondente como uma string.

## Menu

- [Desafio 1](#desafio-1-reverter-a-ordem-das-palavras-nas-frases-mantendo-a-ordem-das-palavras)
- [Desafio 2](#desafio-2-remover-todos-os-caracteres-duplicados-da-string)
- [Desafio 3](#desafio-3-encontrar-a-substring-palíndroma-mais-longa)
- [Desafio 4](#desafio-4-colocar-em-maiúscula-a-primeira-letra-de-cada-frase-na-string)
- [Desafio 5](#desafio-5-verificar-se-a-string-é-um-anagrama-de-um-palíndromo)
- [Testes](#Testes-com-JUnit)
- [Observações](#Observações-importantes)


## StringUtil
A classe StringUtil foi criada para ser colocado a lógica das resoluções, seus métodos estão sendo criados como Static para que não haja a necessidade de instanciamento de um objeto.

## Desafio 1: Reverter a ordem das palavras nas frases, mantendo a ordem das palavras

**Descrição:**
O primeiro desafio consiste em inverter a ordem das palavras em uma frase, mantendo a ordem das palavras individuais.

#### resolução:

Para resolver esse desafio, foi implementada a função `inverterPalavras`, que recebe uma frase como entrada e retorna a frase com as palavras invertidas, mantendo a ordem das palavras individuais.

``` 
public static String inverterPalavras(String frase) {
        String[] palavras = frase.split(" ");
        StringBuilder resultado = new StringBuilder();

        for (int i = palavras.length - 1; i >= 0; i--) {
            resultado.append(palavras[i]).append(" ");
        }
        
        return resultado.toString().trim();
    }
```

## Desafio 2: Remover todos os caracteres duplicados da string

**Descrição:**
O segundo desafio consiste em remover todos os caracteres duplicados de uma string.

## Desafio 3: Encontrar a substring palíndroma mais longa

**Descrição:**
O terceiro desafio consiste em encontrar a substring palíndroma mais longa em uma string.

## Desafio 4: Colocar em maiúscula a primeira letra de cada frase na string

**Descrição:**
O quarto desafio consiste em colocar em maiúscula a primeira letra de cada frase em uma string.

## Desafio 5: Verificar se a string é um anagrama de um palíndromo

**Descrição:**
O quinto desafio consiste em verificar se uma string é um anagrama de um palíndromo.

## Testes com JUnit

Foram implementados testes utilizando o framework de testes JUnit para validar as soluções dos desafios. Os testes podem ser encontrados no módulo Test na classe StringUtilTest. Caso seu ambiente esteja configurado corretamente, pode executar todos os testes.

#### Teste Desafio 1
```
public void testInverterPalavras() {
        String frase = "Hello, World! OpenAI is amazing.";
        String resultadoEsperado = "amazing. is OpenAI World! Hello,";

        String resultado = StringUtil.inverterPalavras(frase);

        assertEquals(resultadoEsperado, resultado);
    }
```


### Observações importantes:

- Os desafios estão em desenvolvimento.
- Os desafios serão resolvidos utilizando a linguagem Java na versão 11 do JDK.
- Para todos os desafios, será assumido que a entrada contém apenas caracteres alfabéticos, espaços e sinais de pontuação.
- A saída para cada desafio será retornada como uma string.

Fique à vontade para explorar o código-fonte conforme eu disponibilizar e testar as soluções dos desafios por conta própria! Caso queira compartilhar com esse repositório, fique a vontade para criar um fork, eu apenas não poderei aceitar, por hora, quaisquer pull requests pois este é um repositório avaliativo para uma vaga.
