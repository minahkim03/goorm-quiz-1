package org.learning.goormquiz.lecture.application.interfaces;

import java.util.Optional;
import org.learning.goormquiz.lecture.domain.Lecture;

public interface LectureQueryRepository {
    Lecture findById(Long id);

}
