/**
 * 
 */
package br.com.makersweb.web.service.core;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import br.com.makersweb.web.service.IEmailSenderService;
import br.com.makersweb.web.service.exception.BusinessException;

/**
 *
 * @author anderson.aristides
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:service-test-context.xml")
@Transactional(rollbackFor = Exception.class)
public class EmailSenderServicesUnitTest {

	@Autowired
	private IEmailSenderService emailSenderService;

	@Test
	public void sentRegisterEmailTest() throws BusinessException {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("name", "Anderson O. Aristides");
		data.put("subject", "Teste E-mail");
		Boolean sendEmail = this.emailSenderService.sendTestEmail("marrecogevans@gmail.com", data);
		Assert.assertTrue(sendEmail);
	}

}
