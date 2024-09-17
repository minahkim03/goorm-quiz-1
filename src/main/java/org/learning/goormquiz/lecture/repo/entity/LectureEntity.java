package org.learning.goormquiz.lecture.repo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.learning.goormquiz.lecture.domain.Lecture;
import org.learning.goormquiz.lecture.domain.LectureInfo;
import org.learning.goormquiz.lecture.domain.MyLectures;
import org.learning.goormquiz.lecture.domain.Price;

@Getter
@Entity
@NoArgsConstructor
public class LectureEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lecture_id")
    private Long lectureId;

    @Embedded
    private LectureInfoEntity lectureInfo;

    private String instructor;

    private String imageUrl;

    @Embedded
    private PriceEntity price;

    private String lectureUrl;

    @OneToMany
    @JoinColumn(name = "my_lecture")
    private List<MyLectureEntity> myLectures = new ArrayList<>();

    public LectureEntity(Long lectureId, LectureInfoEntity lectureInfo, String instructor,
        String imageUrl,
        PriceEntity price, String lectureUrl) {
        this.lectureId = lectureId;
        this.lectureInfo = lectureInfo;
        this.instructor = instructor;
        this.imageUrl = imageUrl;
        this.price = price;
        this.lectureUrl = lectureUrl;
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

    public int getPrice() {
        return price.getPrice();
    }


    public LectureEntity(Lecture lecture) {
        this.lectureId = lecture.getLectureId();
        this.lectureInfo =
            new LectureInfoEntity(lecture.getTitle(), lecture.getGoals(), lecture.getTarget());
        this.instructor = lecture.getInstructor();
        this.imageUrl = lecture.getImageUrl();
        this.price = new PriceEntity(lecture.getPrice());
        this.lectureUrl = lecture.getLectureUrl();
        this.myLectures = lecture.getMyLectures().stream()
            .map(myLecture -> new MyLectureEntity(myLecture, this)).toList();
    }

    public Lecture toLecture() {
        return new Lecture(lectureId, new LectureInfo(getTitle(), getGoals(), getTarget()),
            instructor, imageUrl, new Price(getPrice()), lectureUrl,
            new MyLectures(myLectures.stream().map(MyLectureEntity::toMyLecture).toList()));
    }
}
