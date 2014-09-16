/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.suetholz.messageing;

import net.suetholz.messageing.api.MessageConsumer;
import net.suetholz.messageing.api.MessageProducer;

/**
 *
 * @author wsuetholz
 */
public class MessageConsoleConsumer implements MessageConsumer {

    @Override
    public void consumeMessage(MessageProducer message) {
	System.out.println(message.produceMessage().getString());
    }
    
}
