package com.experiment;

/**
 *
 * 1. register channel with message
 * 2. dispatching the message
 *
 * Created by Karandeep.biawat on 02/03/2015.
 *
 */
public interface DynamicRouter<E extends Message> {

    public void registerChannel(Class<? extends E> contentType, Channel<? extends E> channel);

    public void dispatch(E message);
}
