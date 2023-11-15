//package com.techgeek.kafka.serialization.config;
//
//import org.apache.kafka.clients.consumer.ConsumerConfig;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@Configuration
//public class KafkaConsumerConfig {
//
//    @Value("bootstrap-servers")
//    private String BOOTSTRAP_SERVERS_CONFIG;
//
//    @Value("key-serializer")
//    private String keySerializer;
//
//    @Value("value-serializer")
//    private String valueSerializer;
//
//    @Value("")
//    private String BOOTSTRAP_SERVERS_CONFIG;
//
//    @Value("")
//    private String BOOTSTRAP_SERVERS_CONFIG;
//    @Bean
//    public Map<String, Object> consumerConfig() {
//        Map<String, Object> props = new HashMap<>();
////        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,
////                "localhost:9092");
////        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG,
////                StringDeserializer.class);
////        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,
////                JsonDeserializer.class);
////        props.put(JsonDeserializer.TRUSTED_PACKAGES, "com.javatechie.dto");
//        return props;
//    }
//
//    @Bean
//    public ConsumerFactory<String,Object> consumerFactory(){
//        return new DefaultKafkaConsumerFactory<>(consumerConfig());
//    }
//
//    @Bean
//    public KafkaListenerContainerFactory<ConcurrentMessageListenerContainer<String, Object>> kafkaListenerContainerFactory() {
//        ConcurrentKafkaListenerContainerFactory<String, Object> factory =
//                new ConcurrentKafkaListenerContainerFactory<>();
//        factory.setConsumerFactory(consumerFactory());
//        return factory;
//    }
//
//}
