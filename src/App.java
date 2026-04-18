

import java.util.Arrays;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
                Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMENU");
            System.out.println("1 - Ex01: Progressão Geométrica");
            System.out.println("2 - Ex02: Sequência Decrescente");
            System.out.println("3 - Ex03: Vetor Dinâmico");
            System.out.println("4 - Ex04: Crescente + Soma");
            System.out.println("5 - Ex05: Matriz Incremental");
            System.out.println("6 - Ex06: Operação Matrizes");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1: ex01(sc); break;
                case 2: ex02(sc); break;
                case 3: ex03(sc); break;
                case 4: ex04(sc); break;
                case 5: ex05(sc); break;
                case 6: ex06(sc); break;
                case 0: System.out.println("Encerrando"); break;
                default: System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
      
        // TODO: Implementar menu interativo com as seguintes opcoes:
        // 1. Exercicio 01: Progressao Geometrica
        // 2. Exercicio 02: Sequencia Decrescente
        // 3. Exercicio 03: Vetor Dinamico
        // 4. Exercicio 04: Sequencia Crescente com Soma
        // 5. Exercicio 05: Matriz com Valores Incrementais
        // 6. Exercicio 06: Operacao entre Matrizes
        // 0. Sair
        
        // Utilize o método lerValor para validação de entrada
        // Exiba os resultados utilizando Arrays.toString() para vetores
        // Para matrizes, utilize o método exibirMatriz()
    
    
    // /**
    //  * Metodo auxiliar para ler e validar entrada do usuario
    //  * @param scanner Scanner para leitura
    //  * @param mensagem Mensagem a ser exibida
    //  * @param min Valor minimo (exclusivo)
    //  * @param max Valor maximo (inclusivo)
    //  * @return Valor valido lido
    //  */
    // private static int lerValor(Scanner scanner, String mensagem, int min, int max) {
    //     // TODO: Implementar validacao de entrada
    //     // Deve repetir a leitura ate que o valor seja valido (min < valor <= max)
    //     return 0; // Remover esta linha apos implementacao
    // }
    
    // /**
    //  * Metodo auxiliar para exibir matriz formatada
    //  * @param matriz Matriz a ser exibida
    //  */
    // private static void exibirMatriz(int[][] matriz) {
    //     // TODO: Implementar exibicao da matriz
    //     // Use System.out.printf("%4d ", matriz[i][j]) para formatacao
    // }
    
    /**
     * Exercicio 01: Progressao Geometrica
     * @param valorInicial Valor inicial (deve ser <= 20)
     * @return Vetor de 10 elementos com progressao geometrica (dobro) ou null se invalido
     */

     public static int[] progressaoGeometrica(int valorInicial) {
        if (valorInicial > 20) return null;
        //criando o vetor
        int[] v = new int[10];
        v[0] = valorInicial;
        //percorrendo o vetor criado
        for (int i = 1; i < 10; i++) {
            v[i] = v[i - 1] * 2;
        }
        return v;
    }

    public static void ex01(Scanner sc) {
        int valor;
        int[] r;

        do {
            System.out.print("Valor (<=20): ");
            valor = sc.nextInt();
            r = progressaoGeometrica(valor);
        } while (r == null);

        System.out.println(Arrays.toString(r));
    }
    
    /**
     * Exercicio 02: Sequencia Decrescente
     * @param valorInicial Valor inicial (deve ser > 1)
     * @return Vetor de 10 elementos com sequencia decrescente ou null se invalido
     */
     public static int[] sequenciaDecrescente(int valor) {
        if (valor <= 1 || valor >= 100) return null;
        //criando o vetor
        int[] v = new int[10];
        v[0] = valor;
        //percorrendo o vetor criado
        for (int i = 1; i < 10; i++) {
            v[i] = v[i - 1] - 1;
        }
        return v;
    }

    public static void ex02(Scanner sc) {
        int valor;
        int[] r;

        do {
            System.out.print("Valor (1 < x < 100): ");
            valor = sc.nextInt();
            r = sequenciaDecrescente(valor);
        } while (r == null);

        System.out.println(Arrays.toString(r));
    }
    
    /**
     * Exercicio 03: Vetor Dinamico
     * @param tamanho Tamanho do vetor (deve ser <= 1000)
     * @return Vetor com sequencia de 1 ate tamanho ou null se invalido
     */
    public static int[] vetorDinamico(int valor) {
        if (valor <= 1 || valor > 1000) return null;

        int[] v = new int[valor];

        for (int i = 0; i < valor; i++) {
            v[i] = i + 1;
        }
        return v;
    }

    public static void ex03(Scanner sc) {
        int valor;
        int[] r;

        do {
            System.out.print("Valor (1 < x <= 1000): ");
            valor = sc.nextInt();
            r = vetorDinamico(valor);
        } while (r == null);

        System.out.println(Arrays.toString(r));
    }
    
    /**
     * Exercicio 04: Sequencia Crescente com Soma
     * @param valorInicial Valor inicial
     * @return Vetor de 10 elementos com sequencia crescente
     */
    public static int[] sequenciaCresenteComSoma(int valor) {
        if (valor <= 1 || valor >= 100) return null;

        int[] v = new int[10];
        v[0] = valor;

        for (int i = 1; i < 10; i++) {
            v[i] = v[i - 1] + 1;
        }
        return v;
    }

    public static int calcularSomaa(int[] v) {
        int soma = 0;
        for (int n : v) soma += n;
        return soma;
    }

    public static void ex04(Scanner sc) {
        int valor;
        int[] r;

        do {
            System.out.print("Valor (1 < x < 100): ");
            valor = sc.nextInt();
            r = sequenciaCresenteComSoma(valor);
        } while (r == null);

        System.out.println(Arrays.toString(r));
        System.out.println("Soma: " + calcularSomaa(r));
    }
    
    /**
     * Calcula a soma de todos os elementos do vetor
     * @param vetor Vetor para calcular a soma
     * @return Soma de todos os elementos
     */
    public static int calcularSoma(int[] vetor) {
        // TODO: Implementar calculo da soma
        // Percorrer o vetor e somar todos os elementos
        return 0; // Remover esta linha apos implementacao
    }
    
    /**
     * Exercicio 05: Matriz com Valores Incrementais
     * @param tamanho Tamanho da matriz quadrada
     * @return Matriz NxN com valores incrementais iniciando em tamanho+1
     */
     public static int[][] matrizIncrementais(int valor) {
        if (valor <= 3 || valor > 50) return null;

        int[][] m = new int[valor][valor];
        int contador = valor + 1;

        for (int i = 0; i < valor; i++) {
            for (int j = 0; j < valor; j++) {
                m[i][j] = contador++;
            }
        }
        return m;
    }

    public static void ex05(Scanner sc) {
        int valor;
        int[][] m;

        do {
            System.out.print("Valor (3 < x <= 50): ");
            valor = sc.nextInt();
            m = matrizIncrementais(valor);
        } while (m == null);

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf("%4d ", m[i][j]);
            }
            System.out.println();
        }
    }

    
    /**
     * Exercicio 06: Operacao entre Matrizes
     * @param tamanho Tamanho das matrizes quadradas
     * @return Array com 3 matrizes: [0]=N, [1]=Z, [2]=Soma
     */
     public static int[][][] operacaoEntreMatrizes(int valor) {
        if (valor <= 3 || valor > 50) return null;

        int[][] N = new int[valor][valor];
        int[][] Z = new int[valor][valor];
        int[][] S = new int[valor][valor];

        int contador = valor + 1;

        for (int i = 0; i < valor; i++) {
            for (int j = 0; j < valor; j++) {
                N[i][j] = contador;
                Z[i][j] = contador;
                S[i][j] = N[i][j] + Z[i][j];
                contador++;
            }
        }

        return new int[][][] { N, Z, S };
    }

    public static void ex06(Scanner sc) {
        int valor;
        int[][][] r;

        do {
            System.out.print("Valor (3 < x <= 50): ");
            valor = sc.nextInt();
            r = operacaoEntreMatrizes(valor);
        } while (r == null);

        String[] nomes = {"Matriz N", "Matriz Z", "Matriz Soma"};

        for (int k = 0; k < 3; k++) {
            System.out.println(nomes[k]);
            for (int i = 0; i < r[k].length; i++) {
                for (int j = 0; j < r[k][i].length; j++) {
                    System.out.printf("%4d ", r[k][i][j]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    
    // ========================================
    // METODOS REQUERIDOS PELO AUTOGRADER
    // NAO REMOVER - Necessarios para avaliacao automatica
    // ========================================
    
    /**
     * Metodo ex01 para compatibilidade com autograder
     * @return resultado do exercicio 01
     */
    public static int[] ex01() {
        // TODO: Implementar leitura de entrada e chamar progressaoGeometrica()
        return null; // Remover esta linha apos implementacao
    }
    
    /**
     * Metodo ex02 para compatibilidade com autograder
     * @return resultado do exercicio 02
     */
    public static int[] ex02() {
        // TODO: Implementar leitura de entrada e chamar sequenciaDecrescente()
        return null; // Remover esta linha apos implementacao
    }
    
    /**
     * Metodo ex03 para compatibilidade com autograder
     * @return resultado do exercicio 03
     */
    public static int[] ex03() {
        // TODO: Implementar leitura de entrada e chamar vetorDinamico()
        return null; // Remover esta linha apos implementacao
    }
    
    /**
     * Metodo ex04 para compatibilidade com autograder
     * @return resultado do exercicio 04
     */
    public static int[] ex04() {
        // TODO: Implementar leitura de entrada e chamar sequenciaCresenteComSoma()
        return null; // Remover esta linha apos implementacao
    }
    
    /**
     * Metodo ex05 para compatibilidade com autograder
     * @return resultado do exercicio 05
     */
    public static int[][] ex05() {
        // TODO: Implementar leitura de entrada e chamar matrizIncrementais()
        return null; // Remover esta linha apos implementacao
    }
    
    /**
     * Metodo ex06 para compatibilidade com autograder
     * @return resultado do exercicio 06
     */
    public static int[][][] ex06() {
        // TODO: Implementar leitura de entrada e chamar operacaoEntreMatrizes()
        return null; // Remover esta linha apos implementacao
    }
}
