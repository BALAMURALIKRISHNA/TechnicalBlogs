package ArraysExamples;

import java.util.Stack;

public class TryOutExam {

    public static void main(String[] args){

        TryOutExam to = new TryOutExam();
       // System.out.println(to.lastWordLength("Hello67 Worlds om"));

        TryOutExam.power(2,8);

    }



    /* Function to calculate x raised to the power y */
    static int power(int x, int y)
    {
        if (y == 0)
            return 1;
        else if (y % 2 == 0)
            return power(x, y / 2) * power(x, y / 2);
        else
            return x * power(x, y / 2) * power(x, y / 2);
    }

    public int thirdMaximumElement(){
        int[] input = {2,5,6,1,6,7,9,1,3,9};

        return 0;
    }








    public int lastWordLength(String input){

        input= input.trim();
        char[] arr = input.toCharArray();
        int counter =0;

        for(int i= arr.length-1; i>=0;i--){

            if(arr[i] == ' '){
                return counter;
            }else{
                counter = counter+1;
            }
        }

        return counter;
    }

    // Problem 1
    public boolean validParentheses(){
        String input = "[]}";
        //All the char into char array
        //implement a stack and push [ elements into the stack
        //when closing comes pop from the stack and see it matches

        Stack<Character> st = new Stack<Character>();
        char[] charArr = input.toCharArray();
        boolean isValid = false;
        for (char i: charArr) {
            System.out.println(i);
            if(i=='['||i=='{'||i=='('){
                st.push(i);
            }else {

                char e =' ';
                if(!st.isEmpty()) {
                     e = st.peek();
                }

                switch(i) {
                    case ']':
                    {
                        if(e=='['){
                            st.pop();
                        }else{
                            return isValid = false;
                        }
                        break ;
                    }
                    case ')':
                    {
                        if(e=='('){
                            st.pop();
                        }else{
                            return isValid = false;
                        }
                        break ;
                    }
                    case '}':
                    {
                        if(e=='{'){
                            st.pop();
                        }else{
                            return isValid = false;
                        }
                        break ;
                    } default:{
                        if(i!=']'||i!='}'||i!=']'){
                            return isValid = false;
                        }
                        break ;
                    }

                }
            }
        }

        if (st.isEmpty()){
            return true;
        }

        return isValid;


    }

    // Problem 1
    public void problem1(){
        int input = 18;
        int counter=0;
        int output=0;

        for (int i = 1; i <18 ; i++) {

            System.out.println(i);
            int j =i;

            while(j>0){
                counter =counter+1;

                if(counter==18){
                    output = j/10;
                    System.out.println(output);
                    break;
                }

                j = j/10;
            }

            if(counter==18){
                break;
            }

        }

        System.out.println(counter);
    }
}
