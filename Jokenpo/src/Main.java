import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int pedra = 1;
        int papel = 2;
        int tesoura = 3;

        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "escolha um numero jogador 1 :   "
                        + "\n" + pedra + " - pedra"
                        +"\n" + papel + " - papel"
                        + "\n" + tesoura + " - tesoura"
        );

        int resposta = scanner.nextInt();

        while(resposta >= 4 || resposta <= 0) {
            resposta = scanner.nextInt();
        }

//		while (resposta != pedra
//				&& resposta != papel
//				&& resposta != tesoura ){
//			resposta = scanner.nextInt();
//		}

        if (resposta == pedra) {
            System.out.println(" Jogador 1 escolheu pedra "
                    +"\n------------------------");
        } else if (resposta == papel) {
            System.out.println(" Jogador 1 escolheu papel "
                    +"\n------------------------");
        }else if (resposta == tesoura) {
            System.out.println(" Jogador 1 escolheu tesoura "
                    +"\n------------------------");
        }

        System.out.println(
                "escolha um numero jogador 2 :   "
                        + "\n 1 - pedra"
                        +"\n 2 - papel"
                        + "\n 3 - tesoura"
        );

        int resposta2 = scanner.nextInt();

        while(resposta >= 4 || resposta <= 0) {
            resposta = scanner.nextInt();
        }

//		while (resposta != pedra
//				&& resposta != papel
//				&& resposta != tesoura ){
//			resposta = scanner.nextInt();
//			}

        if (resposta2 == pedra) {
            System.out.println(" Jogador 2 escolheu pedra "
                    +"\n------------------------");
        }else if (resposta2 == papel) {
            System.out.println(" Jogador 2 escolheu papel "
                    +"\n------------------------ ");
        }else if (resposta2 == tesoura) {
            System.out.println(" Jogador 2 escolheu tesoura "
                    +"\n------------------------");
        }

        if ( resposta == pedra && resposta2 == tesoura) {
            System.out.println("pedra ganha de tesoura"
                    + "\nVitoria jogador 1");
        }else if(resposta == tesoura && resposta2 == pedra) {
            System.out.println("pedra ganha de tesoura"
                    + "\nVitoria jogador 2");
        }else if (resposta == tesoura && resposta2 == papel) {
            System.out.println("tesoura ganha de papel"
                    + "\nVitoria jogador 1");
        }else if (resposta == papel && resposta2 == tesoura) {
            System.out.println("tesoura ganha de papel"
                    + "\nVitoria jogador 2");
        }else if (resposta == papel && resposta2 == pedra) {
            System.out.println("papel ganha de pedra"
                    + "\nVitoria jogador 1");
        }else if(resposta == pedra && resposta2 == papel) {
            System.out.println("papel ganha de pedra"
                    +"\nVitoria jogador 2");
        }else if (resposta == resposta2) {
            System.out.println("Empate dos jogadores");

        }

        scanner.close();
    }
}