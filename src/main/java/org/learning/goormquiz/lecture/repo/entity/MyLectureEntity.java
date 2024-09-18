package org.learning.goormquiz.lecture.repo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "my_lecture")
public class MyLectureEntity {

    /**
     * lecture, member 연관관계
     */
}
