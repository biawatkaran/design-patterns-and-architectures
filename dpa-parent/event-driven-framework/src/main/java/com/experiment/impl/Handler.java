package com.experiment.impl;

import com.experiment.Channel;
import com.experiment.Message;

/**
 * Created by Karandeep.biawat on 02/03/2015.
 *
 */
public class Handler implements Channel {

    @Override
    public void dispatch(Message message) {
        System.out.println("dispatching : " + message.getClass());
    }
}
