public class delete {
    public static void main(String[] args)
     {
        StringBuffer sb=new StringBuffer("java lang package");
        System.out.println("Before delete: "+sb);
        sb.delete(4,9);
        System.out.println("After delete: "+sb);
    }
}
