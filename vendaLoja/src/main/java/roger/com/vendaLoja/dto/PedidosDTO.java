package roger.com.vendaLoja.dto;

import java.math.BigDecimal;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PedidosDTO {
	
	private Long cliente;
	private BigDecimal total;
	private List<ItemPedidosDTO> itens;
		

}
