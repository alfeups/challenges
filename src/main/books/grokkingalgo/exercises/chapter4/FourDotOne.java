package main.books.grokkingalgo.exercises.chapter4;

import java.util.List;

public class FourDotOne {

    public static void main(String[] args) {
        // Array de exemplo (deve estar ordenado para a busca binária)
        int[] arr = new int[10000000];
        for (int i = 0; i < 10000000; i++) {
            arr[i] = i * 2; // Preenche o array com números pares
        }

        int alvo1 = 123456; // Elemento presente no array
        int alvo2 = 123457; // Elemento não presente no array

        // Medição de tempo para busca binária
        long inicioBinaria = System.currentTimeMillis();
        int indiceBinario = buscaBinaria(arr, alvo1, 0, arr.length - 1);
        long fimBinaria = System.currentTimeMillis();

        if (indiceBinario != -1) {
            System.out.println("Elemento " + alvo1 + " encontrado na posição " + indiceBinario + " usando busca binária.");
        } else {
            System.out.println("Elemento " + alvo1 + " não encontrado usando busca binária.");
        }

        // Calculando o tempo de execução da busca binária
        long tempoBinaria = fimBinaria - inicioBinaria;
        System.out.println("Tempo de execução da busca binária: " + tempoBinaria + " ms");

        // Medição de tempo para busca linear
        long inicioLinear = System.currentTimeMillis();
        int indiceLinear = buscaLinear(arr, alvo2);
        long fimLinear = System.currentTimeMillis();

        if (indiceLinear != -1) {
            System.out.println("Elemento " + alvo2 + " encontrado na posição " + indiceLinear + " usando busca linear.");
        } else {
            System.out.println("Elemento " + alvo2 + " não encontrado usando busca linear.");
        }

        // Calculando o tempo de execução da busca linear
        long tempoLinear = fimLinear - inicioLinear;
        System.out.println("Tempo de execução da busca linear: " + tempoLinear + " ms");
    }

    public static int soma(List<Integer> nums){
        int sum = 0;
        for(Integer num : nums){
            sum += num;
        }
        return sum;
    }

    public static int somaRecursiva(List<Integer> nums) {
        if (nums.isEmpty()) {
            return 0;
        } else {
            return nums.get(0) + somaRecursiva(nums.subList(1, nums.size()));
        }
    }

    public static int contaElementos(List<Integer> nums) {
        int count = 0;
        for (Integer num : nums) {
            count ++;
        }
        return count;
    }

    public static int encontraMaior(List<Integer> nums) {
        int highest = nums.get(0);
        for (Integer num : nums) {
            if (num > highest) {
                highest = num;
            }
        }
        return highest;
    }

    public static int buscaBinaria(int[] arr, int alvo, int esquerda, int direita) {
        if (esquerda > direita) {
            return -1;
        }
        int meio = esquerda + (direita - esquerda) / 2;

        if (arr[meio] == alvo) {
            return meio;
        } else if (arr[meio] > alvo) {
            return buscaBinaria(arr, alvo, esquerda, meio - 1);
        } else {
            return buscaBinaria(arr, alvo, meio + 1, direita);
        }
    }

    public static int buscaLinear(int[] arr, int alvo) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == alvo) {
                return i;
            }
        }
        return -1;
    }

}
