package com.experiment.impl;

import com.experiment.Message;

/**
 * Events are analog to message
 *
 * Created by Karandeep.biawat on 02/03/2015.
 */
public class Event implements Message {

    @Override
    public Class<? extends Message> getType() {
        return getClass();
    }
}
