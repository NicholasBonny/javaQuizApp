package com.example.android.quizapp_test;

/**
 * Created by user on 5/16/2018.
 */

public class QuestionLibrary {

    public String mQuestions[] = {
      "A process 'that involves recognizing' and focusing on the important " +
              "characteristics of a situation or object is known as:",

            "Which statement is true regarding an object?",

            " In object-oriented programming, composition relates to",

            " In object-oriented programming, new classes can be defined by extending existing classes. This is an example of:",

            "Which of the following does not belong: If a class inherits from some other class, it should",

            "Object-oriented inheritance models the",

            "The wrapping up of data and functions into a single unit is called",

            " Polymorphism",

            "In object-oriented programming, new classes can be defined by extending existing classes. This is an example of:",

            "Given a class named student, which of the following is a valid constructor declaration for the class?"
    };

    public String mChoice[][] = {
            {"(a) Abstraction ", "(b) Object persistence.","(c) Inheritance"},

            {"(a) An object is what classes instantiated are from", "(b) An object is an instance of a class", "(c) An object is a variable"},

            {"(a) The use of consistent coding conventions", "(b) The organization of components interacting to achieve a coherent, common behavior",
                    "(c) The use of inheritance to achieve polymorphic behavior"},

            {"(a) Composition","(b) Inheritance","(c) Aggregation."},

            {"(a) Make use of the parent class’s capabilities", "(b) Over-ride or add the minimum to accomplish the derived class purpose",
            "(c) Over-ride all the methods of its parent class"},

            {"(a) 'has a' relationship","(b) 'is a kind of' relationship",
                    "(c) 'want to be' relationship"},
            {"(a) Encapsulation","(b) Abstraction","(c)Data Handling"},
            {"(a) Simplifies code maintenance",
                    "(b) Not simplifies code maintenance",
                    "(c) Refers to the ability of two or more objects belonging to " +
                            "different classes to respond to exactly the same message " +
                            "in different class-specific ways and simplifies code maintenance."},
            {"(a) Encapsulation"," (b) Composition"
                    ,"(c) Inheritance "},
            {"(a) Student (student s) { }","(b) Student student ( ) { }",
                    "(c) Private final student ( ) { }"}
    };

    public String mCorrectAnswers[] ={
            "(a) Abstraction ",
            "(b) An object is an instance of a class",
            "(b) The organization of components interacting to achieve a coherent, common behavior",
            "(b) Inheritance",
            "(c) Over-ride all the methods of its parent class",
            "(a) 'has a' relationship",
            "(a) Encapsulation",
            "(c) Refers to the ability of two or more objects belonging to different classes to respond to exactly the same " +
                    "message in different class-specific ways and simplifies code maintenance.",
            "(c) Inheritance ",
            "(a) Student (student s) { }"
    };

    public String getmCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

    public String mGetChoice1(int a) {
        String choice0 = mChoice[a][0];
        return choice0;
    }
    public String mGetChoice2(int a) {
        String choice1 = mChoice[a][1];
        return choice1;
    }
    public String mGetChoice3(int a) {
        String choice2 = mChoice[a][2];
        return choice2;
    }

    public String getQuestions(int a) {
        String Question = mQuestions[a];
        return Question;
    }
}
