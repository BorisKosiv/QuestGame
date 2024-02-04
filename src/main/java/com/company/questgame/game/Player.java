package com.company.questgame.game;

import com.company.questgame.game.question.Question;
import com.company.questgame.game.repository.Repository;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Player {
    private Repository repository = Repository.getInstance();

    private Question currentQuestion = repository.getFirstQuestion();
    private Map<Integer,Question> questions = repository.getQuestions();

    public Player(Repository repository, Question currentQuestion, Map<Integer, Question> questions) {
        this.repository = repository;
        this.currentQuestion = currentQuestion;
        this.questions = questions;
    }

    public Player() {
        this.currentQuestion = repository.getFirstQuestion();

    }

    public void nextQuestion(String answer) {
        int answerIndex = Integer.parseInt(answer);
        Question question = questions.get(answerIndex);
        if (Objects.isNull(question)) {
            question = repository.getFirstQuestion();
        }
        currentQuestion = question;
    }
public List<Question> getNextQuestions() {
        List<Integer> nextQuestions = currentQuestion.getNextQuestions();
        return questions.entrySet().stream()
                .filter(entry -> nextQuestions.contains(entry.getKey()))
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
    }
    public Question getCurrentQuestion() {
        return currentQuestion;
    }


}
