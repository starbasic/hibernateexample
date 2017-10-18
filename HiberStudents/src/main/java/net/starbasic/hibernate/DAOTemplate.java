package net.starbasic.hibernate;

import java.util.Collection;

public interface DAOTemplate<T> {

	public Collection<T> values();

	public int add(final T user);

	public void edit(final T user);

	public void delete(final int id);

	public T get(final int id);

	public T findByName(final String name) ;

	public void close();
   
}
