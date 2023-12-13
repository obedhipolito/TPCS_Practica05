/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/RestController.java to edit this template
 */
package org.uv.TPCS_Practica5.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author obed
 */
@RestController
@RequestMapping("/api/hola")
public class Hola {
    
    @GetMapping()
    public DTOUsuario msg(){
        DTOUsuario usr= new DTOUsuario("obed","oriente 6","287172");
        return usr;
    }
    
    @GetMapping("{id}")
    public DTOUsuario msg(@PathVariable("id")Long id){
        DTOUsuario usr= new DTOUsuario("obed"+id,"oriente 6"+id,"282727"+id);
        return usr;
    }
    
    @PostMapping()
    public String msg2(@RequestBody  DTOUsuario usr){
        String msg="se recibio" + usr.getNombre()+ "--"+ usr.getDireccion();
        return "{msg:"+ msg+"}";
    }
    
}
