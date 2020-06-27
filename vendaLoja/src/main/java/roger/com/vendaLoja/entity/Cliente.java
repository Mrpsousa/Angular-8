package roger.com.vendaLoja.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import roger.com.vendaLoja.source.BaseEntity;


@Entity
@Setter
@Getter
@Table(name = "cliente")
public class Cliente extends BaseEntity {

	@Column(name="nome")
	private String nome;

}


