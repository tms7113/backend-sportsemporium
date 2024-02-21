package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Sports;
import com.example.demo.service.SportsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
public class SportsController {
    @Autowired
    SportsService ss;

    
    @PostMapping("/create")
    public Sports postMethodName(@RequestBody Sports entity) {
        return ss.create(entity);
    }
    @GetMapping("/getme/{id}")
    public Sports getMethodName(@PathVariable int id) {
        return ss.getById(id);
    }
    @DeleteMapping("/sp/{id}")
    public void deletesp(@PathVariable("id") int id)
    {
        ss.delete(id);
    }
    @PutMapping("/puts/{id}")
    public Sports updateSports(@PathVariable int id,@RequestBody Sports sports)
    {
        return ss.updateSports(id, sports);
    }


}