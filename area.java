class area
{
 int side;
 area()
 {side=10;
 // int sq=side*side;
}
void show()
{
  int sq=side*side;
 System.out.println("AREA OF SQUARE=" +sq);
}}
class square {
    public static void main(String[] args) {
        area ch=new area();
        ch.show();
    }
}