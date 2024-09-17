package org.learning.goormquiz.lecture.application.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public record CreateLectureRequestDto(
    String title,
    @JsonProperty(value = "image_url") String imageUrl,
    String instructor,
    int price,
    @JsonProperty(value = "lecture_url") String lectureUrl,
    List<String> goals,
    List<String> target) {

}
