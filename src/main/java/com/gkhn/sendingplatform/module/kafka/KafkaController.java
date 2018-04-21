
package com.gkhn.sendingplatform.module.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author liuzh
 * @since 2017/6/17.
 */


@Controller
public class KafkaController {

    public static Logger logger = LoggerFactory.getLogger(KafkaController.class);

    @Resource
    private KafkaTemplate<String,String> template;

    @RequestMapping("/send")
    @ResponseBody
    String send(String topic, String key, String data) {
        template.send("qtmdojbk","hello","helloa");
        //template.send(topic, key, data);
        return "success";
    }



    @KafkaListener(id = "t1", topics = "t1")
    public void listenT1(ConsumerRecord<?, ?> cr) throws Exception {
        System.out.printf("{} - {} : {}", cr.topic(), cr.key(), cr.value());
        logger.info("{} - {} : {}", cr.topic(), cr.key(), cr.value());
    }

    @KafkaListener(id = "t2", topics = "t2")
    public void listenT2(ConsumerRecord<?, ?> cr) throws Exception {
        System.out.printf("{} - {} : {}", cr.topic(), cr.key(), cr.value());
        logger.info("{} - {} : {}", cr.topic(), cr.key(), cr.value());
    }

    @KafkaListener(id = "qtmdojbk", topics = "qtmdojbk")
    public void listenT3(ConsumerRecord<?, ?> cr) throws Exception {
        System.out.printf("{} - {} : {}", cr.topic(), cr.key(), cr.value());
        logger.info("{} - {} : {}", cr.topic(), cr.key(), cr.value());
    }


}

