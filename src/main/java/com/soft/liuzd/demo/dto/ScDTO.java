package com.soft.liuzd.demo.dto;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * USER:liuzd01
 * DATE:2023/6/21
 * EMAIL:liuzd01@mingyuanyun.com
 */
@Entity
@Table(name = "t_sc", schema = "sscs", catalog = "")
@IdClass(ScDTOPK.class)
public class ScDTO {
    private int sno;
    private int cno;
    private int tno;
    private BigDecimal score;

    @Id
    @Column(name = "sno")
    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    @Id
    @Column(name = "cno")
    public int getCno() {
        return cno;
    }

    public void setCno(int cno) {
        this.cno = cno;
    }

    @Id
    @Column(name = "tno")
    public int getTno() {
        return tno;
    }

    public void setTno(int tno) {
        this.tno = tno;
    }

    @Basic
    @Column(name = "score")
    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScDTO scDTO = (ScDTO) o;
        return sno == scDTO.sno &&
                cno == scDTO.cno &&
                tno == scDTO.tno &&
                Objects.equals(score, scDTO.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sno, cno, tno, score);
    }
}
