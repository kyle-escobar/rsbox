public class class421 implements Comparable {
   class526 field4595;
   class526 field4596;

   class421() {
   }

   public class526 method7542() {
      return this.field4595;
   }

   public String method7558() {
      return null == this.field4595 ? "" : this.field4595.method9155();
   }

   public String method7547() {
      return this.field4596 == null ? "" : this.field4596.method9155();
   }

   void method7545(class526 var1, class526 var2) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.field4595 = var1;
         this.field4596 = var2;
      }
   }

   public int method7546(class421 var1) {
      return this.field4595.method9154(var1.field4595);
   }

   public int compareTo(Object var1) {
      return this.method7546((class421)var1);
   }
}
