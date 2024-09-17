package org.learning.goormquiz.lecture.domain;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.learning.goormquiz.lecture.domain.dto.response.GetLectureResponseDto;
import org.learning.goormquiz.lecture.domain.interfaces.MyLectureRepository;
import org.learning.goormquiz.lecture.repo.entity.Lecture;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MyLectureService {

    private final MyLectureRepository myLectureRepository;

    List<GetLectureResponseDto> getMyLectures(Long memberId) {
        List<Lecture> lectures = myLectureRepository.findAllByMemberId(memberId);
        return lectures.stream().map(GetLectureResponseDto::fromEntity).toList();
    }
}
