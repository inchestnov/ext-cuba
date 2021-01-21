package com.company.extcuba.web.gui.components;

import com.haulmont.cuba.core.global.AppBeans;
import com.haulmont.cuba.core.global.TimeSource;
import com.haulmont.cuba.gui.UiComponents;
import com.haulmont.cuba.gui.components.AbstractAction;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.icons.CubaIcon;
import com.haulmont.cuba.web.gui.components.WebDateField;

import java.util.Date;

public class WebAutoTimeDateField extends WebDateField<Date>
    implements AutoTimeDateField {

    protected Button cubaButton;
    protected Date initialValue;

    public WebAutoTimeDateField() {
        initialValue = AppBeans.get(TimeSource.class).currentTimestamp();
    }

    @Override
    public void setInitialValue(Date initialValue) {
        this.initialValue = initialValue;
    }

    @Override
    public Date getInitialValue() {
        return initialValue;
    }

    @Override
    protected void updateLayout() {
        super.updateLayout();
        initButton();
    }

    protected void initButton() {
        cubaButton = AppBeans.get(UiComponents.class).create(Button.class);
        cubaButton.setIconFromSet(CubaIcon.ADJUST); // for example

        cubaButton.setAction(new AbstractAction() {
            @Override
            public void actionPerform(Component component) {
                setValue(initialValue);
            }
        });

        component.addComponent(cubaButton.unwrap(com.vaadin.ui.Button.class));
    }

}
