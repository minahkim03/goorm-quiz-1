package org.learning.goormquiz.lecture.repo.jpa;

import org.learning.goormquiz.lecture.repo.entity.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaLectureRepository extends JpaRepository<Lecture, Long> {

}
