public class recursion {
   public static void ruler(int n) {
      if (n>0) ruler(n-1);
      System.out.println(n);
      if (n>0) ruler(n-1);
   }
   public static void main(String[] args) {
      ruler(10);
   }
}
