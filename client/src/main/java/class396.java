import java.util.ArrayList;

public class class396 extends class406 {
   ArrayList field4461;

   public class396(class406 var1, ArrayList var2) {
      super(var1);
      this.field4461 = var2;
      super.field4513 = "ConcurrentMidiTask";
   }

   public boolean method7131(int var1) {
      for(int var3 = 0; var3 < this.field4461.size(); ++var3) {
         class406 var4 = (class406)this.field4461.get(var3);
         if (null == var4) {
            this.field4461.remove(var3);
            --var3;
         } else if (var4.method7131(var1)) {
            if (var4.method7150()) {
               this.method7135(var4.method7133());
               this.field4461.clear();
               return true;
            }

            if (var4.method7134() != null) {
               this.field4461.add(var4.method7134());
            }

            super.field4511 = var4.field4511;
            this.field4461.remove(var3);
            --var3;
         }
      }

      if (this.field4461.isEmpty()) {
         return true;
      } else {
         return false;
      }
   }
}
