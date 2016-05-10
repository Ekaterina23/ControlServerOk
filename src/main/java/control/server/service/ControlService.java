package control.server.service;

import control.server.entity.Control;

import java.util.List;

public interface ControlService {

    List<Control> getAll();
    Control getById(long id);
    Control save(Control control);
    void remove(long id);

}
