package spring.com.vendasroger.domain.dto;


import java.math.BigDecimal;


import lombok.Getter;
import lombok.Setter;
import spring.com.vendasroger.domain.entity.Produto;
import spring.com.vendasroger.domain.resouce.BaseDTO;

@Getter
@Setter
public class ProdutoDTO implements BaseDTO<Produto> {


	private String nome;
	
	private String descricao;
	
	private String categoria;
	
	private BigDecimal valor;
	
	@Override
	public Produto getEntity() {
		Produto produto = new Produto();
		produto.setNome(nome);
		produto.setDescricao(descricao);
		produto.setCategoria(categoria);
		produto.setValor(valor);
		
		return produto;
	}	
}
