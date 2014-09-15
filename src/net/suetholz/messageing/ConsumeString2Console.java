/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.suetholz.messageing;

import net.suetholz.messageing.api.MessageConsumer;

/**
 *
 * @author wsuetholz
 */
public class ConsumeString2Console implements MessageConsumer {

    @Override
    public void consumeMessage(String message) {
	System.out.println(message);
    }
    
}
