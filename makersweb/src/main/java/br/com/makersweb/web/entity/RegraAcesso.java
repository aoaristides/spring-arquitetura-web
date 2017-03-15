/**
 * 
 */
package br.com.makersweb.web.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author anderson.aristides
 *
 */
@Entity
@Table(name = "tb_regra_acesso")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class RegraAcesso extends DefaultEntity implements Serializable {

	private static final long serialVersionUID = 7575033699818980065L;

	@NotBlank(message = "{br.com.makersweb.text.campo.nome.obrigatorio}")
	@Column(name = "nome", nullable = false, length = 100)
	private String nome;

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

}
