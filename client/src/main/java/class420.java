import java.util.Comparator;
import java.util.Map;

class class420 implements Comparator {
   // $FF: synthetic field
   final class418 this$0;

   class420(class418 var1) {
      this.this$0 = var1;
   }

   int method7531(Map.Entry var1, Map.Entry var2) {
      return ((Float)var2.getValue()).compareTo((Float)var1.getValue());
   }

   public int compare(Object var1, Object var2) {
      return this.method7531((Map.Entry)var1, (Map.Entry)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
