package org.learning.goormquiz.lecture.repo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.learning.goormquiz.lecture.domain.MyLecture;
import org.learning.goormquiz.member.repo.entity.MemberEntity;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MyLectureEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private MemberEntity member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lecture_id")
    private LectureEntity lecture;

    public MyLectureEntity(MyLecture myLecture, LectureEntity lectureEntity) {
        this.id = myLecture.getId();
        this.member = new MemberEntity(myLecture.getMember());
        this.lecture = lectureEntity;
    }

    public MyLecture toMyLecture() {
        return new MyLecture(id, member.toMember(), lecture.toLecture());
    }
}
