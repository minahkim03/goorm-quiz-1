package org.learning.goormquiz.lecture.domain.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public record DeleteLectureRequestDto(@JsonProperty(value = "lecture_id") Long lectureId) {

}
