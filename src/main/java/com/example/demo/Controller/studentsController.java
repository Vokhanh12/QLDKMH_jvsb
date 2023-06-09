package com.example.demo.Controller;

import com.example.demo.Entity.StudentEntity;
import com.example.demo.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class studentsController {

    @Autowired
    private StudentRepository studentRepository;



    @PostMapping("/delete-record-sv")
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

    @PostMapping("/submit-form-sv")
    public String SaveStudent(@ModelAttribute("student") StudentEntity studentEnity) {
        studentRepository.save(studentEnity);
        return "redirect:/pageADMIN";
    }
    @PostMapping("/save-record-sv")
    public ResponseEntity<String> saveRecord(@RequestParam Long id, @RequestParam String maSV, @RequestParam String tenSV) {
        // find the record in the database by name
        Optional<StudentEntity> student = studentRepository.findById(id);
        if (student.isPresent()) {
            StudentEntity studentEntity = student.get();
            // xử lý đối tượng student
            studentEntity.setInputMaSV(maSV);
            studentEntity.setInputTenSV(tenSV);
            studentRepository.save(studentEntity);

            return ResponseEntity.ok("Bản ghi đã được cập nhật.");
        } else {
            // không tìm thấy đối tượng student với id tương ứng
            return ResponseEntity.badRequest().body("Không tìm thấy sinh viên với ID tương ứng.");
        }
    }



}

