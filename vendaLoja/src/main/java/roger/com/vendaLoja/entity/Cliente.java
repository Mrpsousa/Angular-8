package roger.com.vendaLoja.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
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
	
	@OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY, targetEntity = Pedido.class) //or EAGER to fetch all @OneToMany or @ManyToMany
	private Set<Pedido> pedidos;
	
	

}


