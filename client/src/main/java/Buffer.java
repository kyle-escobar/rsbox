import java.math.BigInteger;

public class Buffer extends class470 {
   static int[] field5128 = new int[256];
   static long[] field5130;
   public byte[] data;
   public int offset;

   static {
      int var2;
      for(int var1 = 0; var1 < 256; ++var1) {
         int var0 = var1;

         for(var2 = 0; var2 < 8; ++var2) {
            if (1 == (var0 & 1)) {
               var0 = var0 >>> 1 ^ -306674912;
            } else {
               var0 >>>= 1;
            }
         }

         field5128[var1] = var0;
      }

      field5130 = new long[256];

      for(var2 = 0; var2 < 256; ++var2) {
         long var4 = (long)var2;

         for(int var3 = 0; var3 < 8; ++var3) {
            if ((var4 & 1L) == 1L) {
               var4 = var4 >>> 1 ^ -3932672073523589310L;
            } else {
               var4 >>>= 1;
            }
         }

         field5130[var2] = var4;
      }

   }

   public Buffer(int var1) {
      this.data = class321.method5869(var1);
      this.offset = 0;
   }

   public Buffer(int var1, boolean var2) {
      this.data = class401.method7062(var1, var2);
   }

   public Buffer(byte[] var1) {
      this.data = var1;
      this.offset = 0;
   }

   static int method6596(byte[] var0, int var1, int var2) {
      int var4 = -1;

      for(int var5 = var1; var5 < var2; ++var5) {
         var4 = var4 >>> 8 ^ field5128[(var4 ^ var0[var5]) & 255];
      }

      var4 = ~var4;
      return var4;
   }

   public static int getJagStringSize(String var0) {
      return var0.length() + 1;
   }

   public static int method6819(String var0) {
      return var0.length() + 2;
   }

   public void release() {
      if (this.data != null) {
         class401.method6948(this.data);
      }

      this.data = null;
   }

   public void writeByte(int var1) {
      this.data[++this.offset - 1] = (byte)var1;
   }

   public void writeShort(int var1) {
      this.data[++this.offset - 1] = (byte)(var1 >> 8);
      this.data[++this.offset - 1] = (byte)var1;
   }

   public void writeMedium(int var1) {
      this.data[++this.offset - 1] = (byte)(var1 >> 16);
      this.data[++this.offset - 1] = (byte)(var1 >> 8);
      this.data[++this.offset - 1] = (byte)var1;
   }

   public void writeInt(int var1) {
      this.data[++this.offset - 1] = (byte)(var1 >> 24);
      this.data[++this.offset - 1] = (byte)(var1 >> 16);
      this.data[++this.offset - 1] = (byte)(var1 >> 8);
      this.data[++this.offset - 1] = (byte)var1;
   }

   public void writeMediumLong(long var1) {
      this.data[++this.offset - 1] = (byte)((int)(var1 >> 40));
      this.data[++this.offset - 1] = (byte)((int)(var1 >> 32));
      this.data[++this.offset - 1] = (byte)((int)(var1 >> 24));
      this.data[++this.offset - 1] = (byte)((int)(var1 >> 16));
      this.data[++this.offset - 1] = (byte)((int)(var1 >> 8));
      this.data[++this.offset - 1] = (byte)((int)var1);
   }

   public void writeLong(long var1) {
      this.data[++this.offset - 1] = (byte)((int)(var1 >> 56));
      this.data[++this.offset - 1] = (byte)((int)(var1 >> 48));
      this.data[++this.offset - 1] = (byte)((int)(var1 >> 40));
      this.data[++this.offset - 1] = (byte)((int)(var1 >> 32));
      this.data[++this.offset - 1] = (byte)((int)(var1 >> 24));
      this.data[++this.offset - 1] = (byte)((int)(var1 >> 16));
      this.data[++this.offset - 1] = (byte)((int)(var1 >> 8));
      this.data[++this.offset - 1] = (byte)((int)var1);
   }

   public void writeBoolean(boolean var1) {
      this.writeByte(var1 ? 1 : 0);
   }

   public void writeString(String var1) {
      int var3 = var1.indexOf(0);
      if (var3 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.offset += CP1252UTF8.encodeStringCp1252(var1, 0, var1.length(), this.data, this.offset);
         this.data[++this.offset - 1] = 0;
      }
   }

   public void writeJagString(String var1) {
      int var3 = var1.indexOf(0);
      if (var3 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.data[++this.offset - 1] = 0;
         this.offset += CP1252UTF8.encodeStringCp1252(var1, 0, var1.length(), this.data, this.offset);
         this.data[++this.offset - 1] = 0;
      }
   }

