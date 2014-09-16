/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.suetholz.messageing;

import javax.swing.JOptionPane;
import net.suetholz.messageing.api.MessageProducer;

/**
 *
 * @author wsuetholz
 */
public class GuiMessageProducer implements MessageProducer {

    @Override
    public StringMessage produceMessage() {
	String line = JOptionPane.showInputDialog("Please enter message");

	return new StringMessage(line);
    }
    
}
