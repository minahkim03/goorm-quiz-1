package org.learning.goormquiz.lecture.ui;

import lombok.RequiredArgsConstructor;
import org.learning.goormquiz.lecture.application.LectureService;
import org.learning.goormquiz.lecture.application.MyLectureService;
import org.learning.goormquiz.lecture.application.dto.response.GetLectureListResponseDto;
import org.learning.goormquiz.lecture.application.dto.response.GetLectureResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/lecture")
@RequiredArgsConstructor
public class LectureQueryController {

    private final LectureService lectureService;
    private final MyLectureService myLectureService;

    @GetMapping("/{lecture_id}")
    public GetLectureResponseDto getLecture(@PathVariable("lecture_id") Long lectureId) {
        return lectureService.findLecture(lectureId);
    }

    @GetMapping
    public GetLectureListResponseDto getLectures(@RequestParam("member_id") Long memberId) {
        return myLectureService.getMyLectures(memberId);
    }
}
