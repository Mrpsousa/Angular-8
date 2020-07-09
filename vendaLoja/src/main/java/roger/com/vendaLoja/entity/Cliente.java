package roger.com.vendaLoja.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;
import roger.com.vendaLoja.source.BaseEntity;


@Entity
@Setter
@Getter
@Table(name = "cliente")
public class Cliente extends BaseEntity {

	    @Column(name = "nome", length = 100)
	    private String nome;

	    @JsonIgnore
	    @OneToMany( mappedBy = "cliente" , fetch = FetchType.LAZY )
	    private Set<Pedido> pedidos;

	 
}
