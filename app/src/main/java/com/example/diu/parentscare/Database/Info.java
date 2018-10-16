package com.example.diu.parentscare.Database;

public class Info {

    private int id;
    private String name;
    private String relation;
    private int mob_num;
    private String email;


    public Info (int id, String name, String relation, int mob_num, String email ){
        this.id = id;
        this.name = name;
        this.relation = relation;
        this.mob_num = mob_num;
        this.email = email;
    }

    public Info (String name, String relation, int mob_num, String email){
        this.name = name;
        this.relation = relation;
        this.mob_num = mob_num;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public int getMob_num() {
        return mob_num;
    }

    public void setMob_num(int mob_num) {
        this.mob_num = mob_num;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
