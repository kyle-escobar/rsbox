import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

public class class418 {
   final DecimalFormat field4586 = new DecimalFormat();
   final Map field4584 = new HashMap();
   final Map field4585 = new HashMap();

   public class418() {
      this.field4586.setMaximumFractionDigits(2);
   }

   public void method7474(HttpsURLConnection var1) {
      Iterator var3 = this.field4584.entrySet().iterator();

      while(var3.hasNext()) {
         Map.Entry var4 = (Map.Entry)var3.next();
         var1.setRequestProperty((String)var4.getKey(), (String)var4.getValue());
      }

   }

   public Map method7493() {
      return this.field4584;
   }

   public void method7476(String var1, String var2) {
      if (null != var1 && !var1.isEmpty()) {
         this.field4584.put(var1, null != var2 ? var2 : "");
      }

   }

   public void method7477(String var1) {
      if (null != var1 && !var1.isEmpty()) {
         this.field4584.remove(var1);
      }

   }

   void method7495(class419 var1, String var2) {
      String var4 = String.format("%s %s", var1.method7524(), var2);
      this.method7476("Authorization", var4);
   }

   public void method7479(String var1) {
      this.method7495(class419.field4593, var1);
   }

   public void method7480(String var1) {
      this.method7495(class419.field4589, var1);
   }

   public void method7481(class461 var1) {
      this.field4584.put("Content-Type", var1.method8040());
   }

   public void method7482() {
      this.field4584.remove("Content-Type");
   }

   public void method7483(class461 var1) {
      this.method7484(var1, 1.0F);
   }

   void method7484(class461 var1, float var2) {
      this.field4585.put(var1, Math.max(0.0F, Math.min(1.0F, var2)));
      this.method7507();
   }

   void method7507() {
      this.field4584.remove("Accept");
      if (!this.field4585.isEmpty()) {
         this.field4584.put("Accept", this.method7486());
      }

   }

   String method7486() {
      ArrayList var2 = new ArrayList(this.field4585.entrySet());
      Collections.sort(var2, new class420(this));
      StringBuilder var3 = new StringBuilder();
      Iterator var4 = var2.iterator();

      while(var4.hasNext()) {
         Map.Entry var5 = (Map.Entry)var4.next();
         if (var3.length() > 0) {
            var3.append(",");
         }

         var3.append(((class461)var5.getKey()).method8040());
         float var6 = (Float)var5.getValue();
         if (var6 < 1.0F) {
            String var7 = this.field4586.format((double)var6);
            var3.append(";q=").append(var7);
         }
      }

      return var3.toString();
   }
}
