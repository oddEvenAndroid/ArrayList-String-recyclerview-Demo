package com.example.demodynamicarraylist.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class AttributeResponse {

	@SerializedName("statusCode")
	@Expose
	private int statusCode;

	@SerializedName("success")
	@Expose
	private boolean success;

	@SerializedName("message")
	@Expose
	private String message;

	@SerializedName("data")
	@Expose
	private ArrayList<DataClass> dataclass = null;

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ArrayList<DataClass> getDataclass() {
		return dataclass;
	}

	public void setDataclass(ArrayList<DataClass> dataclass) {
		this.dataclass = dataclass;
	}

	public class DataClass {

		@SerializedName("attributes_id")
		@Expose
		private int attributes_id;

		@SerializedName("category_id")
		@Expose
		private String category_id;

		@SerializedName("subcategory_id")
		@Expose
		private String subcategory_id;

		@SerializedName("product_id")
		@Expose
		private String product_id;

		@SerializedName("attribute_name")
		@Expose
		private String attribute_name;

		@SerializedName("isRequired")
		@Expose
		private String isRequired;

		@SerializedName("attribute_type")
		@Expose
		private String attribute_type;

		@SerializedName("created_at")
		@Expose
		private String created_at;

		@SerializedName("updated_at")
		@Expose
		private String updated_at;

		@SerializedName("attribute_options")
		@Expose
		private ArrayList<String> attribute_options = null;

		public int getAttributes_id() {
			return attributes_id;
		}

		public void setAttributes_id(int attributes_id) {
			this.attributes_id = attributes_id;
		}

		public String getCategory_id() {
			return category_id;
		}

		public void setCategory_id(String category_id) {
			this.category_id = category_id;
		}

		public String getSubcategory_id() {
			return subcategory_id;
		}

		public void setSubcategory_id(String subcategory_id) {
			this.subcategory_id = subcategory_id;
		}

		public String getProduct_id() {
			return product_id;
		}

		public void setProduct_id(String product_id) {
			this.product_id = product_id;
		}

		public String getAttribute_name() {
			return attribute_name;
		}

		public void setAttribute_name(String attribute_name) {
			this.attribute_name = attribute_name;
		}

		public String getIsRequired() {
			return isRequired;
		}

		public void setIsRequired(String isRequired) {
			this.isRequired = isRequired;
		}

		public String getAttribute_type() {
			return attribute_type;
		}

		public void setAttribute_type(String attribute_type) {
			this.attribute_type = attribute_type;
		}

		public String getCreated_at() {
			return created_at;
		}

		public void setCreated_at(String created_at) {
			this.created_at = created_at;
		}

		public String getUpdated_at() {
			return updated_at;
		}

		public void setUpdated_at(String updated_at) {
			this.updated_at = updated_at;
		}

		public ArrayList<String> getAttribute_options() {
			return attribute_options;
		}

		public void setAttribute_options(ArrayList<String> attribute_options) {
			this.attribute_options = attribute_options;
		}
	}
}
