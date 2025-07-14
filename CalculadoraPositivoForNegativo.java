public class CalculadoraPositivoForNegativo {
    public static void main(String[] args) {

        int num1 = 20;
        int num2 = -3;

        if (num1 > 0) {
            int negativo = -1 * num1; // transforma em negativo
            System.out.println("Resultado negativo: " + negativo);
        }

        if (num2 < 0) {
            int positivo = -1 * num2; // transforma em positivo
            System.out.println("Resultado positivo: " + positivo);
        }
    }
}
