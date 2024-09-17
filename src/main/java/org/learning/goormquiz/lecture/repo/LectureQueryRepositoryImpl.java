package org.learning.goormquiz.lecture.repo;

import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.learning.goormquiz.lecture.domain.interfaces.LectureQueryRepository;
import org.learning.goormquiz.lecture.repo.entity.Lecture;
import org.learning.goormquiz.lecture.repo.jpa.JpaLectureQueryRepository;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class LectureQueryRepositoryImpl implements LectureQueryRepository {

    private final JpaLectureQueryRepository lectureQueryRepository;

    @Override
    public Optional<Lecture> findById(Long id) {
        return lectureQueryRepository.findById(id);
    }
}
