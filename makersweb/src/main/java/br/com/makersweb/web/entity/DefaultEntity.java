/**
 * 
 */
package br.com.makersweb.web.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 *
 * @author anderson.aristides
 *
 */
@MappedSuperclass
public class DefaultEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 40405364806982329L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;

	@JsonInclude(Include.NON_NULL)
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@Column(name = "criado", columnDefinition = "DATETIME", nullable = false, updatable = false)
	private LocalDateTime criado;

	@JsonInclude(Include.NON_NULL)
	@Column(name = "criado_por", nullable = false, updatable = false)
	private String criadoPor;

	@JsonInclude(Include.NON_NULL)
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@Column(name = "atualizado", columnDefinition = "DATETIME")
	private LocalDateTime atualizado;

	@JsonInclude(Include.NON_NULL)
	@Column(name = "atualizado_por")
	private String atualizadoPor;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the criado
	 */
	public LocalDateTime getCriado() {
		return criado;
	}

	/**
	 * @param criado
	 *            the criado to set
	 */
	public void setCriado(LocalDateTime criado) {
		this.criado = criado;
	}

	/**
	 * @return the criadoPor
	 */
	public String getCriadoPor() {
		return criadoPor;
	}

	/**
	 * @param criadoPor
	 *            the criadoPor to set
	 */
	public void setCriadoPor(String criadoPor) {
		this.criadoPor = criadoPor;
	}

	/**
	 * @return the atualizado
	 */
	public LocalDateTime getAtualizado() {
		return atualizado;
	}

	/**
	 * @param atualizado
	 *            the atualizado to set
	 */
	public void setAtualizado(LocalDateTime atualizado) {
		this.atualizado = atualizado;
	}

	/**
	 * @return the atualizadoPor
	 */
	public String getAtualizadoPor() {
		return atualizadoPor;
	}

	/**
	 * @param atualizadoPor
	 *            the atualizadoPor to set
	 */
	public void setAtualizadoPor(String atualizadoPor) {
		this.atualizadoPor = atualizadoPor;
	}

}
