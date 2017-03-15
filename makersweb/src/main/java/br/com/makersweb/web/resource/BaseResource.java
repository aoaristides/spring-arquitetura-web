/**
 * 
 */
package br.com.makersweb.web.resource;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.makersweb.web.entity.DefaultEntity;
import br.com.makersweb.web.service.core.BaseService;
import br.com.makersweb.web.service.exception.BusinessException;

/**
 *
 * @author anderson.aristides
 *
 */
@RestController
public abstract class BaseResource<T extends DefaultEntity> {
	
	private Logger logger;
	
	private Class<T> currentClass;

	public BaseResource(Class<T> currentClass) {
		super();
		this.currentClass = currentClass;
		this.logger = LogManager.getLogger(this.getClass());
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<T> listar() {
		getLogger().info("Iniciou Metodo listar " + currentClass.getSimpleName() + "...");
		
		return getService().listar();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public T buscar(@PathVariable Long id) {
		getLogger().info("Iniciou Metodo buscar " + currentClass.getSimpleName() + "...");
		
		return getService().buscar(id);
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public T salvar(@Validated @RequestBody T object) {
		getLogger().info("Iniciou Metodo salvar " + currentClass.getSimpleName() + "...");
		
		T result = null;
		try {
			result = getService().salvar(object);
		} catch (DataIntegrityViolationException di) {
			getLogger().warn("Tentando inserir um dado duplicado: " + di.getMessage());
			throw new BusinessException(di, object);
		} catch (Exception e) {
			getLogger().error("Erro ao gravar objeto: ", e);
			throw new BusinessException(e, object);
		}

		return result;
	}
	
	@RequestMapping(value = "", method = RequestMethod.PUT)
	public T alterar(@Validated @RequestBody T object) {
		getLogger().info("Iniciou Metodo alterar " + currentClass.getSimpleName() + "...");
		
		T result = null;
		try {
			result = getService().alterar(object);
		} catch (Exception e) {
			getLogger().error("Erro ao atualizar objeto: ", e);
			throw new BusinessException(e, object);
		}
		
		return result;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deletar(@PathVariable Long id) {
		getLogger().info("Iniciou Metodo deletar " + currentClass.getSimpleName() + "...");
		
		getService().deletar(id);
	}
	
	protected abstract BaseService<T> getService();

	public Logger getLogger() {
		return logger;
	}

}
