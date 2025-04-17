public class insert {
    public static void main(String[] args) 
    {
        StringBuffer sb = new StringBuffer("R.N collage");
        System.out.println("Before insert: " + sb);
        StringBuffer s=sb.insert(0,"Welcome to ");
        System.out.println("After insert: " + s);
        
    }
}
