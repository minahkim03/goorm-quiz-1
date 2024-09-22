package org.learning.goormquiz.lecture.repo.jpa;

import jakarta.persistence.EntityNotFoundException;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.learning.goormquiz.lecture.application.interfaces.LectureRepository;
import org.learning.goormquiz.lecture.repo.entity.LectureEntity;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class LectureRepositoryImpl implements LectureRepository {

    JpaLectureRepository jpaLectureRepository;

    @Override
    public void save(LectureEntity lectureEntity) {
        jpaLectureRepository.save(lectureEntity);
    }

    @Override
    public void findById(Long id) {
        jpaLectureRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        Optional<LectureEntity> lecture = jpaLectureRepository.findById(id);
        if (lecture.isPresent()) {
            LectureEntity lectureEntity = lecture.get();
            jpaLectureRepository.delete(lectureEntity);
        } else {
            throw new EntityNotFoundException();
        }
    }
}
