package com.experiment;

/**
 * Events - > Messages
 *
 * Created by Karandeep.biawat on 02/03/2015.
 *
 */

public interface Message {

    public Class<? extends Message> getType();
}
