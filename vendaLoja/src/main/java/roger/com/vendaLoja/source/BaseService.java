package roger.com.vendaLoja.source;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class BaseService<E extends BaseEntity> {
	
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
   
    
    public E save(E persisted) {
    	persisted.setCreatedAt(LocalDateTime.now());
		repository.save(persisted);
		return persisted;
	}
    
    
    public E upadate(long id, E newEntity) {
		Optional<E> oldEntity = repository.findById(id);
		if(oldEntity.isPresent()) {
			E auxEntity =  oldEntity.get();
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
