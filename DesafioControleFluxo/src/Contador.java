
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        try (Scanner terminal = new Scanner(System.in)) {
            System.out.println("Digite o primeiro parâmetro");
            //leitura do primeiro parâmetro
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            //leitura do segundo parâmetro
            int parametroDois = terminal.nextInt();

            try {
                //chamando o método contendo a lógica de contagem
                contar(parametroUm, parametroDois);

            } catch (ParametrosInvalidosException e) {

                //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
                System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            }
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro!");
        }

        int contagem = parametroDois - parametroUm;
        //realizar o for para imprimir os números com base na variável contagem
        // o for deve imprimir os números de parametroUm até parametroDois
        //exemplo: se parametroUm for 5 e parametroDois for 10, 
        //o for deve imprimir os números de 5 até 10
        for (int i = 0; i <= contagem; i++) {
            System.out.println("Contando do " + parametroUm + " ao " + parametroDois + " : ");
            System.out.println(parametroUm + i);
        }
    }
}
