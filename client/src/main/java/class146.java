import java.util.concurrent.Callable;

class class146 implements Callable {
   static class84 field1362;
   static int field1364;
   // $FF: synthetic field
   final class120[] val$curveLoadJobs;
   // $FF: synthetic field
   final class156 this$0;
   // $FF: synthetic field
   final int val$workEnd;
   // $FF: synthetic field
   final int val$workStart;

   class146(class156 var1, int var2, int var3, class120[] var4) {
      this.this$0 = var1;
      this.val$workStart = var2;
      this.val$workEnd = var3;
      this.val$curveLoadJobs = var4;
   }

   public Object call() {
      for(int var1 = this.val$workStart; var1 < this.val$workEnd; ++var1) {
         this.val$curveLoadJobs[var1].call();
      }

      return null;
   }
}
