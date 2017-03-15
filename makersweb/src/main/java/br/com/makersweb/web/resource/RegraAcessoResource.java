/**
 * 
 */
package br.com.makersweb.web.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.makersweb.web.entity.RegraAcesso;
import br.com.makersweb.web.service.core.BaseService;
import br.com.makersweb.web.service.core.RegraAcessoService;

/**
 *
 * @author anderson.aristides
 *
 */
@RestController
@RequestMapping("${makersweb.url.base.api}/regras")
public class RegraAcessoResource extends BaseResource<RegraAcesso> {

	@Autowired
	private RegraAcessoService regraService;

	public RegraAcessoResource() {
		super(RegraAcesso.class);
	}

	@Override
	protected BaseService<RegraAcesso> getService() {
		return regraService;
	}

}
