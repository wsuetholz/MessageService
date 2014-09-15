/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.suetholz.messageing;

import net.suetholz.messageing.api.MessageProducer;

/**
 *
 * @author wsuetholz
 */
public final class ProduceStringMessage implements MessageProducer {

    private String message;
    
    /**
     * This class is provides a mechanism to construct pass around a string message
     * and then later process that message from a message consumer.
     * 
     * You are required to construct this class with a string that will get
     * processed later.
     * 
     * You should not return the properties of this class, or allow them to be
     * changed after construction.  This class is meant as a transport class which
     * is constructed with a specific message, and it knows how to process the message
     * when it gets to its destination.
     * 
     * @param message 
     */
    public ProduceStringMessage ( String message ) {
	if (message == null) {
	    throw new IllegalArgumentException ("Message cannot be null!");
	}
	
	this.message = message;
    }
    
    @Override
    public String produceMessage() {
	return this.message;
    }
        
}
