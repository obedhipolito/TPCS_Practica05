/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Repository.java to edit this template
 */
package org.uv.TPCS_Practica5.data;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author obed
 */
public interface RepositoryEmpleado extends JpaRepository<Empleado, Long> {
    
}
