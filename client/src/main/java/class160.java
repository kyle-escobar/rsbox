import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class class160 {
   public static class513 field1750 = null;
   public static class513 field1753 = null;
   public static class513 field1755 = null;
   public static int field1757;
   static int field1760;
   static File field1752;

   class160() throws Throwable {
   }

   public static void method3851(String var0, String var1, String var2, int var3, int var4) throws IOException {
      if (var1 != null && !var1.isEmpty()) {
         var0 = var0 + "-" + var1;
      }

      field1757 = var4;
      class435.field4652 = var3;

      try {
         class428.field4624 = System.getProperty("os.name");
      } catch (Exception var27) {
         class428.field4624 = "Unknown";
      }

      class218.field2396 = class428.field4624.toLowerCase();
      class453.field4738 = null;

      try {
         class453.field4738 = System.getProperty("jagex.userhome");
      } catch (Exception var26) {
      }

      if (class453.field4738 == null) {
         try {
            class453.field4738 = System.getProperty("user.home");
         } catch (Exception var25) {
         }
      }

      if (class453.field4738 != null) {
         class453.field4738 = class453.field4738 + "/";
      }

      try {
         if (class218.field2396.startsWith("win")) {
            if (class453.field4738 == null) {
               class453.field4738 = System.getenv("USERPROFILE");
            }
         } else if (null == class453.field4738) {
            class453.field4738 = System.getenv("HOME");
         }

         if (null != class453.field4738) {
            class453.field4738 = class453.field4738 + "/";
         }
      } catch (Exception var24) {
      }

      if (null == class453.field4738) {
         class453.field4738 = "~/";
      }

      class172.field1825 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class453.field4738, "/tmp/", ""};
      class401.field4471 = new String[]{".jagex_cache_" + class435.field4652, ".file_store_" + class435.field4652};
      int var6 = 0;

      label265:
      while(var6 < 4) {
         String var8 = var6 == 0 ? "" : "" + var6;
         class157.field1739 = new File(class453.field4738, "jagex_cl_" + var0 + "_" + var2 + var8 + ".dat");
         String var9 = null;
         String var10 = null;
         boolean var11 = false;
         PacketBuffer var13;
         int var14;
         int var16;
         File var37;
         if (class157.field1739.exists()) {
            try {
               class508 var12 = new class508(class157.field1739, "rw", 10000L);

               for(var13 = new PacketBuffer((int)var12.method8613()); var13.offset < var13.data.length; var13.offset += var14) {
                  var14 = var12.method8615(var13.data, var13.offset, var13.data.length - var13.offset);
                  if (var14 == -1) {
                     throw new IOException();
                  }
               }

               var13.offset = 0;
               var14 = var13.readUnsignedByte();
               if (var14 < 1 || var14 > 3) {
                  throw new IOException("" + var14);
               }

               int var15 = 0;
               if (var14 > 1) {
                  var15 = var13.readUnsignedByte();
               }

               if (var14 <= 2) {
                  var9 = var13.readJagString();
                  if (var15 == 1) {
                     var10 = var13.readJagString();
                  }
               } else {
                  var9 = var13.readUtf8();
                  if (var15 == 1) {
                     var10 = var13.readUtf8();
                  }
               }

               var12.method8611();
            } catch (IOException var29) {
               var29.printStackTrace();
            }

            if (var9 != null) {
               var37 = new File(var9);
               if (!var37.exists()) {
                  var9 = null;
               }
            }

            if (null != var9) {
               var37 = new File(var9, "test.dat");

               boolean var40;
               try {
                  RandomAccessFile var44 = new RandomAccessFile(var37, "rw");
                  var16 = var44.read();
                  var44.seek(0L);
                  var44.write(var16);
                  var44.seek(0L);
                  var44.close();
                  var37.delete();
                  var40 = true;
               } catch (Exception var23) {
                  var40 = false;
               }

               if (!var40) {
                  var9 = null;
               }
            }
         }

         if (var9 == null && var6 == 0) {
            label239:
            for(int var34 = 0; var34 < class401.field4471.length; ++var34) {
               for(int var39 = 0; var39 < class172.field1825.length; ++var39) {
                  File var42 = new File(class172.field1825[var39] + class401.field4471[var34] + File.separatorChar + var0 + File.separatorChar);
                  if (var42.exists()) {
                     File var45 = new File(var42, "test.dat");

                     boolean var47;
                     try {
                        RandomAccessFile var17 = new RandomAccessFile(var45, "rw");
                        int var18 = var17.read();
                        var17.seek(0L);
                        var17.write(var18);
                        var17.seek(0L);
                        var17.close();
                        var45.delete();
                        var47 = true;
                     } catch (Exception var22) {
                        var47 = false;
                     }

                     if (var47) {
                        var9 = var42.toString();
                        var11 = true;
                        break label239;
                     }
                  }
               }
            }
         }

         if (null == var9) {
            var9 = class453.field4738 + File.separatorChar + ClientLauncher.CACHE_DIR + var8 + File.separatorChar + var0 + File.separatorChar + var2 + File.separatorChar;
            var11 = true;
         }

         File var36;
         if (null != var10) {
            var36 = new File(var10);
            var37 = new File(var9);

            try {
               File[] var43 = var36.listFiles();

               for(var16 = 0; var16 < var43.length; ++var16) {
                  File var48 = var43[var16];
                  File var50 = new File(var37, var48.getName());
                  boolean var19 = var48.renameTo(var50);
                  if (!var19) {
                     throw new IOException();
                  }
               }
            } catch (Exception var28) {
               var28.printStackTrace();
            }

            var11 = true;
         }

         if (var11) {
            var36 = new File(var9);
            var13 = null;

            try {
               class508 var46 = new class508(class157.field1739, "rw", 10000L);
               PacketBuffer var49 = new PacketBuffer(500);
               var49.writeByte(3);
               var49.writeByte(var13 != null ? 1 : 0);
               var49.writeUtf8(var36.getPath());
               if (null != var13) {
                  var49.writeUtf8("");
               }

               var46.method8610(var49.data, 0, var49.offset);
               var46.method8611();
            } catch (IOException var21) {
               var21.printStackTrace();
            }
         }

         File var7 = new File(var9);
         field1752 = var7;
         if (!field1752.exists()) {
            field1752.mkdirs();
         }

         File[] var32 = field1752.listFiles();
         if (null != var32) {
            for(int var33 = 0; var33 < var32.length; ++var33) {
               File var35 = var32[var33];

               boolean var38;
               try {
                  RandomAccessFile var41 = new RandomAccessFile(var35, "rw");
                  var14 = var41.read();
                  var41.seek(0L);
                  var41.write(var14);
                  var41.seek(0L);
                  var41.close();
                  var38 = true;
               } catch (Exception var20) {
                  var38 = false;
               }

               if (!var38) {
                  ++var6;
                  continue label265;
               }
            }
         }
         break;
      }

      File var30 = field1752;
      class167.field1794 = var30;
      if (!class167.field1794.exists()) {
         throw new RuntimeException("");
      } else {
         class167.field1795 = true;
         method7564();
         field1750 = new class513(new class508(class167.method374("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
         field1753 = new class513(new class508(class167.method374("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
         class302.field3191 = new class513[field1757];

         for(int var31 = 0; var31 < field1757; ++var31) {
            class302.field3191[var31] = new class513(new class508(class167.method374("main_file_cache.idx" + var31), "rw", 1048576L), 6000, 0);
         }

      }
   }

   public static class508 method1257(String var0, String var1, boolean var2) {
      File var4 = new File(field1752, "preferences" + var0 + ".dat");
      if (var4.exists()) {
         try {
            class508 var11 = new class508(var4, "rw", 10000L);
            return var11;
         } catch (IOException var10) {
         }
      }

      String var5 = "";
      if (class435.field4652 == 33) {
         var5 = "_rc";
      } else if (34 == class435.field4652) {
         var5 = "_wip";
      }

      File var6 = new File(class453.field4738, "jagex_" + var1 + "_preferences" + var0 + var5 + ".dat");
      class508 var7;
      if (!var2 && var6.exists()) {
         try {
            var7 = new class508(var6, "rw", 10000L);
            return var7;
         } catch (IOException var9) {
         }
      }

      try {
         var7 = new class508(var4, "rw", 10000L);
         return var7;
      } catch (IOException var8) {
         throw new RuntimeException();
      }
   }

   static void method7564() {
      try {
         File var1 = new File(class453.field4738, "random.dat");
         int var3;
         if (var1.exists()) {
            field1755 = new class513(new class508(var1, "rw", 25L), 24, 0);
         } else {
            label34:
            for(int var2 = 0; var2 < class401.field4471.length; ++var2) {
               for(var3 = 0; var3 < class172.field1825.length; ++var3) {
                  File var4 = new File(class172.field1825[var3] + class401.field4471[var2] + File.separatorChar + "random.dat");
                  if (var4.exists()) {
                     field1755 = new class513(new class508(var4, "rw", 25L), 24, 0);
                     break label34;
                  }
               }
            }
         }

         if (field1755 == null) {
            RandomAccessFile var6 = new RandomAccessFile(var1, "rw");
            var3 = var6.read();
            var6.seek(0L);
            var6.write(var3);
            var6.seek(0L);
            var6.close();
            field1755 = new class513(new class508(var1, "rw", 25L), 24, 0);
         }
      } catch (IOException var5) {
      }

   }

   public static byte[] method4268() {
      byte[] var1 = new byte[24];

      try {
         field1755.method8669(0L);
         field1755.method8677(var1);

         int var2;
         for(var2 = 0; var2 < 24 && 0 == var1[var2]; ++var2) {
         }

         if (var2 >= 24) {
            throw new IOException();
         }
      } catch (Exception var4) {
         for(int var3 = 0; var3 < 24; ++var3) {
            var1[var3] = -1;
         }
      }

      return var1;
   }
}
