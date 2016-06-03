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

    @RequestMapping(value = "/control/get/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Control getControlId(@PathVariable("id") Long id)
    {
        return service.findById(id);
    }

    @RequestMapping(value = "/control/post", method = RequestMethod.POST)
    @ResponseBody
    public Control saveControl(@RequestBody Control control)
    {
        return service.save(control);
    }

    @RequestMapping(value = "/control/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void remove(@PathVariable Long id)
    {
        service.remove(id);
    }

}
