package roger.com.vendaLoja.service;

import org.springframework.stereotype.Service;

import roger.com.vendaLoja.dto.ProdutoDTO;
import roger.com.vendaLoja.entity.Produto;
import roger.com.vendaLoja.source.BaseService;

@Service
public class ProdutoService extends BaseService<Produto, ProdutoDTO> {

}
