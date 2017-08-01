package com.example.domain;

import org.seasar.doma.Entity;

import lombok.Getter;
import lombok.Setter;

/**
 * SampleBean.java.
 *
 * @author MEG
 *
 */
@Entity
@Getter
@Setter
public class SampleBean {

	/** PK. */
	private String primaryKey;

	/** name. */
	private String name;

	/** age. */
	private Integer age;

}
