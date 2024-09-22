package org.learning.goormquiz.lecture.repo.entitymanager;

import jakarta.annotation.Nullable;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.PersistenceContext;
import java.util.Optional;
import org.learning.goormquiz.lecture.repo.entity.LectureEntity;
import org.springframework.stereotype.Repository;

@Repository
public class LectureEntityManagerRepository {

    @PersistenceContext
    private EntityManager em;

    //Create, Update
    public void save(LectureEntity lecture) {
        em.persist(lecture);
    }

    //Read
    public Optional<LectureEntity> findById(Long id) {
        return Optional.ofNullable(em.find(LectureEntity.class, id));
    }

    //Delete
    public void delete(Long id) {
        Optional<LectureEntity> lectureEntity = Optional.ofNullable(em.find(LectureEntity.class, id));
        if (lectureEntity.isPresent()) {
            em.remove(lectureEntity);
        } else {
            throw new EntityNotFoundException();
        }
    }
}
