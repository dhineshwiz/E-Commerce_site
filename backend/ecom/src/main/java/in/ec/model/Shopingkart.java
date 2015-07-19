package in.ec.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "shopingkar") 
public class Shopingkart {
@Id
private String id;
private String productId;

public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
private String quantity;
private String orderId;
public String getProductId() {
	return productId;
}
public void setProductId(String productId) {
	this.productId = productId;
}
public String getQuantity() {
	return quantity;
}
public void setQuantity(String quantity) {
	this.quantity = quantity;
}
public String getOrderId() {
	return orderId;
}
public void setOrderId(String orderId) {
	this.orderId = orderId;
}

}
