package com.gmail.simon.ui.views.homepage;

import com.gmail.simon.app.HasLogger;
import com.gmail.simon.backend.data.entity.Order;
import com.gmail.simon.ui.components.SearchBar;
import com.gmail.simon.ui.views.EntityView;
import com.vaadin.flow.component.confirmdialog.ConfirmDialog;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.data.binder.ValidationException;
import com.vaadin.flow.router.BeforeEvent;
import com.vaadin.flow.router.HasUrlParameter;
import com.vaadin.flow.templatemodel.TemplateModel;

import javax.persistence.Id;

public class HomePageView extends PolymerTemplate<TemplateModel>
        implements HasLogger, HasUrlParameter<Long>, EntityView<Order> {


    //@Id("search")
    private SearchBar searchBar;


    public HomePageView() {

        searchBar.setPlaceHolder("Search");


    }

    @Override
    public boolean isDirty() {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public void write(Order entity) throws ValidationException {

    }

    @Override
    public String getEntityName() {
        return null;
    }

    @Override
    public void setConfirmDialog(ConfirmDialog confirmDialog) {

    }

    @Override
    public ConfirmDialog getConfirmDialog() {
        return null;
    }

    @Override
    public void setParameter(BeforeEvent beforeEvent, Long aLong) {

    }
}
