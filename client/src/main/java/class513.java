import java.io.EOFException;
import java.io.IOException;

public class class513 {
   byte[] field5101;
   byte[] field5104;
   class508 field5106;
   int field5100 = 0;
   int field5103;
   long field5102 = -1L;
   long field5105 = -1L;
   long field5107;
   long field5108;
   long field5109;
   long field5110;

   public class513(class508 var1, int var2, int var3) throws IOException {
      this.field5106 = var1;
      this.field5109 = this.field5108 = var1.method8613();
      this.field5101 = new byte[var2];
      this.field5104 = new byte[var3];
      this.field5107 = 0L;
   }

   public void method8661() throws IOException {
      this.method8668();
      this.field5106.method8611();
   }

   public void method8669(long var1) throws IOException {
      if (var1 < 0L) {
         throw new IOException("");
      } else {
         this.field5107 = var1;
      }
   }

   public long method8663() {
      return this.field5109;
   }

   public void method8677(byte[] var1) throws IOException {
      this.method8664(var1, 0, var1.length);
   }

   public void method8664(byte[] var1, int var2, int var3) throws IOException {
      try {
         if (var3 + var2 > var1.length) {
            throw new ArrayIndexOutOfBoundsException(var2 + var3 - var1.length);
         }

         if (this.field5102 != -1L && this.field5107 >= this.field5102 && (long)var3 + this.field5107 <= this.field5102 + (long)this.field5100) {
            System.arraycopy(this.field5104, (int)(this.field5107 - this.field5102), var1, var2, var3);
            this.field5107 += (long)var3;
            return;
         }

         long var5 = this.field5107;
         int var8 = var3;
         int var9;
         if (this.field5107 >= this.field5105 && this.field5107 < this.field5105 + (long)this.field5103) {
            var9 = (int)((long)this.field5103 - (this.field5107 - this.field5105));
            if (var9 > var3) {
               var9 = var3;
            }

            System.arraycopy(this.field5101, (int)(this.field5107 - this.field5105), var1, var2, var9);
            this.field5107 += (long)var9;
            var2 += var9;
            var3 -= var9;
         }

         if (var3 > this.field5101.length) {
            this.field5106.method8608(this.field5107);

            for(this.field5110 = this.field5107; var3 > 0; var3 -= var9) {
               var9 = this.field5106.method8615(var1, var2, var3);
               if (var9 == -1) {
                  break;
               }

               this.field5110 += (long)var9;
               this.field5107 += (long)var9;
               var2 += var9;
            }
         } else if (var3 > 0) {
            this.method8666();
            var9 = var3;
            if (var3 > this.field5103) {
               var9 = this.field5103;
            }

            System.arraycopy(this.field5101, 0, var1, var2, var9);
            var2 += var9;
            var3 -= var9;
            this.field5107 += (long)var9;
         }

         if (this.field5102 != -1L) {
            if (this.field5102 > this.field5107 && var3 > 0) {
               var9 = (int)(this.field5102 - this.field5107) + var2;
               if (var9 > var3 + var2) {
                  var9 = var3 + var2;
               }

               while(var2 < var9) {
                  var1[var2++] = 0;
                  --var3;
                  ++this.field5107;
               }
            }

            long var15 = -1L;
            long var11 = -1L;
            if (this.field5102 >= var5 && this.field5102 < (long)var8 + var5) {
               var15 = this.field5102;
            } else if (var5 >= this.field5102 && var5 < this.field5102 + (long)this.field5100) {
               var15 = var5;
            }

            if (this.field5102 + (long)this.field5100 > var5 && this.field5102 + (long)this.field5100 <= (long)var8 + var5) {
               var11 = this.field5102 + (long)this.field5100;
            } else if ((long)var8 + var5 > this.field5102 && (long)var8 + var5 <= (long)this.field5100 + this.field5102) {
               var11 = var5 + (long)var8;
            }

            if (var15 > -1L && var11 > var15) {
               int var13 = (int)(var11 - var15);
               System.arraycopy(this.field5104, (int)(var15 - this.field5102), var1, var2 + (int)(var15 - var5), var13);
               if (var11 > this.field5107) {
                  var3 = (int)((long)var3 - (var11 - this.field5107));
                  this.field5107 = var11;
               }
            }
         }
      } catch (IOException var14) {
         this.field5110 = -1L;
         throw var14;
      }

      if (var3 > 0) {
         throw new EOFException();
      }
   }

