package com.example.demo.entity.feedback;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.demo.entity.LocationVO;
@Document(collection="feedbacks")
public class FeedbackVO {

	public FeedbackVO() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	private BigInteger feedbackId;
	private LocationVO location;
	private boolean isSafeNow;
	private boolean isPublicPlace; // For Governement Place or Private Property
	private boolean isPeopleFriendly;
	private String urlPhoto;
	private String quickFeedback;//Happy,Unhappy, Neutral
	private int rating; // 1 as low and 5 as high 

	public String getQuickFeedback() {
		return quickFeedback;
	}

	public void setQuickFeedback(String quickFeedback) {
		this.quickFeedback = quickFeedback;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public BigInteger getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(BigInteger feedbackId) {
		this.feedbackId = feedbackId;
	}

	public LocationVO getLocation() {
		return location;
	}

	public void setLocation(LocationVO location) {
		this.location = location;
	}

	public boolean isSafeNow() {
		return isSafeNow;
	}

	public void setSafeNow(boolean isSafeNow) {
		this.isSafeNow = isSafeNow;
	}

	public boolean isPublicPlace() {
		return isPublicPlace;
	}

	public void setPublicPlace(boolean isPublicPlace) {
		this.isPublicPlace = isPublicPlace;
	}

	public boolean isPeopleFriendly() {
		return isPeopleFriendly;
	}

	public void setPeopleFriendly(boolean isPeopleFriendly) {
		this.isPeopleFriendly = isPeopleFriendly;
	}

	public String getUrlPhoto() {
		return urlPhoto;
	}

	public void setUrlPhoto(String urlPhoto) {
		this.urlPhoto = urlPhoto;
	}

		

}
