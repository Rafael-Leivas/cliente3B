package br.senai.repository;

import br.senai.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    public Cliente findByCpf(String cpf);
    public Cliente findByEmail(String email);
    public Cliente findByAndEmail(String cpf, String email);
    public List<Cliente> findByEmailLike(String email);

}
