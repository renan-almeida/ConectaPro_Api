package com.perseus.conectapro.DTO;

import com.perseus.conectapro.Entity.Enuns.PlanoEnum;
import com.perseus.conectapro.Entity.Enuns.StatusDisponibilidadeEnum;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class PrestadorUpdateDTO extends UsuarioUpdateDTO {

    private String cpf;
    //ID do segmento
    private List<Long> segmento;
    private String descPrestador;
    private List<String> especialidades;
    private StatusDisponibilidadeEnum statusDisponibilidade;
    private LocalDate dataNascimento;
    private PlanoEnum plano;

}
