import java.util.*;
public class Test {

	public static void main(String[] args) {
		BSTree BSTree= new BSTree();
		BSTree.root=BSTree.insert(BSTree.root, 20,"Dalin Şampuan",12);
		BSTree.root=BSTree.insert(BSTree.root, 15,"Biskrem Bisküvi",38);
		BSTree.root=BSTree.insert(BSTree.root, 8,"Filiz Makarna",18);
		BSTree.root=BSTree.insert(BSTree.root, 17,"Erikli Su",65);
		BSTree.root=BSTree.insert(BSTree.root, 42,"Söke Un",5);
		
		
		while(true) {
			menu();
			Scanner sc= new Scanner(System.in);
			Scanner sc2= new Scanner(System.in);
			int x=sc.nextInt();
			switch(x) {
			case 1: System.out.println("Please enter barcode number:");
			int barcodeNumber=sc.nextInt();
			System.out.println("Please enter product name:");
			String productName=sc2.nextLine();
			System.out.println("Please enter quantity:");
			int quantity=sc.nextInt();
			BSTree.root=BSTree.insert(BSTree.root, barcodeNumber, productName, quantity);
			break;
			
			case 2:System.out.println("Please enter the product's barcode number that you want to increase its quantity");
			int barcodeNo=sc.nextInt();
			System.out.println("Please enter the quantity you want to add");
			int addValue=sc.nextInt();
			BSTree.findAndAdd(BSTree.root, barcodeNo, addValue);
			break;
			
			case 3:System.out.println("Please enter the product's barcode number that you want to decrease its quantity");
			barcodeNo=sc.nextInt();
			System.out.println("Please enter the quantity you want to decrease");
			addValue=sc.nextInt();
			BSTree.findAndDecrease(BSTree.root, barcodeNo, addValue);
			break;
			
			case 4:BSTree.inOrder(BSTree.root);
			break;
			
			case 5:BSTree.postOrder(BSTree.root);
			break;
			
			case 6:BSTree.preOrder(BSTree.root);
			break;
			default:System.out.print("Please enter valid number!!!");
			
			}
		}	
	}
	
		
	public static void menu() {
		System.out.println("\nPlease select the action:");
		System.out.println("1.Insert a new node");
		System.out.println("2.Increase the quantity");
		System.out.println("3.Decrease the quantity");
		System.out.println("4.Print in-order");
		System.out.println("5.Print post-order");
		System.out.println("6.Print pre-order");
	}
}
	
