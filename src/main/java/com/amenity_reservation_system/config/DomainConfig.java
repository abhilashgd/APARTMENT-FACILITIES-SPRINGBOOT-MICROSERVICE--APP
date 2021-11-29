package com.amenity_reservation_system.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EntityScan("com.amenity_reservation_system.domain")
@EnableJpaRepositories("com.amenity_reservation_system.repos")
@EnableTransactionManagement
public class DomainConfig {
}
