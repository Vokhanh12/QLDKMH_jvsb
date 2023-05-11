package com.example.demo.Controller;

import com.example.demo.Entity.CourseRegistrationEntity;
import com.example.demo.Repository.CourseRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DangKyMHSVController {

    @Autowired
    private CourseRegistrationRepository courseRegistrationRepository;
    @PostMapping("/submit-form-dksv")
    @ResponseBody
    public String saveMH(@ModelAttribute CourseRegistrationEntity courseRegistrationEntity, @RequestParam String matk) {
        courseRegistrationEntity.setMaSV(matk);
        courseRegistrationRepository.save(courseRegistrationEntity);

        // Trả về danh sách đăng ký dưới dạng HTML
        List<CourseRegistrationEntity> listDk = courseRegistrationRepository.findByMaSV(matk);
        String html = "";
        for (CourseRegistrationEntity dk : listDk) {
            html += "<div>" + dk.getMaMH() + "</div>";
        }
        return html;
    }

}
