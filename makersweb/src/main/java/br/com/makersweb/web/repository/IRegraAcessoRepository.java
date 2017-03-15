/**
 * 
 */
package br.com.makersweb.web.repository;

import java.util.List;

import br.com.makersweb.web.entity.RegraAcesso;

/**
 *
 * @author anderson.aristides
 *
 */
public interface IRegraAcessoRepository extends IBaseRepository<RegraAcesso> {

	List<RegraAcesso> findByNomeStartingWith(String nome);
	
}
