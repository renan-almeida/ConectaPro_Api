package com.perseus.conectapro.Entity;

import com.perseus.conectapro.Entity.Enuns.Plano;
import com.perseus.conectapro.Entity.Enuns.StatusDisponibilidadeEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Prestador extends Usuario {
    @Column(name = "DESC_PRESTADOR")
    public String descPrestador;

    @ElementCollection
    @CollectionTable(name = "ESPECIALIDADES", joinColumns = @JoinColumn(name = "ID_USUARIO"))
    @Column(name = "ESPECIALIDADE")
    public List<String> especialidades;

    @Enumerated(EnumType.STRING)
    @Column(name = "STATUS_DISPONIBILIDADE")
    public StatusDisponibilidadeEnum statusDisponibilidade;

    @Enumerated(EnumType.STRING) // Armazena o valor como string no banco
    @Column(name = "PLANO")
    public Plano plano;
}

