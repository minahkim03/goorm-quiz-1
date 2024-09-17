package org.learning.goormquiz.lecture.application;

import lombok.RequiredArgsConstructor;
import org.learning.goormquiz.common.domain.dto.CommonSuccessDto;
import org.learning.goormquiz.lecture.domain.Lecture;
import org.learning.goormquiz.lecture.domain.LectureInfo;
import org.learning.goormquiz.lecture.domain.Price;
import org.learning.goormquiz.lecture.application.dto.request.CreateLectureRequestDto;
import org.learning.goormquiz.lecture.application.dto.request.UpdateLectureTitleRequestDto;
import org.learning.goormquiz.lecture.application.dto.response.GetLectureResponseDto;
import org.learning.goormquiz.lecture.application.interfaces.LectureCommandRepository;
import org.learning.goormquiz.lecture.application.interfaces.LectureQueryRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class LectureService {

    private final LectureQueryRepository lectureQueryRepository;
    private final LectureCommandRepository lectureCommandRepository;

    public GetLectureResponseDto findLecture(Long lectureId) {
        Lecture lecture = lectureQueryRepository.findById(lectureId);
        return GetLectureResponseDto.fromEntity(lecture);
    }

    @Transactional
    public CommonSuccessDto createLecture(CreateLectureRequestDto dto) {
        LectureInfo info = new LectureInfo(dto.title(), dto.goals(), dto.target());
        Lecture lecture = new Lecture(null, info, dto.instructor(), dto.imageUrl(),
            new Price(dto.price()), dto.lectureUrl());
        lectureCommandRepository.save(lecture);
        return new CommonSuccessDto(true);
    }

    @Transactional
    public CommonSuccessDto updateLecture(Long lectureId, UpdateLectureTitleRequestDto dto) {
        Lecture lecture = lectureQueryRepository.findById(lectureId);
        lecture.updateTitle(dto.title());
        return new CommonSuccessDto(true);
    }

    @Transactional
    public CommonSuccessDto deleteLecture(Long lectureId) {
        Lecture lecture = lectureQueryRepository.findById(lectureId);
        lectureCommandRepository.delete(lecture);
        return new CommonSuccessDto(true);
    }
}
