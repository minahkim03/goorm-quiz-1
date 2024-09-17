package org.learning.goormquiz.lecture.ui;

import lombok.RequiredArgsConstructor;
import org.learning.goormquiz.lecture.application.LectureService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/lecture")
@RequiredArgsConstructor
public class MyLectureController {

    private final LectureService lectureService;

}
