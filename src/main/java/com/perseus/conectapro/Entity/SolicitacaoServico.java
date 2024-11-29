package com.perseus.conectapro.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.awt.image.BufferedImage;
import java.text.DateFormat;

@Entity
@Getter
@Setter
@Table(name = "SOLICITACAO_SERVICO")
public class SolicitacaoServico
{
    @Id
    @Column(name = "ID_SOLICITACAO_PRESTADOR")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "ID_PESSOA")
    private Pessoa pessoa;

    @Column(name = "DESCRICAO")
    public String descricao;

    @Column(name = "FOTO ")
    public BufferedImage foto;

    @Column(name = "STATUS")
    public Enum status;

    @Column(name = "CATEGORIA")
    public String categoria;

    @Column(name = "ESPECIALIDADE")
    public String especialidade;

    @Column(name = "LOCALIDADE")
    public String localidade;

    @Column(name = "ATIVIDADE")
    private String atividade;

    @Column(name = "VALOR_PROPOSTO")
    public Double valorProposto;

    @Column(name = "DATA_CRIACAO")
    public DateFormat dataCriacao;

    @Column(name = "DATA_ATUALIZACAO")
    public DateFormat dataAtualizacao;

    @Column(name = "DATA_FINALIZACAO")
    public DateFormat dataFinalizacao;

    @Column(name = "DATA_INICIO_EXECUCAO")
    public DateFormat dataInicioExecucao;

    /*@Column(name = "AVALIACAO_PRESTADOR")
    private AvaliacaoPrestador avaliacaoPrestador; Precisa da classe avaliação prestador*/

    @Column(name = "VISUALIZACAO")
    public int visualizacao;

    @Column(name = "CURTIDAS")
    public int curtidas;

    @Column(name = "COMENTARIO")
    public String comentario;

    @Column(name = "COMPARTILHAMENTO")
    public int compartilhamento;

    @Column(name = "FORMA_PAGTO")
    private Enum formaPagto;

    @Column(name = "PRAZO_EXECUCAO")
    private String prazoExecucao;

    @Column(name = "VALOR_ACORDADO")
    private Double valorAcordado;

    @Column(name = "TAXA_ADM")
    private Double taxaAdm;

}