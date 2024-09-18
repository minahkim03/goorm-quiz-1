package org.learning.goormquiz.lecture.application;

import lombok.RequiredArgsConstructor;
import org.learning.goormquiz.common.domain.dto.CommonSuccessDto;
import org.learning.goormquiz.lecture.application.dto.request.CreateLectureRequestDto;
import org.learning.goormquiz.lecture.application.dto.request.UpdateLectureTitleRequestDto;
import org.learning.goormquiz.lecture.application.dto.response.GetLectureResponseDto;
import org.learning.goormquiz.lecture.application.interfaces.LectureRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class LectureService {

    private final LectureRepository lectureRepository;

    /**
     * TODO
     * lectureRepository에서 데이터를 조회
     */
    public GetLectureResponseDto findLecture(Long lectureId) {
        return null;
    }

    /**
     * TODO
     * lectureRepository를 이용해 데이터를 생성
     */
    @Transactional
    public CommonSuccessDto createLecture(CreateLectureRequestDto dto) {
        return null;
    }

    /**
     * TODO
     * lectureRepository를 이용해 데이터의 title 변경
     */
    @Transactional
    public CommonSuccessDto updateLecture(Long lectureId, UpdateLectureTitleRequestDto dto) {
        return null;
    }

    /**
     * TODO
     * lectureRepository를 이용해 데이터 삭제
     */
    @Transactional
    public CommonSuccessDto deleteLecture(Long lectureId) {
        return null;
    }
}
