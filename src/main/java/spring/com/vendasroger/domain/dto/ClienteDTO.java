package spring.com.vendasroger.domain.dto;


import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import spring.com.vendasroger.domain.entity.Clientes;
import spring.com.vendasroger.domain.resouce.BaseDTO;

@Getter
@Setter
public class ClienteDTO implements BaseDTO<Clientes> {


	private String nome;
	
	private String cpf;
	
	private String rg;
	
	private LocalDateTime data_nasc;
	
	@Override
	public Clientes getEntity() {
		Clientes cliente = new Clientes();
		cliente.setNome(nome);
		cliente.setCpf(cpf);
		cliente.setRg(rg);
		cliente.setData_nasc(data_nasc);
		
		return cliente;
	}	
}
