package com.tdd.tdd_appraoch_demo.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * @author Naveen K Wodeyar
 * @date 04-Aug-2024
 */
@JsonIgnoreProperties
@JsonInclude(Include.NON_NULL)
@Entity
public class Post {

	@Id
	private int pId;
	private int userId;
	private String pTitle;
	private String pBody;
	
	public Post() {}
	
	/**
	 * @param pId
	 * @param userId
	 * @param pTitle
	 * @param pBody
	 */
	public Post(int pId, int userId, String pTitle, String pBody) {
		super();
		this.pId = pId;
		this.userId = userId;
		this.pTitle = pTitle;
		this.pBody = pBody;
	}

	/**
	 * @return the pId
	 */
	public int getpId() {
		return pId;
	}

	/**
	 * @param pId the pId to set
	 */
	public void setpId(int pId) {
		this.pId = pId;
	}

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the pTitle
	 */
	public String getpTitle() {
		return pTitle;
	}

	/**
	 * @param pTitle the pTitle to set
	 */
	public void setpTitle(String pTitle) {
		this.pTitle = pTitle;
	}

	/**
	 * @return the pBody
	 */
	public String getpBody() {
		return pBody;
	}

	/**
	 * @param pBody the pBody to set
	 */
	public void setpBody(String pBody) {
		this.pBody = pBody;
	}

	@Override
	public int hashCode() {
		return Objects.hash(pBody, pId, pTitle, userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Post other = (Post) obj;
		return Objects.equals(pBody, other.pBody) && pId == other.pId && Objects.equals(pTitle, other.pTitle)
				&& userId == other.userId;
	}

	@Override
	public String toString() {
		return "Post [pId=" + pId + ", userId=" + userId + ", pTitle=" + pTitle + ", pBody=" + pBody + "]";
	}
	
}
