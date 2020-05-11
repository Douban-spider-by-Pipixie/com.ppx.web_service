package com.ppx.web_service.model;

import java.util.Date;

public class Comment {
	private String cuser;
	private Date cdate;
	private String comment;
	private Integer cuserful;
	private String cstar;

	public String getCuser() {
		return cuser;
	}

	public void setCuser(String cuser) {
		this.cuser = cuser;
	}

	public Date getCdate() {
		return cdate;
	}

	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Integer getCuserful() {
		return cuserful;
	}

	public void setCuserful(Integer cuserful) {
		this.cuserful = cuserful;
	}

	public String getCstar() {
		return cstar;
	}

	public void setCstar(String cstar) {
		this.cstar = cstar;
	}

	public Comment(String cuser, Date cdate, String comment, Integer cuserful, String cstar) {
		this.cuser = cuser;
		this.cdate = cdate;
		this.comment = comment;
		this.cuserful = cuserful;
		this.cstar = cstar;
	}
}
