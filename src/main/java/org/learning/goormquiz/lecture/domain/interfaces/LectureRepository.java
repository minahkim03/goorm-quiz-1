package org.learning.goormquiz.lecture.domain.interfaces;

import java.util.Optional;
import org.learning.goormquiz.lecture.repo.entity.Lecture;

public interface LectureRepository {

    Optional<Lecture> findById(Long id);
    void save(Lecture lecture);
    void delete(Lecture lecture);
}
