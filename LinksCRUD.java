import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class Link {
    String tema;
    String linkURL;

    Link(String tema, String linkURL) {
        this.tema = tema;
        this.linkURL = linkURL;
    }
}

public class LinksCRUD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Link> listaLinks = new ArrayList<>();

        carregarArquivo(listaLinks);

        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar link");
            System.out.println("2. Editar link");
            System.out.println("3. Excluir link");
            System.out.println("4. Listar links");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção:\n");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao) {
                case 1:
                    System.out.println("\nInsira o tema do link:\n");
                    String tema = scanner.nextLine();

                    System.out.println("\nInsira o Link:\n");
                    String linkURL = scanner.nextLine();

                    listaLinks.add(new Link(tema, linkURL));
                    break;

                case 2:
                    System.out.println("\nInsira o número do link a editar (1-" + listaLinks.size() + "):\n");
                    int linkEditar = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("\nInsira o novo tema:\n");
                    String novoTema = scanner.nextLine();

                    System.out.println("\nInsira o novo Link:\n");
                    String novoLinkURL = scanner.nextLine();

                    listaLinks.set(linkEditar-1, new Link(novoTema, novoLinkURL));
                    break;

                case 3:
                    System.out.println("\nInsira o número do link a excluir (1-" + listaLinks.size() + "):\n");
                    int linkExcluir = scanner.nextInt();

                    listaLinks.remove(linkExcluir-1);
                    break;

                case 4:
                    System.out.println("\nLinks salvos:\n");
                    for (int i = 0; i < listaLinks.size(); i++) {
                        Link link = listaLinks.get(i);
                        System.out.println((i+1) + ". " + link.tema + " - " + link.linkURL);
                    }
                    break;

                case 5:
                    System.out.println("\nSaindo...");
                    scanner.close();
                    break;

                default:
                    System.out.println("\nOpção inválida!");
                    break;
            }
        } while (opcao != 5);

        salvarArquivo(listaLinks);
    }

    public static void salvarArquivo(ArrayList<Link> listaLinks) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("links.txt"));
            for (Link link : listaLinks) {
                writer.write("***Tema***\n" + link.tema + "\n***LinkURL***\n" + link.linkURL + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void carregarArquivo(ArrayList<Link> listaLinks) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("links.txt"));
            String line = reader.readLine();
            while (line != null) {
                if (line.equals("***Tema***")) {
                    String tema = reader.readLine();
                    reader.readLine(); // pula a linha do LinkURL
                    String linkURL = reader.readLine();
                    listaLinks.add(new Link(tema, linkURL));
                }
                line = reader.readLine();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            // O arquivo não existe ainda, então vamos ignorar essa exceção.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}