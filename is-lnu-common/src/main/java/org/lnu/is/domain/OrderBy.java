package org.lnu.is.domain;


/**
 * Class for storing common fields, needed for ordering.
 * @author ivanursul
 *
 */
public class OrderBy {

	private String fieldName;
	private OrderByType type;
	
	public String getFieldName() {
		return fieldName;
	}
	
	public void setFieldName(final String fieldName) {
		this.fieldName = fieldName;
	}
	
	public OrderByType getType() {
		return type;
	}
	
	public void setType(final OrderByType type) {
		this.type = type;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((fieldName == null) ? 0 : fieldName.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		OrderBy other = (OrderBy) obj;
		if (fieldName == null) {
			if (other.fieldName != null) {
				return false;
			}
		} else if (!fieldName.equals(other.fieldName)) {
			return false;
		}
		if (type != other.type) {
			return false;
		}
		return true;
	}
	@Override
	public String toString() {
		return "OrderBy [fieldName=" + fieldName + ", type=" + type + "]";
	}
	
}
