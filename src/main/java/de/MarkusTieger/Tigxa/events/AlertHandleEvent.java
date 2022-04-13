package de.MarkusTieger.Tigxa.events;

import de.MarkusTieger.Tigxa.api.event.IEvent;
import de.MarkusTieger.Tigxa.api.permission.Permission;
import de.MarkusTieger.Tigxa.api.web.IWebEngine;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AlertHandleEvent implements IEvent {

    private static final String NAME = "alert";
    private static final Permission[] PERMISSIONS = new Permission[] {Permission.WEB};

    private final boolean canceled;
    private final String data;
    private final IWebEngine engine;

    public AlertHandleEvent(IWebEngine engine, String data, boolean canceled){
        this.engine = engine;
        this.data = data;
        this.canceled = canceled;
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
