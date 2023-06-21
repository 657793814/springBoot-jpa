package com.soft.liuzd.demo.dto;

import javax.persistence.*;
import java.util.Objects;

/**
 * USER:liuzd01
 * DATE:2023/6/21
 * EMAIL:liuzd01@mingyuanyun.com
 */
@Entity
@Table(name = "t_tc", schema = "sscs", catalog = "")
@IdClass(TcDTOPK.class)
public class TcDTO {
    private int cno;
    private int tno;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TcDTO tcDTO = (TcDTO) o;
        return cno == tcDTO.cno &&
                tno == tcDTO.tno;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cno, tno);
    }
}
