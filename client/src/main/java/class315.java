import java.net.MalformedURLException;
import java.net.URL;

public class class315 {
   class113 field3500;
   class523 field3498;

   class315(String var1, class114 var2) {
      try {
         this.field3500 = var2.method2221(new URL(var1));
      } catch (MalformedURLException var4) {
         this.field3500 = null;
      }

   }

   class315(class113 var1) {
      this.field3500 = var1;
   }

   class523 method5835() {
      if (null == this.field3498 && null != this.field3500 && this.field3500.method2200()) {
         if (this.field3500.method2199() != null) {
            this.field3498 = class32.method2580(this.field3500.method2199());
         }

         this.field3500 = null;
      }

      return this.field3498;
   }
}
