package spring.com.vendasroger.domain.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import spring.com.vendasroger.domain.resouce.BaseEntity;

@Entity
@Getter
@Setter
@Table(name = "produto")
public class Produto extends BaseEntity {

	@Column(name = "nome")
	private String nome;
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "categoria")
	private String categoria;
	
	@Column(name = "valor")
	private BigDecimal valor;
	
	
}
