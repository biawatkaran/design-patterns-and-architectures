package com.experiment.main;

import com.experiment.impl.Event;
import com.experiment.impl.EventDispatcher;
import com.experiment.impl.Handler;

/**
 *
 * Created by Karandeep.biawat on 02/03/2015.
 */

public class Program {

    public static void main(String[] args) {

        EventDispatcher dispatcher = new EventDispatcher();
        dispatcher.registerChannel(Event.class, new Handler());
        dispatcher.dispatch(new Event());

    }
}
