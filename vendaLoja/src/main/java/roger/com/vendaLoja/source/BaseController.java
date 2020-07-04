package roger.com.vendaLoja.source;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;



@RestController
public class BaseController<E extends BaseEntity, S extends BaseService<E>> {
	
	@Autowired
	protected S service;
	 
	@GetMapping("{id}")
	public E getOneById(@PathVariable Long id) {
		try {
			return service.getOne(id);	
		} catch (Exception ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Cliente não atualizado,erro:"+ ex);
		}
	}
	
	@GetMapping
	public List<E> getAll() {
		try {
			return service.getAll();
		} catch (Exception ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Cliente não atualizado,erro:"+ ex);
		}
	}
	
		
		
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public E save(E entity) {
		try {
			return service.save(entity);
		} catch (Exception ex) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Cliente não atualizado,erro:"+ ex);
		}
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		try {
			 service.delete(id);	
		} catch (Exception ex) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Cliente não atualizado,erro:"+ ex);
		}
	}
	
	@PutMapping("{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void update(@PathVariable Long id,  @RequestBody  E entity) {
		try {
			 service.upadate(id, entity);	
		} catch (Exception ex) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Cliente não atualizado,erro:"+ ex);
		}
	}
	
}
