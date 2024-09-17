package org.learning.goormquiz.lecture.application.interfaces;

import org.learning.goormquiz.lecture.domain.Lecture;

public interface LectureCommandRepository {

    void save(Lecture lecture);
    void delete(Lecture lecture);
}