   public void writeUtf8(CharSequence var1) {
      int var4 = var1.length();
      int var5 = 0;

      int var6;
      for(var6 = 0; var6 < var4; ++var6) {
         char var7 = var1.charAt(var6);
         if (var7 <= 127) {
            ++var5;
         } else if (var7 <= 2047) {
            var5 += 2;
         } else {
            var5 += 3;
         }
      }

      this.data[++this.offset - 1] = 0;
      this.writeVarInt(var5);
      var5 = this.offset * 646629181;
      byte[] var13 = this.data;
      int var8 = this.offset;
      int var9 = var1.length();
      int var10 = var8;

      for(int var11 = 0; var11 < var9; ++var11) {
         char var12 = var1.charAt(var11);
         if (var12 <= 127) {
            var13[var10++] = (byte)var12;
         } else if (var12 <= 2047) {
            var13[var10++] = (byte)(192 | var12 >> 6);
            var13[var10++] = (byte)(128 | var12 & 63);
         } else {
            var13[var10++] = (byte)(224 | var12 >> 12);
            var13[var10++] = (byte)(128 | var12 >> 6 & 63);
            var13[var10++] = (byte)(128 | var12 & 63);
         }
      }

      var6 = var10 - var8;
      this.offset = (var5 + var6 * 646629181) * -164706283;
   }

   public void writeBytes(byte[] var1, int var2, int var3) {
      for(int var5 = var2; var5 < var3 + var2; ++var5) {
         this.data[++this.offset - 1] = var1[var5];
      }

   }

   public void writeBytes(Buffer var1) {
      this.writeBytes(var1.data, 0, var1.offset);
   }

   public void writeLengthInt(int var1) {
      if (var1 < 0) {
         throw new IllegalArgumentException();
      } else {
         this.data[this.offset - var1 - 4] = (byte)(var1 >> 24);
         this.data[this.offset - var1 - 3] = (byte)(var1 >> 16);
         this.data[this.offset - var1 - 2] = (byte)(var1 >> 8);
         this.data[this.offset - var1 - 1] = (byte)var1;
      }
   }

