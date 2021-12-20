package ArraysExamples;


import commonUtil.ObjectGenerator;
import commonUtil.Product;

// Array Get O(1)
//Array Set O(1)
// Array Insert O(n)
//Array Delete O(n)
public class ArrayOperations {


    public static void main(String[] args) {
        ObjectGenerator obj = new ObjectGenerator();
        Product[] pArr = new Product[25];
        pArr = obj.createProduct();
        for (Product i : pArr) {
            System.out.println(i);
        }

        ArrayOperations ar = new ArrayOperations();
        System.out.println("ArrayOperations++++++++++++++++++++++++++++++++");

        System.out.println("access4thRecordInArray++++++++++++++++++++++++++++++++");
        System.out.println(ar.accessNthRecordInArray(pArr,4));
        System.out.println("replace4thRecordInArray by 5th++++++++++++++++++++++++++++++++");
        Product p = ar.accessNthRecordInArray(pArr,5);
        Product c = ar.accessNthRecordInArray(pArr,4);
        pArr = ar.replaceNthRecordInArray(pArr,4,p);
        for (Product i : pArr) {
            System.out.println(i);
        }
        System.out.println("delete4thRecordInArray ++++++++++++++++++++++++++++++++");
        pArr = ar.deleteNthRecordInArray(pArr,4);
        for (Product i : pArr) {
            System.out.println(i);
        }

        System.out.println("insertNthRecordInArray ++++++++++++++++++++++++++++++++");
        pArr = ar.insertNthRecordInArray(pArr,4,c);
        for (Product i : pArr) {
            System.out.println(i);
        }
    }

    public Product accessNthRecordInArray(Product[] p,int x) {
        return p[x];
    }

    public Product[] replaceNthRecordInArray(Product[] p,int x, Product c) {
        p[x] = c;
        System.out.println(p[x]);
        return p;
    }


    public Product[] deleteNthRecordInArray(Product[] p,int n) {

        for(int i=n;i<p.length-1;i++){
            p[i] = p[i+1];
       }

        p[p.length-1] = null;

        return  p;
    }

    public Product[] insertNthRecordInArray(Product[] p,int n, Product x) {

        Product[] newArray = new Product[p.length+1];

        System.out.println("record to be inserted "+x);
        for (int i=0;i<newArray.length;i++){

            if(i<n) {
                newArray[i] = p[i];
            }else if(i==n){
                newArray[i] = x;
            }else {
                newArray[i] = p[i-1];
            }

        }

        return  newArray;
    }


}
