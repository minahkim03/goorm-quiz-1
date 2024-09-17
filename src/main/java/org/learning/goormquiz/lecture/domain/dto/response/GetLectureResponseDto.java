package org.learning.goormquiz.lecture.domain.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public record GetLectureResponseDto(
    Long lectureId,
    String title,
    @JsonProperty(value = "image_url") String imageUrl,
    String instructor,
    int price,
    @JsonProperty(value = "lecture_url") String lectureUrl,
    List<String> goals,
    List<String> target) {
}
