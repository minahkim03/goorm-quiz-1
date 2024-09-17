package org.learning.goormquiz.lecture.repo;

import lombok.RequiredArgsConstructor;
import org.learning.goormquiz.lecture.application.interfaces.LectureQueryRepository;
import org.learning.goormquiz.lecture.domain.Lecture;
import org.learning.goormquiz.lecture.repo.jpa.JpaLectureQueryRepository;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class LectureQueryRepositoryImpl implements LectureQueryRepository {

    private final JpaLectureQueryRepository lectureQueryRepository;

    @Override
    public Lecture findById(Long id) {
        return lectureQueryRepository.findById(id)
            .orElseThrow(IllegalArgumentException::new).toLecture();
    }
}
