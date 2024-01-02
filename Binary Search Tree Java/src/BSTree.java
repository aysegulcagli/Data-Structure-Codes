
public class BSTree {

	BST_PRODUCT_NODE root;
	
	public BSTree() {
		root=null;
	}
	
	BST_PRODUCT_NODE newBST_PRODUCT_NODE(int barcodeNumber,String productName, int quantity) {
		
		root=new BST_PRODUCT_NODE(barcodeNumber, productName, quantity);
		return root;
	}
	
	BST_PRODUCT_NODE insert(BST_PRODUCT_NODE root, int barcodeNumber, String productName, int quantity) {
		if(root!=null) {
			if(barcodeNumber<root.barcodeNumber)
				root.left = insert(root.left, barcodeNumber,productName,quantity);
			else {
				root.right = insert(root.right, barcodeNumber,productName,quantity);
			}
		}
		else
			root= newBST_PRODUCT_NODE(barcodeNumber, productName,quantity);
		return root;
	}
	
	void preOrder(BST_PRODUCT_NODE root) {
		if(root!=null) {
			System.out.println("Barcode Number: "+root.barcodeNumber+
			"\nProduct Name: "+root.productName+"\nQuantity: "+root.quantity);
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	void inOrder(BST_PRODUCT_NODE root) {
		if(root!=null) {
			inOrder(root.left);
			System.out.println("Barcode Number: "+root.barcodeNumber+
			"\nProduct Name: "+root.productName+"\nQuantity: "+root.quantity +"\n");
			inOrder(root.right);
			
		}
	}
	void postOrder(BST_PRODUCT_NODE root) {
		if(root!=null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.println("Barcode Number: "+root.barcodeNumber+
			"\nProduct Name: "+root.productName+"\nQuantity: "+root.quantity);
			
		}
	}
	
	public BST_PRODUCT_NODE findAndAdd(BST_PRODUCT_NODE root, int barcodeNumber, int addValue) {
		if(root!=null) {
			if(barcodeNumber<root.barcodeNumber) 
				root.left = findAndAdd(root.left, barcodeNumber, addValue);
			else if(barcodeNumber>root.barcodeNumber){
				root.right = findAndAdd(root.right, barcodeNumber, addValue);
			}
			else
				root.quantity=root.quantity+addValue;
			
			
	}
		return root;
	}
	
	
	public BST_PRODUCT_NODE findAndDecrease(BST_PRODUCT_NODE root, int barcodeNumber, int decreaseValue) {
		if(root!=null) {
			if(barcodeNumber<root.barcodeNumber) 
				root.left = findAndDecrease(root.left, barcodeNumber, decreaseValue);
			else if(barcodeNumber>root.barcodeNumber){
				root.right = findAndDecrease(root.right, barcodeNumber, decreaseValue);
			}
			else
				root.quantity=root.quantity-decreaseValue;
			
			
	}
		return root;
	}
	
}
