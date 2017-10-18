
package net.starbasic.hibernate;


public class Cource {
    private Integer id;
    private String name;
    private String teacher;
    private int hours;

    public Cource() {
    }

  
    public Cource(String name, String teacher, int hours) {
        this.name = name;
        this.teacher = teacher;
        this.hours = hours;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return name + " № " + id + " " + hours + " год.";
    }
    
}
