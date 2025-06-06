package br.com.gs.firetracker.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "CHAMADO")
@Getter
@Setter
public class Chamado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CHAMADO")
    private Integer id;

    @NotBlank(message = "O campo nome é obrigatório.")
    @Size(max = 100, message = "O campo nome deve ter no máximo 100 caracteres.")
    @Column(name = "LOCAL" , nullable = false, length = 100)
    private String local;

    @NotNull(message = "A variável severidade deve ser preenchida.")
    @Column(name = "SEVERIDADE", nullable = false)
    private Integer severidade;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATA_CRIACAO", nullable = false, updatable = false)
    private Date dataCriacao;

    @Column(name = "PROCESSADO")
    private boolean processado = false;

    @NotBlank(message = "O campo status é obrigatório.")
    @Column(name = "STATUS" , nullable = false)
    private String status = "Aberto";

    @Column(name = "ID_EQUIPE")
    private Integer idEquipe;


    @PrePersist
    protected void aoCriar() {
        this.dataCriacao = new Date();
    }

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

    public @NotNull(message = "A variável severidade deve ser preenchida.") Integer getSeveridade() {
        return severidade;
    }

    public void setSeveridade(@NotNull(message = "A variável severidade deve ser preenchida.") Integer severidade) {
        this.severidade = severidade;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public boolean isProcessado() {
        return processado;
    }

    public void setProcessado(boolean processado) {
        this.processado = processado;
    }

    public @NotBlank(message = "O campo status é obrigatório.") String getStatus() {
        return status;
    }

    public void setStatus(@NotBlank(message = "O campo status é obrigatório.") String status) {
        this.status = status;
    }

    public Integer getIdEquipe() {
        return idEquipe;
    }

    public void setIdEquipe(Integer idEquipe) {
        this.idEquipe = idEquipe;
    }
}
