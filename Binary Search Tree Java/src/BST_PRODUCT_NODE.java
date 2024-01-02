
public class BST_PRODUCT_NODE {
	int barcodeNumber;
	BST_PRODUCT_NODE left;
	BST_PRODUCT_NODE right;
	String productName;
	int quantity;
	public BST_PRODUCT_NODE(int barcodeNumber, String productName,int quantity) {
		this.barcodeNumber = barcodeNumber;
		this.productName = productName;
		this.quantity = quantity;
		this.left = null;
		this.right = null;
	}
	
	
	
}
