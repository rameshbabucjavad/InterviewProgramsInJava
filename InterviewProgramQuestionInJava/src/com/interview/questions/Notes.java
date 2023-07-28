package com.interview.questions;

public class Notes {
	private int tagId;
	private String tagName;
	private int noNotes;

	public Notes(int tagId, String tagName, int noNotes) {
		super();
		this.tagId = tagId;
		this.tagName = tagName;
		this.noNotes = noNotes;
	}

	public int getTagId() {
		return tagId;
	}

	public void setTagId(int tagId) {
		this.tagId = tagId;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public int getNoNotes() {
		return noNotes;
	}

	public void setNoNotes(int noNotes) {
		this.noNotes = noNotes;
	}

}
