package com.perseus.conectapro.Repository;

import com.perseus.conectapro.Entity.EmpresaCliente;
import com.perseus.conectapro.Entity.Prestador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpresaClienteRepository extends JpaRepository<EmpresaCliente, Integer> {

    List<EmpresaCliente> findByNome(String nome);

    /*
    List<EmpresaCliente> findBySegmentoContaining(String segmento);
     */
}
