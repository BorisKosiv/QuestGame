package com.company.questgame.game.question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question {
    private final Integer value;
    private final String titleEng;
    private final String textEng;

    private final List<Integer> nextQuestions;

    public Question(Integer value, String titleEng, String textEng,Integer  ... next) {
        this.value = value;
        this.titleEng = titleEng;
        this.textEng = textEng;
        this.nextQuestions = new ArrayList<>(Arrays.asList(next));
    }
    public Integer getValue() {
        return value;
    }

    public String getTitleEng() {
        return titleEng;
    }

    public List<Integer> getNextQuestions() {
        return nextQuestions;
    }


    public String getTextEng() {
        return textEng;
    }
}
