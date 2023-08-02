import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class class478 implements class473 {
   Map field4862;
   final class529 field4863;

   public class478(class529 var1) {
      this.field4863 = var1;
   }

   public int method8146(int var1) {
      if (null != this.field4862) {
         class525 var3 = (class525)this.field4862.get(var1);
         if (null != var3) {
            return (Integer)var3.field5162;
         }
      }

      return (Integer)this.field4863.method9197(var1);
   }

   public void method8142(int var1, Object var2) {
      if (null == this.field4862) {
         this.field4862 = new HashMap();
         this.field4862.put(var1, new class525(var1, var2));
      } else {
         class525 var4 = (class525)this.field4862.get(var1);
         if (null == var4) {
            this.field4862.put(var1, new class525(var1, var2));
         } else {
            var4.field5162 = var2;
         }
      }

   }

   public Iterator iterator() {
      return null == this.field4862 ? Collections.emptyList().iterator() : this.field4862.values().iterator();
   }
}
