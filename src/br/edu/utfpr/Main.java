// PACKAGES: Indica o caminho para encontrar o arquivo à partir da pasta SRC
// Normalmente a primeira informação de um arquivo Java
package br.edu.utfpr;

// IMPORT: importa classes presentes em outros pacotes. Nesse caso java.util seria o pacote e Date a classe
import br.edu.utfpr.model.Televisao;
import br.edu.utfpr.model.TelevisaoAntiga;
import br.edu.utfpr.model.TelevisaoNova;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        // VARIÁVEIS, representação de espaço de memória que alocará determinado dado
        // VARIÁVEIS PRIMITIVAS.
        byte myByte = 1; //armazenas valores numéricos inteiros entre -128 e 127, ocupa 1 byte
        short myShort = 23; // armazena numéricos inteiros  entre -32,768 e 32,767, ocupa 2 bytes
        int myInt = 123123; // armazena numéricos inteiros entre -2147483648 e 2147483647, ocupa 4 bytes
        long myLong = 1_231_982_382L; // armazena numéricos inteiros entre -2^63 e 2^63, ocupa 8 bytes

        float myFloat = 23.49F; // armazena números com decimais em um raio de 32 bits, ocupa 4 bytes.
        double myDouble = 1238.23; // armazena números com decimais em um raio de 64 bits, ocupa 8 bytes

        char myChar = 'a'; //armazena um carácter, ocupa 2 bytes
        boolean myBoolean = false; // armazena ou 1 (true) ou 0 (false), e ocupa apenas 1 bit

        // VARIÁVEIS REFERENCIADAS são variáveis que referenciam outras classes Java.
        Date date = new Date();
        java.sql.Date dateSQL = new java.sql.Date(1); // Exemplo de import em código

        // CLASSE STRING, armazena sequência de carácteres, muito utilizada em Java. Pertence ao pacote java.lang;
        String nome = new String("Valcir");
        System.out.println(nome.equals("Comparação")); // .equals compara duas strings
        System.out.println(nome.substring(0, 2));  // gera uma string menor, contando do índice x ao y
        System.out.println(nome.charAt(3));  // recupera o carácter no índice X
        System.out.println(nome.toUpperCase()); // coloca em letra maiúscula
        System.out.println(nome.toLowerCase()); // coloca em letra minúscula
        // Para descobrir mais métodos da classe Sting apenas digitar nome da variável e "." que o intelliJ fornece os possíveis

        // PALAVRAS RESERVADAS, são as palavras utilizadas pelo java para compilar o código,
        // não podemos usá-las para nomear variáveis, classes ou métodos.
        // Exemplos: class, static, import, package, static, void, public, todos os nomes de variáveis primitivas e mais...

        // OPERADORES ARITMÉTICOS
        int dez = 10;
        int dois = 2;
        int tres = 3;
        System.out.println(dez + dois); // soma
        System.out.println(dez - dois); // subtração
        System.out.println(dez * dois); // multiplicação
        System.out.println(dez / dois); // divisão
        System.out.println(dez % tres); // resto
        dez++; // dez = dez + 1
        dez--; // dez = dez - 1
        dez+= dois; // dez = dez + dois
        dez-= dois; // dez = dez - dois
        dez = 10;

        // OPERADORES DE COMPARAÇÃO
        System.out.println(dez == dez); //se são iguais
        System.out.println(dez > dois); //se x maior que y
        System.out.println(dez >= dois); //se x maior ou igual à y
        System.out.println(dez < dois); //se x menor que y
        System.out.println(dez <= dois); //se x menor ou igual à y
        System.out.println(nome.equals("A")); // .equals, método comum para comparar objetos da mesma classe

        // OPERADORES LÓGICOS
        boolean afirmacaoVerdadeira = true;
        boolean afirmacaoFalsa = false;
        System.out.println(afirmacaoFalsa && afirmacaoFalsa); // retorna verdadeiro caso todas sejam verdadeiras
        System.out.println(afirmacaoVerdadeira || afirmacaoFalsa); // retorna verdadeiro caso apenas uma seja verdadeira
        System.out.println((afirmacaoVerdadeira || afirmacaoFalsa) && afirmacaoVerdadeira); //pode-se combinar várias sequências lógicas

        // Classe MATH
        // classe utilizada para operações matemáticas, pertence ao pacote java.lang
        System.out.println(Math.PI); // valor de pi
        System.out.println(Math.sqrt(9)); // raiz quadrada
        System.out.println(Math.pow(2, 3)); // x elevado à y
        System.out.println(Math.abs(-10)); // absoluto de x
        System.out.println(Math.cos(2)); // cosseno

        // IF, sequência de comparação com infinitas ramificações
        boolean maiorDeIdade = true;
        boolean possuiCarteira = true;
        if(maiorDeIdade) {
            System.out.println("É maior de idade");
        } else if(maiorDeIdade && possuiCarteira) {
            System.out.println("Pode dirigir");
        } else {
            System.out.println("É menor de idade");
        }

        // IF ternary, sequência de comparação para ramificações em Y com retorno de uma execução
        boolean podeDirigir = (maiorDeIdade && possuiCarteira) ? true : false;

        //SWITCH, assume várias possibilidades para uma variável
        String raca = "Guaipeca";
        switch (raca.toUpperCase()) {
            case "PINCHER":
                System.out.println("é pincher");
                break; //A PARTIR DO JAVA 12 não se usa mais break;
            case "PASTOR_ALEMAO":
                System.out.println("Cão policial");
                break;
            default:
                System.out.println("Raça desconhecida");
        }

        // ARRAYS e INDEXES
        // Arrays são variáveis que armazenam sequências de dados, e à posição do dado é chamado de índice
        int [] numeros = new int[2]; // 2 seria o máximo de elementos desse array
        int [] numerosInicializados = {14, -3, 0};
        System.out.println(numerosInicializados[0]); // nesse caso imprimirá 14, número na posição 0

        // FOR
        // percorrer por index
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        // percorrer por elemento
        for (int numero : numeros) {
            System.out.println(numero);
        }

        // BREAK e CONTINUE
        String[] nomes = {"Ana", "Abraao", "Bruno", "Carlos"};
        for (String nomeDoArray : nomes) {
            if(nomeDoArray.startsWith("B")){
                break; // Caso o nome começar com A para o loop e não faz mais nada
            }
            System.out.println(nomeDoArray);
        }

        for (String nomeDoArray : nomes) {
            if(nomeDoArray.startsWith("A")){
                continue; // pula para próxima execução do loop
                //nesse caso apenas imprimirá Bruno e Carlos.
            }
            System.out.println(nomeDoArray);
        }

        //WHILE, loop de condição, executa mesma coisa enquanto afirmação for verdadeira
        int contador = 0;
        while (contador <= 10){
            System.out.println(contador);
            contador++;
        }

        //DO WHILE, mesma coisa que o WHILE, porém verificação é feita após a execução
        contador = 20;
        do{
            System.out.println(contador);
            contador++;
        } while (contador <= 10); //nesse caso ele imprimirá o número 20, se fosse feito com um while não faria nada

    }

    // CLASSES
    // Uma classe é um elemento do código Java que utilizamos para representar objetos do mundo real.
    // Dentro dela é comum declararmos atributos e métodos, que representam, respectivamente, as características e comportamentos desse objeto.
    // Maneira correta de declarar uma classe é criando um arquivo único para ela!!
    static class Mouse {
        String cor;
        String marca;
        boolean ehWireless;

        public Mouse(String cor, String marca, boolean ehWireless){
            this.cor = cor;
            this.marca = marca;
            this.ehWireless = ehWireless;
        }
    }

    // MÉTODOS
    // Um método é um bloco de código ou coleção de instruções ou um conjunto de códigos agrupados para executar uma determinada tarefa ou operação
    public static int contaElementosNoArray(char[] arrayInformado, char paraComparar) {
        int contador = 0;
        for (char c : arrayInformado) {
            if(c == paraComparar)
                contador++;
        }
        return contador;
    }

    //Polimorfismo
    Televisao televisao = new TelevisaoNova("LG", 55);
    Televisao televisaoAntiga = new TelevisaoAntiga("Caixa", 19);


}
