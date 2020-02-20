package models;

public class Relation {
    String me = "Me";
    String son = "Son";
    String daughter = "Daughter";
    String brother = "Brother";
    String sister = "Sister";
    String father = "Father";
    String mother = "Mother";


    public Relation(String me, String son, String daughter, String brother, String sister, String father, String mother) {
        this.me = me;
        this.son = son;
        this.daughter = daughter;
        this.brother = brother;
        this.sister = sister;
        this.father = father;
        this.mother = mother;
    }

    public Relation() {
    }


    public String getMe() {
        return me;
    }

    public void setMe(String me) {
        this.me = me;
    }

    public void setSon(String son) {
        this.son = son;
    }

    public String getDaughter() {
        return daughter;
    }

    public void setDaughter(String daughter) {
        this.daughter = daughter;
    }

    public String getBrother() {
        return brother;
    }

    public void setBrother(String brother) {
        this.brother = brother;
    }

    public String getSister() {
        return sister;
    }

    public void setSister(String sister) {
        this.sister = sister;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getSon() {
        return son;
    }
}
