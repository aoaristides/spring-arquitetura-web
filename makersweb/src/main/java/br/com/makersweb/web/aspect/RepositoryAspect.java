/**
 * 
 */
package br.com.makersweb.web.aspect;

import java.time.LocalDateTime;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import br.com.makersweb.web.entity.DefaultEntity;

/**
 *
 * @author anderson.aristides
 *
 */
public class RepositoryAspect {

	public Object doBasicDomainInformation(ProceedingJoinPoint pjp) throws Throwable {
		Object myEntity = pjp.getArgs()[0];
		if (myEntity instanceof DefaultEntity) {
			myEntity = setDefaultValues((DefaultEntity) myEntity);
		}

		Object retVal = pjp.proceed();
		return retVal;
	}

	private DefaultEntity setDefaultValues(DefaultEntity defaultDomain) {
		if (defaultDomain.getId() != null) {
			defaultDomain.setAtualizado(LocalDateTime.now());
			defaultDomain.setAtualizadoPor(this.getUser());
		} else {
			defaultDomain.setCriado(LocalDateTime.now());
			defaultDomain.setCriadoPor(this.getUser());
		}
		return defaultDomain;
	}

	private String getUser() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String email;
		if (auth != null) {
			email = auth.getName();
		} else {
			email = "assinc";
		}
		return email;
	}

}
