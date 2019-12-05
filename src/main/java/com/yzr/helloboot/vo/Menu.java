package com.yzr.helloboot.vo;

import java.util.Date;

public class Menu {
    private Long id;

    private Date addTime;

    private Long addUserId;

    private Integer deleteState;

    private Long editId;

    private Date editTime;

    private String menuName;

    private String menuUrl;

    private String notes;

    private Menu parentMenu;

    private Long sort;

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

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Menu getParentMenu() {
		return parentMenu;
	}

	public void setParentMenu(Menu parentMenu) {
		this.parentMenu = parentMenu;
	}

	public Long getSort() {
        return sort;
    }

    public void setSort(Long sort) {
        this.sort = sort;
    }
    
	public Menu(Long id, Date addTime, Long addUserId, Integer deleteState, Long editId, Date editTime, String menuName,
			String menuUrl, String notes, Menu parentMenu, Long sort) {
		super();
		this.id = id;
		this.addTime = addTime;
		this.addUserId = addUserId;
		this.deleteState = deleteState;
		this.editId = editId;
		this.editTime = editTime;
		this.menuName = menuName;
		this.menuUrl = menuUrl;
		this.notes = notes;
		this.parentMenu = parentMenu;
		this.sort = sort;
	}

	public Menu() {
		super();
	}
    
    
    
}