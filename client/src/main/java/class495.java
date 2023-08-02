public class class495 {
   static final char[] field4999 = new char[]{'[', ']', '#'};
   static final char[] field5000 = new char[]{' ', '\u00a0', '_', '-', '\u00e0', '\u00e1', '\u00e2', '\u00e4', '\u00e3', '\u00c0', '\u00c1', '\u00c2', '\u00c4', '\u00c3', '\u00e8', '\u00e9', '\u00ea', '\u00eb', '\u00c8', '\u00c9', '\u00ca', '\u00cb', '\u00ed', '\u00ee', '\u00ef', '\u00cd', '\u00ce', '\u00cf', '\u00f2', '\u00f3', '\u00f4', '\u00f6', '\u00f5', '\u00d2', '\u00d3', '\u00d4', '\u00d6', '\u00d5', '\u00f9', '\u00fa', '\u00fb', '\u00fc', '\u00d9', '\u00da', '\u00db', '\u00dc', '\u00e7', '\u00c7', '\u00ff', '\u0178', '\u00f1', '\u00d1', '\u00df'};

   class495() throws Throwable {
   }

   static final int method7098(class477 var0) {
      if (var0 == null) {
         return 12;
      } else {
         switch (var0.field4860) {
            case 8:
               return 20;
            default:
               return 12;
         }
      }
   }

   public static String method7637(CharSequence var0, class477 var1) {
      if (null == var0) {
         return null;
      } else {
         int var3 = 0;

         int var4;
         for(var4 = var0.length(); var3 < var4 && class253.method5004(var0.charAt(var3)); ++var3) {
         }

         while(var4 > var3 && class253.method5004(var0.charAt(var4 - 1))) {
            --var4;
         }

         int var5 = var4 - var3;
         if (var5 >= 1 && var5 <= method7098(var1)) {
            StringBuilder var6 = new StringBuilder(var5);

            for(int var7 = var3; var7 < var4; ++var7) {
               char var8 = var0.charAt(var7);
               boolean var9;
               if (Character.isISOControl(var8)) {
                  var9 = false;
               } else if (class380.method2440(var8)) {
                  var9 = true;
               } else {
                  char[] var10 = field5000;
                  int var11 = 0;

                  label60:
                  while(true) {
                     char var12;
                     if (var11 >= var10.length) {
                        var10 = field4999;

                        for(var11 = 0; var11 < var10.length; ++var11) {
                           var12 = var10[var11];
                           if (var12 == var8) {
                              var9 = true;
                              break label60;
                           }
                        }

                        var9 = false;
                        break;
                     }

                     var12 = var10[var11];
                     if (var8 == var12) {
                        var9 = true;
                        break;
                     }

                     ++var11;
                  }
               }

               if (var9) {
                  char var13 = method68(var8);
                  if (var13 != 0) {
                     var6.append(var13);
                  }
               }
            }

            if (var6.length() == 0) {
               return null;
            } else {
               return var6.toString();
            }
         } else {
            return null;
         }
      }
   }

   static char method68(char var0) {
      switch (var0) {
         case ' ':
         case '-':
         case '_':
         case '\u00a0':
            return '_';
         case '#':
         case '[':
         case ']':
            return var0;
         case '\u00c0':
         case '\u00c1':
         case '\u00c2':
         case '\u00c3':
         case '\u00c4':
         case '\u00e0':
         case '\u00e1':
         case '\u00e2':
         case '\u00e3':
         case '\u00e4':
            return 'a';
         case '\u00c7':
         case '\u00e7':
            return 'c';
         case '\u00c8':
         case '\u00c9':
         case '\u00ca':
         case '\u00cb':
         case '\u00e8':
         case '\u00e9':
         case '\u00ea':
         case '\u00eb':
            return 'e';
         case '\u00cd':
         case '\u00ce':
         case '\u00cf':
         case '\u00ed':
         case '\u00ee':
         case '\u00ef':
            return 'i';
         case '\u00d1':
         case '\u00f1':
            return 'n';
         case '\u00d2':
         case '\u00d3':
         case '\u00d4':
         case '\u00d5':
         case '\u00d6':
         case '\u00f2':
         case '\u00f3':
         case '\u00f4':
         case '\u00f5':
         case '\u00f6':
            return 'o';
         case '\u00d9':
         case '\u00da':
         case '\u00db':
         case '\u00dc':
         case '\u00f9':
         case '\u00fa':
         case '\u00fb':
         case '\u00fc':
            return 'u';
         case '\u00df':
            return 'b';
         case '\u00ff':
         case '\u0178':
            return 'y';
         default:
            return Character.toLowerCase(var0);
      }
   }
}
