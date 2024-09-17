package org.learning.goormquiz.lecture.application.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public record DeleteLectureRequestDto(@JsonProperty(value = "lecture_id") Long lectureId) {

}
