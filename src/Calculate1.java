public class Calculate1 {
    public static void main(String[] args) {
        int a=4;
        int b=8;
        int total=0;
        char ch='+';
        if(ch=='+'){
            total=a+b;
        } else if (ch=='-') {
            total=a-b;

        } else if (ch=='*') {
            total=a*b;
        }else{
            total=a/b;

        }
        System.out.println( total);
    }
}
