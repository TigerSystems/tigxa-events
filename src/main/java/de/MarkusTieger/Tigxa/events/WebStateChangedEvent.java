package de.MarkusTieger.Tigxa.events;

import de.MarkusTieger.Tigxa.api.event.IEvent;
import de.MarkusTieger.Tigxa.api.permission.Permission;
import de.MarkusTieger.Tigxa.api.web.IWebEngine;
import javafx.concurrent.Worker;
import lombok.Getter;

@Getter
public class WebStateChangedEvent implements IEvent {

    private static final String NAME = "web_loading";
    private static final Permission[] PERMISSIONS = new Permission[] {Permission.WEB};

    private final Worker.State oldState, newState;
    private final IWebEngine engine;

    public WebStateChangedEvent(IWebEngine engine, Worker.State oldState, Worker.State newState){
        this.engine = engine;
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
