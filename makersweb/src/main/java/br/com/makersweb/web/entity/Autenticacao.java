/**
 * 
 */
package br.com.makersweb.web.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnTransformer;
import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author anderson.aristides
 *
 */
@Entity
@Table(name = "tb_autenticacao")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Autenticacao extends DefaultEntity implements Serializable {

	private static final long serialVersionUID = -4340888315484734427L;

	@NotEmpty
	@Column(name = "password")
	@ColumnTransformer(write = "SHA2(?, 256)")
	private String password;

	@OneToOne
	private Usuario usuario;

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario
	 *            the usuario to set
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
