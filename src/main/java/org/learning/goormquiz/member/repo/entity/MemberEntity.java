package org.learning.goormquiz.member.repo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.learning.goormquiz.lecture.repo.entity.MyLectureEntity;

@Getter
@Entity
@NoArgsConstructor
@Table(name = "member")
public class MemberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long memberId;

    private String name;

    private String email;

    private String password;

    private String role;

    @OneToMany(mappedBy = "member")
    private List<MyLectureEntity> myLectures = new ArrayList<>();
}
