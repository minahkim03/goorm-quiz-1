package org.learning.goormquiz.lecture.repo.jpa;

import java.util.List;
import org.learning.goormquiz.lecture.repo.entity.Lectures;
import org.learning.goormquiz.lecture.repo.entity.MyLectureEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface JpaMyLectureRepository extends JpaRepository<MyLectureEntity, Long> {

    @Query("SELECT l FROM LectureEntity l JOIN FETCH l.myLectures ml JOIN FETCH ml.member m WHERE m.memberId = :id")
    public List<Lectures> findAllByMemberId(@Param("id") Long id);

}
