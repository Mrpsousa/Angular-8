package roger.com.vendaLoja.entity;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import roger.com.vendaLoja.source.BaseEntity;

@Entity
@Setter
@Getter
@Table(name="item_pedido")
public class ItemPedido extends BaseEntity{

	@Column(name = "produto_id", nullable=false)
	private Long produtoId;
	
	@Column(name = "pedido_id", nullable=false)
	private Long pedidoId;
	
	private BigDecimal quantidade;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "produto_id", referencedColumnName = "id", insertable=false, updatable=false)
	private Produto produto;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pedido_id", referencedColumnName = "id", insertable=false, updatable=false)
	private Pedido pedido;
	
}