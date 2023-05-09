package com.example.demo.Controller;

import com.example.demo.Entity.StudentEnity;
import com.example.demo.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

@Controller
public class studentsController {

    @Autowired
    private StudentRepository studentRepository;


    @PostMapping("/submit-form")
    public String registerUser(@ModelAttribute("student") StudentEnity studentEnity) {
        studentRepository.save(studentEnity);
        return "redirect:/pageADMIN";
    }


    //this line is a buggggg du maaaaa
    @GetMapping("/pageADMIN")
    public String showAdminPage() {
        // trả về view cho trang admin
        return "pageADMIN";
    }


    @PostMapping("/delete-record")
    public ResponseEntity<String> deleteRecord(@RequestParam("id") Long id) {
        try {
            studentRepository.deleteById(id);
            return ResponseEntity.ok("Bản ghi đã được xóa.");
        } catch (NumberFormatException e) {
            return ResponseEntity.badRequest().body("ID không hợp lệ.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Lỗi khi xóa bản ghi.");
        }

    }
}

