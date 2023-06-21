package com.soft.liuzd.demo.dto;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

/**
 * USER:liuzd01
 * DATE:2023/6/21
 * EMAIL:liuzd01@mingyuanyun.com
 */
@Entity
@Table(name = "t_course", schema = "sscs", catalog = "")
public class CourseDTO {
    private int cno;
    private String name;
    private Integer credit;
    private Date periodstart;
    private Date periodend;

    @Id
    @Column(name = "cno")
    public int getCno() {
        return cno;
    }

    public void setCno(int cno) {
        this.cno = cno;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "credit")
    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    @Basic
    @Column(name = "periodstart")
    public Date getPeriodstart() {
        return periodstart;
    }

    public void setPeriodstart(Date periodstart) {
        this.periodstart = periodstart;
    }

    @Basic
    @Column(name = "periodend")
    public Date getPeriodend() {
        return periodend;
    }

    public void setPeriodend(Date periodend) {
        this.periodend = periodend;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourseDTO courseDTO = (CourseDTO) o;
        return cno == courseDTO.cno &&
                Objects.equals(name, courseDTO.name) &&
                Objects.equals(credit, courseDTO.credit) &&
                Objects.equals(periodstart, courseDTO.periodstart) &&
                Objects.equals(periodend, courseDTO.periodend);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cno, name, credit, periodstart, periodend);
    }
}
