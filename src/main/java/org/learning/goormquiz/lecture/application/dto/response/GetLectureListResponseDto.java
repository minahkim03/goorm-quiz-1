package org.learning.goormquiz.lecture.application.dto.response;

import java.util.List;
import org.learning.goormquiz.lecture.domain.Lectures;

public record GetLectureListResponseDto(List<GetLectureResponseDto> dtos) {

    public static GetLectureListResponseDto from(Lectures lectures) {
        return new GetLectureListResponseDto(lectures.
            getLectures().stream().map(GetLectureResponseDto::new).toList());
    }
}
