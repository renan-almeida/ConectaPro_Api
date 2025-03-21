package com.perseus.conectapro.Repository;


import com.perseus.conectapro.Entity.EmpresaCliente;
import com.perseus.conectapro.Entity.Prestador;
import com.perseus.conectapro.Entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}

