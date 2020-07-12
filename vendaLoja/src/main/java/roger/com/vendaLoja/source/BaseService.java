package roger.com.vendaLoja.source;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class BaseService<E extends BaseEntity, D extends BaseDTO<E>> {
	
	@Autowired
	private BaseRepository<E> repository;

 
    public E getOne(Long id){
		Optional<E> optional = repository.findById(id);
		if(optional.isPresent()) {
			 return optional.get();
		}
		return null;
    }
     
    
    public List<E> getAll(){
		return repository.findAll();
	}
   
    
    public E store(D dto) {
  		E entity = dto.getEntity();
  		entity.setCreatedAt(LocalDateTime.now());
  		repository.save(entity);
  		return entity;
  	}
    
    //olhar com calma depois
    public E upadate(long id, D dto ) {
		Optional<E> oldEntity = repository.findById(id);
		
		if(oldEntity.isPresent()) {
			E auxEntity =  oldEntity.get();
			E newEntity = dto.getEntity();
			newEntity.setId(id);
			newEntity.setCreatedAt(auxEntity.getCreatedAt());
			auxEntity = repository.save(newEntity);
			return auxEntity;
		}
		return null;	
	}
    
    
	void delete(long id) {
		Optional<E> entity = repository.findById(id);;
		if(entity.isPresent())
			repository.deleteById(id);
	}
}
