import java.util.Comparator;

public class class73 implements Comparator {
   static class363 field589;
   boolean field588;

   class73() {
   }

   int method1505(class376 var1, class376 var2) {
      if (var1.field4365 == var2.field4365) {
         return 0;
      } else {
         if (this.field588) {
            if (var1.field4365 == Client.field1432) {
               return -1;
            }

            if (var2.field4365 == Client.field1432) {
               return 1;
            }
         }

         return var1.field4365 < var2.field4365 ? -1 : 1;
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method1505((class376)var1, (class376)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
