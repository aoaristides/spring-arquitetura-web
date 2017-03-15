/**
 * 
 */
package br.com.makersweb.web.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.makersweb.web.entity.Perfil;
import br.com.makersweb.web.service.core.BaseService;
import br.com.makersweb.web.service.core.PerfilService;

/**
 *
 * @author anderson.aristides
 *
 */
@RestController
@RequestMapping("${makersweb.url.base.api}/perfis")
public class PerfilResource extends BaseResource<Perfil> {

	@Autowired
	private PerfilService perfilService;

	public PerfilResource() {
		super(Perfil.class);
	}

	@Override
	protected BaseService<Perfil> getService() {
		return perfilService;
	}
}
