import java.util.Comparator;

final class class375 implements Comparator {
   static int[] field4361;

   int method6734(class376 var1, class376 var2) {
      return var1.field4365 < var2.field4365 ? -1 : (var1.field4365 == var2.field4365 ? 0 : 1);
   }

   public int compare(Object var1, Object var2) {
      return this.method6734((class376)var1, (class376)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
