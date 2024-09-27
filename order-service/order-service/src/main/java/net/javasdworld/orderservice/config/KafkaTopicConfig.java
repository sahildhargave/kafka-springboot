package net.javasdworld.orderservice.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig{
    @Value("{spring.kafka.topic.name}")
    private String topicName;

    // spring beans for kafka topic
    @Bean
    public NewTopic topic(){
        return TopicBuilder.anem(topicName)
                .build();
    }
}