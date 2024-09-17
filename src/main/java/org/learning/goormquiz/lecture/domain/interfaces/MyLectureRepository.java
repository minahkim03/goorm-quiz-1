package org.learning.goormquiz.lecture.domain.interfaces;

import java.util.List;
import org.learning.goormquiz.lecture.repo.entity.Lecture;

public interface MyLectureRepository {

    List<Lecture> findAllByMemberId(Long memberId);
}
