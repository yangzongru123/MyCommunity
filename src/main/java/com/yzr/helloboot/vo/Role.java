package com.yzr.helloboot.vo;

import java.util.Date;
import java.util.List;

public class Role {
    private Long id;

    private Date addTime;

    private Long addUserId;

    private Integer deleteState;

    private Long editId;

    private Date editTime;

    private String notes;

    private String roleName;
    
    private List<Menu> menus;
    
    private List<MenuTree> menuTrees;
    
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

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

	public Role(Long id, String roleName) {
		super();
		this.id = id;
		this.roleName = roleName;
	}
	
	
	public List<Menu> getMenus() {
		return menus;
	}

	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}
			
	public List<MenuTree> getMenuTrees() {
		return menuTrees;
	}

	public void setMenuTrees(List<MenuTree> menuTrees) {
		this.menuTrees = menuTrees;
	}

	public Role(Long id, Date addTime, Long addUserId, Integer deleteState, Long editId, Date editTime, String notes,
			String roleName) {
		super();
		this.id = id;
		this.addTime = addTime;
		this.addUserId = addUserId;
		this.deleteState = deleteState;
		this.editId = editId;
		this.editTime = editTime;
		this.notes = notes;
		this.roleName = roleName;
	}

	public Role() {
		super();
	}
    
    
}