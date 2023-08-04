import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class Component extends class470 {
   public static boolean field3737;
   public static boolean[] field3674;
   static class290 field3599 = new class290(50);
   static class290 field3600 = new class290(20);
   static class290 field3617 = new class290(200);
   static class290 field3684 = new class290(8);
   static class428 field3653;
   static class428 field3748;
   class173 field3675;
   class338 field3679;
   int field3652;
   int field3676;
   int field3734;
   HashMap field3677;
   HashMap field3678;
   public boolean field3605 = false;
   public boolean field3626 = false;
   public boolean field3645;
   public boolean field3648;
   public boolean field3649;
   public boolean field3665;
   public boolean field3666;
   public boolean field3681;
   public boolean field3688;
   public boolean field3691;
   public boolean field3708;
   public boolean field3721 = false;
   public boolean field3744;
   public boolean field3745;
   public boolean field3747;
   public boolean field3753;
   public boolean field3754;
   public boolean field3755;
   public byte[][] field3683;
   public byte[][] field3694;
   public class314 field3664;
   public Component field3714;
   public Component[] field3743;
   public class522 field3636;
   public int field3589;
   public int field3590;
   public int field3592 = 0;
   public int field3598 = 0;
   public int field3603;
   public int field3606 = -1;
   public int field3607 = -1;
   public int field3608;
   public int field3609;
   public int field3612 = 0;
   public int field3614 = 0;
   public int field3615 = 0;
   public int field3616 = 0;
   public int field3619 = 0;
   public int field3620 = 0;
   public int field3622 = 0;
   public int field3624 = 1;
   public int field3625 = -1;
   public int field3627 = 0;
   public int field3628 = 0;
   public int field3629 = 0;
   public int field3630;
   public int field3631 = 0;
   public int field3632 = 0;
   public int field3633 = 0;
   public int field3634 = 0;
   public int field3637;
   public int field3638;
   public int field3639;
   public int field3641;
   public int field3642;
   public int field3644;
   public int field3646;
   public int field3650;
   public int field3651;
   public int field3654;
   public int field3655 = 1;
   public int field3656;
   public int field3657;
   public int field3658;
   public int field3659;
   public int field3661;
   public int field3662;
   public int field3663;
   public int field3667;
   public int field3669;
   public int field3671;
   public int field3672;
   public int field3673;
   public int field3680;
   public int field3689 = 0;
   public int field3690;
   public int field3696;
   public int field3700 = 0;
   public int field3709;
   public int field3718 = 0;
   public int field3719 = 0;
   public int field3728;
   public int field3731;
   public int field3732 = 0;
   public int field3739;
   public int field3740 = 0;
   public int field3741;
   public int field3742;
   public int field3746;
   public int field3749;
   public int field3750;
   public int[] field3602;
   public int[] field3604;
   public int[] field3613;
   public int[] field3640;
   public int[] field3704;
   public int[] field3707;
   public int[] field3711;
   public int[] field3733;
   public int[] field3738;
   public int[] field3752;
   public int[][] field3727;
   public Object[] field3597;
   public Object[] field3601;
   public Object[] field3611;
   public Object[] field3618;
   public Object[] field3623;
   public Object[] field3635;
   public Object[] field3660;
   public Object[] field3668;
   public Object[] field3685;
   public Object[] field3687;
   public Object[] field3693;
   public Object[] field3695;
   public Object[] field3697;
   public Object[] field3698;
   public Object[] field3699;
   public Object[] field3701;
   public Object[] field3702;
   public Object[] field3703;
   public Object[] field3705;
   public Object[] field3706;
   public Object[] field3710;
   public Object[] field3713;
   public Object[] field3715;
   public Object[] field3716;
   public Object[] field3717;
   public Object[] field3720;
   public Object[] field3722;
   public Object[] field3723;
   public Object[] field3724;
   public Object[] field3725;
   public Object[] field3726;
   public Object[] field3729;
   public Object[] field3730;
   public Object[] field3751;
   public String field3621;
   public String field3643;
   public String field3670;
   public String field3686;
   public String field3692;
   public String field3735;
   public String field3736;
   public String[] field3647;

   static {
      field3748 = new class428(10, class437.field4668);
      field3653 = new class428(10, class437.field4668);
      field3737 = false;
   }

   public Component() {
      this.field3636 = class522.field5138;
      this.field3637 = 0;
      this.field3638 = 0;
      this.field3639 = 1;
      this.field3708 = false;
      this.field3641 = -1;
      this.field3642 = -1;
      this.field3644 = 0;
      this.field3645 = false;
      this.field3696 = 0;
      this.field3709 = 0;
      this.field3650 = 1;
      this.field3603 = -1;
      this.field3652 = 1;
      this.field3734 = -1;
      this.field3654 = -1;
      this.field3728 = -1;
      this.field3656 = 0;
      this.field3657 = 0;
      this.field3646 = 0;
      this.field3659 = 0;
      this.field3750 = 0;
      this.field3661 = 100;
      this.field3662 = 0;
      this.field3663 = 0;
      this.field3665 = false;
      this.field3666 = false;
      this.field3667 = 2;
      this.field3590 = -1;
      this.field3621 = "";
      this.field3670 = "";
      this.field3671 = 0;
      this.field3672 = 0;
      this.field3673 = 0;
      this.field3688 = false;
      this.field3676 = -1;
      this.field3680 = 0;
      this.field3681 = false;
      this.field3686 = "";
      this.field3714 = null;
      this.field3651 = 0;
      this.field3690 = 0;
      this.field3691 = false;
      this.field3692 = "";
      this.field3747 = false;
      this.field3589 = -1;
      this.field3735 = "";
      this.field3736 = class364.field4239;
      this.field3739 = -1;
      this.field3630 = 0;
      this.field3741 = 0;
      this.field3742 = 0;
      this.field3744 = false;
      this.field3745 = false;
      this.field3746 = -1;
      this.field3731 = 0;
      this.field3658 = 0;
      this.field3749 = 0;
      this.field3609 = -1;
      this.field3669 = -1;
      this.field3753 = false;
      this.field3754 = false;
      this.field3755 = false;
   }

   public static Component getComponent(int var0) {
      int var2 = var0 >> 16;
      int var3 = var0 & '\uffff';
      if (null == class96.interfaces[var2] || class96.interfaces[var2][var3] == null) {
         boolean var4 = method1200(var2);
         if (!var4) {
            return null;
         }
      }

      return class96.interfaces[var2][var3];
   }

   public static Component method1772(int var0, int var1) {
      Component var3 = getComponent(var0);
      if (var1 == -1) {
         return var3;
      } else {
         return var3 != null && var3.field3743 != null && var1 < var3.field3743.length ? var3.field3743[var1] : null;
      }
   }

   public static boolean method1200(int var0) {
      if (field3674[var0]) {
         return true;
      } else if (!class96.field885.method6432(var0)) {
         return false;
      } else {
         int var2 = class96.field885.method6393(var0);
         if (var2 == 0) {
            field3674[var0] = true;
            return true;
         } else {
            if (null == class96.interfaces[var0]) {
               class96.interfaces[var0] = new Component[var2];
            }

            for(int var3 = 0; var3 < var2; ++var3) {
               if (class96.interfaces[var0][var3] == null) {
                  byte[] var4 = class96.field885.method6381(var0, var3);
                  if (var4 != null) {
                     class96.interfaces[var0][var3] = new Component();
                     class96.interfaces[var0][var3].field3606 = (var0 << 16) + var3;
                     if (var4[0] == -1) {
                        class96.interfaces[var0][var3].method6212(new Buffer(var4));
                     } else {
                        class96.interfaces[var0][var3].method6285(new Buffer(var4));
                     }
                  }
               }
            }

            field3674[var0] = true;
            return true;
         }
      }
   }

   public static void method1540() {
      field3617.method5637();
      field3599.method5637();
      field3600.method5637();
      field3684.method5637();
   }

   static Component method4680(int var0, Component var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
      Component var9 = new Component();
      var9.field3608 = var0;
      var9.field3625 = var1.field3606;
      var9.field3607 = var2;
      var9.field3605 = true;
      var9.field3700 = var3;
      var9.field3612 = var4;
      var9.field3592 = var5;
      var9.field3614 = var6;
      var9.field3615 = (int)((float)var1.field3598 * var7[0]);
      var9.field3616 = (int)((float)var1.field3622 * var7[1]);
      var9.field3732 = (int)(var7[2] * (float)var1.field3598);
      var9.field3740 = (int)(var7[3] * (float)var1.field3622);
      return var9;
   }

   public static void method3413(Component var0, int var1, int var2) {
      class314 var4 = var0.field3664;
      boolean var5 = var2 != var4.field3486;
      var4.field3486 = var2;
      if (var5) {
         int var6;
         int var7;
         if (var4.field3486 == var1) {
            for(var6 = 0; var6 < class314.field3482.length; ++var6) {
               var7 = class314.field3482[var6];
               if (var4.field3483[var7] > 0 && var4.field3483[var7] < 512) {
                  var4.field3483[var7] = var4.field3489[var7];
               }
            }
         } else {
            label78: {
               if (var4.field3483[0] >= 512) {
                  boolean var11;
                  if (var4.field3483[0] < 512) {
                     var11 = false;
                  } else {
                     class185 var12 = class185.method2355(var4.field3483[0] - 512);
                     var11 = var12.field1978 != class227.field2501.field2496 && class227.field2501.field2496 != var12.field1979;
                  }

                  if (!var11) {
                     break label78;
                  }
               }

               var4.field3483[class227.field2501.field2496] = 1;
            }

            for(var6 = 0; var6 < 7; ++var6) {
               var7 = class314.field3482[var6];
               if (var4.field3483[var7] > 0 && var4.field3483[var7] < 512) {
                  int[] var8 = var4.field3483;

                  for(int var9 = 0; var9 < class206.field2222; ++var9) {
                     class206 var10 = class206.method2493(var9);
                     if (var10 != null && !var10.field2234 && (var2 == 1 ? 7 : 0) + var6 == var10.field2224) {
                        var8[class314.field3482[var6]] = var9 + 256;
                        break;
                     }
                  }
               }
            }
         }
      }

      var4.method5804();
   }

   public static void method5687(Component var0, int var1, int var2) {
      var0.field3664.field3484[var1] = var2;
      var0.field3664.method5804();
   }

   public static void method2415(Component var0, int var1) {
      class185 var3 = class185.method2355(var1);
      var0.field3664.field3483[var3.field2009] = var1 + 512;
      if (var3.field1978 != -1) {
         var0.field3664.field3483[var3.field1978] = 0;
      }

      if (-1 != var3.field1979) {
         var0.field3664.field3483[var3.field1979] = 0;
      }

      var0.field3664.method5804();
   }

   public static void method4653(Component var0, class314 var1, boolean var2) {
      var0.field3650 = 7;
      var0.field3664 = new class314(var1);
      if (!var2) {
         var0.field3664.field3483 = Arrays.copyOf(var0.field3664.field3489, var0.field3664.field3489.length);
         var0.field3664.method5804();
      }

   }

   void method6285(Buffer var1) {
      this.field3605 = false;
      this.field3608 = var1.readUnsignedByte();
      this.field3689 = var1.readUnsignedByte();
      this.field3631 = var1.readUnsignedShort();
      this.field3615 = var1.readShort();
      this.field3616 = var1.readShort();
      this.field3732 = var1.readUnsignedShort();
      this.field3740 = var1.readUnsignedShort();
      this.field3637 = var1.readUnsignedByte();
      this.field3625 = var1.readUnsignedShort();
      if (65535 == this.field3625) {
         this.field3625 = -1;
      } else {
         this.field3625 += this.field3606 & -65536;
      }

      this.field3589 = var1.readUnsignedShort();
      if (this.field3589 == 65535) {
         this.field3589 = -1;
      }

      int var3 = var1.readUnsignedByte();
      int var4;
      if (var3 > 0) {
         this.field3733 = new int[var3];
         this.field3604 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field3733[var4] = var1.readUnsignedByte();
            this.field3604[var4] = var1.readUnsignedShort();
         }
      }

      var4 = var1.readUnsignedByte();
      int var5;
      if (var4 > 0) {
         this.field3727 = new int[var4][];

         for(var5 = 0; var5 < var4; ++var5) {
            int var6 = var1.readUnsignedShort();
            this.field3727[var5] = new int[var6];

            for(int var7 = 0; var7 < var6; ++var7) {
               this.field3727[var5][var7] = var1.readUnsignedShort();
               if (65535 == this.field3727[var5][var7]) {
                  this.field3727[var5][var7] = -1;
               }
            }
         }
      }

      if (this.field3608 == 0) {
         this.field3719 = var1.readUnsignedShort();
         this.field3626 = var1.readUnsignedByte() == 1;
      }

      if (1 == this.field3608) {
         var1.readUnsignedShort();
         var1.readUnsignedByte();
      }

      if (3 == this.field3608) {
         this.field3721 = var1.readUnsignedByte() == 1;
      }

      if (4 == this.field3608 || 1 == this.field3608) {
         this.field3672 = var1.readUnsignedByte();
         this.field3673 = var1.readUnsignedByte();
         this.field3671 = var1.readUnsignedByte();
         this.field3590 = var1.readUnsignedShort();
         if (65535 == this.field3590) {
            this.field3590 = -1;
         }

         this.field3688 = var1.readUnsignedByte() == 1;
      }

      if (4 == this.field3608) {
         this.field3621 = var1.readString();
         this.field3670 = var1.readString();
      }

      if (this.field3608 == 1 || 3 == this.field3608 || this.field3608 == 4) {
         this.field3718 = var1.readInt();
      }

      if (this.field3608 == 3 || 4 == this.field3608) {
         this.field3632 = var1.readInt();
         this.field3633 = var1.readInt();
         this.field3634 = var1.readInt();
      }

      if (this.field3608 == 5) {
         this.field3641 = var1.readInt();
         this.field3642 = var1.readInt();
      }

      if (6 == this.field3608) {
         this.field3650 = 1;
         this.field3603 = var1.readUnsignedShort();
         if (65535 == this.field3603) {
            this.field3603 = -1;
         }

         this.field3652 = 1;
         this.field3734 = var1.readUnsignedShort();
         if (65535 == this.field3734) {
            this.field3734 = -1;
         }

         this.field3654 = var1.readUnsignedShort();
         if (65535 == this.field3654) {
            this.field3654 = -1;
         }

         this.field3728 = var1.readUnsignedShort();
         if (65535 == this.field3728) {
            this.field3728 = -1;
         }

         this.field3661 = var1.readUnsignedShort();
         this.field3646 = var1.readUnsignedShort();
         this.field3659 = var1.readUnsignedShort();
      }

      if (this.field3608 == 8) {
         this.field3621 = var1.readString();
      }

      if (this.field3689 == 2) {
         this.field3692 = var1.readString();
         this.field3735 = var1.readString();
         var5 = var1.readUnsignedShort() & 63;
         this.field3680 |= var5 << 11;
      }

      if (1 == this.field3689 || this.field3689 == 4 || this.field3689 == 5 || this.field3689 == 6) {
         this.field3736 = var1.readString();
         if (this.field3736.length() == 0) {
            if (1 == this.field3689) {
               this.field3736 = class364.field4239;
            }

            if (4 == this.field3689) {
               this.field3736 = class364.field4229;
            }

            if (this.field3689 == 5) {
               this.field3736 = class364.field4229;
            }

            if (this.field3689 == 6) {
               this.field3736 = class364.field4227;
            }
         }
      }

      if (this.field3689 == 1 || 4 == this.field3689 || 5 == this.field3689) {
         this.field3680 |= 4194304;
      }

      if (this.field3689 == 6) {
         this.field3680 |= 1;
      }

   }

   void method6212(Buffer var1) {
      var1.readUnsignedByte();
      this.field3605 = true;
      this.field3608 = var1.readUnsignedByte();
      this.field3631 = var1.readUnsignedShort();
      this.field3615 = var1.readShort();
      this.field3616 = var1.readShort();
      this.field3732 = var1.readUnsignedShort();
      if (9 == this.field3608) {
         this.field3740 = var1.readShort();
      } else {
         this.field3740 = var1.readUnsignedShort();
      }

      this.field3592 = var1.readByte();
      this.field3614 = var1.readByte();
      this.field3700 = var1.readByte();
      this.field3612 = var1.readByte();
      this.field3625 = var1.readUnsignedShort();
      if (65535 == this.field3625) {
         this.field3625 = -1;
      } else {
         this.field3625 += this.field3606 & -65536;
      }

      this.field3626 = var1.readUnsignedByte() == 1;
      if (this.field3608 == 0) {
         this.field3629 = var1.readUnsignedShort();
         this.field3719 = var1.readUnsignedShort();
         this.field3753 = var1.readUnsignedByte() == 1;
      }

      if (5 == this.field3608) {
         this.field3641 = var1.readInt();
         this.field3644 = var1.readUnsignedShort();
         this.field3645 = var1.readUnsignedByte() == 1;
         this.field3637 = var1.readUnsignedByte();
         this.field3696 = var1.readUnsignedByte();
         this.field3709 = var1.readInt();
         this.field3648 = var1.readUnsignedByte() == 1;
         this.field3649 = var1.readUnsignedByte() == 1;
      }

      if (6 == this.field3608) {
         this.field3650 = 1;
         this.field3603 = var1.readUnsignedShort();
         if (this.field3603 == 65535) {
            this.field3603 = -1;
         }

         this.field3656 = var1.readShort();
         this.field3657 = var1.readShort();
         this.field3646 = var1.readUnsignedShort();
         this.field3659 = var1.readUnsignedShort();
         this.field3750 = var1.readUnsignedShort();
         this.field3661 = var1.readUnsignedShort();
         this.field3654 = var1.readUnsignedShort();
         if (65535 == this.field3654) {
            this.field3654 = -1;
         }

         this.field3665 = var1.readUnsignedByte() == 1;
         var1.readUnsignedShort();
         if (0 != this.field3592) {
            this.field3662 = var1.readUnsignedShort();
         }

         if (this.field3614 != 0) {
            var1.readUnsignedShort();
         }
      }

      if (this.field3608 == 4) {
         this.field3590 = var1.readUnsignedShort();
         if (65535 == this.field3590) {
            this.field3590 = -1;
         }

         this.field3621 = var1.readString();
         this.field3671 = var1.readUnsignedByte();
         this.field3672 = var1.readUnsignedByte();
         this.field3673 = var1.readUnsignedByte();
         this.field3688 = var1.readUnsignedByte() == 1;
         this.field3718 = var1.readInt();
      }

      if (3 == this.field3608) {
         this.field3718 = var1.readInt();
         this.field3721 = var1.readUnsignedByte() == 1;
         this.field3637 = var1.readUnsignedByte();
      }

      if (9 == this.field3608) {
         this.field3639 = var1.readUnsignedByte();
         this.field3718 = var1.readInt();
         this.field3708 = var1.readUnsignedByte() == 1;
      }

      this.field3680 = var1.readUnsignedMedium();
      this.field3686 = var1.readString();
      int var3 = var1.readUnsignedByte();
      if (var3 > 0) {
         this.field3647 = new String[var3];

         for(int var4 = 0; var4 < var3; ++var4) {
            this.field3647[var4] = var1.readString();
         }
      }

      this.field3651 = var1.readUnsignedByte();
      this.field3690 = var1.readUnsignedByte();
      this.field3691 = var1.readUnsignedByte() == 1;
      this.field3692 = var1.readString();
      this.field3705 = this.method6213(var1);
      this.field3699 = this.method6213(var1);
      this.field3701 = this.method6213(var1);
      this.field3706 = this.method6213(var1);
      this.field3716 = this.method6213(var1);
      this.field3668 = this.method6213(var1);
      this.field3685 = this.method6213(var1);
      this.field3710 = this.method6213(var1);
      this.field3687 = this.method6213(var1);
      this.field3713 = this.method6213(var1);
      this.field3660 = this.method6213(var1);
      this.field3695 = this.method6213(var1);
      this.field3693 = this.method6213(var1);
      this.field3697 = this.method6213(var1);
      this.field3698 = this.method6213(var1);
      this.field3702 = this.method6213(var1);
      this.field3703 = this.method6213(var1);
      this.field3715 = this.method6213(var1);
      this.field3707 = this.method6214(var1);
      this.field3704 = this.method6214(var1);
      this.field3711 = this.method6214(var1);
   }

   Object[] method6213(Buffer var1) {
      int var3 = var1.readUnsignedByte();
      if (var3 == 0) {
         return null;
      } else {
         Object[] var4 = new Object[var3];

         for(int var5 = 0; var5 < var3; ++var5) {
            int var6 = var1.readUnsignedByte();
            if (var6 == 0) {
               var4[var5] = new Integer(var1.readInt());
            } else if (var6 == 1) {
               var4[var5] = var1.readString();
            }
         }

         this.field3747 = true;
         return var4;
      }
   }

   int[] method6214(Buffer var1) {
      int var3 = var1.readUnsignedByte();
      if (var3 == 0) {
         return null;
      } else {
         int[] var4 = new int[var3];

         for(int var5 = 0; var5 < var3; ++var5) {
            var4[var5] = var1.readInt();
         }

         return var4;
      }
   }

   public class523 method6215(boolean var1, class114 var2) {
      field3737 = false;
      if (null != this.field3643) {
         class523 var4 = this.method6313(var2);
         if (null != var4) {
            return var4;
         }
      }

      int var8;
      if (var1) {
         var8 = this.field3642;
      } else {
         var8 = this.field3641;
      }

      if (var8 == -1) {
         return null;
      } else {
         long var5 = ((long)this.field3709 << 40) + ((this.field3648 ? 1L : 0L) << 38) + ((long)this.field3696 << 36) + (long)var8 + ((this.field3649 ? 1L : 0L) << 39);
         class523 var7 = (class523)field3617.method5643(var5);
         if (null != var7) {
            return var7;
         } else {
            var7 = class485.method8408(class108.field1061, var8, 0);
            if (var7 == null) {
               field3737 = true;
               return null;
            } else {
               this.method6219(var7);
               field3617.method5640(var7, var5);
               return var7;
            }
         }
      }
   }

   class523 method6313(class114 var1) {
      if (!this.method6231()) {
         return this.method6217(var1);
      } else {
         String var3 = this.field3643 + (this.field3648 ? 1 : 0) + (this.field3649 ? 1 : 0) + this.field3696 + this.field3709;
         class523 var4 = (class523)field3653.method7645(var3);
         if (null == var4) {
            class523 var5 = this.method6217(var1);
            if (null != var5) {
               var4 = var5.method9025();
               this.method6219(var4);
               field3653.method7646(var3, var4);
            }
         }

         return var4;
      }
   }

   class523 method6217(class114 var1) {
      if (null != this.field3643 && null != var1) {
         class315 var3 = (class315)field3748.method7645(this.field3643);
         if (null == var3) {
            var3 = new class315(this.field3643, var1);
            field3748.method7646(this.field3643, var3);
         }

         return var3.method5835();
      } else {
         return null;
      }
   }

   boolean method6231() {
      return this.field3648 || this.field3649 || 0 != this.field3696 || this.field3709 != 0;
   }

   void method6219(class523 var1) {
      if (this.field3648) {
         var1.method9031();
      }

      if (this.field3649) {
         var1.method9103();
      }

      if (this.field3696 > 0) {
         var1.method9029(this.field3696);
      }

      if (this.field3696 >= 1) {
         var1.method9032(1);
      }

      if (this.field3696 >= 2) {
         var1.method9032(16777215);
      }

      if (0 != this.field3709) {
         var1.method9033(this.field3709);
      }

   }

   public class393 method6220() {
      field3737 = false;
      if (-1 == this.field3590) {
         return null;
      } else {
         class393 var2 = (class393)field3600.method5643((long)this.field3590);
         if (null != var2) {
            return var2;
         } else {
            var2 = class538.method7037(class108.field1061, class254.field2871, this.field3590, 0);
            if (var2 != null) {
               field3600.method5640(var2, (long)this.field3590);
            } else {
               field3737 = true;
            }

            return var2;
         }
      }
   }

   public class249 method6221(class215 var1, int var2, boolean var3, class314 var4, class191 var5, class201 var6) {
      field3737 = false;
      int var8;
      int var9;
      if (var3) {
         var8 = this.field3652;
         var9 = this.field3734;
      } else {
         var8 = this.field3650;
         var9 = this.field3603;
      }

      if (var8 == 6) {
         if (null == var5) {
            return null;
         }

         var9 = var5.field2047;
      }

      if (var8 == 0) {
         return null;
      } else if (var8 == 1 && var9 == -1) {
         return null;
      } else {
         if (null != var6 && var6.field2188 && var8 == 6) {
            var8 = 3;
         }

         long var10 = (long)((var8 << 16) + var9);
         if (null != var6) {
            var10 |= var6.field2184 << 20;
         }

         class249 var12 = (class249)field3599.method5643(var10);
         if (null == var12) {
            class213 var13 = null;
            int var14 = 64;
            int var15 = 768;
            switch (var8) {
               case 1:
                  var13 = class213.method3952(class239.field2657, var9, 0);
                  break;
               case 2:
                  var13 = class191.method4208(var9).method3619((class201)null);
                  break;
               case 3:
                  var13 = null != var4 ? var4.method5802() : null;
                  break;
               case 4:
                  class185 var16 = class185.method2355(var9);
                  var13 = var16.method3500(10);
                  var14 += var16.field2003;
                  var15 += var16.field2007;
               case 5:
               default:
                  break;
               case 6:
                  var13 = class191.method4208(var9).method3619(var6);
            }

            if (null == var13) {
               field3737 = true;
               return null;
            }

            var12 = var13.method3976(var14, var15, -50, -10, -50);
            field3599.method5640(var12, var10);
         }

         if (null != var1) {
            var12 = var1.method4057(var12, var2);
         }

         return var12;
      }
   }

   public class321 method6222(boolean var1) {
      if (this.field3642 == -1) {
         var1 = false;
      }

      int var3 = var1 ? this.field3642 : this.field3641;
      if (var3 == -1) {
         return null;
      } else {
         long var4 = ((long)this.field3709 << 40) + (long)var3 + ((long)this.field3696 << 36) + ((this.field3648 ? 1L : 0L) << 38) + ((this.field3649 ? 1L : 0L) << 39);
         class321 var6 = (class321)field3684.method5643(var4);
         if (null != var6) {
            return var6;
         } else {
            class523 var7 = this.method6215(var1, (class114)null);
            if (var7 == null) {
               return null;
            } else {
               class523 var8 = var7.method9026();
               int[] var9 = new int[var8.field5153];
               int[] var10 = new int[var8.field5153];

               for(int var11 = 0; var11 < var8.field5153; ++var11) {
                  int var12 = 0;
                  int var13 = var8.field5148;

                  int var14;
                  for(var14 = 0; var14 < var8.field5148; ++var14) {
                     if (0 == var8.field5147[var11 * var8.field5148 + var14]) {
                        var12 = var14;
                        break;
                     }
                  }

                  for(var14 = var8.field5148 - 1; var14 >= var12; --var14) {
                     if (var8.field5147[var14 + var11 * var8.field5148] == 0) {
                        var13 = var14 + 1;
                        break;
                     }
                  }

                  var9[var11] = var12;
                  var10[var11] = var13 - var12;
               }

               var6 = new class321(var8.field5148, var8.field5153, var10, var9, var3);
               field3684.method5640(var6, var4);
               return var6;
            }
         }
      }
   }

   public void method6223(int var1, String var2) {
      if (null == this.field3647 || this.field3647.length <= var1) {
         String[] var4 = new String[var1 + 1];
         if (null != this.field3647) {
            for(int var5 = 0; var5 < this.field3647.length; ++var5) {
               var4[var5] = this.field3647[var5];
            }
         }

         this.field3647 = var4;
      }

      this.field3647[var1] = var2;
   }

   public boolean method6278() {
      return !this.field3605 || this.field3608 == 0 || this.field3608 == 11 || this.field3747 || this.field3631 == 1338 || 12 == this.field3608;
   }

   public boolean method6225() {
      return 11 == this.field3608 || this.field3608 == 12;
   }

   public void method6291(String var1, class114 var2, long var3) {
      if (11 == this.field3608 && var3 != -1L) {
         var1 = var1.replaceAll("%userid%", Long.toString(var3));
         this.field3675 = new class173();
         if (!this.field3675.method3311(var1, var2)) {
            this.field3675 = null;
         } else {
            if (this.field3677 == null || this.field3678 == null) {
               this.method6216();
            }

         }
      }
   }

   public void method6227(String var1, class114 var2) {
      if (11 == this.field3608 && var1 != null) {
         this.field3675 = new class173();
         this.field3675.method3329(var1, var2);
      }
   }

   void method6216() {
      this.field3677 = new HashMap();
      this.field3678 = new HashMap();
   }

   public void method6229(int var1, int var2) {
      if (11 == this.field3608) {
         if (this.field3677 == null) {
            this.method6216();
         }

         this.field3677.put(var1, var2);
      }
   }

   public void method6230(String var1, int var2) {
      if (11 == this.field3608) {
         if (null == this.field3678) {
            this.method6216();
         }

         this.field3678.put(var1, var2);
      }
   }

   public boolean method6261(int var1, int var2, int var3, int var4) {
      if (11 == this.field3608 && null != this.field3675 && this.method6232()) {
         var1 -= var3;
         var2 -= var4;
         int var6 = (int)(this.field3675.method3319()[0] * (float)this.field3598);
         int var7 = (int)(this.field3675.method3319()[1] * (float)this.field3622);
         int var8 = var6 + (int)(this.field3675.method3319()[2] * (float)this.field3598);
         int var9 = var7 + (int)(this.field3675.method3319()[3] * (float)this.field3622);
         return var1 >= var6 && var2 >= var7 && var1 < var8 && var2 < var9;
      } else {
         return false;
      }
   }

   public boolean method6232() {
      return 2 == this.field3676;
   }

   public int method6233(String var1) {
      return 11 == this.field3608 && this.field3675 != null && this.method6232() ? this.field3675.method3314(var1) : -1;
   }

   public String method6234(String var1) {
      return this.field3608 == 11 && this.field3675 != null && this.method6232() ? this.field3675.method3315(var1) : null;
   }

   public int method6235() {
      return this.field3678 != null && this.field3678.size() > 0 ? 1 : 0;
   }

   public int method6210() {
      if (this.field3608 == 11 && null != this.field3675 && null != this.field3678 && !this.field3678.isEmpty()) {
         String var2 = this.field3675.method3359();
         return null != var2 && this.field3678.containsKey(this.field3675.method3359()) ? (Integer)this.field3678.get(var2) : -1;
      } else {
         return -1;
      }
   }

   public String method6237() {
      if (this.field3608 == 11 && this.field3675 != null) {
         String var2 = this.field3675.method3359();
         Iterator var3 = this.field3675.method3367().iterator();

         while(var3.hasNext()) {
            class179 var4 = (class179)var3.next();
            String var5 = String.format("%%%S%%", var4.method3421());
            if (var4.method3416() == 0) {
               var2.replaceAll(var5, Integer.toString(var4.method3418()));
            } else {
               var2.replaceAll(var5, var4.method3417());
            }
         }

         return var2;
      } else {
         return null;
      }
   }

   public int[] method6334() {
      if (11 == this.field3608 && null != this.field3675) {
         int[] var2 = new int[3];
         int var3 = 0;
         Iterator var4 = this.field3675.method3367().iterator();

         while(var4.hasNext()) {
            class179 var5 = (class179)var4.next();
            if (!var5.method3421().equals("user_id")) {
               if (var5.method3416() != 0) {
                  return null;
               }

               var2[var3++] = var5.method3418();
               if (var3 > 3) {
                  return null;
               }
            }
         }

         return var2;
      } else {
         return null;
      }
   }

   public boolean method6239(class114 var1) {
      if (this.field3608 == 11 && this.field3675 != null) {
         this.field3675.method3352(var1);
         if (this.field3675.method3318() != this.field3676) {
            this.field3676 = this.field3675.method3318();
            if (this.field3676 >= 100) {
               return true;
            }

            if (this.field3676 == 2) {
               this.method6240();
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   void method6240() {
      this.field3753 = true;
      ArrayList var2 = this.field3675.method3316();
      ArrayList var3 = this.field3675.method3317();
      int var4 = var2.size() + var3.size();
      this.field3743 = new Component[var4];
      int var5 = 0;

      Iterator var6;
      Component var8;
      for(var6 = var2.iterator(); var6.hasNext(); this.field3743[var5++] = var8) {
         class182 var7 = (class182)var6.next();
         var8 = method4680(5, this, var5, 0, 0, 0, 0, var7.field1882);
         var8.field3643 = var7.field1886.method2198();
         class315 var9 = new class315(var7.field1886);
         field3748.method7646(var8.field3643, var9);
      }

      for(var6 = var3.iterator(); var6.hasNext(); this.field3743[var5++] = var8) {
         class165 var10 = (class165)var6.next();
         var8 = method4680(4, this, var5, 0, 0, 0, 0, var10.field1783);
         var8.field3621 = var10.field1786;
         var8.field3590 = (Integer)this.field3677.get(var10.field1780);
         var8.field3672 = var10.field1784;
         var8.field3673 = var10.field1785;
      }

   }

   public void method6228() {
      this.field3679 = new class338();

      for(int var2 = 1; var2 <= 12; ++var2) {
         this.field3679.field3785.method393(var2, 0);
      }

      for(char var3 = 0; var3 < ' '; ++var3) {
         this.field3679.field3785.method394(var3, 0);
      }

      this.field3679.field3785.method394('\u0080', 0);
      this.field3679.field3785.method393(82, 2);
      this.field3679.field3785.method393(81, 2);
      this.field3679.field3785.method393(86, 2);
   }

   public class327 method6277() {
      return this.field3679 != null ? this.field3679.field3786 : null;
   }

   public class337 method6242() {
      return null != this.field3679 ? this.field3679.field3789 : null;
   }

   public class28 method6236() {
      return this.field3679 != null ? this.field3679.field3785 : null;
   }

   public class338 method6244() {
      return this.field3679;
   }

   boolean method6245(class327 var1) {
      boolean var3 = false;
      if (null != this.field3621 && !this.field3621.isEmpty()) {
         var3 |= var1.method6038(class380.method347(this.field3621));
         this.field3621 = "";
      }

      if (null != this.field3670 && !this.field3670.isEmpty()) {
         var3 |= var1.method5905(class380.method347(this.field3670));
         this.field3670 = "";
      }

      return var3;
   }

   public boolean method6246() {
      class327 var2 = this.method6277();
      if (var2 == null) {
         return false;
      } else {
         boolean var3 = false;
         if (!var2.method5958() && -1 != this.field3590) {
            int var4 = var2.method6058();
            int var5 = var2.method5960();
            int var6 = var2.method5957();
            int var7 = var2.method5956();
            class393 var8 = this.method6220();
            if (var8 != null) {
               var3 |= var2.method5986(var8);
               var3 |= this.method6245(var2);
               var3 |= var2.method5950(var4, var5);
               var3 |= var2.method5926(var6, var7);
            }
         } else if (var2.method5958()) {
            var3 |= this.method6245(var2);
         }

         var2.method5904();
         return var3;
      }
   }
}
