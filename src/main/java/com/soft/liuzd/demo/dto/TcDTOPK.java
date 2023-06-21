package com.soft.liuzd.demo.dto;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

/**
 * USER:liuzd01
 * DATE:2023/6/21
 * EMAIL:liuzd01@mingyuanyun.com
 */
public class TcDTOPK implements Serializable {
    private int cno;
    private int tno;

    @Column(name = "cno")
    @Id
    public int getCno() {
        return cno;
    }

    public void setCno(int cno) {
        this.cno = cno;
    }

    @Column(name = "tno")
    @Id
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
        TcDTOPK tcDTOPK = (TcDTOPK) o;
        return cno == tcDTOPK.cno &&
                tno == tcDTOPK.tno;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cno, tno);
    }
}
