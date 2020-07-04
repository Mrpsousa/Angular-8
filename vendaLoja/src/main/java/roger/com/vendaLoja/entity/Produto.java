package roger.com.vendaLoja.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import roger.com.vendaLoja.source.BaseEntity;

@Entity
@Setter
@Getter
@Table(name="produto")
public class Produto extends BaseEntity{

	private String descricao;
	
	@Column(name="preco_unitario")
	private BigDecimal precoUnitario;
}
