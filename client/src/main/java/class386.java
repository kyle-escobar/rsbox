import java.util.Comparator;

final class class386 implements Comparator {
   int method6941(class376 var1, class376 var2) {
      return var1.field4366.field4340 < var2.field4366.field4340 ? -1 : (var1.field4366.field4340 == var2.field4366.field4340 ? 0 : 1);
   }

   public int compare(Object var1, Object var2) {
      return this.method6941((class376)var1, (class376)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
