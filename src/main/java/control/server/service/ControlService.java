package control.server.service;

import control.server.entity.Control;

import java.util.List;

public interface ControlService {

    List<Control> getAll();
    Control findById(Long id);
    Control save(Control control);
    void remove(Long id);

}
