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
public class Main {

    public static void main(String[] args) {
	Message[] message;
	MessageConsumer[] consumer;
	MessageProducer[] producer;
	String[] randomChoices = {
	    "String 1", "String 2", "String 3", "String 4", "String 5"
	};

	message = new MessageHandler[10];
	consumer = new MessageConsumer[2];
	producer = new MessageProducer[3];

	consumer[0] = new ConsumeString2Console();
	consumer[1] = new ConsumeString2JOption(null);

	producer[0] = new ProduceMessageFromFile("testFile.txt");
	producer[1] = new ProduceStringMessage("This is a String Message.  Hello There World?");
	producer[2] = new ProduceRandomStringMessage(randomChoices);

	int msgidx = 0;
	for (int i = 0; i < consumer.length; i++) {
	    for (int j = 0; j < producer.length; j++) {
		message[msgidx++] = new MessageHandler(producer[j], consumer[i]);
	    }
	}

	for (int i = 0; i < msgidx; i++) {
	    message[i].processMessage();
	}
    }
}
