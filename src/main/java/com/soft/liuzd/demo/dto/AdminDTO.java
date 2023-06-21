package com.soft.liuzd.demo.dto;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;

/**
 * USER:liuzd01
 * DATE:2023/6/21
 * EMAIL:liuzd01@mingyuanyun.com
 */
@Entity
@Table(name = "t_admin", schema = "sscs", catalog = "")
public class AdminDTO {
    private String userid;
    private String username;
    private String password;
    private Integer age;
    private BigDecimal score;
    private String introduction;
    private Date enterdate;

    @Id
    @Column(name = "userid")
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "age")
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Basic
    @Column(name = "score")
    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    @Basic
    @Column(name = "introduction")
    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    @Basic
    @Column(name = "enterdate")
    public Date getEnterdate() {
        return enterdate;
    }

    public void setEnterdate(Date enterdate) {
        this.enterdate = enterdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdminDTO adminDTO = (AdminDTO) o;
        return Objects.equals(userid, adminDTO.userid) &&
                Objects.equals(username, adminDTO.username) &&
                Objects.equals(password, adminDTO.password) &&
                Objects.equals(age, adminDTO.age) &&
                Objects.equals(score, adminDTO.score) &&
                Objects.equals(introduction, adminDTO.introduction) &&
                Objects.equals(enterdate, adminDTO.enterdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userid, username, password, age, score, introduction, enterdate);
    }
}
