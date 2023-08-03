import java.util.Comparator;

final class class343 implements Comparator {
   public static int field3838;

   static void method6479(int var0) {
      int var2 = Login.field439;
      if (var0 == -3) {
         Login.method2098(class364.field4066, class364.field4067, class364.field4068);
      } else if (var0 == -2) {
         Login.method2098(class364.field4069, class364.field4125, class364.field4130);
      } else if (var0 == -1) {
         Login.method2098(class364.field4072, class364.field4073, class364.field4074);
      } else if (var0 == 3) {
         Login.method6370(3);
         Login.field438 = 1;
      } else if (var0 == 4) {
         Login.method6370(14);
         Login.field437 = 0;
      } else if (var0 == 5) {
         Login.field438 = 2;
         Login.method2098(class364.field4145, class364.field4079, class364.field4080);
      } else if (var0 == 68) {
         if (!Client.field1443) {
            Client.field1443 = true;
            Client.method1974();
            return;
         }

         Login.method2098(class364.field4081, class364.field4082, class364.field4169);
      } else if (!Client.field1440 && var0 == 6) {
         Login.method2098(class364.field4081, class364.field4082, class364.field4169);
      } else if (var0 == 7) {
         Login.method2098(class364.field4084, class364.field4071, class364.field4086);
      } else if (var0 == 8) {
         Login.method2098(class364.field4087, class364.field4088, class364.field4089);
      } else if (var0 == 9) {
         Login.method2098(class364.field4090, class364.field4091, class364.field4092);
      } else if (var0 == 10) {
         Login.method2098(class364.field4093, class364.field4115, class364.field4095);
      } else if (var0 == 11) {
         Login.method2098(class364.field4141, class364.field4097, class364.field4098);
      } else if (var0 == 12) {
         Login.method2098(class364.field4099, class364.field4100, class364.field4101);
      } else if (var0 == 13) {
         Login.method2098(class364.field4102, class364.field4324, class364.field4104);
      } else if (var0 == 14) {
         Login.method2098(class364.field4217, class364.field4193, class364.field4107);
      } else if (var0 == 16) {
         Login.method2098(class364.field4108, class364.field4327, class364.field4052);
         Login.method6370(33);
      } else if (var0 == 17) {
         Login.method2098(class364.field4192, class364.field4112, class364.field4113);
      } else if (var0 == 18) {
         Login.method6370(14);
         Login.field437 = 1;
      } else if (var0 == 19) {
         Login.method2098(class364.field4117, class364.field4042, class364.field4119);
      } else if (var0 == 20) {
         Login.method2098(class364.field4120, class364.field4234, class364.field4122);
      } else if (var0 == 22) {
         Login.method2098(class364.field4123, class364.field4124, class364.field4238);
      } else if (var0 == 23) {
         Login.method2098(class364.field4126, class364.field4127, class364.field4128);
      } else if (var0 == 24) {
         Login.method2098(class364.field4147, class364.field4228, class364.field4131);
      } else if (var0 == 25) {
         Login.method2098(class364.field4132, class364.field4133, class364.field4134);
      } else if (var0 == 26) {
         Login.method2098(class364.field4135, class364.field4136, class364.field4137);
      } else if (var0 == 27) {
         Login.method2098(class364.field4138, class364.field4139, class364.field4140);
      } else if (var0 == 31) {
         Login.method2098(class364.field4293, class364.field4148, class364.field4190);
      } else if (var0 == 32) {
         Login.method6370(14);
         Login.field437 = 2;
      } else if (var0 == 37) {
         Login.method2098(class364.field4250, class364.field4154, class364.field4155);
      } else if (var0 == 38) {
         Login.method2098(class364.field4156, class364.field4083, class364.field4158);
      } else if (var0 == 55) {
         Login.method6370(8);
      } else {
         if (var0 == 56) {
            Login.method2098(class364.field4163, class364.field4164, class364.field4171);
            Client.updateGameState(11);
            return;
         }

         if (var0 == 57) {
            Login.method2098(class364.field4326, class364.field4167, class364.field4168);
            Client.updateGameState(11);
            return;
         }

         if (var0 == 61) {
            Login.method2098("", "Please enter your date of birth (DD/MM/YYYY)", "");
            Login.method6370(7);
         } else {
            if (var0 == 62) {
               Client.updateGameState(10);
               Login.method6370(9);
               Login.method2098(class364.field4129, class364.field4170, class364.field4166);
               return;
            }

            if (var0 == 63) {
               Client.updateGameState(10);
               Login.method6370(9);
               Login.method2098(class364.field4172, class364.field4173, class364.field4174);
               return;
            }

            if (var0 == 65 || var0 == 67) {
               Client.updateGameState(10);
               Login.method6370(9);
               Login.method2098(class364.field4175, class364.field4111, class364.field4065);
               return;
            }

            if (var0 == 71) {
               Client.updateGameState(10);
               Login.method6370(7);
               Login.method2098("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
            } else if (var0 == 73) {
               Client.updateGameState(10);
               Login.method6370(6);
               Login.method2098(class364.field4307, class364.field4308, class364.field4248);
            } else if (var0 == 72) {
               Client.updateGameState(10);
               Login.method6370(32);
            } else {
               Login.method2098(class364.field4178, class364.field4035, class364.field4180);
            }
         }
      }

      Client.updateGameState(10);
      boolean var4 = var2 != Login.method2044();
      if (!var4 && Client.loginMethod.isOAuth()) {
         Login.method6370(9);
      }

   }

   int method6476(class376 var1, class376 var2) {
      return var1.field4366.field4339 < var2.field4366.field4339 ? -1 : (var1.field4366.field4339 == var2.field4366.field4339 ? 0 : 1);
   }

   public int compare(Object var1, Object var2) {
      return this.method6476((class376)var1, (class376)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
