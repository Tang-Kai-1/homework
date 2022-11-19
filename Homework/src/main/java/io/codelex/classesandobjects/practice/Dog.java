package io.codelex.classesandobjects.practice;

public class Dog {
    private String name;
    private String sex;
    private String nameFather = "Unknown";
    private String nameMother = "Unknown";

    public Dog(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public Dog(String name, String sex, String nameFather, String nameMother) {
        this.name = name;
        this.sex = sex;
        this.nameFather = nameFather;
        this.nameMother = nameMother;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", nameFather='" + nameFather + '\'' +
                ", nameMother='" + nameMother + '\'' +
                '}';
    }

    public String fathersName() {
        return this.nameFather;
    }

    public String mothersName() {
        return nameMother;
    }

    public void setNameFather(String nameFather) {
        this.nameFather = nameFather;
    }

    public void setNameMother(String nameMother) {
        this.nameMother = nameMother;
    }

    public boolean hasSameMotherAs(Dog dog) {
        return this.nameMother.equals(dog.mothersName());
    }
}
