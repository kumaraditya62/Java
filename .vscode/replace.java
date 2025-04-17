public class replace {
    public static void main(String[] args) 
    {
        StringBuffer sb=new StringBuffer("I am a good boy");
        System.out.println("Before replace: "+sb);
        System.out.println("After replace :"+sb.replace(7, 11, "bad"));
        
    }
}
