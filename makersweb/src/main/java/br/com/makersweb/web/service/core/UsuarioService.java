/**
 * 
 */
package br.com.makersweb.web.service.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.makersweb.web.entity.Usuario;
import br.com.makersweb.web.repository.IBaseRepository;
import br.com.makersweb.web.repository.IUsuarioRepository;
import br.com.makersweb.web.service.exception.BusinessException;

/**
 *
 * @author anderson.aristides
 *
 */
@Service
@Transactional
public class UsuarioService extends BaseService<Usuario> {

	@Autowired
	private IUsuarioRepository usuarioRepository;

	public UsuarioService() {
		super(Usuario.class);
	}

	@Override
	protected IBaseRepository<Usuario> getRepository() {
		return usuarioRepository;
	}

	@Override
	protected void verificaExistencia(Usuario entity) throws BusinessException {
		buscar(entity.getId());
	}

}
