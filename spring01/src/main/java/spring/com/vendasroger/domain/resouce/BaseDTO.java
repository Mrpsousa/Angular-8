package spring.com.vendasroger.domain.resouce;

public interface BaseDTO<E extends BaseEntity> {
	public E getEntity();
}
