package com.tenabotreq;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "tenabotreq",
            groupId = "ttGroupId"
    )
    void listener(String data){
        System.out.println("Listener received: " + data + " \uD83C\uDF89");
    }
}
