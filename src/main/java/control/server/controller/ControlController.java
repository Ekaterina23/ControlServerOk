package control.server.controller;

import control.server.entity.Control;
import control.server.service.ControlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControlController {

    @Autowired
    private ControlService service;

    @RequestMapping(value = "/control", method = RequestMethod.GET)
    @ResponseBody
    public List<Control> getAllControl()
    {
        return service.getAll();
    }

    @RequestMapping(value = "/control/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Control getControl(@PathVariable("id") long controlId)
    {
        return service.getById(controlId);
    }

    @RequestMapping(value = "/control", method = RequestMethod.POST)
    @ResponseBody
    public Control saveControl(@RequestBody Control control)
    {
        return service.save(control);
    }

    @RequestMapping(value = "/control/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteControl(@PathVariable long id)
    {
        service.remove(id);
    }
}
