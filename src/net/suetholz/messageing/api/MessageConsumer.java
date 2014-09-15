/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.suetholz.messageing.api;

/**
 *
 * @author wsuetholz
 */
public interface MessageConsumer {

    public abstract void consumeMessage(String message);
}
