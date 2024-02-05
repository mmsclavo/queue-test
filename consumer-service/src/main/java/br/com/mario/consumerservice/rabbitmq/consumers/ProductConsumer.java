package br.com.mario.consumerservice.rabbitmq.consumers;

import lombok.extern.log4j.Log4j2;
import org.rabbitmq.dtos.ProductDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import static org.rabbitmq.constants.RabbitMQConstants.QUEUE_PRODUCT_LOG;
import static org.rabbitmq.constants.RabbitMQConstants.RK_PRODUCT_LOG;

@Log4j2
@Component
public class ProductConsumer {
    @RabbitListener(queues = {RK_PRODUCT_LOG})
    public void consumer(ProductDTO dto) {
        log.info("Consumer received a message " + dto);
    }
}
