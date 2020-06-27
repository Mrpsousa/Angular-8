package spring.com.vendasroger.domain.resouce;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;



public interface BaseRepository <T extends BaseEntity> extends JpaRepository <T, Serializable> {

		
}
