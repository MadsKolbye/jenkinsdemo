package mads.kea.sdinjections;

public class Student {
    private String name;
    private String className;

    public void setName(String name) {
        this.name = name;
    }


    public void setClassName(String className) {
        this.className = className;
    }

    public void studentPrint(){
        System.out.println("The name of my student: " + name);
        System.out.println("The class of my student: " + className);
    }
}

