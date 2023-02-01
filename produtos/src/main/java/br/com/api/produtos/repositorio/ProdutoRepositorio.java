package br.com.api.produtos.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.api.produtos.modelo.ProdutoModelo;

// O GOOGLE DIZ QUE NÃO PRECISA USAR ISSO EM CLASSES QUE ESTENDEM DE JPA
@Repository
public interface ProdutoRepositorio extends CrudRepository<ProdutoModelo, Long>{

    
}
