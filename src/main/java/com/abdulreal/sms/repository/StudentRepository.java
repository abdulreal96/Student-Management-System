/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.abdulreal.sms.repository;

import com.abdulreal.sms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Omar
 */
public interface StudentRepository extends JpaRepository<Student, Long> {
    
}
