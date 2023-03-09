package POO;

import java.util.HashMap;
import java.util.Scanner;

public class TestaNumero {
    public static void main(String[] args) {
        Numeros n = new Numeros();

        boolean continuar = true;

        
        Scanner scan = new Scanner(System.in);
        while(continuar) {
            double x = 0;
            double y = 0;
            int operacao = 0;

            System.out.println("digite a operação que deseja realizar:" 
             +               "\n1 para soma"
             +               "\n2 para subtraçao"
             +               "\n3 para multiplicacao"
             +               "\n4 para divisao"
             +               "\n ou 0 para terminar o programa");
           
            operacao = scan.nextInt();
            
            if (operacao == 0) {
                continuar = false;
                return;
            }

            System.out.println("informe o valor do primeiro numero ");
            x = scan.nextDouble();

            System.out.println("informe o valor do segundo numero ");
            y = scan.nextDouble();

            switch (operacao) {
                case 1:
                    imprimeCalculador(operacao, n.soma(x, y), x, y);
                    break;
                case 2:
                    imprimeCalculador(operacao, n.subtracao(x, y), x, y);
                    break;
                case 3:
                    imprimeCalculador(operacao, n.multiplicacao(x, y), x, y);
                    break;
                case 4:
                    imprimeCalculador(operacao, n.divisao(x, y), x, y);
                    break;
            
            }
        }
        scan.close();
    }

    static void imprimeCalculador(int operacao, double resultado, double x, double y) {
        HashMap<Integer, String> mapOperacao = new HashMap<>();
        mapOperacao.put(1, "somado");
        mapOperacao.put(2, "subtraido");
        mapOperacao.put(3, "multiplicado");
        mapOperacao.put(4, "dividido");

        System.out.println(
                "\n o resultado de " + x + mapOperacao.get(operacao) + "por " + y + "é igual a " + resultado + "\n ");
    }
}
