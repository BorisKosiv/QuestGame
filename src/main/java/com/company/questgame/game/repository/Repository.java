package com.company.questgame.game.repository;

import com.company.questgame.game.question.Question;

import java.util.HashMap;
import java.util.Map;

public class Repository {
    private static Repository instance;
    private final Map<Integer, Question> questions;
    private final Question firstQuestion ;



    private Repository() {
        Question question = new Question(1, "Ви втрачаєте пам'ять.", "Прийняти виклик НЛО",2,3);
        questions = new HashMap<>() {
            {
                put(1, question);
                put(2, new Question(2, "Ви прийняли виклик НЛО.", "Прийняти виклик НЛО?", 4, 5));
                put(3, new Question(3, "Відхилили виклик НЛО?", "Відхилити виклик НЛО?",11));
                put(4, new Question(4, "Ви піднялися на капітанський місток?", "Піднятися на капітанський місток?", 6, 7));
                put(5, new Question(5, "Відмовилися підніматися на капітанський місток?", "Відмовитися підніматися на капітанський місток?",11));
                put(6, new Question(6, "Ви піднялися на місток. Хто ви?", "Ви піднялися на місток. Хто Ви?", 8, 9));
                put(7, new Question(7, "Ви не піднялися на місток?", "Ви не піднялися на місток?", 11));
                put(8, new Question(8, "Розповіли правду про себе?", "Розповісти правду про себе?", 10, 11));     ;
                put(9, new Question(9, "Збрехали про себе?", "Збрехати про себе?",  11));
                put(10, new Question(10, "Вас повернули додому. Перемога.", "Вас повернули додому. Перемога."));
                put(11, new Question(11, "Вас затримали? Поразка.", "Вас затримали.Поразка."));
                put (12, new Question(12, "Вас затримали.Поразка.", "Поразка"));
            }

        };
        this.firstQuestion = question;
    }

        public static Repository getInstance() {
            if (instance == null) {
                instance = new Repository();
            }
            return instance;
        }
        public Map<Integer, Question> getQuestions() {
            return questions;
        }
        public Question getFirstQuestion() {
            return firstQuestion;
        }
    }
