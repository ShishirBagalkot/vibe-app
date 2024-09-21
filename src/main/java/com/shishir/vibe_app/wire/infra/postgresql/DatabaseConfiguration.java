package com.shishir.vibe_app.wire.infra.postgresql;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = {"com.shishir.vibe_app"})
@EnableJpaAuditing
public class DatabaseConfiguration {
}