package org.learning.goormquiz.lecture.application.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Builder;
import org.learning.goormquiz.lecture.domain.Lecture;

@Builder
public record GetLectureResponseDto(
    Long lectureId,
    String title,
    @JsonProperty(value = "image_url") String imageUrl,
    String instructor,
    int price,
    @JsonProperty(value = "lecture_url") String lectureUrl,
    List<String> goals,
    List<String> target) {

    public GetLectureResponseDto(Lecture lecture) {
        this.lectureId = lecture.getLectureId();
        this.title = lecture.getTitle();
        this.imageUrl = lecture.getImageUrl();
        this.instructor = lecture.getInstructor();
        this.price = lecture.getPrice();
        this.lectureUrl = lecture.getLectureUrl();
        this.goals = lecture.getGoals();
        this.target = lecture.getTarget();
    }

    public static GetLectureResponseDto fromEntity(Lecture lecture) {
        return GetLectureResponseDto.builder()
            .lectureId(lecture.getLectureId())
            .title(lecture.getTitle())
            .imageUrl(lecture.getImageUrl())
            .instructor(lecture.getInstructor())
            .price(lecture.getPrice())
            .lectureUrl(lecture.getLectureUrl())
            .goals(lecture.getGoals())
            .target(lecture.getTarget())
            .build();
    }
}
