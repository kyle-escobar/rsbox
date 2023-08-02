import java.util.Locale;

@class371
@class333
public class class384 implements class383 {
   public static final class384 field4402;
   public static final class384 field4403;
   public static final class384 field4410;
   public static final class384[] field4406;
   static int[] field4409;
   static final class384 field4398;
   static final class384 field4399;
   static final class384 field4400;
   static final class384 field4401;
   final int field4397;
   final String field4404;
   final String field4405;

   static {
      field4403 = new class384("EN", "en", "English", class388.field4439, 0, "GB");
      field4398 = new class384("DE", "de", "German", class388.field4439, 1, "DE");
      field4410 = new class384("FR", "fr", "French", class388.field4439, 2, "FR");
      field4400 = new class384("PT", "pt", "Portuguese", class388.field4439, 3, "BR");
      field4401 = new class384("NL", "nl", "Dutch", class388.field4426, 4, "NL");
      field4402 = new class384("ES", "es", "Spanish", class388.field4426, 5, "ES");
      field4399 = new class384("ES_MX", "es-mx", "Spanish (Latin American)", class388.field4439, 6, "MX");
      class384[] var0 = method6927();
      field4406 = new class384[var0.length];

      for(int var2 = 0; var2 < var0.length; ++var2) {
         class384 var3 = var0[var2];
         if (field4406[var3.field4397] != null) {
            throw new IllegalStateException();
         }

         field4406[var3.field4397] = var3;
      }

   }

   class384(String var1, String var2, String var3, class388 var4, int var5, String var6) {
      this.field4404 = var1;
      this.field4405 = var2;
      this.field4397 = var5;
      if (var6 != null) {
         new Locale(var2.substring(0, 2), var6);
      } else {
         new Locale(var2.substring(0, 2));
      }

   }

   public static void method6921(class342 var0) {
      class515.field5118 = var0;
   }

   static class384[] method6927() {
      return new class384[]{field4399, field4403, field4402, field4400, field4410, field4398, field4401};
   }

   String method6922() {
      return this.field4405;
   }

   public int method6917() {
      return this.field4397;
   }

   public String toString() {
      return this.method6922().toLowerCase(Locale.ENGLISH);
   }
}
