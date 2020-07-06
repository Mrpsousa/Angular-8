package roger.com.vendaLoja.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import roger.com.vendaLoja.entity.Cliente;
import roger.com.vendaLoja.source.BaseController;
import roger.com.vendaLoja.source.BaseService;

@RestController
@RequestMapping("/cliente")
public class ClienteController extends BaseController<Cliente, BaseService<Cliente>> {

}
