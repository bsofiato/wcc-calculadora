package com.matera.wcc.calculadora.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.time.Instant;
import java.util.Objects;

@Embeddable
public class Requisicao {
    @Column(name="TIMESTAMP")
    private Instant timestamp;
    @Column(name="IP")
    private String ip;

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Requisicao that = (Requisicao) o;
        return Objects.equals(timestamp, that.timestamp) &&
                Objects.equals(ip, that.ip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp, ip);
    }
}
