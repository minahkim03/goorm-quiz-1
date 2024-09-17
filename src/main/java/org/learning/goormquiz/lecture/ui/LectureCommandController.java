package org.learning.goormquiz.lecture.ui;

import lombok.RequiredArgsConstructor;
import org.learning.goormquiz.common.domain.dto.CommonSuccessDto;
import org.learning.goormquiz.lecture.application.LectureService;
import org.learning.goormquiz.lecture.application.dto.request.CreateLectureRequestDto;
import org.learning.goormquiz.lecture.application.dto.request.UpdateLectureTitleRequestDto;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/lecture")
@RequiredArgsConstructor
public class LectureCommandController {

    private final LectureService lectureService;

    @PostMapping
    public CommonSuccessDto createLecture(@RequestBody CreateLectureRequestDto dto) {
        return lectureService.createLecture(dto);
    }

    @PatchMapping("/{lecture_id}")
    public CommonSuccessDto updateLecture(@PathVariable("lecture_id") Long lectureId, @RequestBody
    UpdateLectureTitleRequestDto dto) {
        return lectureService.updateLecture(lectureId, dto);
    }

    @DeleteMapping("/{lecture_id}")
    public CommonSuccessDto deleteLecture(@PathVariable("lecture_id") Long lectureId) {
        return lectureService.deleteLecture(lectureId);
    }
}
