public class class91 {
   static final class91 field836 = new class91();
   static final class91 field837 = new class91();
   static final class91 field838 = new class91();
   static final class91 field839 = new class91();
   static final class91 field840 = new class91();
   static final class91 field841 = new class91();
   static final class91 field842 = new class91();
   static final class91 field843 = new class91();
   static final class91 field844 = new class91();
   static final class91 field845 = new class91();
   static final class91 field846 = new class91();
   static final class91 field847 = new class91();
   static final class91 field848 = new class91();
   static final class91 field849 = new class91();
   static final class91 field850 = new class91();
   static final class91 field851 = new class91();

   class91() {
   }

   static int method1970(int var0, class81 var1, boolean var2) {
      if (var0 == 3600) {
         if (class165.field1782.field403 == 0) {
            class63.field483[++class63.field479 - 1] = -2;
         } else if (class165.field1782.field403 == 1) {
            class63.field483[++class63.field479 - 1] = -1;
         } else {
            class63.field483[++class63.field479 - 1] = class165.field1782.field401.method7770();
         }

         return 1;
      } else {
         int var4;
         if (var0 == 3601) {
            var4 = class63.field483[--class63.field479];
            if (class165.field1782.method1130() && var4 >= 0 && var4 < class165.field1782.field401.method7770()) {
               class425 var9 = (class425)class165.field1782.field401.method7728(var4);
               class63.field484[++class63.field486 - 1] = var9.method7558();
               class63.field484[++class63.field486 - 1] = var9.method7547();
            } else {
               class63.field484[++class63.field486 - 1] = "";
               class63.field484[++class63.field486 - 1] = "";
            }

            return 1;
         } else if (var0 == 3602) {
            var4 = class63.field483[--class63.field479];
            if (class165.field1782.method1130() && var4 >= 0 && var4 < class165.field1782.field401.method7770()) {
               class63.field483[++class63.field479 - 1] = ((class417)class165.field1782.field401.method7728(var4)).field4575;
            } else {
               class63.field483[++class63.field479 - 1] = 0;
            }

            return 1;
         } else if (var0 == 3603) {
            var4 = class63.field483[--class63.field479];
            if (class165.field1782.method1130() && var4 >= 0 && var4 < class165.field1782.field401.method7770()) {
               class63.field483[++class63.field479 - 1] = ((class417)class165.field1782.field401.method7728(var4)).field4577;
            } else {
               class63.field483[++class63.field479 - 1] = 0;
            }

            return 1;
         } else {
            String var10;
            if (var0 == 3604) {
               var10 = class63.field484[--class63.field486];
               int var8 = class63.field483[--class63.field479];
               class56.method4752(var10, var8);
               return 1;
            } else if (var0 == 3605) {
               var10 = class63.field484[--class63.field486];
               class165.field1782.method1097(var10);
               return 1;
            } else if (var0 == 3606) {
               var10 = class63.field484[--class63.field486];
               class165.field1782.method1101(var10);
               return 1;
            } else if (var0 == 3607) {
               var10 = class63.field484[--class63.field486];
               class165.field1782.method1147(var10);
               return 1;
            } else if (var0 == 3608) {
               var10 = class63.field484[--class63.field486];
               boolean var7 = true;
               class165.field1782.method1093(var10, var7);
               return 1;
            } else if (var0 == 3609) {
               var10 = class63.field484[--class63.field486];
               var10 = Client.method7581(var10);
               class63.field483[++class63.field479 - 1] = class165.field1782.method1138(new class526(var10, class454.field4743), false) ? 1 : 0;
               return 1;
            } else if (var0 == 3611) {
               if (Js5Index.field42 != null) {
                  class63.field484[++class63.field486 - 1] = Js5Index.field42.field4616;
               } else {
                  class63.field484[++class63.field486 - 1] = "";
               }

               return 1;
            } else if (var0 == 3612) {
               if (Js5Index.field42 != null) {
                  class63.field483[++class63.field479 - 1] = Js5Index.field42.method7770();
               } else {
                  class63.field483[++class63.field479 - 1] = 0;
               }

               return 1;
            } else if (var0 == 3613) {
               var4 = class63.field483[--class63.field479];
               if (Js5Index.field42 != null && var4 < Js5Index.field42.method7770()) {
                  class63.field484[++class63.field486 - 1] = Js5Index.field42.method7728(var4).method7542().method9155();
               } else {
                  class63.field484[++class63.field486 - 1] = "";
               }

               return 1;
            } else if (var0 == 3614) {
               var4 = class63.field483[--class63.field479];
               if (Js5Index.field42 != null && var4 < Js5Index.field42.method7770()) {
                  class63.field483[++class63.field479 - 1] = ((class417) Js5Index.field42.method7728(var4)).method7472();
               } else {
                  class63.field483[++class63.field479 - 1] = 0;
               }

               return 1;
            } else if (var0 == 3615) {
               var4 = class63.field483[--class63.field479];
               if (Js5Index.field42 != null && var4 < Js5Index.field42.method7770()) {
                  class63.field483[++class63.field479 - 1] = ((class417) Js5Index.field42.method7728(var4)).field4577;
               } else {
                  class63.field483[++class63.field479 - 1] = 0;
               }

               return 1;
            } else if (var0 == 3616) {
               class63.field483[++class63.field479 - 1] = Js5Index.field42 != null ? Js5Index.field42.field4618 : 0;
               return 1;
            } else if (var0 == 3617) {
               var10 = class63.field484[--class63.field486];
               Client.method5752(var10);
               return 1;
            } else if (var0 == 3618) {
               class63.field483[++class63.field479 - 1] = null != Js5Index.field42 ? Js5Index.field42.field4620 : 0;
               return 1;
            } else if (var0 == 3619) {
               var10 = class63.field484[--class63.field486];
               Client.method2470(var10);
               return 1;
            } else if (var0 == 3620) {
               Client.method4204();
               return 1;
            } else if (var0 == 3621) {
               if (!class165.field1782.method1130()) {
                  class63.field483[++class63.field479 - 1] = -1;
               } else {
                  class63.field483[++class63.field479 - 1] = class165.field1782.field402.method7770();
               }

               return 1;
            } else if (var0 == 3622) {
               var4 = class63.field483[--class63.field479];
               if (class165.field1782.method1130() && var4 >= 0 && var4 < class165.field1782.field402.method7770()) {
                  class430 var5 = (class430)class165.field1782.field402.method7728(var4);
                  class63.field484[++class63.field486 - 1] = var5.method7558();
                  class63.field484[++class63.field486 - 1] = var5.method7547();
               } else {
                  class63.field484[++class63.field486 - 1] = "";
                  class63.field484[++class63.field486 - 1] = "";
               }

               return 1;
            } else if (var0 == 3623) {
               var10 = class63.field484[--class63.field486];
               var10 = Client.method7581(var10);
               class63.field483[++class63.field479 - 1] = class165.field1782.method1096(new class526(var10, class454.field4743)) ? 1 : 0;
               return 1;
            } else if (var0 == 3624) {
               var4 = class63.field483[--class63.field479];
               if (null != Js5Index.field42 && var4 < Js5Index.field42.method7770() && Js5Index.field42.method7728(var4).method7542().equals(class146.field1362.field740)) {
                  class63.field483[++class63.field479 - 1] = 1;
               } else {
                  class63.field483[++class63.field479 - 1] = 0;
               }

               return 1;
            } else if (var0 == 3625) {
               if (null != Js5Index.field42 && Js5Index.field42.field4614 != null) {
                  class63.field484[++class63.field486 - 1] = Js5Index.field42.field4614;
               } else {
                  class63.field484[++class63.field486 - 1] = "";
               }

               return 1;
            } else if (var0 == 3626) {
               var4 = class63.field483[--class63.field479];
               if (Js5Index.field42 != null && var4 < Js5Index.field42.method7770() && ((class423) Js5Index.field42.method7728(var4)).method7567()) {
                  class63.field483[++class63.field479 - 1] = 1;
               } else {
                  class63.field483[++class63.field479 - 1] = 0;
               }

               return 1;
            } else if (var0 != 3627) {
               if (var0 == 3628) {
                  class165.field1782.field401.method7786();
                  return 1;
               } else {
                  boolean var6;
                  if (var0 == 3629) {
                     var6 = class63.field483[--class63.field479] == 1;
                     class165.field1782.field401.method7739(new class520(var6));
                     return 1;
                  } else if (var0 == 3630) {
                     var6 = class63.field483[--class63.field479] == 1;
                     class165.field1782.field401.method7739(new class539(var6));
                     return 1;
                  } else if (var0 == 3631) {
                     var6 = class63.field483[--class63.field479] == 1;
                     class165.field1782.field401.method7739(new class111(var6));
                     return 1;
                  } else if (var0 == 3632) {
                     var6 = class63.field483[--class63.field479] == 1;
                     class165.field1782.field401.method7739(new class118(var6));
                     return 1;
                  } else if (var0 == 3633) {
                     var6 = class63.field483[--class63.field479] == 1;
                     class165.field1782.field401.method7739(new class109(var6));
                     return 1;
                  } else if (var0 == 3634) {
                     var6 = class63.field483[--class63.field479] == 1;
                     class165.field1782.field401.method7739(new class128(var6));
                     return 1;
                  } else if (var0 == 3635) {
                     var6 = class63.field483[--class63.field479] == 1;
                     class165.field1782.field401.method7739(new class121(var6));
                     return 1;
                  } else if (var0 == 3636) {
                     var6 = class63.field483[--class63.field479] == 1;
                     class165.field1782.field401.method7739(new class123(var6));
                     return 1;
                  } else if (var0 == 3637) {
                     var6 = class63.field483[--class63.field479] == 1;
                     class165.field1782.field401.method7739(new class129(var6));
                     return 1;
                  } else if (var0 == 3638) {
                     var6 = class63.field483[--class63.field479] == 1;
                     class165.field1782.field401.method7739(new class108(var6));
                     return 1;
                  } else if (var0 == 3639) {
                     class165.field1782.field401.method7729();
                     return 1;
                  } else if (var0 == 3640) {
                     class165.field1782.field402.method7786();
                     return 1;
                  } else if (var0 == 3641) {
                     var6 = class63.field483[--class63.field479] == 1;
                     class165.field1782.field402.method7739(new class520(var6));
                     return 1;
                  } else if (var0 == 3642) {
                     var6 = class63.field483[--class63.field479] == 1;
                     class165.field1782.field402.method7739(new class539(var6));
                     return 1;
                  } else if (var0 == 3643) {
                     class165.field1782.field402.method7729();
                     return 1;
                  } else if (var0 == 3644) {
                     if (Js5Index.field42 != null) {
                        Js5Index.field42.method7786();
                     }

                     return 1;
                  } else if (var0 == 3645) {
                     var6 = class63.field483[--class63.field479] == 1;
                     if (Js5Index.field42 != null) {
                        Js5Index.field42.method7739(new class520(var6));
                     }

                     return 1;
                  } else if (var0 == 3646) {
                     var6 = class63.field483[--class63.field479] == 1;
                     if (null != Js5Index.field42) {
                        Js5Index.field42.method7739(new class539(var6));
                     }

                     return 1;
                  } else if (var0 == 3647) {
                     var6 = class63.field483[--class63.field479] == 1;
                     if (Js5Index.field42 != null) {
                        Js5Index.field42.method7739(new class111(var6));
                     }

                     return 1;
                  } else if (var0 == 3648) {
                     var6 = class63.field483[--class63.field479] == 1;
                     if (Js5Index.field42 != null) {
                        Js5Index.field42.method7739(new class118(var6));
                     }

                     return 1;
                  } else if (var0 == 3649) {
                     var6 = class63.field483[--class63.field479] == 1;
                     if (null != Js5Index.field42) {
                        Js5Index.field42.method7739(new class109(var6));
                     }

                     return 1;
                  } else if (var0 == 3650) {
                     var6 = class63.field483[--class63.field479] == 1;
                     if (null != Js5Index.field42) {
                        Js5Index.field42.method7739(new class128(var6));
                     }

                     return 1;
                  } else if (var0 == 3651) {
                     var6 = class63.field483[--class63.field479] == 1;
                     if (Js5Index.field42 != null) {
                        Js5Index.field42.method7739(new class121(var6));
                     }

                     return 1;
                  } else if (var0 == 3652) {
                     var6 = class63.field483[--class63.field479] == 1;
                     if (null != Js5Index.field42) {
                        Js5Index.field42.method7739(new class123(var6));
                     }

                     return 1;
                  } else if (var0 == 3653) {
                     var6 = class63.field483[--class63.field479] == 1;
                     if (null != Js5Index.field42) {
                        Js5Index.field42.method7739(new class129(var6));
                     }

                     return 1;
                  } else if (var0 == 3654) {
                     var6 = class63.field483[--class63.field479] == 1;
                     if (Js5Index.field42 != null) {
                        Js5Index.field42.method7739(new class108(var6));
                     }

                     return 1;
                  } else if (var0 == 3655) {
                     if (Js5Index.field42 != null) {
                        Js5Index.field42.method7729();
                     }

                     return 1;
                  } else if (var0 == 3656) {
                     var6 = class63.field483[--class63.field479] == 1;
                     class165.field1782.field401.method7739(new class105(var6));
                     return 1;
                  } else if (var0 == 3657) {
                     var6 = class63.field483[--class63.field479] == 1;
                     if (null != Js5Index.field42) {
                        Js5Index.field42.method7739(new class105(var6));
                     }

                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var4 = class63.field483[--class63.field479];
               if (Js5Index.field42 != null && var4 < Js5Index.field42.method7770() && ((class423) Js5Index.field42.method7728(var4)).method7570()) {
                  class63.field483[++class63.field479 - 1] = 1;
               } else {
                  class63.field483[++class63.field479 - 1] = 0;
               }

               return 1;
            }
         }
      }
   }
}
