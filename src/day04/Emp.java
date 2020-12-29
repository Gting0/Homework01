package day04;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/**
 * 定义私有属性:
 * String name;
 * int age;
 * String gender;
 * int salary;
 * Date hiredate;//入职时间
 * 
 * 定义构造方法，以及属性get,set方法.
 * 定义toString方法，格式如:
 *    张三,25,男,5000,2006-02-15
 * 
 * 定义equals方法，要求名字以及年龄相同，则认为内容一致。
 * @author Bonnie
 *
 */
public class Emp {
    private String name;
    private int age;
    private String gender;
    private int salary;
    private Date hireDate;

    public Emp() {
    }

    public Emp(String name, int age, String gender, int salary, Date hireDate) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return age == emp.age &&
                salary == emp.salary &&
                Objects.equals(name, emp.name) &&
                Objects.equals(gender, emp.gender) &&
                Objects.equals(hireDate, emp.hireDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender, salary, hireDate);
    }

    @Override
    public String toString() {
        return name + "," + age + "," + gender + "," + salary + "," + new SimpleDateFormat("yyyy-MM-dd").format(hireDate);

    }
}
