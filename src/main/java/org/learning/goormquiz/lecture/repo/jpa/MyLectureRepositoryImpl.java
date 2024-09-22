package org.learning.goormquiz.lecture.repo.jpa;

import lombok.RequiredArgsConstructor;
import org.learning.goormquiz.lecture.application.interfaces.MyLectureRepository;
import org.learning.goormquiz.lecture.repo.entity.Lectures;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MyLectureRepositoryImpl implements MyLectureRepository {

    JpaMyLectureRepository myLectureRepository;

    @Override
    public Lectures findAllByMemberId(Long memberId) {
        return (Lectures) myLectureRepository.findAllByMemberId(memberId);
    }
}
