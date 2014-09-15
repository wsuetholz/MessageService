/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.suetholz.messageing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import net.suetholz.messageing.api.MessageProducer;

/**
 *
 * @author wsuetholz
 */
public class MessageFromFileProducer implements MessageProducer {

    private String filePath;

    public MessageFromFileProducer(String filePath) {
	if (filePath == null || filePath.length() <= 0) {
	    throw new IllegalArgumentException("File path needs to be supplied");
	}
	this.filePath = filePath;
    }

    @Override
    public String produceMessage() {
	StringBuffer sb = new StringBuffer();
	char[] chars = new char[4 * 1024];
	int len;
	
	File file = new File(filePath);
	try {

	    Scanner sc = new Scanner(file);

	    while (sc.hasNextLine()) {
		String line = sc.nextLine();
		sb.append(line);
	    }
	    sc.close();
	} catch (FileNotFoundException e) {
	    sb = new StringBuffer("FILE \""); 
	    sb.append(filePath);
	    sb.append("\" NOT FOUND");
	}
	
	return sb.toString();
    }

}
