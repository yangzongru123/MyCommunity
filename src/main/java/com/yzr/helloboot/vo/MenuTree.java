package com.yzr.helloboot.vo;

public class MenuTree {
	private Long id;
	private Long pId;
	private String name;
	private Boolean checked;
	private Boolean open;
	public MenuTree(Long id, Long pId, String name) {
		super();
		this.id = id;
		this.pId = pId;
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getpId() {
		return pId;
	}
	public void setpId(Long pId) {
		this.pId = pId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getChecked() {
		return checked;
	}
	public void setChecked(Boolean checked) {
		this.checked = checked;
	}
	public Boolean getOpen() {
		return open;
	}
	public void setOpen(Boolean open) {
		this.open = open;
	}
	
		
}
