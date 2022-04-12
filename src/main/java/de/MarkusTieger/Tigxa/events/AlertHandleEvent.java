package de.MarkusTieger.Tigxa.events;

import de.MarkusTieger.Tigxa.api.event.IEvent;
import de.MarkusTieger.Tigxa.api.permission.Permission;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AlertHandleEvent implements IEvent {

    private static final String NAME = "alert";
    private static final Permission[] PERMISSIONS = new Permission[] {Permission.WEB};

    private final boolean canceled;
    private final String data;

    public AlertHandleEvent(String data, boolean canceled){
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
