package de.MarkusTieger.Tigxa.events;

import de.MarkusTieger.Tigxa.api.event.IEvent;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WebLoadStartEvent implements IEvent {

    private static final String NAME = "web_load";

    private String location;
    private boolean canceled;

    public WebLoadStartEvent(String location, boolean canceled){
        this.location = location;
        this.canceled = canceled;
    }

    @Override
    public String getName() {
        return NAME;
    }
}