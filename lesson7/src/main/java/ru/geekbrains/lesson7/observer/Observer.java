package ru.geekbrains.lesson7.observer;

public interface Observer {

    void receiveOffer(String nameCompany, int salary);

    void receiveOffer(Vacancy vacancy);

}
