package control.server.service;

import control.server.entity.Control;
import control.server.repository.ControlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ControlServiceImpl implements ControlService {

    @Autowired
    private ControlRepository repository;

    public List<Control> getAll() {
        return repository.findAll();
    }

    public Control findById(Long id) {
        return repository.findOne(id);
    }

    public Control save(Control control) {
        return repository.saveAndFlush(control);
    }

    public void remove(Long id) {
        repository.delete(id);
    }


}
