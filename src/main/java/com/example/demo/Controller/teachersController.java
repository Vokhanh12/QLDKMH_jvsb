package com.example.demo.Controller;

import com.example.demo.Entity.StudentEntity;
import com.example.demo.Entity.TeacherEntity;
import com.example.demo.Repository.StudentRepository;
import com.example.demo.Repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class teachersController {

    @Autowired
    private TeacherRepository teacherRepository;
    @PostMapping("/submit-form-gv")
    public String SaveStudent(@ModelAttribute("teacher") TeacherEntity teacherEntity) {
        teacherRepository.save(teacherEntity);
        return "redirect:/pageADMIN";
    }

    @PostMapping("/delete-record-gv")
    public ResponseEntity<String> deleteRecord(@RequestParam("id") Long id) {
        try {
            teacherRepository.deleteById(id);
            return ResponseEntity.ok("Bản ghi đã được xóa.");
        } catch (NumberFormatException e) {
            return ResponseEntity.badRequest().body("ID không hợp lệ.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Lỗi khi xóa bản ghi.");
        }

    }

    @PostMapping("/save-record-gv")
    public ResponseEntity<String> saveRecord(@RequestParam Long id, @RequestParam String maGV, @RequestParam String tenGV) {
        // find the record in the database by name
        Optional<TeacherEntity> teacher = teacherRepository.findById(id);
        if (teacher.isPresent()) {
            TeacherEntity teacherEntity = teacher.get();
            // xử lý đối tượng student
            teacherEntity.setInputMaGV(maGV);
            teacherEntity.setInputTenGV(tenGV);
            teacherRepository.save(teacherEntity);

            return ResponseEntity.ok("Bản ghi đã được cập nhật.");
        } else {
            // không tìm thấy đối tượng student với id tương ứng
            return ResponseEntity.badRequest().body("Không tìm thấy sinh viên với ID tương ứng.");
        }
    }


}
