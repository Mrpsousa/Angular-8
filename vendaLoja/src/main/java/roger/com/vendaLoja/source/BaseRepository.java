package roger.com.vendaLoja.source;

import java.io.Serializable;
import roger.com.vendaLoja.source.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseRepository <T extends BaseEntity> extends JpaRepository <T, Long>{

}
