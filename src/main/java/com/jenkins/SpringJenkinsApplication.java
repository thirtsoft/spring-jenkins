package com.jenkins;

import com.jenkins.dao.StudentRepository;
import com.jenkins.model.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication implements CommandLineRunner {

	private static final Logger LOG = LoggerFactory.getLogger(SpringJenkinsApplication.class);

	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/*
		Student st1 = studentRepository.save(new Student("Tairou", "Diallo", "Hann-Mariste 2", "779440310"));
		Student st2 = studentRepository.save(new Student("Abdoulay", "Samba", "Bel-Air", "759440310"));
		Student st3 = studentRepository.save(new Student("Seydina", "Diouf", "Ouakam", "769440310"));
		Student st4 = studentRepository.save(new Student("Awa", "Ndao", "Mbao", "789440310"));
		Student st5 = studentRepository.save(new Student("Mame awa", "Niang", "Sacré coeur", "77'440310"));


		 */
	}
}
