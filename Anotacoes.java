
import java.util.Scanner;

    public class Anotacoes {

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Seja bem vindo!");
            System.out.print("Qual o seu nome?: ");
            String nome = scanner.nextLine();

            System.out.print("Olá " + nome + "!,");
            System.out.println(" Deseja criar uma anotação de um jogador? (sim/não)");

            String respostaInicial = scanner.nextLine();
            if (!respostaInicial.equalsIgnoreCase("sim")) {
                System.out.println("Ok, não iremos criar uma anotação. Obrigado por usar nosso sistema, " + nome + "! Até a próxima!");
                return; // Encerra o programa se a resposta for não
            }
            System.out.println("Perfeito, vamos anotar as informações do jogador!");
            System.out.print("Qual o nome do jogador que você deseja anotar?: ");

            String jogador = scanner.nextLine();
            System.out.println("Ótimo, vamos anotar as informações do jogador " + jogador + "!");

            System.out.print("Idade de " + jogador + ": ");
            int idade = Integer.parseInt(scanner.nextLine());

            System.out.print("Posiçao de " + jogador + ": ");
            String posicao = scanner.nextLine();

            System.out.print("Time de " + jogador + ": ");
            String time = scanner.nextLine();

            System.out.println("Parabéns " + nome + ", você acabou de criar uma anotação do jogador " + jogador + "!");
            System.out.println("---informações do jogador---");



            System.out.println("Nome: " + jogador);
            System.out.println("Idade: " + idade);
            System.out.println("Posição: " + posicao);
            System.out.println("Time: " + time);



            System.out.println("Você deseja editar as informações do jogador? (sim/não)");
            String respostaEdicao = scanner.nextLine();

            if (respostaEdicao.equalsIgnoreCase("sim")) {
                System.out.println("Perfeito, vamos editar as informações do jogador " + jogador + "!");

                System.out.println("Parabéns " + nome + ", você acabou de editar as informações do jogador " + jogador + "!");
            } else {
                System.out.println("Ok, não iremos editar as informações do jogador.");

                System.out.println("Você deseja excluir as informações do jogador? (sim/não)");
                String respostaExclusao = scanner.nextLine();

                if (respostaExclusao.equalsIgnoreCase("sim")) {
                    System.out.println("Perfeito, vamos excluir as informações do jogador " + jogador + "!");
                    jogador = "";
                    idade = 0;
                    posicao = "";
                    time = "";
                    System.out.println("As informações do jogador foram excluídas com sucesso!");
                } else {
                    System.out.println("Ok, não iremos excluir as informações do jogador.");
                }

                System.out.println("Obrigado por usar nosso sistema de anotações, " + nome + "! Até a próxima!");
                return; // Encerra o programa se a resposta for não

            }
            System.out.print("Novo nome do jogador: ");
            jogador = scanner.nextLine();

            System.out.print("Nova idade: ");
            idade = Integer.parseInt(scanner.nextLine());

            System.out.print("Nova posição: ");
            posicao = scanner.nextLine();

            System.out.print("Novo time: ");
            time = scanner.nextLine();


                System.out.println("---informações atualizadas do jogador---");

            System.out.println("Nome: " + jogador);
            System.out.println("Idade: " + idade);
            System.out.println("Posição: " + posicao);
            System.out.println("Time: " + time);

            System.out.println("Parabéns " + nome + ", você acabou de editar as informações do jogador " + jogador + "!");

            System.out.println("Você deseja excluir as informações do jogador? (sim/não)");
            String respostaExclusao = scanner.nextLine();

            if (respostaExclusao.equalsIgnoreCase("sim")) {
                System.out.println("Perfeito, vamos excluir as informações do jogador " + jogador + "!");
                jogador = "";
                idade = 0;
                posicao = "";
                time = "";
                System.out.println("As informações do jogador foram excluídas com sucesso!");
            } else {
                System.out.println("Ok, não iremos excluir as informações do jogador.");
            }


            System.out.println("Obrigado por usar nosso sistema de anotações, " + nome + "! Até a próxima!");


        }

}
