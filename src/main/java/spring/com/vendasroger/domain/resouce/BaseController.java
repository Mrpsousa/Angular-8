package spring.com.vendasroger.domain.resouce;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;


public class BaseController <E extends BaseEntity, D extends BaseDTO<E>, S extends BaseService<E, D> > {

	@Autowired
	private S service;
	
	  @GetMapping
		public Page<E> index(@PageableDefault Pageable pageable, E filter){
			return service.findAll(pageable, filter);	
		}
	  
	 @PutMapping(value = "{id}")
	 public ResponseEntity<E> update( @PathVariable(value = "id") Long id, @RequestBody @Valid D dto) {
		E entity = service.update(id, dto);
		if(entity != null) {
			return ResponseEntity.ok(entity);
		}
		throw new ResponseStatusException(HttpStatus.NOT_FOUND);
	 }	  
	 
	 @GetMapping(value = "{id}")
		public ResponseEntity<E> show(@PathVariable(value = "id") Long id) {
			E entity = service.getOne(id);
			if(entity != null) {
				return ResponseEntity.ok(entity);
			}
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
	  
	 @DeleteMapping(value = "{id}")
		@Transactional
		public void  delete(@PathVariable(value = "id") Long id) {
			service.destroy(id); 
			
		}
}
