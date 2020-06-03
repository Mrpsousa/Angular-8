package spring.com.vendasroger.domain.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.com.vendasroger.domain.dto.ProdutoDTO;
import spring.com.vendasroger.domain.entity.Produto;
import spring.com.vendasroger.domain.resouce.BaseController;
import spring.com.vendasroger.domain.service.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoController extends BaseController<Produto, ProdutoDTO, ProdutoService> {
}
