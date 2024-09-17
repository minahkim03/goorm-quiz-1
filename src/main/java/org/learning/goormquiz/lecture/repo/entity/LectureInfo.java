package org.learning.goormquiz.lecture.repo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Lob;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class LectureInfo {

    private String title;

    @Lob
    @Column(columnDefinition = "TEXT")
    @Convert(converter = StringToListConverter.class)
    private List<String> goals;

    @Lob
    @Column(columnDefinition = "TEXT")
    @Convert(converter = StringToListConverter.class)
    private List<String> target;

    public void updateTitle(String title) {
        this.title = title;
    }
}
