package com.freitas.service;

import com.freitas.controller.ObjectController;
import com.freitas.domain.Object;

import org.apache.log4j.Logger;

public class ObjectService {

    final static Logger logger = Logger.getLogger(ObjectController.class);


    public String create(Object object){
        try {
            logger.info("creating object");
        } catch (Exception ex) {
            logger.error("occurred an error creating object: " + ex.getMessage());
        }
    }

    public void findOne(long id){
        try {
            logger.info("getting one object");
        } catch (Exception ex) {
            logger.error("occurred an error getting an object: " + ex.getMessage());
        }
    }

    public void findAll(){
        try {
            logger.info("getting all objects");
        } catch (Exception ex) {
            logger.error("occurred an error getting all objects: " + ex.getMessage());
        }
    }

    public void update(){
        try {
            logger.info("updating object");
        } catch (Exception ex) {
            logger.error("occurred an error updating object: " + ex.getMessage());
        }
    }

    public void remove(){
        try {
            logger.info("removing object");
        } catch (Exception ex) {
            logger.error("occurred an error removing object: " + ex.getMessage());
        }
    }
}
