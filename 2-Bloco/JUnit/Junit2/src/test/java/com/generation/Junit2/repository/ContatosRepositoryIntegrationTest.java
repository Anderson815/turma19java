package com.generation.Junit2.repository;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.generation.Junit2.model.ContatoModel;

@RunWith(SpringRunner.class) // Serve para indicar o formato do teste
@DataJpaTest //Serve para testar o JPA da melhor maneira
public class ContatosRepositoryIntegrationTest {
	
	private ContatoModel contato;
	
	@Autowired
	private ContatoRepository contatoRepository;
	
	@Before
	public void start() {
		contato = new ContatoModel("Gabriel", "011y", "9xxxxxxx9");
	}
	
	@Test(expected = RuntimeException.class)
	public void salvarComTelNulo() {
		
		contato.setTelefone(null);
		contatoRepository.save(contato);
	}
	
	@Test(expected = RuntimeException.class)
	public void salvarComDddNulo() {
		
		contato.setDdd(null);
		contatoRepository.save(contato);
	}
	
	@Test(expected = RuntimeException.class)
	public void salvarComNomeNulo() {
		
		contato.setNome(null);
		contatoRepository.save(contato);
	}
}
