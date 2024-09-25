package com.unit.mockito.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

/**
 * @author Naveen K Wodeyaar,
 * @Date 12-Aug-2024
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "TEST_MOVIE")
public class Movie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long mId;
	
	private String mName;
	
	private String mgenre;
	
	private LocalDate mReleaseDate;

	public Movie() {}
	
	public Movie(Long mId, String mName, String mgenre, LocalDate mReleaseDate) {
		super();
		this.mId = mId;
		this.mName = mName;
		this.mgenre = mgenre;
		this.mReleaseDate = mReleaseDate;
	}

	/**
	 * @return the mId
	 */
	public Long getmId() {
		return mId;
	}

	/**
	 * @param mId the mId to set
	 */
	public void setmId(Long mId) {
		this.mId = mId;
	}

	/**
	 * @return the mName
	 */
	public String getmName() {
		return mName;
	}

	/**
	 * @param mName the mName to set
	 */
	public void setmName(String mName) {
		this.mName = mName;
	}

	/**
	 * @return the mgenre
	 */
	public String getMgenre() {
		return mgenre;
	}

	/**
	 * @param mgenre the mgenre to set
	 */
	public void setMgenre(String mgenre) {
		this.mgenre = mgenre;
	}

	/**
	 * @return the mReleaseDate
	 */
	public LocalDate getmReleaseDate() {
		return mReleaseDate;
	}

	/**
	 * @param mReleaseDate the mReleaseDate to set
	 */
	public void setmReleaseDate(LocalDate mReleaseDate) {
		this.mReleaseDate = mReleaseDate;
	}
	
	
	
	
}