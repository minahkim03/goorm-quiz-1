package org.learning.goormquiz.lecture.application.interfaces;

import org.learning.goormquiz.lecture.repo.entity.LectureEntity;

public interface LectureRepository {
    void save(LectureEntity lectureEntity);

    void findById(Long id);

    void delete(Long id);
}
