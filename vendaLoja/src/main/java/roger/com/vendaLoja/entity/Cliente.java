package roger.com.vendaLoja.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
    		
    @Column(name = "pedido_id", nullable=false)
    private Long pedidoId;
    
    @JsonIgnore
 	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
 	@JoinColumn(name = "pedido_id", referencedColumnName = "id", insertable=false, updatable=false)
 	private Pedido pedido;
}


