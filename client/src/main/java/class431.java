import java.util.Comparator;

class class431 implements Comparator {
   // $FF: synthetic field
   final class428 this$0;

   class431(class428 var1) {
      this.this$0 = var1;
   }

   int method7680(class434 var1, class434 var2) {
      if (var1.field4650 > var2.field4650) {
         return 1;
      } else {
         return var1.field4650 < var2.field4650 ? -1 : 0;
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method7680((class434)var1, (class434)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
