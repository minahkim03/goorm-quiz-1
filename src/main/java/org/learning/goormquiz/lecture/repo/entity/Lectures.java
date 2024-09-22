package org.learning.goormquiz.lecture.repo.entity;

import jakarta.persistence.Entity;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Lectures {
    private List<LectureEntity> lectures;
}
