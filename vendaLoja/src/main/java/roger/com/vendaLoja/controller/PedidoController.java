package roger.com.vendaLoja.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import roger.com.vendaLoja.entity.Pedido;
import roger.com.vendaLoja.source.BaseController;
import roger.com.vendaLoja.source.BaseService;

@RequestMapping("/pedido")
public class PedidoController extends BaseController<Pedido, BaseService<Pedido>> {

}
