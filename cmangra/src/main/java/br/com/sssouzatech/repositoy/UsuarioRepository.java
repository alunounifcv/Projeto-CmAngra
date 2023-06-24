package br.com.sssouzatech.repositoy;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.sssouzatech.model.Usuario;

@Repository
public interface UsuarioRepository  extends CrudRepository<Usuario, Long>{

}
