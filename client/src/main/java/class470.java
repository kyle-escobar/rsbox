public class class470 {
   public class470 field4815;
   public class470 field4817;
   public long field4816;

   public void method8116() {
      if (this.field4815 != null) {
         this.field4815.field4817 = this.field4817;
         this.field4817.field4815 = this.field4815;
         this.field4817 = null;
         this.field4815 = null;
      }
   }

   public boolean method8120() {
      return this.field4815 != null;
   }
}
