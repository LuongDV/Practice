package org.example;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "luongdvCode",
            groupId = "groupId"
    )
    void listener(String data) {
        System.out.println("List received: " + data);
    }
}
