package org.learning.goormquiz.lecture.application;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.learning.goormquiz.lecture.application.dto.response.GetLectureListResponseDto;
import org.learning.goormquiz.lecture.domain.Lectures;
import org.learning.goormquiz.lecture.application.dto.response.GetLectureResponseDto;
import org.learning.goormquiz.lecture.application.interfaces.MyLectureRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MyLectureService {

    private final MyLectureRepository myLectureRepository;

    public GetLectureListResponseDto getMyLectures(Long memberId) {
        Lectures lectures = myLectureRepository.findAllByMemberId(memberId);
        return GetLectureListResponseDto.from(lectures);
    }
}
