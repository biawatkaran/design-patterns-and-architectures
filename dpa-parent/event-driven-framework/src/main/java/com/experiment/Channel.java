package com.experiment;

/**
 * It's the delivery point
 *  Event Handlers - > Channels
 *
 * Created by Karandeep.biawat on 02/03/2015.
 *
 */
public interface Channel<E extends Message> {

    public void dispatch(E message);
}
