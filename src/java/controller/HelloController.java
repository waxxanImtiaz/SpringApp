/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import beans.Person;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author imtiaz-ali
 */
public class HelloController implements Controller {
    private Person person;
    @Override 
    public ModelAndView handleRequest(HttpServletRequest req,HttpServletResponse res){
        person = new Person();
        person.setName("Imtiaz Ali");
        person.setAge(23);
        return new ModelAndView("hellopage","person",person);
    }
    
}
