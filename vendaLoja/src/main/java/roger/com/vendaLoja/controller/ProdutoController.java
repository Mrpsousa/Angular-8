package roger.com.vendaLoja.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import roger.com.vendaLoja.entity.Produto;
import roger.com.vendaLoja.source.BaseController;
import roger.com.vendaLoja.source.BaseService;

@RequestMapping("/produto")
public class ProdutoController extends BaseController<Produto, BaseService<Produto>> {

}
