package day05;

import javax.swing.border.StrokeBorder;
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
 *    姓名:张三,年龄:25,性别:男,薪资:5000,入职时间:2006-02-15
 * 
 * 定义equals方法，要求名字以及年龄相同，则认为内容一致。
 * 
 * 实现Comparable接口，并重写抽象方法comparaTo()，比较规则为年龄小的人小。
 * @author Bonnie
 *
 */
public class Emp implements Comparable{
    private String name;
    private int age;
    private boolean gender;
    private int salary;
    private Date hireDate;

    public Emp() {
    }

    public Emp(String name, int age, boolean gender, int salary, Date hireDate) {
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

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
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

    public boolean isGender() {
        return gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        day05.Emp emp = (day05.Emp) o;
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
        return name + "," + age + "," + (gender?"男":"女") + "," + salary + "," + new SimpleDateFormat("yyyy-MM-dd").format(hireDate);

    }

    @Override
    public int compareTo(Object o) {
        Emp emp = (Emp)o;
        return this.age - emp.age;
    }
}
