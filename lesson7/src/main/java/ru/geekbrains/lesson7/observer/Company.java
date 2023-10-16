package ru.geekbrains.lesson7.observer;

import java.util.Random;

public class Company {

    private Random random = new Random();

    private String name;

    private Publisher jobAgency;

    private int maxSalary;
    private String position;

    public Company(String name, Publisher jobAgency, int maxSalary, String position) {
        this.name = name;
        this.jobAgency = jobAgency;
        this.maxSalary = maxSalary;
        this.position = position;
    }

    public void needEmployee() {
        int salary = random.nextInt(maxSalary);
        Vacancy vacancy = new Vacancy(this.position, this.name, salary);
        jobAgency.sendOffer(vacancy);

    }


}
