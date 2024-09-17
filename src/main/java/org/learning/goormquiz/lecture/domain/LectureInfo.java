package org.learning.goormquiz.lecture.domain;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class LectureInfo {

    private String title;
    private List<String> goals;
    private List<String> target;

    public void updateTitle(String title) {
        this.title = title;
    }
}
