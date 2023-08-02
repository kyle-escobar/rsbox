import java.util.ArrayList;

public class class410 {
   boolean field4547 = true;
   class407 field4546;
   int field4552 = Integer.MAX_VALUE;
   int field4553 = Integer.MAX_VALUE;
   int field4554 = 0;
   int field4555 = 0;
   int field4557 = 0;
   int field4558 = 0;
   int field4560 = 0;
   ArrayList field4559 = new ArrayList();

   public class416 method7277(int var1) {
      return (class416)this.field4559.get(var1);
   }

   class416 method7278() {
      return this.field4559.size() == 0 ? null : (class416)this.field4559.get(this.field4559.size() - 1);
   }

   public boolean method7279() {
      return this.field4559.size() == 0;
   }

   boolean method7280() {
      return this.field4553 > 1;
   }

   public int method7281() {
      return this.field4559.size();
   }

   public String method7333() {
      if (this.method7279()) {
         return "";
      } else {
         StringBuilder var2 = new StringBuilder(this.method7281());

         for(int var3 = 0; var3 < this.method7281(); ++var3) {
            class416 var4 = this.method7277(var3);
            var2.append(var4.field4573);
         }

         return var2.toString();
      }
   }

   public void method7349(int var1) {
      if (this.field4546 != null && var1 < 2 * this.field4546.field4527) {
         var1 = Integer.MAX_VALUE;
      }

      if (var1 != this.field4552) {
         this.field4552 = var1;
         this.method7393();
      }

   }

   public void method7284(int var1) {
      if (this.field4553 != var1) {
         this.field4553 = var1;
         this.method7393();
      }

   }

   public void method7357(int var1) {
      if (this.field4557 != var1) {
         this.field4557 = var1;
         this.method7393();
      }

   }

   public void method7414(class407 var1) {
      if (var1 != this.field4546) {
         this.field4546 = var1;
         if (null != this.field4546) {
            if (this.field4558 == 0) {
               this.field4558 = this.field4546.field4527;
            }

            if (!this.method7279()) {
               this.method7393();
            }
         }
      }

   }

   public void method7287(int var1) {
      if (this.field4560 != var1) {
         this.field4560 = var1;
         this.method7393();
      }

   }

   public boolean method7288(int var1, int var2) {
      if (var1 != this.field4554 || this.field4555 != var2) {
         this.field4554 = var1;
         this.field4555 = var2;
         this.method7393();
      }

      return true;
   }

   public void method7282(int var1) {
      if (this.field4558 != var1) {
         this.field4558 = var1;
         this.method7393();
      }

   }

   public class405 method7387(int var1, int var2) {
      if (var1 == var2) {
         return new class405(this, 0, 0);
      } else if (var1 <= this.field4559.size() && var2 <= this.field4559.size()) {
         return var2 < var1 ? new class405(this, var2, var1) : new class405(this, var1, var2);
      } else {
         return new class405(this, 0, 0);
      }
   }

   public class398 method7291(char var1, int var2, int var3) {
      return this.method7292(Character.toString(var1), var2, var3);
   }

   public class398 method7292(String var1, int var2, int var3) {
      if (var3 == 0) {
         var3 = Integer.MAX_VALUE;
      }

      int var5 = var2;
      if (this.field4559.size() >= var3) {
         this.method7312(var2, var2);
         return new class398(var2, true);
      } else {
         this.field4559.ensureCapacity(this.field4559.size() + var1.length());

         for(int var6 = 0; var6 < var1.length() && this.field4559.size() < var3; ++var6) {
            class416 var7 = new class416();
            var7.field4573 = var1.charAt(var6);
            this.field4559.add(var5, var7);
            ++var5;
         }

         this.method7312(var2, var5);
         if (0 != this.field4553 && this.method7303() > this.field4553) {
            while(var5 != var2) {
               --var5;
               this.method7402(var5);
               if (this.method7303() <= this.field4553) {
                  break;
               }
            }

            return new class398(var5, true);
         } else {
            return new class398(var5, false);
         }
      }
   }

   class398 method7293(String var1, int var2) {
      return this.method7292(var1, this.field4559.size(), var2);
   }

   public class398 method7294(String var1) {
      this.method7295();
      return this.method7293(var1, 0);
   }

   void method7295() {
      this.field4559.clear();
   }

   public int method7402(int var1) {
      return this.method7297(var1, var1 + 1);
   }

   public int method7297(int var1, int var2) {
      int var4;
      if (var2 < var1) {
         var4 = var2;
         var2 = var1;
         var1 = var4;
      }

      this.field4559.subList(var1, var2).clear();
      var4 = var1;
      if (this.method7280() && 1 == this.field4560) {
         while(var4 > 0) {
            --var4;
            char var5 = ((class416)this.field4559.get(var4)).field4573;
            if (var5 == ' ' || var5 == '\t') {
               break;
            }
         }
      }

      this.method7312(var4, var2);
      return var1;
   }

