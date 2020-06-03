package spring.com.vendasroger.domain.dto;


import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import spring.com.vendasroger.domain.entity.Clientes;
import spring.com.vendasroger.domain.entity.Produto;
import spring.com.vendasroger.domain.resouce.BaseDTO;

@Getter
@Setter
public class ProdutoDTO implements BaseDTO<Produto> {


	private String nome;
	
	private String descricao;
	
	
	@Override
	public Produto getEntity() {
		Produto produto = new Produto();
		produto.setNome(nome);
		produto.setDescricao(descricao);
		
		return produto;
	}	
}
