/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abdulreal.sms.service;

import com.abdulreal.sms.entity.Student;
import com.abdulreal.sms.repository.StudentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Omar
 */
@Service
public class StudentService {
    
    @Autowired
    StudentRepository studentRepository;
    
    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }
    
    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }
    
    public Student updateStudent(Student student){
        return studentRepository.save(student);
    }
    
    public Student getStudentById(Long id){
        return studentRepository.findById(id).get();
    }
    
    public void deleteStudentById(Long id){
        studentRepository.deleteById(id);
    }
}
