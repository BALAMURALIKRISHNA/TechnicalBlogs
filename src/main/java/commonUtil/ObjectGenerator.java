package commonUtil;

import java.util.Random;

public class ObjectGenerator {

    public Product[] createProduct(){
        Product[] pArr= new Product[25];
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();
        System.out.println(random.toString());
        for(int i=0;i<25;i++) {
        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

            int id =i;
            String productName = generatedString;
            Product p = new Product(id, "PN-"+generatedString, id+10, random.nextBoolean());
            pArr[i]=p;
        }

        return pArr;
    }
}
