package com.ProjetPFE.demo;

import com.ProjetPFE.demo.Dao.FactureDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProjetPFEApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetPFEApplication.class, args);
		ApplicationContext ctx=SpringApplication.run(ProjetPFEApplication.class, args);
		/*UserDao user_dao=ctx.getBean(UserDao.class);

		User u1= new User("khouloud hachicha","111111","khouloud@gmail.com","21555666","k11111");
		user_dao.save(u1);*/
	}

}
