package roger.com.vendaLoja.entity;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;
import roger.com.vendaLoja.source.BaseEntity;

@Setter
@Getter
public class ItemPedido extends BaseEntity{

	@Column(name = "produto_id", nullable=false)
	private Long produtoId;
	
	@Column(name = "pedido_id", nullable=false)
	private Long pedidoId;
	
	private BigDecimal quantidade;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "produto_id", referencedColumnName = "id", insertable=false, updatable=false)
	private Produto produto;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "pedido_id", referencedColumnName = "id", insertable=false, updatable=false)
	private Pedido pedido;
	
}
