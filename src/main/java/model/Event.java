package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Task containing description and the time of the event.
 */
public class Event extends Task implements TimedItem {
    /** LocalDateTime of the event */
    private final LocalDateTime time;
    
    /**
     * Creates an Event that has a description and timing.
     *
     * @param desc String representing the description
     * @param time LocalDateTime.
     */
    public Event(String desc, LocalDateTime time) {
        super(desc);
        assert time != null;
    
        this.time = time;
    }
    
    /**
     * String representation of Event, marked with [E], desc and the timing
     *
     * @return string
     */
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return "[E]" + super.toString() + " (at : " + time.format(formatter) + ")";
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime getTime() {
        return time;
    }
}
