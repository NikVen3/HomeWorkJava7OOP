package ru.geekbrains.lesson7.observer;

public class Vacancy {
    public Vacancy(String position, String name, int salary) {

    }

    public int getSalary() {
        return 0;
    }

    public Object getCompanyName() {
        return null;
    }

    public Object getPosition() {
        return null;
    }

    public class Vacancy {
        private final String position;
        private final String companyName;
        private final int salary;

        public Vacancy(String position, String companyName, int salary) {
            this.position = position;
            this.companyName = companyName;
            this.salary = salary;
        }

        public String getPosition() {
            return position;
        }

        public String getCompanyName() {
            return companyName;
        }

        public int getSalary() {
            return salary;
        }
    }
}
