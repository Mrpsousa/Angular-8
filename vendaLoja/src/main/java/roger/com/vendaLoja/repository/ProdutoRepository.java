package roger.com.vendaLoja.repository;

import org.springframework.stereotype.Repository;

import roger.com.vendaLoja.entity.Produto;
import roger.com.vendaLoja.source.BaseRepository;

@Repository
public interface ProdutoRepository extends BaseRepository<Produto> {

}