   public int method7298(int var1, int var2) {
      if (this.field4546 == null) {
         return 0;
      } else if (this.method7280() && var1 > this.field4552) {
         return this.field4559.size();
      } else {
         if (!this.field4559.isEmpty()) {
            for(int var4 = 0; var4 < this.field4559.size(); ++var4) {
               class416 var5 = (class416)this.field4559.get(var4);
               if (var2 <= var5.field4574 + this.method7316()) {
                  if (var2 < var5.field4574) {
                     break;
                  }

                  if (var1 < var5.field4572) {
                     return var4 > 0 ? var4 - 1 : 0;
                  }

                  if (var4 + 1 != this.field4559.size() && ((class416)this.field4559.get(var4 + 1)).field4574 != var5.field4574) {
                     int var6 = this.method7311((class416)this.field4559.get(var4), false);
                     if (var1 < var5.field4572 + var6) {
                        return var4;
                     }

                     if (var2 <= var5.field4574 + this.method7316()) {
                        return var4 + 1;
                     }
                  }
               }
            }

            class416 var7 = (class416)this.field4559.get(this.field4559.size() - 1);
            if (var1 >= var7.field4572 && var1 <= var7.field4572 + this.method7304() && var2 >= var7.field4574 && var2 <= var7.field4574 + this.method7316()) {
               return this.field4559.size() - 1;
            }
         }

         return this.field4559.size();
      }
   }

   public int method7299(int var1, int var2) {
      if (this.field4546 != null && !this.method7279() && var1 <= this.field4559.size()) {
         byte var4;
         if (var2 > 0) {
            var4 = 1;
         } else {
            var4 = -1;
            var2 = -var2;
         }

         int var5 = 0;
         int var6 = 0;
         if (var1 > 0) {
            class416 var7 = (class416)this.field4559.get(var1 - 1);
            var5 = var7.field4572 + this.method7313(var1 - 1);
            var6 = var7.field4574;
         } else if (var4 == -1 && var1 == 0) {
            return 0;
         }

         int var15 = 16777215;
         int var8 = 0;
         int var9 = var1;
         int var10 = 16777215;
         int var11 = var4 == 1 ? this.field4559.size() + 1 : 0;

         for(int var12 = var1 + var4; var11 != var12; var12 += var4) {
            class416 var13 = (class416)this.field4559.get(var12 - 1);
            if (var13.field4574 != var6) {
               ++var8;
               var6 = var13.field4574;
               if (var8 > var2) {
                  return var9;
               }
            }

            if (var8 == var2) {
               int var14 = Math.abs(var13.field4572 + this.method7313(var12 - 1) - var5);
               if (var14 >= var10) {
                  return var9;
               }

               var9 = var12;
               var10 = var14;
            }
         }

         if (var4 == 1) {
            return this.field4559.size();
         } else {
            if (var6 != 0) {
               ++var8;
            }

            return var10 != 16777215 && (var2 != var8 || var5 >= var10) ? var9 : 0;
         }
      } else {
         return 0;
      }
   }

   public int method7300() {
      if (!this.field4559.isEmpty() && this.method7303() == 1) {
         return this.field4559.isEmpty() ? 0 : ((class416)this.field4559.get(this.field4559.size() - 1)).field4572 + this.method7304();
      } else {
         int var2 = -1;
         int var3 = 0;

         for(int var4 = this.field4559.size() - 1; var4 >= 0; --var4) {
            class416 var5 = (class416)this.field4559.get(var4);
            if (var5.field4574 != var2) {
               int var6 = this.method7311(var5, false) + var5.field4572;
               var3 = Math.max(var6, var3);
               var2 = var5.field4574;
            }
         }

         return var3;
      }
   }

   public int method7283() {
      return this.method7279() ? 0 : this.field4546.field4527 + ((class416)this.field4559.get(this.field4559.size() - 1)).field4574;
   }

   public int method7316() {
      return this.field4558;
   }

   public int method7303() {
      return this.method7283() / this.field4546.field4527;
   }

   int method7304() {
      return this.method7279() ? 0 : this.method7311((class416)this.field4559.get(this.field4559.size() - 1), false);
   }

   public int method7305() {
      return this.field4552;
   }

   public int method7306() {
      return this.field4553;
   }

   public int method7345() {
      return this.field4560;
   }

   public int method7308() {
      return this.field4557;
   }

   public int method7309(int var1) {
      switch (this.field4554) {
         case 0:
            return 0;
         case 1:
            return var1 / 2;
         case 2:
            return var1;
         default:
            return 0;
      }
   }

   public int method7310(int var1) {
      switch (this.field4555) {
         case 0:
            return 0;
         case 1:
            return var1 / 2;
         case 2:
            return var1;
         default:
            return 0;
      }
   }

   void method7393() {
      this.method7312(0, this.field4559.size());
   }

