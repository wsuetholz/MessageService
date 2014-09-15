/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.suetholz.messageing;

import net.suetholz.messageing.api.Message;
import net.suetholz.messageing.api.MessageConsumer;
import net.suetholz.messageing.api.MessageProducer;

/**
 *
 * @author wsuetholz
 */
public class MessageHandler implements Message {
    MessageProducer producer;
    MessageConsumer consumer;
    
    public MessageHandler ( MessageProducer producer, MessageConsumer consumer ) {
	if (producer == null) {
	    throw new IllegalArgumentException ( "Message Producer not allowed to be null!");
	}
	if (consumer == null) {
	    throw new IllegalArgumentException ( "Message Consumer not allowed to be null!");	    
	}
	this.producer = producer;
	this.consumer = consumer;
    }
    
    @Override
    public void processMessage () {
	this.consumer.consumeMessage ( this.producer.produceMessage() ) ;
    }
}
