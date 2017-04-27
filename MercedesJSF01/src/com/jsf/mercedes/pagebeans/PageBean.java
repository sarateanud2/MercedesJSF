package com.jsf.mercedes.pagebeans;

import java.io.Serializable;


import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
//import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "pageBean", eager = true)
@ViewScoped
public class PageBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String page;
	
	@PostConstruct
	public void init(){
		page = "index_content";
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}
	
}