   void method7312(int var1, int var2) {
      if (!this.method7279() && this.field4546 != null) {
         class474 var4 = this.method7315(var1, var2);
         boolean var5 = (Integer)var4.field4833 == 0 && (Integer)var4.field4831 == this.field4559.size();
         int var6 = (Integer)var4.field4833;
         int var7 = 0;
         int var8 = var5 ? 0 : ((class416)this.field4559.get((Integer)var4.field4833)).field4574;
         int var9 = 0;

         int var10;
         for(var10 = (Integer)var4.field4833; var10 <= (Integer)var4.field4831; ++var10) {
            boolean var11 = var10 >= this.field4559.size();
            class416 var12 = (class416)this.field4559.get(!var11 ? var10 : this.field4559.size() - 1);
            int var13 = !var11 ? this.method7311(var12, false) : 0;
            boolean var14 = !var11 && var12.field4573 == '\n';
            boolean var15 = !var11 && this.method7280() && var7 + var13 > this.field4552;
            if (var14 || var15 || var11) {
               int var16 = var10;
               int var17 = 0;
               int var18;
               int var19;
               class416 var20;
               if (var15) {
                  var18 = 0;
                  if (this.field4560 == 1) {
                     for(var19 = var10; var19 > var6; --var19) {
                        var20 = (class416)this.field4559.get(var19);
                        var18 += var19 < var10 ? this.method7311(var20, false) : 0;
                        if (var20.field4573 == ' ' || var20.field4573 == '\n') {
                           var16 = var19;
                           var7 -= var18;
                           var17 = var18;
                           break;
                        }
                     }
                  }
               }

               var18 = -this.method7309(var7);

               for(var19 = var6; var19 < var16; ++var19) {
                  var20 = (class416)this.field4559.get(var19);
                  int var21 = this.method7311(var20, false);
                  var20.field4572 = var18;
                  var20.field4574 = var8;
                  var18 += var21;
               }

               var6 = var16;
               var7 = var17;
               var8 += this.method7316();
               ++var9;
            }

            var7 += !var11 ? var13 : 0;
         }

         if (0 != this.field4555 && var5) {
            var10 = var9 * this.method7316();
            int var22 = this.method7310(var10);

            for(int var23 = 0; var23 < this.field4559.size(); ++var23) {
               class416 var24 = (class416)this.field4559.get(var23);
               var24.field4574 -= var22;
            }
         }

      }
   }

   int method7313(int var1) {
      return var1 < this.field4559.size() ? this.method7311((class416)this.field4559.get(var1), false) : 0;
   }

   int method7311(class416 var1, boolean var2) {
      if (var1.field4573 == '\n') {
         return 0;
      } else if (!var2 && 0 != this.field4557) {
         return this.field4546.field4538[42];
      } else {
         int var4 = this.field4546.field4538[var1.field4573];
         if (var4 == 0) {
            return var1.field4573 == '\t' ? this.field4546.field4538[32] * 3 : this.field4546.field4538[32];
         } else {
            return var4;
         }
      }
   }

   class474 method7315(int var1, int var2) {
      int var4 = Math.min(var1, var2);
      int var5 = Math.max(var1, var2);
      int var6 = this.field4559.size();
      if (var4 == 0 && var5 == var6) {
         return new class474(0, var6);
      } else {
         int var7 = this.method7331(var4, false);
         int var8 = this.method7317(var5, false);
         int var9;
         switch (this.field4555) {
            case 0:
               if (0 == this.field4554) {
                  return new class474(var7, var6);
               }

               var9 = this.method7331(var4, true);
               return new class474(var9, var6);
            case 1:
               return new class474(0, var6);
            case 2:
               if (2 == this.field4554) {
                  return new class474(0, var8);
               }

               var9 = this.method7317(var5, true);
               return new class474(0, var9);
            default:
               return new class474(0, var6);
         }
      }
   }

   int method7331(int var1, boolean var2) {
      if (var1 < this.field4559.size()) {
         int var4 = ((class416)this.field4559.get(var1)).field4574;

         for(int var5 = var1; var5 > 0; --var5) {
            if (((class416)this.field4559.get(var5 - 1)).field4574 < var4) {
               if (!var2) {
                  return var5;
               }

               var2 = false;
               var4 = ((class416)this.field4559.get(var5 - 1)).field4574;
            }
         }
      }

      return 0;
   }

   int method7317(int var1, boolean var2) {
      if (var1 < this.field4559.size()) {
         int var4 = ((class416)this.field4559.get(var1)).field4574;

         for(int var5 = var1; var5 < this.field4559.size() - 1; ++var5) {
            if (((class416)this.field4559.get(var5 + 1)).field4574 > var4) {
               if (!var2) {
                  return var5;
               }

               var2 = false;
               var4 = ((class416)this.field4559.get(var5 + 1)).field4574;
            }
         }
      }

      return this.field4559.size();
   }
}
