package org.learning.goormquiz.lecture.repo;

import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.learning.goormquiz.lecture.domain.interfaces.LectureRepository;
import org.learning.goormquiz.lecture.repo.entity.Lecture;
import org.learning.goormquiz.lecture.repo.jpa.JpaLectureRepository;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class LectureRepositoryImpl implements LectureRepository {

    private final JpaLectureRepository lectureRepository;

    @Override
    public Optional<Lecture> findById(Long id) {
        return lectureRepository.findById(id);
    }

    @Override
    public void save(Lecture lecture) {
        lectureRepository.save(lecture);
    }

    @Override
    public void delete(Lecture lecture) {
        lectureRepository.delete(lecture);
    }
}
