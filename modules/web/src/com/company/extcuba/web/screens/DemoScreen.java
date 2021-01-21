package com.company.extcuba.web.screens;

import com.company.extcuba.web.gui.components.AutoTimeDateField;
import com.haulmont.cuba.gui.UiComponents;
import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.screen.Screen;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;
import java.util.Calendar;
import java.util.Date;

@UiController("extcuba_DemoScreen")
@UiDescriptor("demo-screen.xml")
public class DemoScreen extends Screen {

    @Inject
    private VBoxLayout vBox;
    @Inject
    private UiComponents uiComponents;

    @Subscribe
    public void onInit(InitEvent event) {
        addStandardDateField();
        addAutoTimeDateField();
        addAutoTimeDateFieldWIthCustomDate();
    }

    protected void addStandardDateField() {
        DateField<?> dateField = uiComponents.create(DateField.class);
        dateField.setCaption("Standard component");
        vBox.add(dateField);
    }

    protected void addAutoTimeDateField() {
        AutoTimeDateField autoTimeDateField = uiComponents.create(AutoTimeDateField.class);
        autoTimeDateField.setCaption("Autotime component with current time initializer");
        vBox.add(autoTimeDateField);
    }

    protected void addAutoTimeDateFieldWIthCustomDate() {
        AutoTimeDateField autoTimeDateField = uiComponents.create(AutoTimeDateField.class);
        autoTimeDateField.setCaption("Auto-time component with custom time initializer (01.01.2020, UTC-0)");
        autoTimeDateField.setInitialValue(new Date(1577836800000L));
        vBox.add(autoTimeDateField);
    }

}