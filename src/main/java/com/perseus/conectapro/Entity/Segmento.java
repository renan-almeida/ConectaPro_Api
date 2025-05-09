package com.perseus.conectapro.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "TBL_SEGMENTO")
public class Segmento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SEGMENTO")
    private int idSegmento;

    @Column(name = "DESC_SEGMENTO")
    private String descSegmento;
}
