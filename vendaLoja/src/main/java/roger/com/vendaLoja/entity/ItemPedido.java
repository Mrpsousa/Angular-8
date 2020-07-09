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

	   @ManyToOne
	    @JoinColumn(name = "pedido_id")
	    private Pedido pedido;

	    @ManyToOne
	    @JoinColumn(name = "produto_id")
	    private Produto produto;

	    @Column
	    private Long quantidade;
	
}