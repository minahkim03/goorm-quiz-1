package org.learning.goormquiz.lecture.repo;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.learning.goormquiz.lecture.domain.Lectures;
import org.learning.goormquiz.lecture.application.interfaces.MyLectureRepository;
import org.learning.goormquiz.lecture.repo.entity.LectureEntity;
import org.learning.goormquiz.lecture.repo.jpa.JpaMyLectureRepository;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MyLectureRepositoryImpl implements MyLectureRepository {

    private final JpaMyLectureRepository myLectureRepository;

    public Lectures findAllByMemberId(Long memberId) {
        List<LectureEntity> entities = myLectureRepository.findAllByMemberId(memberId);
        return new Lectures(entities.stream().map(LectureEntity::toLecture).toList());
    }
}
