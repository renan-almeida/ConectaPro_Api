package com.perseus.conectapro.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.service.annotation.GetExchange;

@Entity
@Getter
@Setter
@Table(name = "TBL_PLANO")
public class Plano {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PLANO")
    public int idPlano;  //identificador

    @Column(name = "DESC_PLANO")
    public String descPlano; // descricao ou nome do plano

    @Column(name = "VALOR_FIXO_PLANO")
    public float valorFixoPlano; //valor fixo do plano

    @Column(name = "PERCENTUAL_PLANO")
    public float percentualPlano; //percentual sobre valor de comissionamento do plano
}