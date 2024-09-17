package org.learning.goormquiz.lecture.repo.jpa;

import org.learning.goormquiz.lecture.repo.entity.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaLectureQueryRepository extends JpaRepository<Lecture, Long> {

}
