package com.yzr.helloboot.vo;

import java.util.Date;

public class Factory {
    private Long id;

    private Date addTime;

    private Long addUserId;

    private Integer deleteState;

    private Long editId;

    private Date editTime;

    private String address;

    private String name;

    private String notes;

    private String tel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Long getAddUserId() {
        return addUserId;
    }

    public void setAddUserId(Long addUserId) {
        this.addUserId = addUserId;
    }

    public Integer getDeleteState() {
        return deleteState;
    }

    public void setDeleteState(Integer deleteState) {
        this.deleteState = deleteState;
    }

    public Long getEditId() {
        return editId;
    }

    public void setEditId(Long editId) {
        this.editId = editId;
    }

    public Date getEditTime() {
        return editTime;
    }

    public void setEditTime(Date editTime) {
        this.editTime = editTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Factory(Long id, Date addTime, Long addUserId, Integer deleteState, Long editId, Date editTime,
                   String address, String name, String notes, String tel) {
        super();
        this.id = id;
        this.addTime = addTime;
        this.addUserId = addUserId;
        this.deleteState = deleteState;
        this.editId = editId;
        this.editTime = editTime;
        this.address = address;
        this.name = name;
        this.notes = notes;
        this.tel = tel;
    }

    public Factory() {
        super();
    }

    public Factory(Long id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
}
