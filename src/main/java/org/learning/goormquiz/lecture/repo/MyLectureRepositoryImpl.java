package org.learning.goormquiz.lecture.repo;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.learning.goormquiz.lecture.domain.interfaces.MyLectureRepository;
import org.learning.goormquiz.lecture.repo.entity.Lecture;
import org.learning.goormquiz.lecture.repo.jpa.JpaMyLectureRepository;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MyLectureRepositoryImpl implements MyLectureRepository {

    private final JpaMyLectureRepository myLectureRepository;

    public List<Lecture> findAllByMemberId(Long memberId) {
        return myLectureRepository.findAllByMemberId(memberId);
    }
}
