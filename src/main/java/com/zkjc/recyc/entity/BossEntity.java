package com.zkjc.recyc.entity;

public class BossEntity {
    private String bossId;
    private String name;
    private String phone;

    public BossEntity() {
    }

    public BossEntity(String bossId, String name, String phone) {
        this.bossId = bossId;
        this.name = name;
        this.phone = phone;
    }

    public String getBossId() {
        return bossId;
    }

    public void setBossId(String bossId) {
        this.bossId = bossId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
