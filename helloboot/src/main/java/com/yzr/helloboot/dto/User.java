package com.yzr.helloboot.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User implements Serializable{
    private Long id;

    private Date addTime;

    private Long addUserId;

    private Integer deleteState;

    private Long editId;

    private Date editTime;

    private String email;

    private String loginPwd;

    private String notes;

    private String realName;

    private Byte sex;

    private String tel;

    private String userName;

    private Factory factory ;
    
    private List<Role> roles=new ArrayList<Role>();
    
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

	public Factory getFactory() {
		return factory;
	}

	public void setFactory(Factory factory) {
		this.factory = factory;
	}
		
	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public User(Long id, Date addTime, Long addUserId, Integer deleteState, Long editId, Date editTime, String email,
			String loginPwd, String notes, String realName, Byte sex, String tel, String userName, Factory factory) {
		super();
		this.id = id;
		this.addTime = addTime;
		this.addUserId = addUserId;
		this.deleteState = deleteState;
		this.editId = editId;
		this.editTime = editTime;
		this.email = email;
		this.loginPwd = loginPwd;
		this.notes = notes;
		this.realName = realName;
		this.sex = sex;
		this.tel = tel;
		this.userName = userName;
		this.factory = factory;
	}

	public User() {
		super();
	}
    
}