package org.learning.goormquiz.lecture.repo.jpa;

import org.learning.goormquiz.lecture.repo.entity.LectureEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaLectureCommandRepository extends JpaRepository<LectureEntity, Long> {

}
