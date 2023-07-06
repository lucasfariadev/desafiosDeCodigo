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
  - [Desafio 1](#Teste-Desafio-1)
  - [Desafio 2](#Teste-Desafio-2)
  - [Desafio 3](#Teste-Desafio-3)
  - [Desafio 4](#Teste-Desafio-4)
  - [Desafio 5](#Teste-Desafio-5)
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

#### Resolução:

A resolução desse desafio foi implementada na função `removerCaracteresDuplicados`, que recebe uma string como entrada e retorna a string sem os caracteres duplicados.
```
    public static String removerCaracteresDuplicados(String texto) {
        StringBuilder resultado = new StringBuilder();
        Set<Character> caracteres = new HashSet<>();

        for (char c : texto.toCharArray()) {
            if (!caracteres.contains(c)) {
                caracteres.add(c);
                resultado.append(c);
            }
        }

        return resultado.toString();
    }
```

## Desafio 3: Encontrar a substring palíndroma mais longa

**Descrição:**
O terceiro desafio consiste em encontrar a substring palíndroma mais longa em uma string.

#### Resolução:

A resolução desse desafio foi implementada na função `encontrarSubstringPalindromaMaisLonga`, que recebe uma string como entrada e retorna a substring palíndroma mais longa encontrada. Ela depende da função `isPalindromo` que verifica se ums string é ou não um palíndromo.
```
public static String encontrarSubstringPalindromaMaisLonga(String texto) {
        int tamanhoMax = 0;
        String resultado = "";

        for (int i = 0; i < texto.length(); i++) {
            for (int j = i + 1; j <= texto.length(); j++) {
                String substr = texto.substring(i, j);
                if (isPalindromo(substr) && substr.length() > tamanhoMax) {
                    tamanhoMax = substr.length();
                    resultado = substr;
                }
            }
        }

        return resultado;
    }
```    
```
  private static boolean isPalindromo(String texto) {
  int i = 0;
  int j = texto.length() - 1;
  
          while (i < j) {
              if (texto.charAt(i) != texto.charAt(j)) {
                  return false;
              }
              i++;
              j--;
          }
  
          return true;
      }
```


## Desafio 4: Colocar em maiúscula a primeira letra de cada frase na string

**Descrição:**
O quarto desafio consiste em colocar em maiúscula a primeira letra de cada frase em uma string.

#### Resolução:
Para resolver o quarto desafio foi implementada a função `primeiraLetraMaiuscula`. Ela divide a string em frases usando caracteres delimitadores como ".", "?", ou "!", seguidos por um espaço em branco. Em seguida, percorre cada frase, verificando se não está vazia e substituindo a primeira letra pela sua versão maiúscula. Por fim, reúne as frases em uma única string, mantendo a pontuação original de cada uma.
```
public static String primeiraLetraMaiuscula(String texto) {
        String[] frases = texto.split("(?<=\\.\\s|\\?\\s|!\\s)");
        StringBuilder resultado = new StringBuilder();

        for (String frase : frases) {
            if (!frase.trim().isEmpty()) {
                frase = frase.substring(0, 1).toUpperCase() + frase.substring(1);
            }
            resultado.append(frase);
        }

        return resultado.toString();
    }
```
## Desafio 5: Verificar se a string é um anagrama de um palíndromo

**Descrição:**
O quinto desafio consiste em verificar se uma string é um anagrama de um palíndromo.

#### Resolução:
Para resolver o quinto desafio foi implementada a função `isAnagramaDePalindromo`. Nela é contada a frequência de ocorrência de cada caractere na string utilizando um mapa. Depois é verificado quantos caracteres têm uma quantidade ímpar de ocorrências e então, se o número de caracteres com quantidade ímpar for no máximo 1, a string é considerada um anagrama de um palíndromo, caso contrário, não é. Ela então retornará uma string com "true" ou "false"
```
public static boolean isAnagramaDePalindromo(String texto) {
        Map<Character, Integer> frequencia = new HashMap<>();

        for (char c : texto.toCharArray()) {
            frequencia.put(c, frequencia.getOrDefault(c, 0) + 1);
        }

        int qtdCaracteresImpares = 0;

        for (int count : frequencia.values()) {
            if (count % 2 != 0) {
                qtdCaracteresImpares++;
            }
        }

        return qtdCaracteresImpares <= 1;
    }
```
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

#### Teste Desafio 2
```
    public void testRemoverCaracteresDuplicados() {
        String texto = "Hello, World!";
        String resultadoEsperado = "Helo, Wrd!";

        String resultado = StringUtil.removerCaracteresDuplicados(texto);

        assertEquals(resultadoEsperado, resultado);
    }
```

#### Teste Desafio 3
```
  public void testEncontrarSubstringPalindromaMaisLonga() {
          String texto = "babad";
          String resultadoEsperado = "bab";
  
          String resultado = StringUtil.encontrarSubstringPalindromaMaisLonga(texto);
  
          assertEquals(resultadoEsperado, resultado);
      }
```

#### Teste Desafio 4
```
public void testPrimeiraLetraMaiuscula() {
        String frase = "hello. how are you? i'm fine, thank you.";
        String resultadoEsperado = "Hello. How are you? I'm fine, thank you.";

        String resultado = StringUtil.primeiraLetraMaiuscula(frase);

        assertEquals(resultadoEsperado, resultado);
    }

```

#### Teste Desafio 5
```
  public void testIsAnagramaDePalindromo() {
        String texto = "racecar";
        boolean resultadoEsperado = true;

        boolean resultado = StringUtil.isAnagramaDePalindromo(texto);

        assertEquals(resultadoEsperado, resultado);
    }
```


### Observações importantes:

- Os desafios estão em desenvolvimento.
- Os desafios estão sendo resolvidos utilizando a linguagem Java na versão 11 do JDK.
- Para todos os desafios, será assumido que a entrada contém apenas caracteres alfabéticos, espaços e sinais de pontuação.
- A saída para cada desafio será retornada como uma string.

Fique à vontade para explorar o código-fonte conforme eu disponibilizar e testar as soluções dos desafios por conta própria! Caso queira compartilhar com esse repositório, fique a vontade para criar um fork, eu apenas não poderei aceitar, por hora, quaisquer pull requests pois este é um repositório avaliativo para uma vaga.
