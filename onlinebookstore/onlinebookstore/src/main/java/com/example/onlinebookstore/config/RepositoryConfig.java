package com.example.onlinebookstore.config;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.Type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {
	@Autowired
	private EntityManager em;
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		/*
		 * config.exposeIdsFor(Book.class); config.exposeIdsFor(BookCategory.class);
		 */
		config.exposeIdsFor(em.getMetamodel().getEntities().parallelStream().map(Type::getJavaType).toArray(Class[]::new));
	}
}
