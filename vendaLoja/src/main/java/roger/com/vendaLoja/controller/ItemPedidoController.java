  
package roger.com.vendaLoja.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import roger.com.vendaLoja.dto.ItemPedidoDTO;
import roger.com.vendaLoja.entity.ItemPedido;
import roger.com.vendaLoja.source.BaseController;
import roger.com.vendaLoja.source.BaseService;

@RestController
@RequestMapping("/itemPedido")
public class ItemPedidoController extends BaseController<ItemPedido,ItemPedidoDTO, BaseService<ItemPedido,ItemPedidoDTO>> {

}