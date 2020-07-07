package roger.com.vendaLoja.entity;

import java.math.BigDecimal;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PedidoDTO {
	
	private Long cliente;
	private BigDecimal total;
	private List<ItemPedidoDTO> itens;
		

}
