package org.learning.goormquiz.lecture.domain.interfaces;

import java.util.Optional;
import org.learning.goormquiz.lecture.repo.entity.Lecture;

public interface LectureCommandRepository {

    void save(Lecture lecture);
    void delete(Lecture lecture);
}
