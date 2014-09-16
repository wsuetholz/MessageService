/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.suetholz.messageing;

import net.suetholz.messageing.api.MessageContainer;

/**
 *
 * @author wsuetholz
 */
public class StringMessage implements MessageContainer {

    private String content;

    public StringMessage(String content) {
	this.setContent(content);
    }

    public String getContent() {
	return content;
    }

    public void setContent(String content) {
	if (content == null) {
	    throw new IllegalArgumentException("Message content can not be null!");
	}
	this.content = content;
    }

    @Override
    public String getString() {
	return content;
    }

}
