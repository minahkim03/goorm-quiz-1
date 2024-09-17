package org.learning.goormquiz.lecture.repo;

import lombok.RequiredArgsConstructor;
import org.learning.goormquiz.lecture.application.interfaces.LectureCommandRepository;
import org.learning.goormquiz.lecture.domain.Lecture;
import org.learning.goormquiz.lecture.repo.entity.LectureEntity;
import org.learning.goormquiz.lecture.repo.jpa.JpaLectureCommandRepository;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class LectureCommandRepositoryImpl implements LectureCommandRepository {

    private final JpaLectureCommandRepository lectureCommandRepository;

    @Override
    public void save(Lecture lecture) {
        lectureCommandRepository.save(new LectureEntity(lecture));
    }

    @Override
    public void delete(Lecture lecture) {
        lectureCommandRepository.delete(new LectureEntity(lecture));
    }
}
