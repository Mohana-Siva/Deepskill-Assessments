class Product {
    int productId;
    String productName;
    String category;

    Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
}

public class EcommerceSearch {

    // Linear Search
    static void linearSearch(Product[] products, int id) {
        boolean found = false;

        for (int i = 0; i < products.length; i++) {
            if (products[i].productId == id) {
                System.out.println("Product Found (Linear Search)");
                System.out.println("ID : " + products[i].productId);
                System.out.println("Name : " + products[i].productName);
                System.out.println("Category : " + products[i].category);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Product Not Found");
        }
    }

    // Binary Search
    static void binarySearch(Product[] products, int id) {
        int left = 0;
        int right = products.length - 1;
        boolean found = false;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (products[mid].productId == id) {
                System.out.println("Product Found (Binary Search)");
                System.out.println("ID : " + products[mid].productId);
                System.out.println("Name : " + products[mid].productName);
                System.out.println("Category : " + products[mid].category);
                found = true;
                break;
            } else if (products[mid].productId < id) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Product Not Found");
        }
    }

    public static void main(String[] args) {

        // Array for Linear Search
        Product[] products = {
                new Product(103, "Mouse", "Electronics"),
                new Product(101, "Laptop", "Electronics"),
                new Product(105, "Shoes", "Fashion"),
                new Product(102, "Book", "Education"),
                new Product(104, "Watch", "Accessories")
        };

        System.out.println("Linear Search");
        linearSearch(products, 102);

        // Sorted Array for Binary Search
        Product[] sortedProducts = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Book", "Education"),
                new Product(103, "Mouse", "Electronics"),
                new Product(104, "Watch", "Accessories"),
                new Product(105, "Shoes", "Fashion")
        };

        System.out.println("\nBinary Search");
        binarySearch(sortedProducts, 102);

        System.out.println("\nTime Complexity");
        System.out.println("Linear Search : O(n)");
        System.out.println("Binary Search : O(log n)");
    }
}

/*(--Linear Search--)
1.Suitable for small datasets.
2.Works on unsorted arrays.
3.Simpler to implement.
4.Time Complexity: O(n).
(--Binary Search--)
1.Suitable for large datasets.
2.Requires the array to be sorted.
3.Faster than linear search because it repeatedly divides the search space into half.
4.Time Complexity: O(log n).

For an e-commerce platform with many products, 
Binary Search is more suitable because it provides 
faster search performance on sorted data. */