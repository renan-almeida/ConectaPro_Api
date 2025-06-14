package com.perseus.conectapro.Entity;

import com.perseus.conectapro.Entity.Enuns.FormaPagtoEnum;
import com.perseus.conectapro.Entity.Enuns.NvlSatisfacaoEnum;
import com.perseus.conectapro.Entity.Enuns.NvlUrgenciaEnum;
import com.perseus.conectapro.Entity.Enuns.StatusServicoEnum;
import com.perseus.conectapro.Entity.Enuns.TipoCategoriaEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "TBL_SERVICOS")
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SERVICO")
    private int idServico;

    @OneToOne
    @JoinColumn(name = "ID_PAGAMENTO")
    private Pagamento pagamento;

    @ManyToOne
    @JoinColumn(name = "ID_PRESTADOR")
    private Prestador idPrestador;

    @ManyToOne
    @JoinColumn(name = "ID_EMPRESA_CLIENTE")
    private EmpresaCliente idEmpresaCliente;

    @Column(name = "TITULO_SERVICO")
    private String tituloServico;

    @Column(name = "DESC_SERVICO")
    private String descServico;

    @ManyToOne
    @JoinColumn(name = "ID_SOLICITACAO_SERVICO")
    private SolicitacaoServico solicitacaoServico;

    @Column(name = "VALOR_CONTRATACAO")
    private Float valorContratacao;

    @Column(name = "DATA_INCLUSAO")
    private LocalDateTime dataInclusao;

    @Column(name = "DATA_APROVACAO")
    private LocalDateTime dataAprovacao;

    @Column(name = "DATA_EXECUCAO")
    private LocalDateTime dataExecucao;

    @Column(name = "DATA_FINALIZACAO")
    private LocalDateTime dataFinalizacao;

    @Column(name = "DATA_PAGAMENTO")
    private LocalDateTime dataPagamento;

    @Enumerated(EnumType.STRING)
    @Column(name = "FORMA_PAGTO")
    private FormaPagtoEnum formaPagto;

    @Enumerated(EnumType.STRING)
    @Column(name = "SITUACAO_SERVICO")
    private StatusServicoEnum statusServico;

    @Enumerated(EnumType.STRING)
    @Column(name = "NIVEL_URGENCIA")
    private NvlUrgenciaEnum nvlUrgencia;

    @Enumerated(EnumType.STRING)
    @Column(name = "TIPO_CATEGORIA")
    private TipoCategoriaEnum tipoCategoria;

    @Column(name = "PREVISAO_INICIO")
    private LocalDate previsaoInicio;

    @Column(name = "DURACAO_SERVICO")
    private Integer duracaoServico;

    @Enumerated(EnumType.STRING)
    @Column(name = "NIVEL_SATISFACAO")
    private NvlSatisfacaoEnum nvlSatisfacao;

}
