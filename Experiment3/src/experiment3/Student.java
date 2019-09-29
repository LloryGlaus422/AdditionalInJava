/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment3;

/**
 *
 * @author sugallo_sd2023
 */
public class Student {

    private String id = "1880";
    private String id2 = "0";
    private String id3 = "0";
    private String password;
    private String confirm;
    private String username;
    private String fname;
    private String lname;
    private String age;
    private String course;
    private String units;
    private String sched;

    public Student() {
    }

    public Student(String id, String id3, String course, String units, String sched) {
        this.id = id;
        this.id3 = id3;
        this.course = course;
        this.units = units;
        this.sched = sched;
    }

    public Student(String id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;

    }

    public String getId() {
        return id;
    }

    public String getId2() {
        return id2;
    }

    public String getId3() {
        return id3;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setId2(String id2) {
        this.id2 = id2;
    }

    public void setId3(String id3) {
        this.id3 = id3;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public String getSched() {
        return sched;
    }

    public void setSched(String sched) {
        this.sched = sched;
    }

    @Override
    public String toString() {
        return  "id=" + id + ",  password=" + password + ",  username=" + username  ;
    }

    public String display1() {
        return  String.format("%d,%s,%s", id , username, password);
    }
    
     public String display2() {
        return  "id=" + id +"id"+ ", password=" + password + ", username=" + username ;
    }

}
