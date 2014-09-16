/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.suetholz.messageing;

import java.util.Scanner;
import net.suetholz.messageing.api.MessageContainer;
import net.suetholz.messageing.api.MessageProducer;

/**
 *
 * @author wsuetholz
 */
public class MessageFromKeyboardProducer implements MessageProducer {

    @Override
    public MessageContainer produceMessage() {
	Scanner sc = new Scanner(System.in);
	String line = sc.nextLine();

	return new StringMessage(line);
    }

}
