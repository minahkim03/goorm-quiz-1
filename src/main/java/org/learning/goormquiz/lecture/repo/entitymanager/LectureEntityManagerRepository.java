package org.learning.goormquiz.lecture.repo.entitymanager;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.Optional;
import org.learning.goormquiz.lecture.repo.entity.Lecture;
import org.springframework.stereotype.Repository;

@Repository
public class LectureEntityManagerRepository {

    @PersistenceContext
    private EntityManager em;

    public Optional<Lecture> findById(Long id) {
        return Optional.ofNullable(em.find(Lecture.class, id));
    }

    public void save(Lecture lecture) {
        if (lecture.getLectureId() == null) {
            em.persist(lecture);
            return;
        }
        em.merge(lecture);
    }

    public void delete(Lecture lecture) {
        if (lecture == null) {
            throw new IllegalArgumentException();
        }
        em.remove(lecture);
    }
}
