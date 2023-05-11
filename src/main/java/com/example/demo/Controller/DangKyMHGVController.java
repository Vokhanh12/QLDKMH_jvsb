package com.example.demo.Controller;

import com.example.demo.Entity.CourseRegistrationEntity;
import com.example.demo.Entity.CourseTeachEntity;
import com.example.demo.Repository.CourseRegistrationRepository;
import com.example.demo.Repository.CourseTeachRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DangKyMHGVController {

    @Autowired
    private CourseTeachRepository courseTeachRepository;
    @PostMapping("/submit-form-dkgv")
    @ResponseBody
    public String saveMH(@ModelAttribute CourseTeachEntity courseTeachEntity, @RequestParam String matk) {
        courseTeachEntity.setMaGV(matk);
        courseTeachRepository.save(courseTeachEntity);

        // Trả về danh sách đăng ký dưới dạng HTML
        List<CourseTeachEntity> listDk = courseTeachRepository.findByMaGV(matk);
        String html = "";
        for (CourseTeachEntity dk : listDk) {
            html += "<div>" + dk.getMaMH() + "</div>";
        }
        return html;
    }

}