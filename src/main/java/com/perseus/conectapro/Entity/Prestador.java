package com.perseus.conectapro.Entity;

import com.perseus.conectapro.Entity.Enuns.PlanoEnum;
import com.perseus.conectapro.Entity.Enuns.StatusDisponibilidadeEnum;
import com.perseus.conectapro.Entity.Enuns.TipoCategoriaEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Entity
@Getter
@Setter
public class Prestador extends Usuario {
    @Column(name = "DESC_PRESTADOR")
    private String descPrestador;

    @Column(name = "CPF")
    private String cpf;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "ESPECIALIDADES", joinColumns = @JoinColumn(name = "ID_USUARIO"))
    @Column(name = "ESPECIALIDADE")
    private List<String> especialidades;

    @Enumerated(EnumType.STRING)
    @Column(name = "STATUS_DISPONIBILIDADE")
    private StatusDisponibilidadeEnum statusDisponibilidade;

    @ElementCollection(fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "TIPO_CATEGORIA", joinColumns = @JoinColumn(name = "ID_USUARIO"))
    @Column(name = "TIPO_CATEGORIA")
    private List<TipoCategoriaEnum> tipoCategoria;


    @Enumerated(EnumType.STRING)
    @Column(name = "PLANO")
    private PlanoEnum planoEnum;

    @OneToMany(mappedBy = "idPrestador")
    private List<Avaliacao> avaliacoes;

    @OneToMany(mappedBy = "idPrestador")
    private List<SolicitacaoServico> solicitacaoServicos;

    @OneToMany(mappedBy = "idPrestador")
    private List<Servico> servicos;

    @PrePersist
    @PreUpdate
    public void formatarCpf() {
        if (cpf != null) {
            cpf = cpf.replaceAll("\\D", ""); // Remove tudo que não for número

            if (cpf.length() != 11) {
                throw new IllegalArgumentException("CPF deve conter exatamente 11 dígitos numéricos.");
            }

            cpf = cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9, 11);
        }
    }

}

