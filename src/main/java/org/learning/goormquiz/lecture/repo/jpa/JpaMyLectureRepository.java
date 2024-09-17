package org.learning.goormquiz.lecture.repo.jpa;

import java.util.List;
import org.learning.goormquiz.lecture.repo.entity.Lecture;
import org.learning.goormquiz.lecture.repo.entity.MyLecture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface JpaMyLectureRepository extends JpaRepository<MyLecture, Long> {

    @Query("select l from Lecture l"
        + " join fetch l.myLecture ml"
        + " join fetch ml.member m"
        + " where m.memberId=:memberId")
    List<Lecture> findAllByMemberId(@Param("memberId") Long memberId);
}
