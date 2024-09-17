package org.learning.goormquiz.lecture.repo.jpa;

import java.util.List;
import org.learning.goormquiz.lecture.repo.entity.LectureEntity;
import org.learning.goormquiz.lecture.repo.entity.MyLectureEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface JpaMyLectureRepository extends JpaRepository<MyLectureEntity, Long> {

    @Query("select l from LectureEntity l"
        + " join fetch l.myLectures ml"
        + " join fetch ml.member m"
        + " where m.memberId=:memberId")
    List<LectureEntity> findAllByMemberId(@Param("memberId") Long memberId);
}
