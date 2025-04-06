package com.assistant.interviewer.component.mongo;

import java.io.Serializable;

import com.assistant.interviewer.component.common.base.AbstractBaseEntity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;

public abstract class MongoBaseEntity extends AbstractBaseEntity implements Serializable {
	private static final long serialVersionUID = -8152521988572821259L;

	@Id
	private String id;

	@CreatedDate
	private Long creationDate;

	@LastModifiedDate
	private Long lastModifiedDate;

	public MongoBaseEntity() {
	}

	public void setId(final String id) {
		this.id = id;
	}

	public String getId() {
		return this.id;
	}

	public Long getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Long creationDate) {
		this.creationDate = creationDate;
	}

	public Long getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Long lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public String toString() {
		String var10000 = super.toString();
		return "MongoBaseEntity(super=" + var10000 + ", id=" + this.getId() + ")";
	}
}
