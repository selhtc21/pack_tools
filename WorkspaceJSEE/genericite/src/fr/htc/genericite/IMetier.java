package fr.htc.genericite;

import java.util.List;

public interface IMetier<T,U> {
	public T save(T o);
	public List<T> getAll();
	public T findOne(U id); 
	

}
