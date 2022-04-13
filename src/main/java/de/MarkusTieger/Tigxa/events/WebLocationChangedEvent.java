package de.MarkusTieger.Tigxa.events;

import de.MarkusTieger.Tigxa.api.event.IEvent;
import de.MarkusTieger.Tigxa.api.permission.Permission;
import de.MarkusTieger.Tigxa.api.web.IWebEngine;
import lombok.Getter;

@Getter
public class WebLocationChangedEvent implements IEvent {

    private static final String NAME = "web_location";
    private static final Permission[] PERMISSIONS = new Permission[] {Permission.WEB};

    private final String oldLocation, newLocation;
    private final IWebEngine engine;

    public WebLocationChangedEvent(IWebEngine engine, String oldLocation, String newLocation){
        this.engine = engine;
        this.oldLocation = oldLocation;
        this.newLocation = newLocation;
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
