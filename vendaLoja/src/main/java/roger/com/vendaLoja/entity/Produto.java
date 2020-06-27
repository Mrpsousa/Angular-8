package roger.com.vendaLoja.entity;

import java.math.BigDecimal;

import javax.persistence.Column;

import lombok.Getter;
import lombok.Setter;
import roger.com.vendaLoja.source.BaseEntity;

@Setter
@Getter
public class Produto extends BaseEntity{

	private String descricao;
	
	@Column(name="preco_unitario")
	private BigDecimal precoUnitario;
}