   void method8666() throws IOException {
      this.field5103 = 0;
      if (this.field5107 != this.field5110) {
         this.field5106.method8608(this.field5107);
         this.field5110 = this.field5107;
      }

      int var3;
      for(this.field5105 = this.field5107; this.field5103 < this.field5101.length; this.field5103 += var3) {
         int var2 = this.field5101.length - this.field5103;
         if (var2 > 200000000) {
            var2 = 200000000;
         }

         var3 = this.field5106.method8615(this.field5101, this.field5103, var2);
         if (var3 == -1) {
            break;
         }

         this.field5110 += (long)var3;
      }

   }

   public void method8683(byte[] var1, int var2, int var3) throws IOException {
      try {
         if ((long)var3 + this.field5107 > this.field5109) {
            this.field5109 = (long)var3 + this.field5107;
         }

         if (this.field5102 != -1L && (this.field5107 < this.field5102 || this.field5107 > this.field5102 + (long)this.field5100)) {
            this.method8668();
         }

         if (-1L != this.field5102 && this.field5107 + (long)var3 > this.field5102 + (long)this.field5104.length) {
            int var5 = (int)((long)this.field5104.length - (this.field5107 - this.field5102));
            System.arraycopy(var1, var2, this.field5104, (int)(this.field5107 - this.field5102), var5);
            this.field5107 += (long)var5;
            var2 += var5;
            var3 -= var5;
            this.field5100 = this.field5104.length;
            this.method8668();
         }

         if (var3 <= this.field5104.length) {
            if (var3 > 0) {
               if (this.field5102 == -1L) {
                  this.field5102 = this.field5107;
               }

               System.arraycopy(var1, var2, this.field5104, (int)(this.field5107 - this.field5102), var3);
               this.field5107 += (long)var3;
               if (this.field5107 - this.field5102 > (long)this.field5100) {
                  this.field5100 = (int)(this.field5107 - this.field5102);
               }

            }
         } else {
            if (this.field5110 != this.field5107) {
               this.field5106.method8608(this.field5107);
               this.field5110 = this.field5107;
            }

            this.field5106.method8610(var1, var2, var3);
            this.field5110 += (long)var3;
            if (this.field5110 > this.field5108) {
               this.field5108 = this.field5110;
            }

            long var11 = -1L;
            long var7 = -1L;
            if (this.field5107 >= this.field5105 && this.field5107 < (long)this.field5103 + this.field5105) {
               var11 = this.field5107;
            } else if (this.field5105 >= this.field5107 && this.field5105 < (long)var3 + this.field5107) {
               var11 = this.field5105;
            }

            if ((long)var3 + this.field5107 > this.field5105 && this.field5107 + (long)var3 <= (long)this.field5103 + this.field5105) {
               var7 = (long)var3 + this.field5107;
            } else if (this.field5105 + (long)this.field5103 > this.field5107 && this.field5105 + (long)this.field5103 <= (long)var3 + this.field5107) {
               var7 = this.field5105 + (long)this.field5103;
            }

            if (var11 > -1L && var7 > var11) {
               int var9 = (int)(var7 - var11);
               System.arraycopy(var1, (int)(var11 + (long)var2 - this.field5107), this.field5101, (int)(var11 - this.field5105), var9);
            }

            this.field5107 += (long)var3;
         }
      } catch (IOException var10) {
         this.field5110 = -1L;
         throw var10;
      }
   }

   void method8668() throws IOException {
      if (-1L != this.field5102) {
         if (this.field5110 != this.field5102) {
            this.field5106.method8608(this.field5102);
            this.field5110 = this.field5102;
         }

         this.field5106.method8610(this.field5104, 0, this.field5100);
         this.field5110 += (long)this.field5100;
         if (this.field5110 > this.field5108) {
            this.field5108 = this.field5110;
         }

         long var2 = -1L;
         long var4 = -1L;
         if (this.field5102 >= this.field5105 && this.field5102 < this.field5105 + (long)this.field5103) {
            var2 = this.field5102;
         } else if (this.field5105 >= this.field5102 && this.field5105 < this.field5102 + (long)this.field5100) {
            var2 = this.field5105;
         }

         if ((long)this.field5100 + this.field5102 > this.field5105 && (long)this.field5100 + this.field5102 <= (long)this.field5103 + this.field5105) {
            var4 = (long)this.field5100 + this.field5102;
         } else if ((long)this.field5103 + this.field5105 > this.field5102 && this.field5105 + (long)this.field5103 <= (long)this.field5100 + this.field5102) {
            var4 = (long)this.field5103 + this.field5105;
         }

         if (var2 > -1L && var4 > var2) {
            int var6 = (int)(var4 - var2);
            System.arraycopy(this.field5104, (int)(var2 - this.field5102), this.field5101, (int)(var2 - this.field5105), var6);
         }

         this.field5102 = -1L;
         this.field5100 = 0;
      }

   }
}
