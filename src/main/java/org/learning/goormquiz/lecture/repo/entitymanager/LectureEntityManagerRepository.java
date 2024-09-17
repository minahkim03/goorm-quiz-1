package org.learning.goormquiz.lecture.repo.entitymanager;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.Optional;
import org.learning.goormquiz.lecture.repo.entity.LectureEntity;
import org.springframework.stereotype.Repository;

@Repository
public class LectureEntityManagerRepository {

    @PersistenceContext
    private EntityManager em;

    public Optional<LectureEntity> findById(Long id) {
        return Optional.ofNullable(em.find(LectureEntity.class, id));
    }

    public void save(LectureEntity lecture) {
        if (lecture.getLectureId() == null) {
            em.persist(lecture);
            return;
        }
        em.merge(lecture);
    }

    public void delete(LectureEntity lecture) {
        if (lecture == null) {
            throw new IllegalArgumentException();
        }
        em.remove(lecture);
    }
}
