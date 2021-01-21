package com.company.extcuba.web.gui.components;

import com.haulmont.cuba.gui.components.DateField;

import java.util.Date;

public interface AutoTimeDateField extends DateField<Date> {

    String NAME = "autoTimeDateField";

    void setInitialValue(Date initialValue);

    Date getInitialValue();

}
