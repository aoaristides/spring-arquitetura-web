/**
 * 
 */
package br.com.makersweb.web.service.exception;

/**
 *
 * @author anderson.aristides
 *
 */
public class BusinessException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8368310721222818659L;

	private Object object;

	/**
	 * 
	 */
	public BusinessException() {
		super();
	}

	/**
	 * @param message
	 * @param cause
	 */
	public BusinessException(String message, Throwable cause) {
		super(message, cause);
	}

	public BusinessException(Throwable cause, Object object) {
		super(cause);
		this.object = object;
	}

	/**
	 * @param message
	 */
	public BusinessException(String message) {
		super(message);
	}

	/**
	 * @param message
	 */
	public BusinessException(String message, Boolean error, String typeError) {
		super(message);
	}

	/**
	 * @return the object
	 */
	public Object getObject() {
		return object;
	}

}
