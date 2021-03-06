package br.ufes.inf.nemo.marvin.core.persistence;

import br.ufes.inf.nemo.jbutler.ejb.persistence.BaseDAO;
import br.ufes.inf.nemo.jbutler.ejb.persistence.exceptions.MultiplePersistentObjectsFoundException;
import br.ufes.inf.nemo.jbutler.ejb.persistence.exceptions.PersistentObjectNotFoundException;
import br.ufes.inf.nemo.marvin.core.domain.User;

public interface UserDAO extends BaseDAO<User> {

	User retrieveByEmail(String email)
			throws PersistentObjectNotFoundException, MultiplePersistentObjectsFoundException;

}
