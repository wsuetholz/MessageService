/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.suetholz.messageing;

import java.awt.Component;
import javax.swing.JOptionPane;
import net.suetholz.messageing.api.MessageConsumer;
import net.suetholz.messageing.api.MessageProducer;

/**
 *
 * @author wsuetholz
 */
public class MessageGuiConsumer implements MessageConsumer {

    Component parentComponent;
    
     /** 
     * @param parentComponent
     */
    public MessageGuiConsumer ( Component parentComponent ) {
	this.parentComponent = parentComponent;	    // Yes this CAN be null.
    }
    
    @Override
    public void consumeMessage(MessageProducer message) {
	JOptionPane.showMessageDialog(this.parentComponent,
				      message.produceMessage().getString());
    }

}
