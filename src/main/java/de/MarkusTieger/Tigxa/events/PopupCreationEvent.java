package de.MarkusTieger.Tigxa.events;

import de.MarkusTieger.Tigxa.api.event.IEvent;
import de.MarkusTieger.Tigxa.api.permission.Permission;
import de.MarkusTieger.Tigxa.api.web.IWebEngine;
import de.MarkusTieger.Tigxa.api.window.ITab;
import de.MarkusTieger.Tigxa.api.window.IWindow;
import lombok.Getter;

@Getter
public class PopupCreationEvent implements IEvent {

    public static final String NAME = "popup_creation";
    private static final Permission[] PERMISSIONS = new Permission[] {Permission.WEB, Permission.WINDOW};

    private final IWindow window;
    private final ITab tab;
    private final IWebEngine engine;
    private final IWebEngine newEngine;

    public PopupCreationEvent(IWebEngine engine, IWebEngine newEngine, IWindow window, ITab tab){
        this.window = window;
        this.tab = tab;
        this.engine = engine;
        this.newEngine = newEngine;
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
