/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.suetholz.messageing;

import net.suetholz.messageing.api.MessageService;
import net.suetholz.messageing.api.MessageConsumer;
import net.suetholz.messageing.api.MessageProducer;

/**
 *
 * @author wsuetholz
 */
public class MessageHandler implements MessageService {

    private MessageProducer producer;
    private MessageConsumer consumer;

    public MessageHandler(MessageProducer producer, MessageConsumer consumer) {
	this.setProducer(producer);
	this.setConsumer(consumer);
    }

    public MessageProducer getProducer() {
	return producer;
    }

    public void setProducer(MessageProducer producer) {
	if (producer == null) {
	    throw new IllegalArgumentException("Message Producer not allowed to be null!");
	}
	this.producer = producer;
    }

    public MessageConsumer getConsumer() {
	return consumer;
    }

    public void setConsumer(MessageConsumer consumer) {
	if (consumer == null) {
	    throw new IllegalArgumentException("Message Consumer not allowed to be null!");
	}
	this.consumer = consumer;
    }

    @Override
    public void processMessage() {
	this.consumer.consumeMessage(this.producer);
    }
}
