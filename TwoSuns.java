

import java.util.HashMap;

public class Main {

    // Método que retorna os índices dos dois números que somam o target
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mapa = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complemento = target - nums[i];

            if (mapa.containsKey(complemento)) {
                return new int[] { mapa.get(complemento), i };
            }

            mapa.put(nums[i], i);
        }

        throw new IllegalArgumentException("Nenhuma solução encontrada");
    }

    // Método main para testar
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] resultado = twoSum(nums, target);

        System.out.println("Índices encontrados: [" + resultado[0] + ", " + resultado[1] + "]");
    }
}
