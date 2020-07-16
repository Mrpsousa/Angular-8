package roger.com.vendaLoja.source;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;



public class BaseController<E extends BaseEntity, D extends BaseDTO<E>, S extends BaseService<E, D>> {
	
	@Autowired
	protected S service;
	 
	@GetMapping("/{id}")
	public E getOneById(@PathVariable Long id) {
		try {
			return service.getOne(id);	
		} catch (Exception ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Entity não encontrada");
			
		}
		//return service.getOne(id);	
	}
	
	@GetMapping
	public List<E> getAll() {
		try {
			return service.getAll();
		} catch (Exception ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Entities não encontradas");
		}
	}
	
		
		
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public E save(@RequestBody @Valid D dto ) {
		try { 
			E entity = service.store(dto);
			return entity;
		} catch (Exception ex) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Entity não salva");
		}
		
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void delete(@PathVariable Long id) {
		try {
			 service.delete(id);	
		} catch (Exception ex) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Entity não deletada");
		}
	}
	
	@PutMapping("{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public E update(@PathVariable Long id,  @RequestBody  D dto) {
		try {
			return service.upadate(id, dto);	
		} catch (Exception ex) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Entity não atualizada");
		}
	}
	
}
