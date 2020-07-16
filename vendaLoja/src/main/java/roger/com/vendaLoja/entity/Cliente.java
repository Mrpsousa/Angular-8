package roger.com.vendaLoja.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;
import roger.com.vendaLoja.source.BaseEntity;


@Entity
@Setter
@Getter
@Table(name = "cliente")
public class Cliente extends BaseEntity {

		@NotNull(message = "Campo 'nome' é obrigatório.")
	    private String nome;
	 
}
