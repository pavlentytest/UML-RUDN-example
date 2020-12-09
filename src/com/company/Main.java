package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        Question[] question = new Question[5];
        question[0].setTitle("Столица России?");

        Answer[] answers = new Answer[3];
        answers[0].setName("Москва - 1");
        answers[1].setName("Казань - 2");
        answers[2].setName("Нижний Новгород - 3");

        question[0].setAnswers(answers);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Приветствую! Представьтесь [name age town]");
        String full = scanner.nextLine();
        String[] parse_full  = full.split(" ");
        String name = parse_full[0];
        System.out.println("Привет: "+ name + ", выберите вопрос: от 1 до 10");




    }
}
