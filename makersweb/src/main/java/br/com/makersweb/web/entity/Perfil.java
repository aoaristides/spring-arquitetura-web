/**
 * 
 */
package br.com.makersweb.web.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.validator.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author anderson.aristides
 *
 */
@Entity
@Table(name = "tb_perfil", uniqueConstraints = @UniqueConstraint(columnNames = { "nome" }))
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Perfil extends DefaultEntity implements Serializable {

	private static final long serialVersionUID = -980260915993656024L;

	@NotBlank(message = "{br.com.makersweb.text.campo.nome.obrigatorio}")
	@Column(name = "nome", nullable = false, unique = true)
	private String nome;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "tb_perfil_regra_acesso", joinColumns = {
			@JoinColumn(name = "regra_acesso_id") }, inverseJoinColumns = { @JoinColumn(name = "perfil_id") })
	private List<RegraAcesso> regraAcesso;

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the regraAcesso
	 */
	public List<RegraAcesso> getRegraAcesso() {
		return regraAcesso;
	}

	/**
	 * @param regraAcesso
	 *            the regraAcesso to set
	 */
	public void setRegraAcesso(List<RegraAcesso> regraAcesso) {
		this.regraAcesso = regraAcesso;
	}

}
