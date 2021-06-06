package com.github.stanislavmikheyev.pgsgradessource.config

import org.h2.tools.Server
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.sql.SQLException

@Configuration
class H2Config constructor(
    @Value("\${pgs.h2DatabaseServer.port}") val databaseServerPort: String
) {

    val logger: Logger = LoggerFactory.getLogger(H2Config::class.java)

    @Bean(initMethod = "start", destroyMethod = "stop")
    @ConditionalOnProperty(name = ["pgs.h2DatabaseServer.enable"], havingValue = "true")
    @Throws(SQLException::class)
    fun inMemoryH2DatabaseServer(): Server? {
        logger.info("H2 Database server created on port {}", databaseServerPort)
        return Server.createTcpServer(
            "-tcp", "-tcpAllowOthers", "-tcpPort", databaseServerPort
        )
    }
}