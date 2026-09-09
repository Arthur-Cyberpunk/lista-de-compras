import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ProjetoListaDeCompras {

    public static void main(String[] args) {

        ArrayList<String> listaDeCompras = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os itens da lista de compras.");
        System.out.println("Digite 'fim' para terminar.");

        while (true) {

            System.out.print("Digite um item: ");
            String item = scanner.nextLine();

            if (item.equalsIgnoreCase("fim")) {
                break;
            }

            if (!item.isEmpty()) {
                listaDeCompras.add(item);
            }
        }

        System.out.println("\nLista de Compras:");

        for (String item : listaDeCompras) {
            System.out.println("- " + item);
        }

        try {
            File arquivo = new File("listaDeCompras.txt");

            PrintWriter writer = new PrintWriter(arquivo);

            for (String item : listaDeCompras) {
                writer.println(item);
            }

            writer.close();

            System.out.println("\nLista exportada com sucesso!");

        } catch (Exception ex) {
            System.out.println("Erro Ocorrido: " + ex.getMessage());
        }

        scanner.close();
    }
}