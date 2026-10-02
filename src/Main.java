//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

            Scanner scanner = new Scanner(System.in);
            IO.println("Digite o nome do seu personagem: ");
            String nome = scanner.nextLine();

            Personagem heroi = new Personagem(nome);

            int opcao = 0;

            while (opcao != 5) {
                IO.println("\n----------------------------------");
                IO.println("O que " + heroi.getNome() + " deve fazer?");
                IO.println("1 - Atacar");
                IO.println("2 - Descansar");
                IO.println("3 - Receber Dano");
                IO.println("4 - Ver Status");
                IO.println("5 - Sair do jogo");
                IO.println("Escolha uma opção: ");

                opcao = scanner.nextInt();
                IO.println("");

                switch (opcao) {
                    case 1:
                        heroi.atacar();
                        break;

                    case 2:
                        heroi.descansar();
                        break;

                    case 3:
                        IO.println("Digite a quantidade de dano recebido: ");
                        int dano = scanner.nextInt();
                        heroi.receberDano(dano);
                        break;

                    case 4:
                        IO.println("=== FICHA DO PERSONAGEM ===");
                        IO.println("Nome: " + heroi.getNome());
                        IO.println("Nível: " + heroi.getNivel());
                        IO.println("Vida: " + heroi.getVida());
                        IO.println("Energia: " + heroi.getEnergia());
                        IO.println("Status: " + heroi.getStatus());
                        break;

                    case 5:
                        IO.println("Saindo do jogo... Até a próxima!");
                        break;

                    default:
                        IO.println("Opção inválida! Escolha um número de 1 a 5.");
                        break;
                }
            }
        }