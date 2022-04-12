package de.MarkusTieger.Tigxa.events;

import de.MarkusTieger.Tigxa.api.event.IEvent;
import de.MarkusTieger.Tigxa.api.permission.Permission;
import javafx.concurrent.Worker;
import lombok.Getter;

@Getter
public class WebStateChangedEvent implements IEvent {

    private static final String NAME = "web_loading";
    private static final Permission[] PERMISSIONS = new Permission[] {Permission.WEB};

    private final Worker.State oldState, newState;

    public WebStateChangedEvent(Worker.State oldState, Worker.State newState){
        this.oldState = oldState;
        this.newState = newState;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public Permission[] getRequiredPermissions() {
        return PERMISSIONS;
    }
}
