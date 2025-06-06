package br.com.gs.firetracker.entities;

import jakarta.persistence.*;
        import jakarta.validation.constraints.*;
        import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "EQUIPE")
@Getter
@Setter
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_EQUIPE")
    private Integer id;

    @NotBlank(message = "O campo nome é obrigatório.")
    @Size(max = 100, message = "O campo nome deve ter no máximo 100 caracteres.")
    @Column(name = "NOME" , nullable = false, length = 100)
    private String nome;

    @NotNull(message = "A variável idade deve ser preenchida.")
    @Column(name = "idade", nullable = false)
    private Integer idade;

    @NotBlank(message = "O campo setor é obrigatório.")
    @Size(max = 200, message = "O campo nome deve ter no máximo 200 caracteres.")
    @Column(name = "SETOR" , nullable = false, length = 200)
    private String setor;

    @Column(name = "DISPONIVEL")
    private boolean disponivel = true;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public @NotBlank(message = "O campo nome é obrigatório.") @Size(max = 100, message = "O campo nome deve ter no máximo 100 caracteres.") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "O campo nome é obrigatório.") @Size(max = 100, message = "O campo nome deve ter no máximo 100 caracteres.") String nome) {
        this.nome = nome;
    }

    public @NotNull(message = "A variável idade deve ser preenchida.") Integer getIdade() {
        return idade;
    }

    public void setIdade(@NotNull(message = "A variável idade deve ser preenchida.") Integer idade) {
        this.idade = idade;
    }

    public @NotBlank(message = "O campo setor é obrigatório.") @Size(max = 200, message = "O campo nome deve ter no máximo 200 caracteres.") String getSetor() {
        return setor;
    }

    public void setSetor(@NotBlank(message = "O campo setor é obrigatório.") @Size(max = 200, message = "O campo nome deve ter no máximo 200 caracteres.") String setor) {
        this.setor = setor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
