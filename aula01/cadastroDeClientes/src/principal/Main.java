package principal;

import com.sun.security.jgss.GSSUtil;
import entidades.Cliente;
import repositorios.ClienteRepositorio;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.UUID;

// Classe principal da aplicação
public class Main {

    /**
     * Metodo inicial da aplicação
     * @param args
     */
    public static void main(String[] args) {

        // Mensagem inicial para apresentação do sistema
        System.out.println("\nSISTEMA DE CONTROLE DE CLIENTES");
        System.out.println("------------------------------------------------");

        // Criando um objeto da classe Cliente
        var cliente = new Cliente();

        /*
        cliente.setId(UUID.randomUUID()); // gera um UUID aleatório
        cliente.setNome("Sergio Mendes");
        cliente.setEmail("sergio@gmail.com");
        cliente.setTelefone("(21) 99765-0900");
        cliente.setCpf("123.456.789-00");
        cliente.setDataHoraCadastro(LocalDateTime.now()); // data e hora inicial
        */

        // Criando um objeto da classe Scanner, para ler a entrada de dados pelo usuario
        var scanner = new Scanner(System.in);

        System.out.println("\nEntre com os dados para cadastrar um cliente: \n");
        System.out.print("Informe o nome...............: ");
        cliente.setNome(scanner.nextLine());
        System.out.print("Informe o e-mail.............: ");
        cliente.setEmail(scanner.nextLine());
        System.out.print("Informe o CPF................: ");
        cliente.setCpf(scanner.nextLine());
        System.out.print("Informe o telefone...........: ");
        cliente.setTelefone(scanner.nextLine());

        cliente.setId(UUID.randomUUID());
        cliente.setDataHoraCadastro(LocalDateTime.now());

        System.out.println("\nDADOS DO CLIENTE: ");
        System.out.println("ID...........................: " + cliente.getId());
        System.out.println("NOME.........................: " + cliente.getNome());
        System.out.println("E-MAIL.......................: " + cliente.getEmail());
        System.out.println("CPF..........................: " + cliente.getCpf());
        System.out.println("TELEFONE.....................: " + cliente.getTelefone());
        System.out.println("DATA HORA DO CADASTRO........: " + cliente.getDataHoraCadastro());

        var repo = new ClienteRepositorio();
        repo.exportar(cliente);

    }

}
