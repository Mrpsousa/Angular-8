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
@Table(name = "cliente")
public class Clientes extends BaseEntity {

	@Column(name = "nome")
	private String nome;
	
	@Column(name = "cpf")
	private String cpf;
	
	@Column(name = "rg")
	private String rg;
	
	@Column(name = "data_nasc")
	private LocalDateTime data_nasc;

	
}