   public void writeLengthShort(int var1) {
      if (var1 >= 0 && var1 <= 65535) {
         this.data[this.offset - var1 - 2] = (byte)(var1 >> 8);
         this.data[this.offset - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void writeLengthByte(int var1) {
      if (var1 >= 0 && var1 <= 255) {
         this.data[this.offset - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void writeSmartByteShort(int var1) {
      if (var1 >= 0 && var1 < 128) {
         this.writeByte(var1);
      } else if (var1 >= 0 && var1 < 32768) {
         this.writeShort(var1 + '\u8000');
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void writeVarInt(int var1) {
      if ((var1 & -128) != 0) {
         if (0 != (var1 & -16384)) {
            if ((var1 & -2097152) != 0) {
               if ((var1 & -268435456) != 0) {
                  this.writeByte(var1 >>> 28 | 128);
               }

               this.writeByte(var1 >>> 21 | 128);
            }

            this.writeByte(var1 >>> 14 | 128);
         }

         this.writeByte(var1 >>> 7 | 128);
      }

      this.writeByte(var1 & 127);
   }

   public int readUnsignedByte() {
      return this.data[++this.offset - 1] & 255;
   }

   public byte readByte() {
      return this.data[++this.offset - 1];
   }

   public int readUnsignedShort() {
      this.offset += 2;
      return ((this.data[this.offset - 2] & 255) << 8) + (this.data[this.offset - 1] & 255);
   }

   public int readShort() {
      this.offset += 2;
      int var2 = (this.data[this.offset - 1] & 255) + ((this.data[this.offset - 2] & 255) << 8);
      if (var2 > 32767) {
         var2 -= 65536;
      }

      return var2;
   }

   public int readUnsignedMedium() {
      this.offset += 3;
      return ((this.data[this.offset - 3] & 255) << 16) + ((this.data[this.offset - 2] & 255) << 8) + (this.data[this.offset - 1] & 255);
   }

   public int readMedium() {
      this.offset += 3;
      int var2 = (this.data[this.offset - 1] & 255) + ((this.data[this.offset - 2] & 255) << 8) + ((this.data[this.offset - 3] & 255) << 16);
      if (var2 > 8388607) {
         var2 -= 16777216;
      }

      return var2;
   }

   public int readInt() {
      this.offset += 4;
      return ((this.data[this.offset - 3] & 255) << 16) + ((this.data[this.offset - 4] & 255) << 24) + ((this.data[this.offset - 2] & 255) << 8) + (this.data[this.offset - 1] & 255);
   }

   public long readLong() {
      long var2 = (long)this.readInt() & 4294967295L;
      long var4 = (long)this.readInt() & 4294967295L;
      return (var2 << 32) + var4;
   }

   public float readFloat() {
      return Float.intBitsToFloat(this.readInt());
   }

   public boolean readBoolean() {
      return (this.readUnsignedByte() & 1) == 1;
   }

   public String readStringOrNull() {
      if (this.data[this.offset] == 0) {
         ++this.offset;
         return null;
      } else {
         return this.readString();
      }
   }

   public String readString() {
      int var2 = this.offset;

      while(this.data[++this.offset - 1] != 0) {
      }

      int var3 = this.offset - var2 - 1;
      return var3 == 0 ? "" : CP1252UTF8.cp1252ToUtf8(this.data, var2, var3);
   }

   public String readJagString() {
      byte var2 = this.data[++this.offset - 1];
      if (var2 != 0) {
         throw new IllegalStateException("");
      } else {
         int var3 = this.offset;

         while(this.data[++this.offset - 1] != 0) {
         }

         int var4 = this.offset - var3 - 1;
         return var4 == 0 ? "" : CP1252UTF8.cp1252ToUtf8(this.data, var3, var4);
      }
   }

   public String readUtf8() {
      byte var2 = this.data[++this.offset - 1];
      if (var2 != 0) {
         throw new IllegalStateException("");
      } else {
         int var3 = this.readVarInt();
         if (var3 + this.offset > this.data.length) {
            throw new IllegalStateException("");
         } else {
            String var4 = class501.method7095(this.data, this.offset, var3);
            this.offset += var3;
            return var4;
         }
      }
   }

   public void readBytes(byte[] var1, int var2, int var3) {
      for(int var5 = var2; var5 < var3 + var2; ++var5) {
         var1[var5] = this.data[++this.offset - 1];
      }

   }

   public int readSmartByteShort() {
      int var2 = this.data[this.offset] & 255;
      return var2 < 128 ? this.readUnsignedByte() - 64 : this.readUnsignedShort() - '\uc000';
   }

   public int readUnsignedSmartByteShort() {
      int var2 = this.data[this.offset] & 255;
      return var2 < 128 ? this.readUnsignedByte() : this.readUnsignedShort() - '\u8000';
   }

   public int readUnsignedSmartByteShortNull() {
      int var2 = this.data[this.offset] & 255;
      return var2 < 128 ? this.readUnsignedByte() - 1 : this.readUnsignedShort() - '\u8001';
   }

   public int method8766() {
      int var2 = 0;

      int var3;
      for(var3 = this.readUnsignedSmartByteShort(); var3 == 32767; var3 = this.readUnsignedSmartByteShort()) {
         var2 += 32767;
      }

      var2 += var3;
      return var2;
   }

   public int method8767() {
      return this.data[this.offset] < 0 ? this.readInt() & Integer.MAX_VALUE : this.readUnsignedShort();
   }

   public int method8814() {
      if (this.data[this.offset] < 0) {
         return this.readInt() & Integer.MAX_VALUE;
      } else {
         int var2 = this.readUnsignedShort();
         return var2 == 32767 ? -1 : var2;
      }
   }

   public int readVarInt() {
      byte var2 = this.data[++this.offset - 1];

      int var3;
      for(var3 = 0; var2 < 0; var2 = this.data[++this.offset - 1]) {
         var3 = (var3 | var2 & 127) << 7;
      }

      return var3 | var2;
   }

   public int readVarLength() {
      int var3 = 0;
      int var4 = 0;

      int var2;
      do {
         var2 = this.readUnsignedByte();
         var3 |= (var2 & 127) << var4;
         var4 += 7;
      } while(var2 > 127);

      return var3;
   }

   public void method8771(int[] var1) {
      int var3 = this.offset / 8;
      this.offset = 0;

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = this.readInt();
         int var6 = this.readInt();
         int var7 = 0;
         int var8 = -1640531527;

         for(int var9 = 32; var9-- > 0; var6 += (var5 << 4 ^ var5 >>> 5) + var5 ^ var7 + var1[var7 >>> 11 & 3]) {
            var5 += var6 + (var6 << 4 ^ var6 >>> 5) ^ var1[var7 & 3] + var7;
            var7 += var8;
         }

         this.offset -= 8;
         this.writeInt(var5);
         this.writeInt(var6);
      }

   }

   public void method8834(int[] var1) {
      int var3 = this.offset / 8;
      this.offset = 0;

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = this.readInt();
         int var6 = this.readInt();
         int var7 = -957401312;
         int var8 = -1640531527;

         for(int var9 = 32; var9-- > 0; var5 -= var6 + (var6 << 4 ^ var6 >>> 5) ^ var7 + var1[var7 & 3]) {
            var6 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var1[var7 >>> 11 & 3] + var7;
            var7 -= var8;
         }

         this.offset -= 8;
         this.writeInt(var5);
         this.writeInt(var6);
      }

   }

   public void method8773(int[] var1, int var2, int var3) {
      int var5 = this.offset;
      this.offset = var2;
      int var6 = (var3 - var2) / 8;

      for(int var7 = 0; var7 < var6; ++var7) {
         int var8 = this.readInt();
         int var9 = this.readInt();
         int var10 = 0;
         int var11 = -1640531527;

         for(int var12 = 32; var12-- > 0; var9 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var10 + var1[var10 >>> 11 & 3]) {
            var8 += var9 + (var9 << 4 ^ var9 >>> 5) ^ var10 + var1[var10 & 3];
            var10 += var11;
         }

         this.offset -= 8;
         this.writeInt(var8);
         this.writeInt(var9);
      }

      this.offset = var5;
   }

   public void method8774(int[] var1, int var2, int var3) {
      int var5 = this.offset;
      this.offset = var2;
      int var6 = (var3 - var2) / 8;

      for(int var7 = 0; var7 < var6; ++var7) {
         int var8 = this.readInt();
         int var9 = this.readInt();
         int var10 = -957401312;
         int var11 = -1640531527;

         for(int var12 = 32; var12-- > 0; var8 -= (var9 << 4 ^ var9 >>> 5) + var9 ^ var10 + var1[var10 & 3]) {
            var9 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ var1[var10 >>> 11 & 3] + var10;
            var10 -= var11;
         }

         this.offset -= 8;
         this.writeInt(var8);
         this.writeInt(var9);
      }

      this.offset = var5;
   }

   public void encryptRsa(BigInteger exponent, BigInteger modulus) {
      int var4 = this.offset;
      this.offset = 0;
      byte[] var5 = new byte[var4];
      this.readBytes(var5, 0, var4);
      BigInteger var6 = new BigInteger(var5);
      BigInteger var7 = var6.modPow(exponent, modulus);
      byte[] var8 = var7.toByteArray();
      this.offset = 0;
      this.writeShort(var8.length);
      this.writeBytes(var8, 0, var8.length);
   }

   public int writeCrc(int var1) {
      int var3 = method6596(this.data, var1, this.offset);
      this.writeInt(var3);
      return var3;
   }

   public boolean verifyCrc() {
      this.offset -= 4;
      int var2 = method6596(this.data, 0, this.offset);
      int var3 = this.readInt();
      return var3 == var2;
   }

   public void writeByteAdd(int var1) {
      this.data[++this.offset - 1] = (byte)(var1 + 128);
   }

   public void writeByteNeg(int var1) {
      this.data[++this.offset - 1] = (byte)(0 - var1);
   }

   public void writeByteSub(int var1) {
      this.data[++this.offset - 1] = (byte)(128 - var1);
   }

   public int readUnsignedByteAdd() {
      return this.data[++this.offset - 1] - 128 & 255;
   }

   public int readUnsignedByteNeg() {
      return 0 - this.data[++this.offset - 1] & 255;
   }

   public int readUnsignedByteSub() {
      return 128 - this.data[++this.offset - 1] & 255;
   }

   public byte readByteAdd() {
      return (byte)(this.data[++this.offset - 1] - 128);
   }

   public byte readByteNeg() {
      return (byte)(0 - this.data[++this.offset - 1]);
   }

   public byte readByteSub() {
      return (byte)(128 - this.data[++this.offset - 1]);
   }

   public void writeShortLE(int var1) {
      this.data[++this.offset - 1] = (byte)var1;
      this.data[++this.offset - 1] = (byte)(var1 >> 8);
   }

   public void writeShortAdd(int var1) {
      this.data[++this.offset - 1] = (byte)(var1 >> 8);
      this.data[++this.offset - 1] = (byte)(var1 + 128);
   }

   public void writeShortLEAdd(int var1) {
      this.data[++this.offset - 1] = (byte)(var1 + 128);
      this.data[++this.offset - 1] = (byte)(var1 >> 8);
   }

   public int readUnsignedShortLE() {
      this.offset += 2;
      return (this.data[this.offset - 2] & 255) + ((this.data[this.offset - 1] & 255) << 8);
   }

   public int readUnsignedShortAdd() {
      this.offset += 2;
      return (this.data[this.offset - 1] - 128 & 255) + ((this.data[this.offset - 2] & 255) << 8);
   }

   public int readUnsignedShortLEAdd() {
      this.offset += 2;
      return ((this.data[this.offset - 1] & 255) << 8) + (this.data[this.offset - 2] - 128 & 255);
   }

   public int readShortLE() {
      this.offset += 2;
      int var2 = ((this.data[this.offset - 1] & 255) << 8) + (this.data[this.offset - 2] & 255);
      if (var2 > 32767) {
         var2 -= 65536;
      }

      return var2;
   }

   public int readShortAdd() {
      this.offset += 2;
      int var2 = ((this.data[this.offset - 2] & 255) << 8) + (this.data[this.offset - 1] - 128 & 255);
      if (var2 > 32767) {
         var2 -= 65536;
      }

      return var2;
   }

   // 1, 2, 3
   public void writeMediumLE(int var1) {
      this.data[++this.offset - 1] = (byte)var1;
      this.data[++this.offset - 1] = (byte)(var1 >> 8);
      this.data[++this.offset - 1] = (byte)(var1 >> 16);
   }

   public int readUnsignedMediumLE() {
      this.offset += 3;
      return (this.data[this.offset - 3] & 255) + ((this.data[this.offset - 2] & 255) << 8) + ((this.data[this.offset - 1] & 255) << 16);
   }

   // 2, 1, 3
   public int readUnsignedMediumME() {
      this.offset += 3;
      return (this.data[this.offset - 2] & 255) + ((this.data[this.offset - 1] & 255) << 8) + ((this.data[this.offset - 3] & 255) << 16);
   }

   // 1, 3, 2
   public int readUnsignedMediumIME() {
      this.offset += 3;
      int var2 = (this.data[this.offset - 1] & 255) + ((this.data[this.offset - 3] & 255) << 8) + ((this.data[this.offset - 2] & 255) << 16);
      if (var2 > 8388607) {
         var2 -= 16777216;
      }

      return var2;
   }

   // 1, 2, 3, 4
   public void writeIntLE(int var1) {
      this.data[++this.offset - 1] = (byte)var1;
      this.data[++this.offset - 1] = (byte)(var1 >> 8);
      this.data[++this.offset - 1] = (byte)(var1 >> 16);
      this.data[++this.offset - 1] = (byte)(var1 >> 24);
   }

   // 2, 1, 4, 3
   public void writeIntME(int var1) {
      this.data[++this.offset - 1] = (byte)(var1 >> 8);
      this.data[++this.offset - 1] = (byte)var1;
      this.data[++this.offset - 1] = (byte)(var1 >> 24);
      this.data[++this.offset - 1] = (byte)(var1 >> 16);
   }

   // 3, 4, 1, 2
   public void writeIntIME(int var1) {
      this.data[++this.offset - 1] = (byte)(var1 >> 16);
      this.data[++this.offset - 1] = (byte)(var1 >> 24);
      this.data[++this.offset - 1] = (byte)var1;
      this.data[++this.offset - 1] = (byte)(var1 >> 8);
   }

   // 4, 3, 2, 1
   public int readIntLE() {
      this.offset += 4;
      return ((this.data[this.offset - 1] & 255) << 24) + ((this.data[this.offset - 2] & 255) << 16) + ((this.data[this.offset - 3] & 255) << 8) + (this.data[this.offset - 4] & 255);
   }

   // 3, 4, 1, 2
   public int writeIntME() {
      this.offset += 4;
      return (this.data[this.offset - 3] & 255) + ((this.data[this.offset - 4] & 255) << 8) + ((this.data[this.offset - 1] & 255) << 16) + ((this.data[this.offset - 2] & 255) << 24);
   }

   // 2, 1, 4, 3
   public int writeIntIME() {
      this.offset += 4;
      return ((this.data[this.offset - 3] & 255) << 24) + ((this.data[this.offset - 4] & 255) << 16) + ((this.data[this.offset - 1] & 255) << 8) + (this.data[this.offset - 2] & 255);
   }

   public void writeBytesReversed(byte[] var1, int var2, int var3) {
      for(int var5 = var2 + var3 - 1; var5 >= var2; --var5) {
         var1[var5] = this.data[++this.offset - 1];
      }

   }

   public void writeBytesReversedAdd(byte[] var1, int var2, int var3) {
      for(int var5 = var2 + var3 - 1; var5 >= var2; --var5) {
         var1[var5] = (byte)(this.data[++this.offset - 1] - 128);
      }

   }
}
