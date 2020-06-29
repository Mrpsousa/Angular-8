package roger.com.vendaLoja.source;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseRepository <T extends BaseEntity> extends JpaRepository <T, Long>{

}
