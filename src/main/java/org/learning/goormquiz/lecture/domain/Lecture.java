package org.learning.goormquiz.lecture.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Lecture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lecture_id")
    private Long lectureId;

    @Embedded
    private LectureInfo lectureInfo;

    private String instructor;

    private String imageUrl;

    private int price;

    private String lectureUrl;

    public String getTitle() {
        return lectureInfo.getTitle();
    }

    public List<String> getGoals() {
        return lectureInfo.getGoals();
    }

    public List<String> getTarget() {
        return lectureInfo.getTarget();
    }

    public void updateTitle(String title) {
        this.lectureInfo.updateTitle(title);
    }
}
