package org.learning.goormquiz.lecture.domain;

import lombok.RequiredArgsConstructor;
import org.learning.goormquiz.common.domain.dto.CommonSuccessDto;
import org.learning.goormquiz.lecture.domain.dto.request.CreateLectureRequestDto;
import org.learning.goormquiz.lecture.domain.dto.request.UpdateLectureTitleRequestDto;
import org.learning.goormquiz.lecture.domain.dto.response.GetLectureResponseDto;
import org.learning.goormquiz.lecture.domain.interfaces.LectureCommandRepository;
import org.learning.goormquiz.lecture.domain.interfaces.LectureQueryRepository;
import org.learning.goormquiz.lecture.repo.entity.Lecture;
import org.learning.goormquiz.lecture.repo.entity.LectureInfo;
import org.learning.goormquiz.lecture.repo.entity.Price;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class LectureService {

    private final LectureQueryRepository lectureQueryRepository;
    private final LectureCommandRepository lectureCommandRepository;

    public GetLectureResponseDto findLecture(Long lectureId) {
        Lecture lecture = lectureQueryRepository.findById(lectureId)
            .orElseThrow(IllegalArgumentException::new);
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
        Lecture lecture = lectureQueryRepository.findById(lectureId)
            .orElseThrow(IllegalArgumentException::new);
        lecture.updateTitle(dto.title());
        return new CommonSuccessDto(true);
    }

    @Transactional
    public CommonSuccessDto deleteLecture(Long lectureId) {
        Lecture lecture = lectureQueryRepository.findById(lectureId)
            .orElseThrow(IllegalArgumentException::new);
        lectureCommandRepository.delete(lecture);
        return new CommonSuccessDto(true);
    }
}
