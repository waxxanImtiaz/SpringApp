/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import beans.Person;
import java.util.InputMismatchException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author imtiaz-ali
 */
public class FormHandler implements Controller {
    
    @Override
    public ModelAndView handleRequest(HttpServletRequest req,HttpServletResponse res){
        String name = req.getParameter("name");
        String age = req.getParameter("age");
        
        Person  person = new Person();
        try{
        person.setAge(Integer.parseInt(age));
        person.setName(name);
        }catch(InputMismatchException e){
            e.printStackTrace();
        }
        
        return new ModelAndView("hellopage","person",person);
    } 
    
}
