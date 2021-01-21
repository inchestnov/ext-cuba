package com.company.extcuba.web.gui;

import com.company.extcuba.web.gui.components.AutoTimeDateField;
import com.company.extcuba.web.gui.components.WebAutoTimeDateField;
import com.haulmont.cuba.web.gui.WebUiComponents;

public class ExtWebUiComponents extends WebUiComponents {

    {
        classes.put(AutoTimeDateField.NAME, WebAutoTimeDateField.class);
    }

}
