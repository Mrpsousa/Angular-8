package roger.com.vendaLoja.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;
import roger.com.vendaLoja.source.BaseEntity;

@Setter
@Getter
public class Pedido extends BaseEntity{

	@Column(name = "cliente_id", nullable=false)
	private Long clienteId;
	
	@Column(name = "data_pedido", nullable=false)
	private LocalDate dataPedido;
	
	private BigDecimal total;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "cliente_id", referencedColumnName = "id", insertable=false, updatable=false)
	private Cliente cliente;
	
}
