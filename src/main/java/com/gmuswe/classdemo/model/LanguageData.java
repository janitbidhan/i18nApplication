package com.gmuswe.classdemo.model;

import javax.persistence.*;

@Entity
@Table(name = "intdata")
public class LanguageData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private long id;
    @Column(name = "lkey")
    private String lkey;
    @Column(name = "lvalue")
    private String lvalue;
    @Column(name = "lang")
    private String lang;

    public LanguageData(long id, String lkey, String lvalue, String lang) {
        this.id=id;
        this.lkey = lkey;
        this.lvalue = lvalue;
        this.lang = lang;
    }

    public LanguageData() {

    }

    @Override
    public String toString() {
        return "LanguageData{" +
                "key=" + id +
                ", lkey='" + lkey + '\'' +
                ", lvalue='" + lvalue + '\'' +
                ", lang='" + lang + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLkey() {
        return lkey;
    }

    public void setLkey(String lkey) {
        this.lkey = lkey;
    }

    public String getLvalue() {
        return lvalue;
    }

    public void setLvalue(String lvalue) {
        this.lvalue = lvalue;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

}
