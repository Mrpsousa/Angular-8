package roger.com.vendaLoja.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import roger.com.vendaLoja.source.BaseEntity;

@Entity
@Setter
@Getter
@Table(name="pedido")
public class Pedido extends BaseEntity{

	@Column(name = "cliente_id", nullable=false)
	private Long clienteId;
	
	@Column(name = "produto_id", nullable=false)
	private Long produtoId;
	
	@Column(name = "data_pedido", nullable=false)
	private LocalDate dataPedido;
	
	private BigDecimal total;

	
}