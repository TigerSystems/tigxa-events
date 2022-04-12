package de.MarkusTieger.Tigxa.events;

import de.MarkusTieger.Tigxa.api.event.IEvent;
import de.MarkusTieger.Tigxa.api.permission.Permission;
import lombok.Getter;

import java.net.URI;

@Getter
public class FaviconLoadingFinishedEvent implements IEvent {

    private static final String NAME = "fav_loaded";
    private static final Permission[] PERMISSIONS = new Permission[] {Permission.WEB};

    private final String location;
    private final URI locationAsURI;
    private final boolean success;

    public FaviconLoadingFinishedEvent(String loc, URI locAsURI, boolean success){
        this.location = loc;
        this.locationAsURI = locAsURI;
        this.success = success;
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
