package com.example.demo;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Table(name = "destination_candidates")
@Getter
@Setter
@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class DestinationCandidate {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer registration_order;
	private String user_code;
	private String destination_id;
	private String destination_name;
	private String destination_category_id;
	private String destination_region_id;
	private Integer destination_order;
	private Integer visit_count;
	private Integer evaluation_value;
	private String delete_flag;
	private Timestamp create_at;
	private Timestamp update_at;

	public Integer getRegistrationOrder() {
		return registration_order;
	}

	public void setRegistrationOrder(Integer registration_order) {
		this.registration_order = registration_order;
	}

	public String getUserCode() {
		return user_code;
	}

	public void setUserCode(String user_code) {
		this.user_code = user_code;
	}

	public String getDestinationId() {
		return destination_id;
	}

	public void setDestinationId(String destination_id) {
		this.destination_id = destination_id;
	}

	public String getDestinationName() {
		return destination_name;
	}

	public void setDestinationName(String destination_name) {
		this.destination_name = destination_name;
	}

	public String getDestinationCategoryId() {
		return destination_category_id;
	}

	public void setDestinationCategoryId(String destination_category_id) {
		this.destination_category_id = destination_category_id;
	}

	public String getDestinationRegionId() {
		return destination_region_id;
	}

	public void setDestinationRegionId(String destination_region_id) {
		this.destination_region_id = destination_region_id;
	}

	public Integer getDestinationOrder() {
		return destination_order;
	}

	public void setDestinationOrder(Integer destination_order) {
		this.destination_order = destination_order;
	}
	public Integer getVisitCount() {
		return visit_count;
	}
	public void setVisitCount(Integer visit_count) {
		this.visit_count = visit_count;
	}

	public Integer getEvaluationValue() {
		return evaluation_value;
	}
	public void setEvaluationValue(Integer evaluation_value) {
		this.evaluation_value = evaluation_value;
	}
	public String getDeleteFlag() {
		return delete_flag;
	}

	public void setDeleteFlag(String delete_flag) {
		this.delete_flag = delete_flag;
	}
	public Timestamp getCreateAt() {
		return create_at;
	}

	public void setCreateAt(Timestamp create_at) {
		this.create_at = create_at;
	}
	public Timestamp getUpdateAt() {
		return update_at;
	}

	public void setUpdateAt(Timestamp update_at) {
		this.update_at = update_at;
	}
}
