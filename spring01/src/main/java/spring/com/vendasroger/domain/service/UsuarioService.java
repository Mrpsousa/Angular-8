package spring.com.vendasroger.domain.service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import spring.com.vendasroger.domain.dto.UsuarioDTO;
import spring.com.vendasroger.domain.entity.Usuario;
import spring.com.vendasroger.domain.resouce.BaseService;

@Service
public class UsuarioService extends BaseService<Usuario, UsuarioDTO>{
	
	public Usuario getUsuario(String username) {
			List<Usuario> optional =  repository.findAll();
			
			Optional.ofNullable(optional)
	        .orElse(Collections.emptyList())
	        .forEach(e -> {
	        	
	        });
	       
//		
//		if(optional.isPresent()) {
//			return optional.get();
//		}
		return null;

	}
}
