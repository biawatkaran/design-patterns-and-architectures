package com.experiment.impl;

import com.experiment.Channel;
import com.experiment.DynamicRouter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Karandeep.biawat on 02/03/2015.
 *
 */

public class EventDispatcher implements DynamicRouter<Event>{

    Map<Class <? extends Event>, Handler> handlers;

    public EventDispatcher(){
        handlers = new HashMap<Class<? extends Event>, Handler>();
    }

    @Override
    public void registerChannel(Class<? extends Event> contentType, Channel<? extends Event> channel) {
        handlers.put(contentType, (Handler) channel);
    }

    @Override
    public void dispatch(Event message) {
        handlers.get(message.getType()).dispatch(message);
    }
}
