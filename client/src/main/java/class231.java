public class class231 implements class27 {
   static class523[] field2524;
   boolean field2523 = false;
   boolean field2528 = false;
   Component field2525 = null;

   public void method4393(Component var1) {
      this.method4390();
      if (null != var1) {
         this.field2525 = var1;
         class338 var3 = var1.method6244();
         if (var3 != null) {
            var3.field3786.method5902(true);
            if (null != var3.field3791) {
               class87 var4 = new class87();
               var4.method1904(var1);
               var4.method1893(var3.field3791);
               Client.method5754().method6680(var4);
            }
         }
      }

   }

   public Component method4389() {
      return this.field2525;
   }

   public void method4390() {
      if (null != this.field2525) {
         class338 var2 = this.field2525.method6244();
         Component var3 = this.field2525;
         this.field2525 = null;
         if (var2 != null) {
            var2.field3786.method5902(false);
            if (null != var2.field3791) {
               class87 var4 = new class87();
               var4.method1904(var3);
               var4.method1893(var2.field3791);
               Client.method5754().method6680(var4);
            }

         }
      }
   }

   public boolean method389(int var1) {
      if (null == this.field2525) {
         return false;
      } else {
         class28 var3 = this.field2525.method6236();
         if (var3 == null) {
            return false;
         } else {
            if (var3.method400(var1)) {
               switch (var1) {
                  case 81:
                     this.field2528 = true;
                     break;
                  case 82:
                     this.field2523 = true;
                     break;
                  default:
                     if (this.method4392(var1)) {
                        Client.setDirty(this.field2525);
                     }
               }
            }

            return var3.method397(var1);
         }
      }
   }

   public boolean method380(int var1) {
      switch (var1) {
         case 81:
            this.field2528 = false;
            return false;
         case 82:
            this.field2523 = false;
            return false;
         default:
            return false;
      }
   }

   public boolean method381(char var1) {
      if (this.field2525 == null) {
         return false;
      } else {
         boolean var3;
         if (var1 >= ' ' && var1 < 127 || var1 > 127 && var1 < 160 || var1 > 160 && var1 <= 255) {
            var3 = true;
         } else {
            label80: {
               if (var1 != 0) {
                  char[] var4 = CP1252UTF8.field4443;

                  for(int var5 = 0; var5 < var4.length; ++var5) {
                     char var6 = var4[var5];
                     if (var1 == var6) {
                        var3 = true;
                        break label80;
                     }
                  }
               }

               var3 = false;
            }
         }

         if (!var3) {
            return false;
         } else {
            class327 var7 = this.field2525.method6277();
            if (null != var7 && var7.method5958()) {
               class28 var8 = this.field2525.method6236();
               if (null == var8) {
                  return false;
               } else {
                  if (var8.method408(var1) && var7.method6164(var1)) {
                     Client.setDirty(this.field2525);
                  }

                  return var8.method398(var1);
               }
            } else {
               return false;
            }
         }
      }
   }

   public boolean method382(boolean var1) {
      return false;
   }

   boolean method4392(int var1) {
      if (null == this.field2525) {
         return false;
      } else {
         class327 var3 = this.field2525.method6277();
         if (null != var3 && var3.method5958()) {
            switch (var1) {
               case 13:
                  this.method4390();
                  return true;
               case 48:
                  if (this.field2523) {
                     var3.method5976();
                  }

                  return true;
               case 65:
                  if (this.field2523) {
                     var3.method5944(Client.method2581());
                  }

                  return true;
               case 66:
                  if (this.field2523) {
                     var3.method5943(Client.method2581());
                  }

                  return true;
               case 67:
                  if (this.field2523) {
                     var3.method5945(Client.method2581());
                  }

                  return true;
               case 84:
                  if (var3.method5946() == 0) {
                     var3.method6164(10);
                  } else if (this.field2528 && var3.method5968()) {
                     var3.method6164(10);
                  } else {
                     class338 var4 = this.field2525.method6244();
                     class87 var5 = new class87();
                     var5.method1904(this.field2525);
                     var5.method1893(var4.field3788);
                     Client.method5754().method6680(var5);
                     this.method4390();
                  }

                  return true;
               case 85:
                  if (this.field2523) {
                     var3.method5922();
                  } else {
                     var3.method5977();
                  }

                  return true;
               case 96:
                  if (this.field2523) {
                     var3.method5933(this.field2528);
                  } else {
                     var3.method5931(this.field2528);
                  }

                  return true;
               case 97:
                  if (this.field2523) {
                     var3.method5934(this.field2528);
                  } else {
                     var3.method5932(this.field2528);
                  }

                  return true;
               case 98:
                  if (this.field2523) {
                     var3.method5972();
                  } else {
                     var3.method6100(this.field2528);
                  }

                  return true;
               case 99:
                  if (this.field2523) {
                     var3.method5927();
                  } else {
                     var3.method5936(this.field2528);
                  }

                  return true;
               case 101:
                  if (this.field2523) {
                     var3.method5923();
                  } else {
                     var3.method5921();
                  }

                  return true;
               case 102:
                  if (this.field2523) {
                     var3.method5929(this.field2528);
                  } else {
                     var3.method6063(this.field2528);
                  }

                  return true;
               case 103:
                  if (this.field2523) {
                     var3.method6059(this.field2528);
                  } else {
                     var3.method5928(this.field2528);
                  }

                  return true;
               case 104:
                  if (this.field2523) {
                     var3.method6095(this.field2528);
                  } else {
                     var3.method5937(this.field2528);
                  }

                  return true;
               case 105:
                  if (this.field2523) {
                     var3.method5940(this.field2528);
                  } else {
                     var3.method5900(this.field2528);
                  }

                  return true;
               default:
                  return false;
            }
         } else {
            return false;
         }
      }
   }
}
