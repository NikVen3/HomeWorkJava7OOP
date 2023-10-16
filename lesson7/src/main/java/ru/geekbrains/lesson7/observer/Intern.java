package ru.geekbrains.lesson7.observer;

public class Intern implements Observer {
    private String name;
    private int salaryExpectation = 5000;

    public Intern(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {

    }

    @Override
    public void receiveOffer(Vacancy vacancy) {
        if (this.salaryExpectation <= vacancy.getSalary()){
            System.out.printf("Интерн %s: Мне нужна эта работа! (Company: %s. Position: %s. Salary: %d)\n",
                    name, vacancy.getCompanyName(), vacancy.getPosition(), vacancy.getSalary());
            this.salaryExpectation = vacancy.getSalary();
        }
        else {
            System.out.printf("Интерн %s: Я найду работу лучше! (Company: %s. Position: %s. Salary: %d)\n",
                    name, vacancy.getCompanyName(), vacancy.getPosition(), vacancy.getSalary());
        }
    }
}