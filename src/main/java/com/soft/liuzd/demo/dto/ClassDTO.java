package com.soft.liuzd.demo.dto;

import javax.persistence.*;
import java.util.Objects;

/**
 * USER:liuzd01
 * DATE:2023/6/21
 * EMAIL:liuzd01@mingyuanyun.com
 */
@Entity
@Table(name = "t_class", schema = "sscs", catalog = "")
public class ClassDTO {
    private int classno;
    private String cname;
    private String cteacher;
    private String classroom;

    @Id
    @Column(name = "classno")
    public int getClassno() {
        return classno;
    }

    public void setClassno(int classno) {
        this.classno = classno;
    }

    @Basic
    @Column(name = "cname")
    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Basic
    @Column(name = "cteacher")
    public String getCteacher() {
        return cteacher;
    }

    public void setCteacher(String cteacher) {
        this.cteacher = cteacher;
    }

    @Basic
    @Column(name = "classroom")
    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassDTO classDTO = (ClassDTO) o;
        return classno == classDTO.classno &&
                Objects.equals(cname, classDTO.cname) &&
                Objects.equals(cteacher, classDTO.cteacher) &&
                Objects.equals(classroom, classDTO.classroom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classno, cname, cteacher, classroom);
    }
}
