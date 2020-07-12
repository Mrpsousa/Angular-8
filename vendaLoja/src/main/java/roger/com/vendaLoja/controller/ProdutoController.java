package roger.com.vendaLoja.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import roger.com.vendaLoja.dto.ProdutoDTO;
import roger.com.vendaLoja.entity.Produto;
import roger.com.vendaLoja.source.BaseController;
import roger.com.vendaLoja.source.BaseService;

@RestController
@RequestMapping("/produto")
public class ProdutoController extends BaseController<Produto, ProdutoDTO, BaseService<Produto,ProdutoDTO>> {

}
