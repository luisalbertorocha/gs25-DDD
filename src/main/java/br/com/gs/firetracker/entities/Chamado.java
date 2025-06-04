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

    @NotNull(message = "A variável dataCriacao deve ser informada.")
    @PastOrPresent(message = "A variável dataCriacao está inválida.")
    @Column(name = "DATA_CRIACAO", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;
}
