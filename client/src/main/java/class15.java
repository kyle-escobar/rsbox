import java.io.IOException;
import java.util.concurrent.Callable;

public class class15 implements Callable {
   static byte[][][] field75;
   static int field74;
   // $FF: synthetic field
   final class1 this$0;
   final class17 field71;

   class15(class1 var1, class17 var2) {
      this.this$0 = var1;
      this.field71 = var2;
   }

   public Object call() throws Exception {
      try {
         while(this.field71.method287()) {
            class292.method354(10L);
         }
      } catch (IOException var2) {
         return new class3("Error servicing REST query: " + var2.getMessage());
      }

      return this.field71.method288();
   }
}
