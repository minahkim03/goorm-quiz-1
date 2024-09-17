package org.learning.goormquiz.lecture.domain;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Lecture {

    private Long lectureId;
    private LectureInfo lectureInfo;
    private String instructor;
    private String imageUrl;
    private Price price;
    private String lectureUrl;

    public int getPrice() {
        return price.getPrice();
    }

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
