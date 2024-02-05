package br.com.mario.consumerservice.rabbitmq.config;

import org.springframework.amqp.support.converter.SimpleMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * Necessaria a criação desta configuração para evitar erro de segurança na deserialização
 */
@Configuration
public class RabbitMqConfig {

    @Bean
    public SimpleMessageConverter converter() {
        SimpleMessageConverter converter = new SimpleMessageConverter();
        converter.setAllowedListPatterns(List.of("org.rabbitmq.dtos.*"));
        return converter;
    }
}
