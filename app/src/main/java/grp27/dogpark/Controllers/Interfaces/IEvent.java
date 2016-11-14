package grp27.dogpark.Controllers.Interfaces;


import grp27.dogpark.Controllers.Event;

/**
 * Created by BigBaws on 14/11/2016.
 */

public interface IEvent {
    Event getEvent(int eventid);
    Event getEvents();
    void createEvent();
    void like();
    void comment();
}
