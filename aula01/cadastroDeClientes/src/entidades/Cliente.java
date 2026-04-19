package entidades;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Entidade que representa um Cliente
 */
public class Cliente {

    // Atributos da classe
    private UUID id;
    private String nome;
    private String email;
    private String cpf;
    private String telefone;
    private LocalDateTime dataHoraCadastro;

    // Construtor padrão
    public Cliente() {
    }

    // Construtor com parâmetros
    public Cliente(UUID id, String nome, String email, String cpf, String telefone, LocalDateTime dataHoraCadastro) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataHoraCadastro = dataHoraCadastro;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDateTime getDataHoraCadastro() {
        return dataHoraCadastro;
    }

    public void setDataHoraCadastro(LocalDateTime dataHoraCadastro) {
        this.dataHoraCadastro = dataHoraCadastro;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", cpf='" + cpf + '\'' +
                ", telefone='" + telefone + '\'' +
                ", dataHoraCadastro=" + dataHoraCadastro +
                '}';
    }
}
