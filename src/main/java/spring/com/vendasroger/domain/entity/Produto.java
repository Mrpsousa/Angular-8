package spring.com.vendasroger.domain.entity;

import java.time.LocalDateTime;

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

	@Column(name = "nome_produto")
	private String nome;
	
	@Column(name = "descricao")
	private String descricao;

	
}
