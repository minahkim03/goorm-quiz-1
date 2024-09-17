package org.learning.goormquiz.lecture.application.interfaces;

import org.learning.goormquiz.lecture.domain.Lectures;

public interface MyLectureRepository {

    Lectures findAllByMemberId(Long memberId);
}
