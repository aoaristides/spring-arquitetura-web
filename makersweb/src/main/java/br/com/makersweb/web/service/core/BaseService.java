/**
 * 
 */
package br.com.makersweb.web.service.core;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import br.com.makersweb.web.entity.DefaultEntity;
import br.com.makersweb.web.message.MakersWebMessage;
import br.com.makersweb.web.repository.IBaseRepository;
import br.com.makersweb.web.service.exception.BusinessException;

/**
 *
 * @author anderson.aristides
 *
 */
public abstract class BaseService<T extends DefaultEntity> {

	@Autowired
	private MessageSource messageSource;

	private Class<T> currentClass;

	/**
	 * @param currentClass
	 */
	public BaseService(Class<T> currentClass) {
		super();
		this.currentClass = currentClass;
	}

	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public T buscar(Long id) throws BusinessException {

		if (ObjectUtils.isEmpty(id)) {
			throw new BusinessException(
					new MakersWebMessage(messageSource).message("br.com.raticket.text.campos.obrigatorio"));
		}

		T result = getRepository().findOne(id);

		if (ObjectUtils.isEmpty(result)) {
			throw new BusinessException(new MakersWebMessage(messageSource)
					.message("br.com.raticket.text.nao.encontrado", currentClass.getCanonicalName()));
		}

		return result;
	}

	public void deletar(Long id) throws BusinessException {
		T object = buscar(id);

		if (ObjectUtils.isEmpty(object)) {
			throw new BusinessException(new MakersWebMessage(messageSource)
					.message("br.com.raticket.text.nao.encontrado", currentClass.getSimpleName()));
		}

		getRepository().delete(id);
	}

	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public List<T> listar() throws BusinessException {
		List<T> results = getRepository().findAll();

		if (CollectionUtils.isEmpty(results)) {
			throw new BusinessException(new MakersWebMessage(messageSource)
					.message("br.com.raticket.text.nao.encontrado", currentClass.getSimpleName()));
		}

		return results;
	}

	public T salvar(T object) throws BusinessException {
		checkWriteAccess(object);
		prepareToSave(object);

		T saved = getRepository().save(object);
		return saved;
	}

	public T alterar(T object) throws BusinessException {
		verificaExistencia(object);

		T updated = getRepository().save(object);

		return updated;
	}

	protected abstract IBaseRepository<T> getRepository();

	protected abstract void verificaExistencia(T entity) throws BusinessException;

	protected void checkWriteAccess(T object) {
	}

	protected void prepareToSave(T object) {
	}

}
