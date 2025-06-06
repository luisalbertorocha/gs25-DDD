package br.com.gs.firetracker.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "ALERTA")
@Getter
@Setter
public class Alerta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CHAMADO")
    private Integer id;

    @NotBlank(message = "O campo nome é obrigatório.")
    @Size(max = 100, message = "O campo nome deve ter no máximo 100 caracteres.")
    @Column(name = "LOCAL" , nullable = false, length = 100)
    private String local;

    @Column(name = "MENSAGEM" , nullable = false)
    private String mensagem;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public @NotBlank(message = "O campo nome é obrigatório.") @Size(max = 100, message = "O campo nome deve ter no máximo 100 caracteres.") String getLocal() {
        return local;
    }

    public void setLocal(@NotBlank(message = "O campo nome é obrigatório.") @Size(max = 100, message = "O campo nome deve ter no máximo 100 caracteres.") String local) {
        this.local = local;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
