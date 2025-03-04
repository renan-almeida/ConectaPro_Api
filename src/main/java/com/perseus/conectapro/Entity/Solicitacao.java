package com.perseus.conectapro.Entity;

import com.perseus.conectapro.Entity.Enuns.TipoSegmentoEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.awt.image.BufferedImage;
import java.text.DateFormat;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "SOLICITACAO")
public class Solicitacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SOLICITACAO")
    private Long id;

    @Column(name = "DESCRICAO")
    private String descricao;

    @Column(name = "FOTO")
    private BufferedImage foto;

    @OneToMany
    @JoinColumn(name = "CATEGORIA")
    private List<TipoSegmentoEnum> categoria;

    //private NvlUrgenciaEnum nvlUrgencia; - NvlUrgenciaEnum ainda não existe
    @Column(name = "DATA_PUBLICACAO")
    private DateFormat dataPub;

    @Column(name = "LOCALIDADE")
    private String localidade;

    @Column(name = "VALOR_PROPOSTO")
    private double valorProposto;

    @Column(name = "VISUALIZACOES")
    private Long visualizacoes;

    @Column(name = "CURTIDAS")
    private Long curtidas;

    @Column(name = "COMENTARIOS")
    private String comentarios;

    @Column(name = "COMPARTILHAMENTO")
    private Long compartilhamento;

    @OneToMany
    @JoinColumn(name = "PESSOA")
    private Usuario idPessoa;
}
