/**
 * 
 */
package br.com.makersweb.web.service;

import java.util.Map;

/**
*
* @author anderson.aristides
*
*/
public interface IEmailSenderService {
	
	Boolean sendTestEmail(String email, Map<String, Object> data);

}
