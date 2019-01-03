package com.freitas.controller;


import com.freitas.domain.Object;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.*;

@RestController
public class ObjectController {

    final static Logger logger = Logger.getLogger(ObjectController.class);

    @PostMapping(name = "/object")
    public void create(@RequestBody Object object){
        try {
            logger.info("creating object");
        } catch (Exception ex) {
            logger.error("occurred an error creating object: " + ex.getMessage());
        }
    }

    @GetMapping(name = "/object/{id}")
    public void findOne(@PathVariable long id){
        try {
            logger.info("getting one object");
        } catch (Exception ex) {
            logger.error("occurred an error getting an object: " + ex.getMessage());
        }
    }

    @GetMapping(name = "/object")
    public void findAll(){
        try {
            logger.info("getting all objects");
        } catch (Exception ex) {
            logger.error("occurred an error getting all objects: " + ex.getMessage());
        }
    }

    @PutMapping(name = "/object")
    public void update(){
        try {
            logger.info("updating object");
        } catch (Exception ex) {
            logger.error("occurred an error updating object: " + ex.getMessage());
        }
    }

    @DeleteMapping(name = "/object")
    public void remove(){
        try {
            logger.info("removing object");
        } catch (Exception ex) {
            logger.error("occurred an error removing object: " + ex.getMessage());
        }
    }
}
