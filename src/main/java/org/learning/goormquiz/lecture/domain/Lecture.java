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
    private MyLectures myLectures;

    public Lecture(Long lectureId, LectureInfo lectureInfo, String instructor, String imageUrl,
        Price price, String lectureUrl) {
        this.lectureId = lectureId;
        this.lectureInfo = lectureInfo;
        this.instructor = instructor;
        this.imageUrl = imageUrl;
        this.price = price;
        this.lectureUrl = lectureUrl;
    }

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

    public List<MyLecture> getMyLectures() {
        return myLectures.getMyLectures();
    }

    public void updateTitle(String title) {
        this.lectureInfo.updateTitle(title);
    }

}
