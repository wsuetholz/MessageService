/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.suetholz.messageing;

import net.suetholz.messageing.api.MessageProducer;

/**
 * This class is provides a mechanism to construct pass around an array of
 * string messages, and output a "random" array element when asked for a string
 *
 * You are required to construct this class with an array of strings that will get
 * processed later.
 *
 * You should not return the properties of this class, or allow them to be
 * changed after construction. This class is meant as a transport class which is
 * constructed with a specific message, and it knows how to process the message
 * when it gets to its destination.
 *
 *
 * @author wsuetholz
 */
public final class RandomStringMessageProducer implements MessageProducer {

    private String[] messageChoices;
    long numDigits;
    
    public RandomStringMessageProducer ( String[] messageChoices ) {
	if (messageChoices == null || messageChoices.length == 0) {
	    throw new IllegalArgumentException ( "Array of message choices needs to be filled in");
	}
	
	this.messageChoices = messageChoices;
	this.numDigits = String.valueOf(messageChoices.length).length();
    }

    @Override
    public String produceMessage() {
	long index = Math.round ( Math.random() * Math.pow(10, numDigits) ) % messageChoices.length ;
	
	if (index < 0 || index > messageChoices.length) {   // Trust is a wonderful thing..  Oh well.. Should NEVER Happen!!
	    throw new IndexOutOfBoundsException ( "Calculation of Random Index Error!" );
	}
	
	return this.messageChoices[(int)index] ;
    }

}
