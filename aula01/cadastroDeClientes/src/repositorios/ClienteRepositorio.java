package repositorios;

import entidades.Cliente;

import java.io.PrintWriter;
import java.util.UUID;

/**
 * Classe para persistência de dados do cliente
 */
public class ClienteRepositorio {

    /**
     * Metodo para exportar os dados do cliente para um arquivo
     * @param cliente
     */
    public void exportar(Cliente cliente) {
        try {

            // Criar um arquivo dentro do projeto
            var printWriter = new PrintWriter("cliente_" + cliente.getId() + ".txt");

            // Escrevendo dados no arquivo
            printWriter.println(cliente.toString());

            // Fechando o objeto PrintWriter
            printWriter.close();

            System.out.println("Dados exportados com sucesso!");

        } catch (Exception e) {
            System.out.println("Erro ao exportar dados do cliente: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
