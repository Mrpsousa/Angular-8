package roger.com.vendaLoja.source;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@MappedSuperclass
public class BaseEntity {
	

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id")
		protected Long id;
		
		@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
		@Column(name = "created_at")
		protected LocalDateTime createdAt;
		
		@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
		@Column(name = "deleted_at")
		protected LocalDateTime deletedAt;



//		public Long getId() {
//			return id;
//		}
//
//		public void setId(Long id) {
//			this.id = id;
//		}
//		public LocalDateTime getCreatedAt() {
//			return createdAt;
//		}
//
//		public void setCreatedAt(LocalDateTime createdAt) {
//			this.createdAt = createdAt;
//		}
//
//		public LocalDateTime getDeletedAt() {
//			return deletedAt;
//		}
//
//		public void setDeletedAt(LocalDateTime deletedAt) {
//			this.deletedAt = deletedAt;
//		}
//
//	}

}
