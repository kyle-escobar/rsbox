import com.jagex.oldscape.pub.OAuthApi;
import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.OtlTokenResponse;
import com.jagex.oldscape.pub.RefreshAccessTokenRequester;
import com.jagex.oldscape.pub.RefreshAccessTokenResponse;
import java.awt.datatransfer.Clipboard;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import netscape.javascript.JSObject;
import org.json.JSONException;
import org.json.JSONObject;

public final class Client extends GameShell implements class438, OAuthApi, class326 {
   public static boolean field1435 = false;
   public static Component field1512;
   public static int field1432 = 1;
   public static int revision = 215;
   public static int field1540;
   public static int field1708;
   public static final class106 serverConnection;
   static boolean field1440 = false;
   static boolean field1443 = false;
   static boolean field1450 = true;
   static boolean isResizable;
   static boolean isUsernameRemembered;
   static boolean field1487;
   static boolean field1490;
   static boolean field1496;
   static boolean isDynamicRegion;
   static boolean field1516;
   static boolean field1529;
   static boolean field1547 = true;
   static boolean isLowDetail = false;
   static boolean field1555;
   static boolean field1575;
   static boolean field1576;
   static boolean field1587;
   static boolean field1598 = true;
   static boolean isPlayerMod;
   static boolean field1617;
   static boolean field1623;
   static boolean field1657;
   static boolean field1672;
   static boolean field1677;
   static boolean field1682;
   static boolean field1689;
   static boolean field1691;
   static boolean field1692;
   static boolean field1697;
   static boolean field1698;
   static boolean field1713;
   static boolean field1725;
   static boolean field1732;
   static boolean[] field1534;
   static boolean[] field1585;
   static boolean[] field1634;
   static boolean[] field1651;
   static boolean[] field1652;
   static boolean[] field1683;
   static byte[] field1488;
   static class101 field1460;
   static class101 field1461;
   static class132 authType;
   static class154[] field1628;
   static class164[] field1673;
   static class216 field1666;
   static class218[] field1504;
   static class231 field1528;
   static class290 field1475;
   static class290 field1724;
   static class29[] field1727;
   static class314 field1630;
   static Component field1520;
   static Component meslayerPauseButtonComponent;
   static Component field1611;
   static Component field1616;
   static class367[] field1720;
   static class368 field1439;
   static class368 field1571;
   static class368 field1593;
   static class368 field1643;
   static class368 field1644;
   static class368 field1645;
   static class368 field1726;
   static class368[][][] field1568;
   static class403 field1497;
   static class428 field1722;
   static class480 field1694;
   static class481 activeSubInterfaces;
   static class481 field1647;
   static class483 field1719;
   static class487 field1559;
   static class487 field1695;
   static LoginMethod loginMethod;
   static class523[] field1678;
   static class530 field1642;
   static class55 field1484;
   static class73 field1721;
   static class84[] field1527;
   static class86[] field1489;
   static class91 field1463;
   static int field1433 = 0;
   static int field1434 = 0;
   static int field1437 = -1;
   static int clientType = -1;
   static int field1442;
   static int field1444;
   static int field1445 = 0;
   static int field1447;
   static int field1448 = -1;
   static int field1451 = 0;
   static int field1452 = 0;
   static int field1453;
   static int field1454 = 0;
   static int field1455 = 0;
   static int field1456;
   static int field1457 = 0;
   static int field1458 = 0;
   static int field1459 = 0;
   static int js5ConnectState;
   static int field1465;
   static int field1466;
   static int loginStage;
   static int field1468;
   static int field1469;
   static int field1470;
   static int field1494;
   static int field1499;
   static int field1500;
   static int field1502;
   static int field1509;
   static int field1510;
   static int field1511;
   static int field1513;
   static int field1514;
   static int field1518;
   static int field1519;
   static int field1521;
   static int field1522;
   static int field1523 = 0;
   static int field1524;
   static int field1525;
   static int field1526;
   static int field1530;
   static int field1531;
   static int field1532;
   static int field1533;
   static int field1535;
   static int field1536;
   static int field1538;
   static int field1541;
   static int field1542;
   static int field1545;
   static int field1546;
   static int field1548;
   static int field1551;
   static int field1553;
   static int field1556;
   static int isMember;
   static int field1560;
   static int field1561;
   static int field1564;
   static int field1565;
   static int field1567;
   static int field1569;
   static int platformType = -1;
   static int field1586;
   static int field1588;
   static int field1589;
   static int field1590;
   static int field1591;
   static int field1592;
   static int field1594;
   static int field1595;
   static int field1596;
   static int field1597;
   static int rootInterface;
   static int field1602;
   static int field1603;
   static int field1604;
   static int field1606;
   static int field1607;
   static int privilege;
   static int field1609;
   static int field1612 = 0;
   static int field1614;
   static int field1615;
   static int field1618;
   static int field1619;
   static int field1621;
   static int field1622;
   static int field1624;
   static int field1626;
   static int field1627;
   static int field1632;
   static int field1633;
   static int field1635;
   static int field1636;
   static int field1637;
   static int field1639;
   static int field1640;
   static int field1641;
   static int field1646;
   static int field1648;
   static int field1649;
   static int field1659 = -1;
   static int field1661;
   static int field1662;
   static int field1665;
   static int field1668;
   static int field1671;
   static int field1674;
   static int field1679;
   static int field1680;
   static int field1681;
   static int field1688;
   static int field1690;
   static int field1702;
   static int field1705;
   static int field1709;
   static int field1712;
   static int field1714;
   static int field1715;
   static int localPlayerIndex;
   static int field1717;
   static int field1718;
   static int gameState = 0;
   static int field1729;
   static int field1730;
   static int field1733;
   static int[] field1491;
   static int[] field1492;
   static int[] field1493;
   static int[] field1495;
   static int[] field1501;
   static int[] field1503;
   static int[] field1517;
   static int[] field1537;
   static int[] field1539;
   static int[] field1562;
   static int[] field1572;
   static int[] field1574;
   static int[] field1578;
   static int[] field1579;
   static int[] field1580;
   static int[] field1581;
   static int[] field1582;
   static int[] field1599;
   static int[] field1620;
   static int[] field1625;
   static int[] field1629;
   static int[] field1631;
   static int[] field1638;
   static int[] field1653;
   static int[] field1654;
   static int[] field1655;
   static int[] field1656;
   static int[] field1660;
   static int[] field1667;
   static int[] field1669;
   static int[] field1670;
   static int[] field1676;
   static int[] field1684;
   static int[] field1685;
   static int[] field1686;
   static int[] field1687;
   static int[] field1699;
   static int[] field1700;
   static int[] field1701;
   static int[] field1704;
   static int[] field1711;
   static int[] field1723;
   static int[][] field1544;
   static int[][] field1554;
   static int[][][] instanceChunkTemplates;
   static String field1473;
   static String field1552;
   static String field1650;
   static String field1663;
   static String[] field1543;
   static String[] field1577;
   static String[] field1583;
   static String[] field1584;
   static ArrayList field1431;
   static HashMap field1498;
   static List field1570;
   static long field1446 = -1L;
   static long field1449 = -1L;
   static long serverUUIDMaybeIdk;
   static long field1566;
   static long field1658;
   static long[] field1664;
   static short field1508;
   static short field1515;
   static short field1675;
   static short field1693;
   static short field1703;
   static short field1706;
   static short field1707;
   static short field1710;
   static final class67 field1731;
   static final int[] field1507;
   static final int[] field1563;
   static final String field1482;
   boolean field1478 = false;
   class1 field1474;
   class26 field1486;
   class4 field1479;
   class4 field1550;
   Buffer field1485;
   OtlTokenRequester field1476;
   RefreshAccessTokenRequester field1480;
   String oauthToken;
   Future field1477;
   Future field1481;
   long serverSeed = -1L;

   static {
      field1460 = class101.field934;
      field1461 = class101.field934;
      field1672 = false;
      field1463 = class91.field839;
      js5ConnectState = 0;
      field1465 = 0;
      field1466 = 0;
      loginStage = 0;
      field1468 = 0;
      field1712 = 0;
      field1470 = 0;
      authType = class132.field1243;
      loginMethod = LoginMethod.NORMAL;
      int var1 = "com_jagex_auth_desktop_osrs:public".length();
      byte[] var2 = new byte[var1];

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = "com_jagex_auth_desktop_osrs:public".charAt(var3);
         if (var4 > 127) {
            var2[var3] = 63;
         } else {
            var2[var3] = (byte)var4;
         }
      }

      field1482 = class379.method6576(var2);
      isUsernameRemembered = false;
      field1484 = new class55();
      field1488 = null;
      field1489 = new class86[65536];
      field1565 = 0;
      field1491 = new int[65536];
      field1717 = 0;
      field1503 = new int[250];
      serverConnection = new class106();
      field1542 = 0;
      field1487 = false;
      field1497 = new class403();
      field1498 = new HashMap();
      field1646 = 0;
      field1500 = 1;
      field1595 = 0;
      field1502 = 1;
      field1453 = 0;
      field1504 = new class218[4];
      isDynamicRegion = false;
      instanceChunkTemplates = new int[4][13][13];
      field1507 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
      field1618 = 0;
      field1509 = 2301979;
      field1510 = 5063219;
      field1511 = 3353893;
      field1688 = 7759444;
      field1732 = false;
      field1514 = 0;
      field1649 = 128;
      field1569 = 0;
      field1690 = 0;
      field1518 = 0;
      field1519 = 0;
      field1733 = 0;
      field1521 = 0;
      field1522 = 50;
      field1499 = 0;
      field1524 = 0;
      field1525 = 0;
      field1526 = 12;
      field1702 = 6;
      field1540 = 0;
      field1529 = false;
      field1530 = 0;
      field1623 = false;
      field1532 = 0;
      field1447 = 0;
      field1531 = 50;
      field1667 = new int[field1531];
      field1562 = new int[field1531];
      field1537 = new int[field1531];
      field1638 = new int[field1531];
      field1539 = new int[field1531];
      field1599 = new int[field1531];
      field1554 = new int[field1531][];
      field1495 = new int[field1531];
      field1543 = new String[field1531];
      field1544 = new int[104][104];
      field1545 = 0;
      field1546 = -1;
      field1665 = -1;
      field1548 = 0;
      field1442 = 0;
      field1681 = 0;
      field1551 = 0;
      field1555 = true;
      field1553 = 0;
      field1496 = true;
      field1527 = new class84[2048];
      localPlayerIndex = -1;
      isMember = 0;
      serverUUIDMaybeIdk = -1L;
      field1682 = true;
      field1560 = 0;
      field1561 = 0;
      field1517 = new int[1000];
      field1563 = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
      field1577 = new String[8];
      field1683 = new boolean[8];
      field1620 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
      field1567 = -1;
      field1568 = new class368[4][104][104];
      field1593 = new class368();
      field1439 = new class368();
      field1571 = new class368();
      field1572 = new int[25];
      field1493 = new int[25];
      field1574 = new int[25];
      field1575 = false;
      field1576 = false;
      field1594 = 0;
      field1578 = new int[500];
      field1579 = new int[500];
      field1580 = new int[500];
      field1704 = new int[500];
      field1582 = new int[500];
      field1583 = new String[500];
      field1584 = new String[500];
      field1585 = new boolean[500];
      field1692 = false;
      field1587 = false;
      field1617 = true;
      field1589 = -1;
      field1590 = -1;
      field1591 = 0;
      field1592 = 50;
      field1494 = 0;
      field1473 = null;
      field1657 = false;
      field1596 = -1;
      field1597 = -1;
      field1552 = null;
      field1650 = null;
      rootInterface = -1;
      activeSubInterfaces = new class481(8);
      field1533 = 0;
      field1603 = -1;
      field1604 = 0;
      meslayerPauseButtonComponent = null;
      field1606 = 0;
      field1607 = 0;
      privilege = 0;
      field1609 = -1;
      isPlayerMod = false;
      field1611 = null;
      field1512 = null;
      field1520 = null;
      field1614 = 0;
      field1615 = 0;
      field1616 = null;
      field1677 = false;
      field1564 = -1;
      field1619 = -1;
      field1725 = false;
      field1621 = -1;
      field1622 = -1;
      field1516 = false;
      field1624 = 1;
      field1625 = new int[32];
      field1626 = 0;
      field1723 = new int[32];
      field1602 = 0;
      field1629 = new int[32];
      field1627 = 0;
      field1631 = new int[32];
      field1709 = 0;
      field1633 = 0;
      field1679 = 0;
      field1635 = 0;
      field1469 = 0;
      field1538 = 0;
      field1637 = 0;
      field1639 = 0;
      field1640 = 0;
      field1641 = 0;
      field1642 = new class530();
      field1643 = new class368();
      field1644 = new class368();
      field1645 = new class368();
      field1726 = new class368();
      field1647 = new class481(512);
      field1648 = 0;
      field1444 = -2;
      field1634 = new boolean[100];
      field1651 = new boolean[100];
      field1652 = new boolean[100];
      field1581 = new int[100];
      field1654 = new int[100];
      field1655 = new int[100];
      field1656 = new int[100];
      field1588 = 0;
      field1658 = 0L;
      isResizable = true;
      field1660 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
      field1661 = 0;
      field1662 = 0;
      field1663 = "";
      field1664 = new long[100];
      field1556 = 0;
      field1666 = new class216();
      field1528 = new class231();
      field1668 = 0;
      field1669 = new int[128];
      field1670 = new int[128];
      field1566 = -1L;
      field1628 = new class154[4];
      field1673 = new class164[4];
      field1674 = -1;
      field1536 = 0;
      field1676 = new int[1000];
      field1492 = new int[1000];
      field1678 = new class523[1000];
      field1513 = 0;
      field1680 = 0;
      field1586 = 0;
      field1490 = false;
      field1632 = 0;
      field1684 = new int[50];
      field1685 = new int[50];
      field1686 = new int[50];
      field1501 = new int[50];
      field1727 = new class29[50];
      field1689 = false;
      field1691 = false;
      field1713 = false;
      field1698 = false;
      field1694 = null;
      field1695 = null;
      field1559 = null;
      field1697 = false;
      field1534 = new boolean[5];
      field1699 = new int[5];
      field1700 = new int[5];
      field1701 = new int[5];
      field1687 = new int[5];
      field1703 = 256;
      field1693 = 205;
      field1515 = 256;
      field1706 = 320;
      field1707 = 1;
      field1508 = 32767;
      field1675 = 1;
      field1710 = 32767;
      field1705 = 0;
      field1541 = 0;
      field1456 = 0;
      field1714 = 0;
      field1715 = 0;
      field1630 = new class314();
      field1636 = -1;
      field1718 = -1;
      field1719 = new class489();
      field1720 = new class367[8];
      field1721 = new class73();
      field1722 = new class428(8, class437.field4668);
      field1475 = new class290(64);
      field1724 = new class290(64);
      field1535 = -1;
      field1708 = -1;
      field1570 = new ArrayList();
      field1431 = new ArrayList(10);
      field1729 = 0;
      field1730 = 0;
      field1731 = new class67();
      field1711 = new int[50];
      field1653 = new int[50];
   }

   static class485 method1738() {
      return class115.field1095;
   }

   static final void method1972() {
      class234.field2595 = false;
      isLowDetail = false;
   }

   static void method2099() {
      class3.field21 = System.getenv("JX_ACCESS_TOKEN");
      class81.field719 = System.getenv("JX_REFRESH_TOKEN");
      class20.field114 = System.getenv("JX_SESSION_ID");
      Login.field468 = System.getenv("JX_CHARACTER_ID");
      String var1 = System.getenv("JX_DISPLAY_NAME");
      String var2;
      if (var1 != null && !var1.isEmpty() && var1.charAt(0) != '#') {
         var2 = var1;
      } else {
         var2 = "";
      }

      Login.field448 = var2;
   }

   public static class216 method4736() {
      return field1666;
   }

   static void method1974() {
      if (class104.field1038.method2361()) {
         class104.field1038.method2378();
      }

      if (null != class514.field5111) {
         class514.field5111.field736 = false;
      }

      class514.field5111 = null;
      serverConnection.method2146();
      if (GameShell.field272 != null) {
         try {
            GameShell.field272.method3398();
         } catch (Exception var3) {
         }
      }

      GameShell.field272 = null;
      method3256();
      class186.field2015.method6397();
      class475.field4839.method6397();
      class49.field361.method6397();
      class200.field2181.method6397();
      class70.field570.method6397();
      class107.field1059.method6397();
      class127.field1209.method6397();
      class63.field498.method6397();
      class17.field95 = null;
      class34.field170 = null;
      class270.field2986 = null;
      class505.field5067 = null;
      class2.field12 = null;
      class357.field3957 = null;
      class95.field878 = null;
      class231.field2524 = null;
      class297.field3148 = null;
      class302.field3190 = null;
      class282.field3048 = null;
      class109.field1065.method4534();

      int var1;
      for(var1 = 0; var1 < 4; ++var1) {
         field1504[var1].method4164();
      }

      class115.field1095 = null;
      class303.method4211(0, 0);
      class303.field3198.clear();
      field1490 = false;
      class77.method2555();
      if (class194.field2126 != null) {
         class194.field2126.method547();
      }

      Js5NetQueue.field1356.method6540();
      class350.method6519();
      if (class261.field2935 != null) {
         class261.field2935.method2227();
      }

      try {
         class160.field1750.method8661();

         for(var1 = 0; var1 < class160.field1757; ++var1) {
            class302.field3191[var1].method8661();
         }

         class160.field1753.method8661();
         class160.field1755.method8661();
      } catch (Exception var4) {
      }

      class160.field1750 = null;
      class160.field1753 = null;
      class302.field3191 = null;
      class167.field1796.clear();
      class157.field1740 = null;
      field1431.clear();
      field1730 = 0;
      Js5NetQueue.field1356 = new class355();
      class261.field2935 = new class112(class124.field1180.field1478, 215);

      try {
         class160.method3851("oldschool", class189.field2035, class96.field883.field3853, 0, 22);
      } catch (IOException var2) {
         throw new RuntimeException(var2);
      }

      class157.field1740 = new class449(255, class160.field1750, class160.field1753, 500000);
      GameShell.field272 = new class178();
      field1463 = class91.field839;
      updateGameState(0);
   }

   static void updateGameState(int var0) {
      if (gameState != var0) {
         if (30 == gameState) {
            field1528.method4390();
         }

         if (gameState == 0) {
            class124.field1180.method812();
         }

         if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) {
            updateLoginStage(0);
            field1468 = 0;
            field1712 = 0;
            field1497.method7069(var0);
            if (var0 != 20) {
               method6480(false);
            }
         }

         if (var0 != 20 && var0 != 40 && null != class109.field1069) {
            class109.field1069.method7589();
            class109.field1069 = null;
         }

         if (25 == gameState) {
            field1453 = 0;
            field1646 = 0;
            field1500 = 1;
            field1595 = 0;
            field1502 = 1;
         }

         if (var0 != 5 && var0 != 10) {
            if (var0 == 20) {
               int var4 = 11 == gameState ? 4 : 0;
               class108.method2167(class131.field1236, class379.field4382, false, var4);
            } else if (var0 == 11) {
               class108.method2167(class131.field1236, class379.field4382, false, 4);
            } else if (var0 == 50) {
               Login.method2098("", "Updating date of birth...", "");
               class108.method2167(class131.field1236, class379.field4382, false, 7);
            } else {
               Login.method4749();
            }
         } else {
            boolean var2 = class141.clientPreferences.method1687() >= field1437;
            int var3 = var2 ? 0 : 12;
            class108.method2167(class131.field1236, class379.field4382, true, var3);
         }

         gameState = var0;
      }
   }

   static void method3571(class363 var0, String var1) {
      class96 var3 = new class96(var0, var1);
      field1431.add(var3);
      field1730 += var3.field879;
   }

   static boolean method597() {
      if (null != field1431 && field1729 < field1431.size()) {
         while(field1729 < field1431.size()) {
            class96 var1 = (class96)field1431.get(field1729);
            if (!var1.method1998()) {
               return false;
            }

            ++field1729;
         }

         return true;
      } else {
         return true;
      }
   }

   static int method3284() {
      if (field1431 != null && field1729 < field1431.size()) {
         int var1 = 0;

         for(int var2 = 0; var2 <= field1729; ++var2) {
            var1 += ((class96)field1431.get(var2)).field881;
         }

         return var1 * 10000 / field1730;
      } else {
         return 10000;
      }
   }

   static int method7580(int var0) {
      return var0 * 3 + 600;
   }

   static void method7540(int var0, int var1) {
      int[] var3 = new int[9];

      for(int var4 = 0; var4 < var3.length; ++var4) {
         int var5 = 15 + var4 * 32 + 128;
         int var6 = method7580(var5);
         int var7 = class229.field2511[var5];
         var6 = method7749(var6, var1);
         var3[var4] = var7 * var6 >> 16;
      }

      class234.method4546(var3, 500, 800, var0 * 334 / var1, 334);
   }

   static void method4206() {
      int var30;
      if (class91.field839 == field1463) {
         class109.field1065 = new class234(4, 104, 104, class88.field797);

         for(var30 = 0; var30 < 4; ++var30) {
            field1504[var30] = new class218(104, 104);
         }

         class247.field2715 = new class523(512, 512);
         Login.field436 = class364.field4301;
         Login.field450 = 5;
         field1463 = class91.field841;
      } else if (class91.field841 == field1463) {
         Login.field436 = class364.field4284;
         Login.field450 = 10;
         field1463 = class91.field838;
      } else if (class91.field838 == field1463) {
         class150.field1383 = class104.method2120(0, false, true, true, false);
         class124.field1182 = class104.method2120(1, false, true, true, false);
         class186.field2015 = class104.method2120(2, true, false, true, false);
         class260.field2931 = class104.method2120(3, false, true, true, false);
         class136.field1254 = class104.method2120(4, false, true, true, false);
         Js5Index.mapsJs5 = class104.method2120(5, true, true, true, false);
         class24.field121 = class104.method2120(6, true, true, true, false);
         class26.field133 = class104.method2120(7, false, true, true, false);
         class379.field4382 = class104.method2120(8, false, true, true, false);
         class144.field1347 = class104.method2120(9, false, true, true, false);
         class131.field1236 = class104.method2120(10, false, true, true, false);
         class73.field589 = class104.method2120(11, false, true, true, false);
         class130.field1226 = class104.method2120(12, false, true, true, false);
         class475.field4839 = class104.method2120(13, true, false, true, false);
         class49.field361 = class104.method2120(14, false, true, true, false);
         class200.field2181 = class104.method2120(15, false, true, true, false);
         class70.field570 = class104.method2120(17, true, true, true, false);
         class107.field1059 = class104.method2120(18, false, true, true, false);
         class127.field1209 = class104.method2120(19, false, true, true, false);
         class63.field498 = class104.method2120(20, false, true, true, false);
         class182.field1885 = class104.method2120(21, false, true, true, true);
         Login.field436 = class364.field4319;
         Login.field450 = 20;
         field1463 = class91.field850;
      } else if (field1463 == class91.field850) {
         byte var54 = 0;
         var30 = var54 + class150.field1383.method6598() * 4 / 100;
         var30 += class124.field1182.method6598() * 4 / 100;
         var30 += class186.field2015.method6598() * 2 / 100;
         var30 += class260.field2931.method6598() * 2 / 100;
         var30 += class136.field1254.method6598() * 6 / 100;
         var30 += Js5Index.mapsJs5.method6598() * 4 / 100;
         var30 += class24.field121.method6598() * 2 / 100;
         var30 += class26.field133.method6598() * 55 / 100;
         var30 += class379.field4382.method6598() * 2 / 100;
         var30 += class144.field1347.method6598() * 2 / 100;
         var30 += class131.field1236.method6598() * 2 / 100;
         var30 += class73.field589.method6598() * 2 / 100;
         var30 += class130.field1226.method6598() * 2 / 100;
         var30 += class475.field4839.method6598() * 2 / 100;
         var30 += class49.field361.method6598() * 2 / 100;
         var30 += class200.field2181.method6598() * 2 / 100;
         var30 += class127.field1209.method6598() / 100;
         var30 += class107.field1059.method6598() / 100;
         var30 += class63.field498.method6598() / 100;
         var30 += class182.field1885.method6598() / 100;
         var30 += class70.field570.method6614() && class70.field570.method6399() ? 1 : 0;
         if (var30 != 100) {
            if (var30 != 0) {
               Login.field436 = class364.field4050 + var30 + "%";
            }

            Login.field450 = 30;
         } else {
            method3571(class150.field1383, "Animations");
            method3571(class124.field1182, "Skeletons");
            method3571(class136.field1254, "Sound FX");
            method3571(Js5Index.mapsJs5, "Maps");
            method3571(class24.field121, "Music Tracks");
            method3571(class26.field133, "Models");
            method3571(class379.field4382, "Sprites");
            method3571(class73.field589, "Music Jingles");
            method3571(class49.field361, "Music Samples");
            method3571(class200.field2181, "Music Patches");
            method3571(class127.field1209, "World Map");
            method3571(class107.field1059, "World Map Geography");
            method3571(class63.field498, "World Map Ground");
            class351.field3879 = new class463();
            class351.field3879.method8047(class70.field570);
            Login.field436 = class364.field4196;
            Login.field450 = 30;
            field1463 = class91.field840;
         }
      } else {
         int var41;
         if (field1463 == class91.field840) {
            class37.method4636(22050, !isLowDetail, 2);
            ArrayList var52 = new ArrayList(3);
            class178 var34 = GameShell.field272;
            short var39 = 2048;
            if (class37.field198 == 0) {
               throw new IllegalStateException();
            } else {
               if (var39 < 256) {
                  var39 = 256;
               }

               class37 var38;
               try {
                  class37 var49 = class293.field3132.method528();
                  var49.field187 = new int[(class373.field4355 ? 2 : 1) * 256];
                  var49.field188 = var39;
                  var49.method538();
                  var49.field202 = 1024 + (var39 & -1024);
                  if (var49.field202 > 16384) {
                     var49.field202 = 16384;
                  }

                  var49.method535(var49.field202);
                  if (class204.field2196 > 0 && class265.field2956 == null) {
                     class265.field2956 = new class50();
                     class277.field3029 = Executors.newScheduledThreadPool(1);
                     class277.field3029.scheduleAtFixedRate(class265.field2956, 0L, 10L, TimeUnit.MILLISECONDS);
                  }

                  if (class265.field2956 != null) {
                     if (null != class265.field2956.field365[0]) {
                        throw new IllegalArgumentException();
                     }

                     class265.field2956.field365[0] = var49;
                  }

                  var38 = var49;
               } catch (Throwable var28) {
                  var38 = new class37();
               }

               class194.field2126 = var38;
               class103.field1019 = new class31();
               class31 var53 = new class31();
               var53.method449(class103.field1019);

               for(var41 = 0; var41 < 3; ++var41) {
                  class289 var47 = new class289();
                  var47.method5535(9, 128);
                  var53.method449(var47);
                  var52.add(var47);
               }

               class194.field2126.method530(var53);
               class303.method5350(class200.field2181, class49.field361, class136.field1254, var52);
               class34.field167 = new class62(22050, class37.field198);
               Login.field436 = class364.field4039;
               Login.field450 = 35;
               field1463 = class91.field836;
               class220.field2432 = new class494(class379.field4382, class475.field4839);
            }
         } else if (field1463 == class91.field836) {
            var30 = class475.method8155().length;
            class494 var37 = class220.field2432;
            class475[] var32 = new class475[]{class475.field4841, class475.field4836, class475.field4838, class475.field4844, class475.field4834, class475.field4837};
            field1498 = var37.method8461(var32);
            if (field1498.size() < var30) {
               Login.field436 = class364.field4040 + field1498.size() * 100 / var30 + "%";
               Login.field450 = 40;
            } else {
               class185.field1996 = (class393)field1498.get(class475.field4844);
               class112.field1079 = (class393)field1498.get(class475.field4834);
               class316.field3504 = (class393)field1498.get(class475.field4836);
               class191.field2089 = field1719.method8198();
               Login.field436 = class364.field4226;
               Login.field450 = 40;
               field1463 = class91.field842;
            }
         } else {
            class363 var3;
            int var4;
            class363 var35;
            int var43;
            if (class91.field842 == field1463) {
               var35 = class131.field1236;
               var3 = class379.field4382;
               var4 = 0;
               String[] var46 = Login.field427;

               String var44;
               for(var41 = 0; var41 < var46.length; ++var41) {
                  var44 = var46[var41];
                  if (var35.method6403(var44, "")) {
                     ++var4;
                  }
               }

               var46 = Login.field462;

               for(var41 = 0; var41 < var46.length; ++var41) {
                  var44 = var46[var41];
                  if (var3.method6403(var44, "")) {
                     ++var4;
                  }
               }

               var46 = Login.field442;

               for(var41 = 0; var41 < var46.length; ++var41) {
                  var44 = var46[var41];
                  if (var3.getGroupId(var44) != -1 && var3.method6403(var44, "")) {
                     ++var4;
                  }
               }

               var43 = Login.method6489(class379.field4382);
               if (var4 < var43) {
                  Login.field436 = class364.field4106 + var4 * 100 / var43 + "%";
                  Login.field450 = 50;
               } else {
                  Login.field436 = class364.field4043;
                  Login.field450 = 50;
                  updateGameState(5);
                  field1463 = class91.field843;
               }
            } else if (field1463 == class91.field843) {
               if (!class186.field2015.method6399()) {
                  Login.field436 = class364.field4056 + class186.field2015.method6607() + "%";
                  Login.field450 = 60;
               } else if (!class182.field1885.method6399()) {
                  Login.field436 = class364.field4056 + (80 + class130.field1226.method6607() / 6) + "%";
                  Login.field450 = 60;
               } else {
                  class209.method2479(class186.field2015);
                  class363 var48 = class186.field2015;
                  class192.field2092 = var48;
                  class206.method2331(class186.field2015, class26.field133);
                  var35 = class186.field2015;
                  var3 = class26.field133;
                  boolean var36 = isLowDetail;
                  class184.field1908 = var35;
                  class184.field1906 = var3;
                  class184.field1921 = var36;
                  class363 var45 = class186.field2015;
                  class363 var40 = class26.field133;
                  class527.field5167 = var45;
                  class191.field2044 = var40;
                  class202.method64(class186.field2015);
                  class185.method1378(class186.field2015, class26.field133, field1435, class185.field1996);
                  class215.method7149(class186.field2015, class150.field1383, class124.field1182);
                  class363 var42 = class186.field2015;
                  class363 var50 = class26.field133;
                  class205.field2212 = var42;
                  class58.field413 = var50;
                  class196.method1032(class186.field2015);
                  class363 var51 = class186.field2015;
                  class189.field2034 = var51;
                  class189.field2029 = class189.field2034.method6393(16);
                  class363 var10 = class260.field2931;
                  class363 var11 = class26.field133;
                  class363 var12 = class379.field4382;
                  class363 var13 = class475.field4839;
                  int var14 = 0;
                  if (null != var10) {
                     class96.field885 = var10;
                     class239.field2657 = var11;
                     class108.field1061 = var12;
                     class254.field2871 = var13;
                     var14 = class96.field885.method6394();
                  }

                  class96.interfaces = new Component[var14][];
                  Component.field3674 = new boolean[var14];
                  class363 var55 = class186.field2015;
                  class190.field2037 = var55;
                  class363 var15 = class186.field2015;
                  class195.field2136 = var15;
                  class363 var16 = class186.field2015;
                  class187.field2027 = var16;
                  class363 var17 = class186.field2015;
                  class363 var18 = class186.field2015;
                  class199.field2178 = var18;
                  class505.method7056(class186.field2015);
                  class384.method6921(class186.field2015);
                  class291.field3124 = new class510(class12.field65, 54, class63.field496, class186.field2015);
                  class339.field3793 = new class510(class12.field65, 47, class63.field496, class186.field2015);
                  class104.field1038 = new class127();
                  class363 var19 = class186.field2015;
                  class363 var20 = class379.field4382;
                  class363 var21 = class475.field4839;
                  class193.field2105 = var19;
                  class380.field4384 = var20;
                  class193.field2099 = var21;
                  class363 var22 = class186.field2015;
                  class363 var23 = class379.field4382;
                  class183.field1891 = var22;
                  class183.field1888 = var23;
                  class363 var24 = class186.field2015;
                  class363 var25 = class379.field4382;
                  class197.field2151 = var25;
                  if (var24.method6399()) {
                     class62.field474 = var24.method6393(35);
                     class324.field3540 = new class197[class62.field474];

                     for(int var26 = 0; var26 < class62.field474; ++var26) {
                        byte[] var27 = var24.method6381(35, var26);
                        class324.field3540[var26] = new class197(var26);
                        if (null != var27) {
                           class324.field3540[var26].method3769(new Buffer(var27));
                           class324.field3540[var26].method3778();
                        }
                     }
                  }

                  Login.field436 = class364.field4045;
                  Login.field450 = 60;
                  field1463 = class91.field846;
               }
            } else if (field1463 == class91.field846) {
               var30 = 0;
               if (null == class17.field95) {
                  class17.field95 = class485.method8408(class379.field4382, class351.field3879.field4775, 0);
               } else {
                  ++var30;
               }

               if (null == class34.field170) {
                  class34.field170 = class485.method8408(class379.field4382, class351.field3879.field4768, 0);
               } else {
                  ++var30;
               }

               class537[] var2;
               boolean var5;
               byte[] var6;
               class537[] var7;
               int var8;
               class537 var9;
               if (null == class270.field2986) {
                  var3 = class379.field4382;
                  var4 = class351.field3879.field4769;
                  var6 = var3.method6381(var4, 0);
                  if (null == var6) {
                     var5 = false;
                  } else {
                     class538.method3764(var6);
                     var5 = true;
                  }

                  if (!var5) {
                     var2 = null;
                  } else {
                     var7 = new class537[class538.field5226];

                     for(var8 = 0; var8 < class538.field5226; ++var8) {
                        var9 = var7[var8] = new class537();
                        var9.field5221 = class538.field5222;
                        var9.field5218 = class538.field5224;
                        var9.field5217 = class482.field4876[var8];
                        var9.field5219 = class155.field1421[var8];
                        var9.field5216 = class168.field1802[var8];
                        var9.field5214 = class538.field5225[var8];
                        var9.field5215 = class538.field5223;
                        var9.field5220 = class352.field3889[var8];
                     }

                     class538.method8588();
                     var2 = var7;
                  }

                  class270.field2986 = var2;
               } else {
                  ++var30;
               }

               if (null == class505.field5067) {
                  class505.field5067 = class538.method8028(class379.field4382, class351.field3879.field4770, 0);
               } else {
                  ++var30;
               }

               if (null == class2.field12) {
                  class2.field12 = class538.method8028(class379.field4382, class351.field3879.field4772, 0);
               } else {
                  ++var30;
               }

               if (null == class357.field3957) {
                  class357.field3957 = class538.method8028(class379.field4382, class351.field3879.field4767, 0);
               } else {
                  ++var30;
               }

               if (null == class95.field878) {
                  class95.field878 = class538.method8028(class379.field4382, class351.field3879.field4773, 0);
               } else {
                  ++var30;
               }

               if (class231.field2524 == null) {
                  class231.field2524 = class538.method8028(class379.field4382, class351.field3879.field4774, 0);
               } else {
                  ++var30;
               }

               if (class297.field3148 == null) {
                  class297.field3148 = class538.method8028(class379.field4382, class351.field3879.field4771, 0);
               } else {
                  ++var30;
               }

               if (null == class302.field3190) {
                  var3 = class379.field4382;
                  var4 = class351.field3879.field4776;
                  var6 = var3.method6381(var4, 0);
                  if (var6 == null) {
                     var5 = false;
                  } else {
                     class538.method3764(var6);
                     var5 = true;
                  }

                  if (!var5) {
                     var2 = null;
                  } else {
                     var7 = new class537[class538.field5226];

                     for(var8 = 0; var8 < class538.field5226; ++var8) {
                        var9 = var7[var8] = new class537();
                        var9.field5221 = class538.field5222;
                        var9.field5218 = class538.field5224;
                        var9.field5217 = class482.field4876[var8];
                        var9.field5219 = class155.field1421[var8];
                        var9.field5216 = class168.field1802[var8];
                        var9.field5214 = class538.field5225[var8];
                        var9.field5215 = class538.field5223;
                        var9.field5220 = class352.field3889[var8];
                     }

                     class538.method8588();
                     var2 = var7;
                  }

                  class302.field3190 = var2;
               } else {
                  ++var30;
               }

               if (null == class282.field3048) {
                  var3 = class379.field4382;
                  var4 = class351.field3879.field4777;
                  var6 = var3.method6381(var4, 0);
                  if (var6 == null) {
                     var5 = false;
                  } else {
                     class538.method3764(var6);
                     var5 = true;
                  }

                  if (!var5) {
                     var2 = null;
                  } else {
                     var7 = new class537[class538.field5226];

                     for(var8 = 0; var8 < class538.field5226; ++var8) {
                        var9 = var7[var8] = new class537();
                        var9.field5221 = class538.field5222;
                        var9.field5218 = class538.field5224;
                        var9.field5217 = class482.field4876[var8];
                        var9.field5219 = class155.field1421[var8];
                        var9.field5216 = class168.field1802[var8];
                        var9.field5214 = class538.field5225[var8];
                        var9.field5215 = class538.field5223;
                        var9.field5220 = class352.field3889[var8];
                     }

                     class538.method8588();
                     var2 = var7;
                  }

                  class282.field3048 = var2;
               } else {
                  ++var30;
               }

               if (var30 < 11) {
                  Login.field436 = class364.field4287 + var30 * 100 / 12 + "%";
                  Login.field450 = 70;
               } else {
                  class407.field4521 = class282.field3048;
                  class34.field170.method9028();
                  int var33 = (int)(Math.random() * 21.0) - 10;
                  int var31 = (int)(Math.random() * 21.0) - 10;
                  var4 = (int)(Math.random() * 21.0) - 10;
                  var43 = (int)(Math.random() * 41.0) - 20;
                  class270.field2986[0].method9325(var43 + var33, var31 + var43, var4 + var43);
                  Login.field436 = class364.field4047;
                  Login.field450 = 70;
                  field1463 = class91.field845;
               }
            } else if (field1463 == class91.field845) {
               if (!class144.field1347.method6399()) {
                  Login.field436 = class364.field4048 + "0%";
                  Login.field450 = 90;
               } else {
                  class112.field1080 = new class236(class144.field1347, class379.field4382, 20, class141.clientPreferences.method1624(), isLowDetail ? 64 : 128);
                  class229.method4278(class112.field1080);
                  class229.method4279(class141.clientPreferences.method1624());
                  field1463 = class91.field844;
               }
            } else if (field1463 == class91.field844) {
               var30 = class112.field1080.method4585();
               if (var30 < 100) {
                  Login.field436 = class364.field4048 + var30 + "%";
                  Login.field450 = 90;
               } else {
                  Login.field436 = class364.field4049;
                  Login.field450 = 90;
                  field1463 = class91.field847;
               }
            } else if (field1463 == class91.field847) {
               class514.field5111 = new class83();
               GameShell.field272.method3400(class514.field5111, 10);
               Login.field436 = class364.field4023;
               Login.field450 = 92;
               field1463 = class91.field848;
            } else if (field1463 == class91.field848) {
               if (!class131.field1236.method6403("huffman", "")) {
                  Login.field436 = class364.field4051 + 0 + "%";
                  Login.field450 = 94;
               } else {
                  class313 var29 = new class313(class131.field1236.method6402("huffman", ""));
                  class324.field3541 = var29;
                  Login.field436 = class364.field4204;
                  Login.field450 = 94;
                  field1463 = class91.field849;
               }
            } else if (class91.field849 == field1463) {
               if (!class260.field2931.method6399()) {
                  Login.field436 = class364.field4053 + class260.field2931.method6607() * 4 / 5 + "%";
                  Login.field450 = 96;
               } else if (!class130.field1226.method6399()) {
                  Login.field436 = class364.field4053 + (80 + class130.field1226.method6607() / 6) + "%";
                  Login.field450 = 96;
               } else if (!class475.field4839.method6399()) {
                  Login.field436 = class364.field4053 + (96 + class475.field4839.method6607() / 50) + "%";
                  Login.field450 = 96;
               } else {
                  Login.field436 = class364.field4054;
                  Login.field450 = 98;
                  if (class130.field1226.method6401("version.dat", "")) {
                     Buffer var1 = new Buffer(class130.field1226.method6402("version.dat", ""));
                     var1.readUnsignedShort();
                  }

                  field1463 = class91.field837;
               }
            } else if (field1463 == class91.field837) {
               Login.field450 = 100;
               if (class127.field1209.method6394() > 0 && !class127.field1209.method6404(class276.field3025.field3022)) {
                  Login.field436 = class364.field4055 + class127.field1209.method6423(class276.field3025.field3022) / 10 + "%";
               } else {
                  if (class115.field1095 == null) {
                     class115.field1095 = new class485();
                     class115.field1095.method8388(class127.field1209, class107.field1059, class63.field498, class316.field3504, field1498, class270.field2986);
                  }

                  Login.field436 = class364.field4121;
                  field1463 = class91.field851;
               }
            } else {
               if (class91.field851 == field1463) {
                  updateGameState(10);
               }

            }
         }
      }
   }

   static final void method5258() {
      serverConnection.method2146();
      method3256();
      class109.field1065.method4534();

      for(int var1 = 0; var1 < 4; ++var1) {
         field1504[var1].method4164();
      }

      field1528.method4390();
      System.gc();
      class303.method4211(0, 0);
      class303.field3198.clear();
      field1490 = false;
      class77.method2555();
      updateGameState(10);
   }

   static final void method6483(int var0) {
      method5258();
      switch (var0) {
         case 1:
            Login.method6370(24);
            Login.method2098(class364.field4254, class364.field4255, class364.field4256);
            break;
         case 2:
            Login.method6370(24);
            Login.method2098(class364.field4251, class364.field4252, class364.field4205);
      }

   }

   static long get214LoginResponseLong() {
      return serverUUIDMaybeIdk;
   }

   static final void method3256() {
      class209.method7425();
      class192.method6501();
      class206.field2223.method5637();
      class184.field1907.method5637();
      class184.field1914.method5637();
      class184.field1909.method5637();
      class184.field1910.method5637();
      class191.method2182();
      class185.method1508();
      class215.method8092();
      class205.method3613();
      class196.field2143.method5637();
      class189.field2030.method5637();
      class291.field3124.method8631();
      class339.field3793.method8631();
      class193.field2100.method5637();
      class193.field2101.method5637();
      class193.field2102.method5637();
      class183.method8606();
      class202.method2657();
      class199.field2175.method5637();
      class197.field2150.method5637();
      class505.method1546();
      class515.field5115.method5637();
      field1475.method5637();
      field1724.method5637();
      class314.field3493.method5637();
      Component.method1540();
      ((class236)class229.field2513.field2815).method4598();
      class81.field708.method5637();
      field1722.method7665();
      class150.field1383.method6397();
      class124.field1182.method6397();
      class260.field2931.method6397();
      class136.field1254.method6397();
      Js5Index.mapsJs5.method6397();
      class24.field121.method6397();
      class26.field133.method6397();
      class379.field4382.method6397();
      class144.field1347.method6397();
      class131.field1236.method6397();
      class73.field589.method6397();
      class130.field1226.method6397();
      class182.field1885.method6397();
   }

   static final void method2043() {
      if (field1542 > 0) {
         method5258();
      } else {
         field1497.method7068();
         updateGameState(40);
         class109.field1069 = serverConnection.method2137();
         serverConnection.method2150();
      }
   }

   static final void method6480(boolean var0) {
      if (var0) {
         authType = Login.field451 ? class132.field1242 : class132.field1244;
      } else {
         authType = class141.clientPreferences.method1688(Login.loginUsername) ? class132.field1248 : class132.field1243;
      }

   }

   static final void method2290() {
      if (class194.field2126 != null) {
         class194.field2126.method531();
      }

   }

   static void method7426(class215 var0, int var1, int var2, int var3) {
      if (field1632 < 50 && class141.clientPreferences.method1629() != 0) {
         if (null != var0.field2337 && var1 < var0.field2337.length) {
            method1036(var0.field2337[var1], var2, var3);
         }
      }
   }

   static void method366(class215 var0, int var1, int var2, int var3) {
      if (field1632 < 50 && class141.clientPreferences.method1629() != 0) {
         if (null != var0.field2339 && var0.field2339.containsKey(var1)) {
            method1036((Integer)var0.field2339.get(var1), var2, var3);
         }
      }
   }

   static void method1036(int var0, int var1, int var2) {
      if (var0 != 0) {
         int var4 = var0 >> 8;
         int var5 = var0 >> 4 & 7;
         int var6 = var0 & 15;
         field1684[field1632] = var4;
         field1685[field1632] = var5;
         field1686[field1632] = 0;
         field1727[field1632] = null;
         int var7 = (var1 - 64) / 128;
         int var8 = (var2 - 64) / 128;
         field1501[field1632] = var6 + (var8 << 8) + (var7 << 16);
         ++field1632;
      }
   }

   static void method21(int var0, int var1, int var2) {
      if (class141.clientPreferences.method1628() != 0 && var1 != 0 && field1632 < 50) {
         field1684[field1632] = var0;
         field1685[field1632] = var1;
         field1686[field1632] = var2;
         field1727[field1632] = null;
         field1501[field1632] = 0;
         ++field1632;
      }

   }

   static void method5202(int var0) {
      if (var0 == -1 && !field1490) {
         class303.method4211(0, 0);
      } else if (var0 != -1) {
         boolean var2;
         if (class303.field3198.isEmpty()) {
            var2 = false;
         } else {
            class322 var3 = (class322)class303.field3198.get(0);
            var2 = var3 != null && var3.field3524 == var0;
         }

         if (!var2 && class141.clientPreferences.method1626() != 0) {
            ArrayList var4 = new ArrayList();
            var4.add(new class322(class24.field121, var0, 0, class141.clientPreferences.method1626(), false));
            if (field1490) {
               class303.field3198.clear();
               class303.field3198.addAll(var4);
               class303.method2001(0, 100, 100, 0);
            } else {
               class303.method2298(var4, 0, 100, 100, 0, false);
            }
         }
      }

   }

   static void method3492(ArrayList var0, int var1, int var2, int var3, int var4) {
      if (!var0.isEmpty()) {
         int var6 = (Integer)var0.get(0);
         if (var6 == -1 && !field1490) {
            class303.method4211(0, 0);
         } else if (var6 != -1) {
            boolean var7;
            if (class303.field3198.isEmpty()) {
               var7 = false;
            } else {
               class322 var8 = (class322)class303.field3198.get(0);
               var7 = null != var8 && var8.field3524 == var6;
            }

            if (!var7 && class141.clientPreferences.method1626() != 0) {
               ArrayList var10 = new ArrayList();

               for(int var9 = 0; var9 < var0.size(); ++var9) {
                  var10.add(new class322(class24.field121, (Integer)var0.get(var9), 0, class141.clientPreferences.method1626(), false));
               }

               if (field1490) {
                  class303.field3198.clear();
                  class303.field3198.addAll(var10);
                  class303.method2001(var1, var2, var3, var4);
               } else {
                  class303.method2298(var10, var1, var2, var3, var4, false);
               }
            }
         }

      }
   }

   static void method1303(int var0, int var1) {
      if (class141.clientPreferences.method1626() != 0 && var0 != -1) {
         ArrayList var3 = new ArrayList();
         var3.add(new class322(class73.field589, var0, 0, class141.clientPreferences.method1626(), false));
         class303.method2298(var3, 0, 0, 0, 0, true);
         field1490 = true;
      }

   }

   static final void method3426(Component var0, int var1, int var2) {
      if (0 == field1586 || field1586 == 3) {
         if (!field1576 && (class41.field256 == 1 || !class40.field238 && class41.field256 == 4)) {
            class321 var4 = var0.method6222(true);
            if (null == var4) {
               return;
            }

            int var5 = class41.field257 - var1;
            int var6 = class41.field258 - var2;
            if (var4.method5865(var5, var6)) {
               var5 -= var4.field3517 / 2;
               var6 -= var4.field3518 / 2;
               int var7 = field1569 & 2047;
               int var8 = class229.field2511[var7];
               int var9 = class229.field2512[var7];
               int var10 = var6 * var8 + var5 * var9 >> 11;
               int var11 = var9 * var6 - var5 * var8 >> 11;
               int var12 = class146.field1362.field949 + var10 >> 7;
               int var13 = class146.field1362.field963 - var11 >> 7;
               class308 var14 = class308.method8607(ClientPacket.field3447, serverConnection.field1046);
               var14.packet.writeByte(18);
               var14.packet.writeShort(class342.field3837 + var12);
               var14.packet.writeByteAdd(field1666.method4103(82) ? (field1666.method4103(81) ? 2 : 1) : 0);
               var14.packet.writeShortLE(class144.field1352 + var13);
               var14.packet.writeByte(var5);
               var14.packet.writeByte(var6);
               var14.packet.writeShort(field1569);
               var14.packet.writeByte(57);
               var14.packet.writeByte(0);
               var14.packet.writeByte(0);
               var14.packet.writeByte(89);
               var14.packet.writeShort(class146.field1362.field949);
               var14.packet.writeShort(class146.field1362.field963);
               var14.packet.writeByte(63);
               serverConnection.method2148(var14);
               field1513 = var12;
               field1680 = var13;
            }
         }

      }
   }

   static final void method9009(String var0) {
      if (var0.equalsIgnoreCase("toggleroof")) {
         class141.clientPreferences.method1612(!class141.clientPreferences.method1613());
         if (class141.clientPreferences.method1613()) {
            class119.method7274(99, "", "Roofs are now all hidden");
         } else {
            class119.method7274(99, "", "Roofs will only be removed selectively");
         }
      }

      if (var0.startsWith("zbuf")) {
         boolean var2 = class380.method5731(var0.substring(5).trim()) == 1;
         class124.field1180.method667(var2);
         class229.method4277(var2);
      }

      if (var0.equalsIgnoreCase("z")) {
         field1672 = !field1672;
      }

      if (var0.equalsIgnoreCase("displayfps")) {
         class141.clientPreferences.method1649();
      }

      if (var0.equalsIgnoreCase("renderself")) {
         field1682 = !field1682;
      }

      if (var0.equalsIgnoreCase("mouseovertext")) {
         field1617 = !field1617;
      }

      if (privilege >= 2) {
         if (var0.equalsIgnoreCase("errortest")) {
            throw new RuntimeException();
         }

         if (var0.equalsIgnoreCase("showcoord")) {
            class115.field1095.field4900 = !class115.field1095.field4900;
         }

         if (var0.equalsIgnoreCase("fpson")) {
            class141.clientPreferences.method1667(true);
         }

         if (var0.equalsIgnoreCase("fpsoff")) {
            class141.clientPreferences.method1667(false);
         }

         if (var0.equalsIgnoreCase("gc")) {
            System.gc();
         }

         if (var0.equalsIgnoreCase("clientdrop")) {
            method2043();
         }
      }

      class308 var3 = class308.method8607(ClientPacket.field3436, serverConnection.field1046);
      var3.packet.writeByte(var0.length() + 1);
      var3.packet.writeString(var0);
      serverConnection.method2148(var3);
   }

   static final int method1193(int var0) {
      return Math.min(Math.max(var0, 128), 383);
   }

   static final int method307(int var0) {
      return Math.abs(var0 - class456.field4751) > 1024 ? 2048 * (var0 < class456.field4751 ? 1 : -1) + var0 : var0;
   }

   static final void method1765(int var0, int var1, int var2) {
      if (class172.field1822 < var0) {
         class172.field1822 += field1671 + (var0 - class172.field1822) * class55.field397 / 1000;
         if (class172.field1822 > var0) {
            class172.field1822 = var0;
         }
      }

      if (class172.field1822 > var0) {
         class172.field1822 -= field1671 + class55.field397 * (class172.field1822 - var0) / 1000;
         if (class172.field1822 < var0) {
            class172.field1822 = var0;
         }
      }

      if (class372.field4350 < var1) {
         class372.field4350 += field1671 + class55.field397 * (var1 - class372.field4350) / 1000;
         if (class372.field4350 > var1) {
            class372.field4350 = var1;
         }
      }

      if (class372.field4350 > var1) {
         class372.field4350 -= field1671 + (class372.field4350 - var1) * class55.field397 / 1000;
         if (class372.field4350 < var1) {
            class372.field4350 = var1;
         }
      }

      if (class50.field362 < var2) {
         class50.field362 += field1671 + (var2 - class50.field362) * class55.field397 / 1000;
         if (class50.field362 > var2) {
            class50.field362 = var2;
         }
      }

      if (class50.field362 > var2) {
         class50.field362 -= (class50.field362 - var2) * class55.field397 / 1000 + field1671;
         if (class50.field362 < var2) {
            class50.field362 = var2;
         }
      }

   }

   static final void method3795(int var0, int var1) {
      if (var0 < 128) {
         var0 = 128;
      } else if (var0 > 383) {
         var0 = 383;
      }

      if (class15.field74 < var0) {
         class15.field74 += class172.field1823 * (var0 - class15.field74) / 1000 + class4.field24;
         if (class15.field74 > var0) {
            class15.field74 = var0;
         }
      } else if (class15.field74 > var0) {
         class15.field74 -= class4.field24 + (class15.field74 - var0) * class172.field1823 / 1000;
         if (class15.field74 < var0) {
            class15.field74 = var0;
         }
      }

      var1 &= 2047;
      int var3 = var1 - class456.field4751;
      if (var3 > 1024) {
         var3 -= 2048;
      } else if (var3 < -1024) {
         var3 += 2048;
      }

      if (var3 > 0) {
         class456.field4751 += var3 * class172.field1823 / 1000 + class4.field24;
         class456.field4751 &= 2047;
      } else if (var3 < 0) {
         class456.field4751 -= class4.field24 + -var3 * class172.field1823 / 1000;
         class456.field4751 &= 2047;
      }

      int var4 = var1 - class456.field4751;
      if (var4 > 1024) {
         var4 -= 2048;
      } else if (var4 < -1024) {
         var4 += 2048;
      }

      if (var4 < 0 && var3 > 0 || var4 > 0 && var3 < 0) {
         class456.field4751 = var1;
      }

   }

   static final void method425() {
      int var1 = class116.field1116;
      int[] var2 = class116.field1120;

      for(int var3 = 0; var3 < var1; ++var3) {
         class84 var4 = field1527[var2[var3]];
         if (var4 != null) {
            method589(var4, 1);
         }
      }

   }

   static final void method2494() {
      for(int var1 = 0; var1 < field1565; ++var1) {
         int var2 = field1491[var1];
         class86 var3 = field1489[var2];
         if (var3 != null) {
            method589(var3, var3.field776.field2049);
         }
      }

   }

   static final void method589(class102 var0, int var1) {
      int var3;
      int var4;
      int var5;
      class215 var12;
      if (var0.field964 >= field1445) {
         var3 = Math.max(1, var0.field964 - field1445);
         var4 = var0.field992 * 128 + var0.field981 * 64;
         var5 = var0.field994 * 128 + var0.field981 * 64;
         var0.field949 += (var4 - var0.field949) / var3;
         var0.field963 += (var5 - var0.field963) / var3;
         var0.field1014 = 0;
         var0.field1007 = var0.field990;
      } else if (var0.field997 >= field1445) {
         method3573(var0);
      } else {
         var0.field1013 = var0.field989;
         if (var0.field1010 == 0) {
            var0.field1014 = 0;
         } else {
            label451: {
               if (-1 != var0.field968 && 0 == var0.field988) {
                  var12 = class215.method2582(var0.field968);
                  if (var0.field1015 > 0 && 0 == var12.field2351) {
                     ++var0.field1014;
                     break label451;
                  }

                  if (var0.field1015 <= 0 && 0 == var12.field2356) {
                     ++var0.field1014;
                     break label451;
                  }
               }

               var3 = var0.field949;
               var4 = var0.field963;
               var5 = var0.field981 * 64 + 128 * var0.field945[var0.field1010 - 1];
               int var6 = var0.field981 * 64 + var0.field1012[var0.field1010 - 1] * 128;
               if (var3 < var5) {
                  if (var4 < var6) {
                     var0.field1007 = 1280;
                  } else if (var4 > var6) {
                     var0.field1007 = 1792;
                  } else {
                     var0.field1007 = 1536;
                  }
               } else if (var3 > var5) {
                  if (var4 < var6) {
                     var0.field1007 = 768;
                  } else if (var4 > var6) {
                     var0.field1007 = 256;
                  } else {
                     var0.field1007 = 512;
                  }
               } else if (var4 < var6) {
                  var0.field1007 = 1024;
               } else if (var4 > var6) {
                  var0.field1007 = 0;
               }

               class223 var7 = var0.field998[var0.field1010 - 1];
               if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
                  int var8 = var0.field1007 - var0.field942 & 2047;
                  if (var8 > 1024) {
                     var8 -= 2048;
                  }

                  int var9 = var0.field1004;
                  if (var8 >= -256 && var8 <= 256) {
                     var9 = var0.field993;
                  } else if (var8 >= 256 && var8 < 768) {
                     var9 = var0.field984;
                  } else if (var8 >= -768 && var8 <= -256) {
                     var9 = var0.field1001;
                  }

                  if (var9 == -1) {
                     var9 = var0.field993;
                  }

                  var0.field1013 = var9;
                  int var10 = 4;
                  boolean var11 = true;
                  if (var0 instanceof class86) {
                     var11 = ((class86)var0).field776.field2084;
                  }

                  if (var11) {
                     if (var0.field1007 != var0.field942 && var0.field975 == -1 && 0 != var0.field1009) {
                        var10 = 2;
                     }

                     if (var0.field1010 > 2) {
                        var10 = 6;
                     }

                     if (var0.field1010 > 3) {
                        var10 = 8;
                     }

                     if (var0.field1014 > 0 && var0.field1010 > 1) {
                        var10 = 8;
                        --var0.field1014;
                     }
                  } else {
                     if (var0.field1010 > 1) {
                        var10 = 6;
                     }

                     if (var0.field1010 > 2) {
                        var10 = 8;
                     }

                     if (var0.field1014 > 0 && var0.field1010 > 1) {
                        var10 = 8;
                        --var0.field1014;
                     }
                  }

                  if (class223.field2450 == var7) {
                     var10 <<= 1;
                  } else if (class223.field2451 == var7) {
                     var10 >>= 1;
                  }

                  if (var10 >= 8) {
                     if (var0.field993 == var0.field1013 && -1 != var0.field953) {
                        var0.field1013 = var0.field953;
                     } else if (var0.field1004 == var0.field1013 && -1 != var0.field952) {
                        var0.field1013 = var0.field952;
                     } else if (var0.field1013 == var0.field1001 && var0.field955 != -1) {
                        var0.field1013 = var0.field955;
                     } else if (var0.field984 == var0.field1013 && var0.field956 != -1) {
                        var0.field1013 = var0.field956;
                     }
                  } else if (var10 <= 2) {
                     if (var0.field1013 == var0.field993 && var0.field969 != -1) {
                        var0.field1013 = var0.field969;
                     } else if (var0.field1013 == var0.field1004 && var0.field958 != -1) {
                        var0.field1013 = var0.field958;
                     } else if (var0.field1001 == var0.field1013 && -1 != var0.field959) {
                        var0.field1013 = var0.field959;
                     } else if (var0.field984 == var0.field1013 && var0.field960 != -1) {
                        var0.field1013 = var0.field960;
                     }
                  }

                  if (var5 != var3 || var4 != var6) {
                     if (var3 < var5) {
                        var0.field949 += var10;
                        if (var0.field949 > var5) {
                           var0.field949 = var5;
                        }
                     } else if (var3 > var5) {
                        var0.field949 -= var10;
                        if (var0.field949 < var5) {
                           var0.field949 = var5;
                        }
                     }

                     if (var4 < var6) {
                        var0.field963 += var10;
                        if (var0.field963 > var6) {
                           var0.field963 = var6;
                        }
                     } else if (var4 > var6) {
                        var0.field963 -= var10;
                        if (var0.field963 < var6) {
                           var0.field963 = var6;
                        }
                     }
                  }

                  if (var0.field949 == var5 && var0.field963 == var6) {
                     --var0.field1010;
                     if (var0.field1015 > 0) {
                        --var0.field1015;
                     }
                  }
               } else {
                  var0.field949 = var5;
                  var0.field963 = var6;
                  --var0.field1010;
                  if (var0.field1015 > 0) {
                     --var0.field1015;
                  }
               }
            }
         }
      }

      if (var0.field949 < 128 || var0.field963 < 128 || var0.field949 >= 13184 || var0.field963 >= 13184) {
         var0.field968 = -1;
         var0.field964 = 0;
         var0.field997 = 0;
         var0.method2090();
         var0.field949 = 128 * var0.field945[0] + var0.field981 * 64;
         var0.field963 = var0.field981 * 64 + var0.field1012[0] * 128;
         var0.method2081();
      }

      if (var0 == class146.field1362 && (var0.field949 < 1536 || var0.field963 < 1536 || var0.field949 >= 11776 || var0.field963 >= 11776)) {
         var0.field968 = -1;
         var0.field964 = 0;
         var0.field997 = 0;
         var0.method2090();
         var0.field949 = var0.field945[0] * 128 + var0.field981 * 64;
         var0.field963 = var0.field981 * 64 + 128 * var0.field1012[0];
         var0.method2081();
      }

      class365.method6639(var0);
      var0.field974 = false;
      if (var0.field1013 != -1) {
         var12 = class215.method2582(var0.field1013);
         if (null != var12) {
            if (!var12.method4058() && var12.field2336 != null) {
               ++var0.field983;
               if (var0.field1011 < var12.field2336.length && var0.field983 > var12.field2344[var0.field1011]) {
                  var0.field983 = 1;
                  ++var0.field1011;
                  method7426(var12, var0.field1011, var0.field949, var0.field963);
               }

               if (var0.field1011 >= var12.field2336.length) {
                  if (var12.field2355 > 0) {
                     var0.field1011 -= var12.field2355;
                     if (var12.field2357) {
                        ++var0.field951;
                     }

                     if (var0.field1011 < 0 || var0.field1011 >= var12.field2336.length || var12.field2357 && var0.field951 >= var12.field2353) {
                        var0.field983 = 0;
                        var0.field1011 = 0;
                        var0.field951 = 0;
                     }
                  } else {
                     var0.field983 = 0;
                     var0.field1011 = 0;
                  }

                  method7426(var12, var0.field1011, var0.field949, var0.field963);
               }
            } else if (var12.method4058()) {
               ++var0.field1011;
               var4 = var12.method4059();
               if (var0.field1011 < var4) {
                  method366(var12, var0.field1011, var0.field949, var0.field963);
               } else {
                  if (var12.field2355 > 0) {
                     var0.field1011 -= var12.field2355;
                     if (var12.field2357) {
                        ++var0.field951;
                     }

                     if (var0.field1011 < 0 || var0.field1011 >= var4 || var12.field2357 && var0.field951 >= var12.field2353) {
                        var0.field1011 = 0;
                        var0.field983 = 0;
                        var0.field951 = 0;
                     }
                  } else {
                     var0.field983 = 0;
                     var0.field1011 = 0;
                  }

                  method366(var12, var0.field1011, var0.field949, var0.field963);
               }
            } else {
               var0.field1013 = -1;
            }
         } else {
            var0.field1013 = -1;
         }
      }

      class491 var13 = new class491(var0.method2069());

      for(class521 var14 = (class521)var13.method8449(); var14 != null; var14 = (class521)var13.next()) {
         if (var14.field5136 != -1 && field1445 >= var14.field5132) {
            var5 = class205.method3634(var14.field5136).field2204;
            if (var5 == -1) {
               var14.method8116();
               --var0.field991;
            } else {
               var14.field5135 = Math.max(var14.field5135, 0);
               class215 var16 = class215.method2582(var5);
               if (null != var16.field2336 && !var16.method4058()) {
                  ++var14.field5134;
                  if (var14.field5135 < var16.field2336.length && var14.field5134 > var16.field2344[var14.field5135]) {
                     var14.field5134 = 1;
                     ++var14.field5135;
                     method7426(var16, var14.field5135, var0.field949, var0.field963);
                  }

                  if (var14.field5135 >= var16.field2336.length) {
                     var14.method8116();
                     --var0.field991;
                  }
               } else if (var16.method4058()) {
                  ++var14.field5135;
                  int var17 = var16.method4059();
                  if (var14.field5135 < var17) {
                     method366(var16, var14.field5135, var0.field949, var0.field963);
                  } else {
                     var14.method8116();
                     --var0.field991;
                  }
               } else {
                  var14.method8116();
                  --var0.field991;
               }
            }
         }
      }

      class215 var15;
      if (var0.field968 != -1 && var0.field988 <= 1) {
         var15 = class215.method2582(var0.field968);
         if (1 == var15.field2351 && var0.field1015 > 0 && var0.field964 <= field1445 && var0.field997 < field1445) {
            var0.field988 = 1;
            return;
         }
      }

      if (-1 != var0.field968 && var0.field988 == 0) {
         var15 = class215.method2582(var0.field968);
         if (null == var15) {
            var0.field968 = -1;
         } else if (!var15.method4058() && null != var15.field2336) {
            ++var0.field987;
            if (var0.field986 < var15.field2336.length && var0.field987 > var15.field2344[var0.field986]) {
               var0.field987 = 1;
               ++var0.field986;
               method7426(var15, var0.field986, var0.field949, var0.field963);
            }

            if (var0.field986 >= var15.field2336.length) {
               var0.field986 -= var15.field2355;
               ++var0.field957;
               if (var0.field957 >= var15.field2353) {
                  var0.field968 = -1;
               } else if (var0.field986 >= 0 && var0.field986 < var15.field2336.length) {
                  method7426(var15, var0.field986, var0.field949, var0.field963);
               } else {
                  var0.field968 = -1;
               }
            }

            var0.field974 = var15.field2349;
         } else if (var15.method4058()) {
            ++var0.field986;
            var5 = var15.method4059();
            if (var0.field986 < var5) {
               method366(var15, var0.field986, var0.field949, var0.field963);
            } else {
               var0.field986 -= var15.field2355;
               ++var0.field957;
               if (var0.field957 >= var15.field2353) {
                  var0.field968 = -1;
               } else if (var0.field986 >= 0 && var0.field986 < var5) {
                  method366(var15, var0.field986, var0.field949, var0.field963);
               } else {
                  var0.field968 = -1;
               }
            }
         } else {
            var0.field968 = -1;
         }
      }

      if (var0.field988 > 0) {
         --var0.field988;
      }

   }

   static final void method3573(class102 var0) {
      boolean var2 = field1445 == var0.field997 || var0.field968 == -1 || 0 != var0.field988;
      if (!var2) {
         class215 var3 = class215.method2582(var0.field968);
         if (var3 != null && !var3.method4058()) {
            var2 = 1 + var0.field987 > var3.field2344[var0.field986];
         } else {
            var2 = true;
         }
      }

      if (var2) {
         int var9 = var0.field997 - var0.field964;
         int var4 = field1445 - var0.field964;
         int var5 = var0.field981 * 64 + var0.field992 * 128;
         int var6 = var0.field981 * 64 + var0.field994 * 128;
         int var7 = var0.field954 * 128 + var0.field981 * 64;
         int var8 = var0.field982 * 128 + var0.field981 * 64;
         var0.field949 = (var4 * var7 + (var9 - var4) * var5) / var9;
         var0.field963 = (var6 * (var9 - var4) + var8 * var4) / var9;
      }

      var0.field1014 = 0;
      var0.field1007 = var0.field990;
      var0.field942 = var0.field1007;
   }

   static int method5791() {
      return isResizable ? 2 : 1;
   }

   static void method7275() {
      class308 var1 = class308.method8607(ClientPacket.field3389, serverConnection.field1046);
      var1.packet.writeByte(method5791());
      var1.packet.writeShort(class343.field3838);
      var1.packet.writeShort(class488.field4948);
      serverConnection.method2148(var1);
   }

   static final void method2100(String var0, boolean var1) {
      if (field1496) {
         byte var3 = 4;
         int var4 = var3 + 6;
         int var5 = var3 + 6;
         int var6 = class112.field1079.method7263(var0, 250);
         int var7 = class112.field1079.method7160(var0, 250) * 13;
         class535.method9231(var4 - var3, var5 - var3, var6 + var3 + var3, var7 + var3 + var3, 0);
         class535.method9223(var4 - var3, var5 - var3, var3 + var6 + var3, var3 + var3 + var7, 16777215);
         class112.field1079.method7238(var0, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
         method4202(var4 - var3, var5 - var3, var3 + var6 + var3, var3 + var3 + var7);
         if (var1) {
            class159.field1749.method9186(0, 0);
         } else {
            for(int var12 = 0; var12 < field1648; ++var12) {
               if (field1655[var12] + field1581[var12] > var4 && field1581[var12] < var4 + var6 && field1656[var12] + field1654[var12] > var5 && field1654[var12] < var7 + var5) {
                  field1651[var12] = true;
               }
            }
         }

      }
   }

   static final void method428(int var0, int var1, int var2, int var3) {
      ++field1545;
      if (field1513 == class146.field1362.field949 >> 7 && class146.field1362.field963 >> 7 == field1680) {
         field1513 = 0;
      }

      method1767();
      method2002();
      method8539(true);
      int var5 = class116.field1116;
      int[] var6 = class116.field1120;

      int var7;
      for(var7 = 0; var7 < var5; ++var7) {
         if (var6[var7] != field1567 && var6[var7] != localPlayerIndex) {
            class348.method6499(field1527[var6[var7]], true);
         }
      }

      method8539(false);
      method7028();
      method2557();
      method843(var0, var1, var2, var3, true);
      var0 = field1705;
      var1 = field1541;
      var2 = field1456;
      var3 = field1714;
      class535.method9304(var0, var1, var2 + var0, var1 + var3);
      class229.method4291();
      class535.method9244();
      var5 = field1649;
      if (field1532 / 256 > var5) {
         var5 = field1532 / 256;
      }

      if (field1534[4] && field1700[4] + 128 > var5) {
         var5 = field1700[4] + 128;
      }

      int var18 = field1569 & 2047;
      class32.method497(class468.field4805, class98.field916, class44.field302, var5, var18, method7580(var5), var3);
      int var8;
      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      int var16;
      if (!field1689) {
         if (class141.clientPreferences.method1613()) {
            var8 = class44.field306;
         } else {
            label286: {
               var9 = 3;
               if (class15.field74 < 310) {
                  if (field1521 == 1) {
                     var10 = class468.field4805 >> 7;
                     var11 = class44.field302 >> 7;
                  } else {
                     var10 = class146.field1362.field949 >> 7;
                     var11 = class146.field1362.field963 >> 7;
                  }

                  var12 = class172.field1822 >> 7;
                  var13 = class50.field362 >> 7;
                  if (var12 < 0 || var13 < 0 || var12 >= 104 || var13 >= 104) {
                     var8 = class44.field306;
                     break label286;
                  }

                  if (var10 < 0 || var11 < 0 || var10 >= 104 || var11 >= 104) {
                     var8 = class44.field306;
                     break label286;
                  }

                  if ((class88.field804[class44.field306][var12][var13] & 4) != 0) {
                     var9 = class44.field306;
                  }

                  if (var10 > var12) {
                     var14 = var10 - var12;
                  } else {
                     var14 = var12 - var10;
                  }

                  if (var11 > var13) {
                     var15 = var11 - var13;
                  } else {
                     var15 = var13 - var11;
                  }

                  int var17;
                  if (var14 > var15) {
                     var16 = var15 * 65536 / var14;
                     var17 = 32768;

                     while(var10 != var12) {
                        if (var12 < var10) {
                           ++var12;
                        } else if (var12 > var10) {
                           --var12;
                        }

                        if ((class88.field804[class44.field306][var12][var13] & 4) != 0) {
                           var9 = class44.field306;
                        }

                        var17 += var16;
                        if (var17 >= 65536) {
                           var17 -= 65536;
                           if (var13 < var11) {
                              ++var13;
                           } else if (var13 > var11) {
                              --var13;
                           }

                           if (0 != (class88.field804[class44.field306][var12][var13] & 4)) {
                              var9 = class44.field306;
                           }
                        }
                     }
                  } else if (var15 > 0) {
                     var16 = var14 * 65536 / var15;
                     var17 = 32768;

                     while(var11 != var13) {
                        if (var13 < var11) {
                           ++var13;
                        } else if (var13 > var11) {
                           --var13;
                        }

                        if (0 != (class88.field804[class44.field306][var12][var13] & 4)) {
                           var9 = class44.field306;
                        }

                        var17 += var16;
                        if (var17 >= 65536) {
                           var17 -= 65536;
                           if (var12 < var10) {
                              ++var12;
                           } else if (var12 > var10) {
                              --var12;
                           }

                           if (0 != (class88.field804[class44.field306][var12][var13] & 4)) {
                              var9 = class44.field306;
                           }
                        }
                     }
                  }
               }

               if (class146.field1362.field949 >= 0 && class146.field1362.field963 >= 0 && class146.field1362.field949 < 13312 && class146.field1362.field963 < 13312) {
                  if ((class88.field804[class44.field306][class146.field1362.field949 >> 7][class146.field1362.field963 >> 7] & 4) != 0) {
                     var9 = class44.field306;
                  }

                  var8 = var9;
               } else {
                  var8 = class44.field306;
               }
            }
         }

         var7 = var8;
      } else {
         if (class141.clientPreferences.method1613()) {
            var8 = class44.field306;
         } else {
            var9 = method5733(class172.field1822, class50.field362, class44.field306);
            if (var9 - class372.field4350 < 800 && (class88.field804[class44.field306][class172.field1822 >> 7][class50.field362 >> 7] & 4) != 0) {
               var8 = class44.field306;
            } else {
               var8 = 3;
            }
         }

         var7 = var8;
      }

      var8 = class172.field1822;
      var9 = class372.field4350;
      var10 = class50.field362;
      var11 = class15.field74;
      var12 = class456.field4751;

      for(var13 = 0; var13 < 5; ++var13) {
         if (field1534[var13]) {
            var14 = (int)(Math.random() * (double)(1 + field1699[var13] * 2) - (double)field1699[var13] + Math.sin((double)field1701[var13] / 100.0 * (double)field1687[var13]) * (double)field1700[var13]);
            if (var13 == 0) {
               class172.field1822 += var14;
            }

            if (var13 == 1) {
               class372.field4350 += var14;
            }

            if (var13 == 2) {
               class50.field362 += var14;
            }

            if (var13 == 3) {
               class456.field4751 = var14 + class456.field4751 & 2047;
            }

            if (var13 == 4) {
               class15.field74 += var14;
               if (class15.field74 < 128) {
                  class15.field74 = 128;
               }

               if (class15.field74 > 383) {
                  class15.field74 = 383;
               }
            }
         }
      }

      var13 = class41.field249;
      var14 = class41.field250;
      if (0 != class41.field256) {
         var13 = class41.field257;
         var14 = class41.field258;
      }

      if (var13 >= var0 && var13 < var0 + var2 && var14 >= var1 && var14 < var1 + var3) {
         var15 = var13 - var0;
         var16 = var14 - var1;
         class252.field2836 = var15;
         class252.field2837 = var16;
         class252.field2842 = true;
         class252.field2838 = 0;
         class252.field2835 = false;
      } else {
         class252.field2842 = false;
         class252.field2838 = 0;
      }

      method2290();
      class535.method9231(var0, var1, var2, var3, 0);
      method2290();
      var15 = class229.method4288();
      class229.method4277(class124.field1180.field277);
      class229.field2513.field2814 = field1715;
      class109.field1065.method4448(class172.field1822, class372.field4350, class50.field362, class15.field74, class456.field4751, var7);
      class229.method4277(false);
      if (field1672) {
         class535.method9245();
      }

      class229.field2513.field2814 = var15;
      method2290();
      class109.field1065.method4419();
      method2327(var0, var1, var2, var3);
      if (2 == field1452) {
         method1033(field1458 + (field1455 - class342.field3837 << 7), (field1523 - class144.field1352 << 7) + field1459, field1457 * 2);
         if (field1546 > -1 && field1445 % 20 < 10) {
            class357.field3957[0].method9139(var0 + field1546 - 12, var1 + field1665 - 28);
         }
      }

      ((class236)class229.field2513.field2815).method4592(field1618);
      method7789();
      class172.field1822 = var8;
      class372.field4350 = var9;
      class50.field362 = var10;
      class15.field74 = var11;
      class456.field4751 = var12;
      if (field1598 && Js5NetQueue.field1356.method6539(true, false) == 0) {
         field1598 = false;
      }

      if (field1598) {
         class535.method9231(var0, var1, var2, var3, 0);
         method2100(class364.field4024, false);
      }

   }

   static final void method843(int var0, int var1, int var2, int var3, boolean var4) {
      if (var2 < 1) {
         var2 = 1;
      }

      if (var3 < 1) {
         var3 = 1;
      }

      int var6 = var3 - 334;
      int var7;
      if (var6 < 0) {
         var7 = field1703;
      } else if (var6 >= 100) {
         var7 = field1693;
      } else {
         var7 = (field1693 - field1703) * var6 / 100 + field1703;
      }

      int var8 = 512 * var7 * var3 / (var2 * 334);
      int var9;
      int var10;
      short var11;
      if (var8 < field1675) {
         var11 = field1675;
         var7 = var11 * var2 * 334 / (var3 * 512);
         if (var7 > field1508) {
            var7 = field1508;
            var9 = 512 * var3 * var7 / (var11 * 334);
            var10 = (var2 - var9) / 2;
            if (var4) {
               class535.method9222();
               class535.method9231(var0, var1, var10, var3, -16777216);
               class535.method9231(var2 + var0 - var10, var1, var10, var3, -16777216);
            }

            var0 += var10;
            var2 -= var10 * 2;
         }
      } else if (var8 > field1710) {
         var11 = field1710;
         var7 = var11 * var2 * 334 / (var3 * 512);
         if (var7 < field1707) {
            var7 = field1707;
            var9 = var2 * var11 * 334 / (var7 * 512);
            var10 = (var3 - var9) / 2;
            if (var4) {
               class535.method9222();
               class535.method9231(var0, var1, var2, var10, -16777216);
               class535.method9231(var0, var1 + var3 - var10, var2, var10, -16777216);
            }

            var1 += var10;
            var3 -= var10 * 2;
         }
      }

      field1715 = var7 * var3 / 334;
      if (var2 != field1456 || var3 != field1714) {
         method7540(var2, var3);
      }

      field1705 = var0;
      field1541 = var1;
      field1456 = var2;
      field1714 = var3;
   }

   static void method1767() {
      if (field1682) {
         class348.method6499(class146.field1362, false);
      }

   }

   static void method2002() {
      if (field1567 >= 0 && field1527[field1567] != null) {
         class348.method6499(field1527[field1567], false);
      }

   }

   static final void method8539(boolean var0) {
      for(int var2 = 0; var2 < field1565; ++var2) {
         class86 var3 = field1489[field1491[var2]];
         if (null != var3 && var3.method2065() && var0 == var3.field776.field2059 && var3.field776.method3626()) {
            int var4 = var3.field949 >> 7;
            int var5 = var3.field963 >> 7;
            if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
               if (var3.field981 == 1 && (var3.field949 & 127) == 64 && 64 == (var3.field963 & 127)) {
                  if (field1544[var4][var5] == field1545) {
                     continue;
                  }

                  field1544[var4][var5] = field1545;
               }

               long var6 = class252.method7702(0, 0, 1, !var3.field776.field2082, field1491[var2]);
               var3.field985 = field1445;
               class109.field1065.method4452(class44.field306, var3.field949, var3.field963, method5733(var3.field981 * 64 - 64 + var3.field949, var3.field963 + (var3.field981 * 64 - 64), class44.field306), 60 + (var3.field981 * 64 - 64), var3, var3.field942, var6, var3.field974);
            }
         }
      }

   }

   static final void method7028() {
      for(class74 var1 = (class74)field1439.method6706(); var1 != null; var1 = (class74)field1439.method6687()) {
         if (class44.field306 == var1.field598 && field1445 <= var1.field600) {
            if (field1445 >= var1.field599) {
               if (var1.field603 > 0) {
                  class86 var2 = field1489[var1.field603 - 1];
                  if (var2 != null && var2.field949 >= 0 && var2.field949 < 13312 && var2.field963 >= 0 && var2.field963 < 13312) {
                     var1.method1518(var2.field949, var2.field963, method5733(var2.field949, var2.field963, var1.field598) - var1.field616, field1445);
                  }
               }

               if (var1.field603 < 0) {
                  int var3 = -var1.field603 - 1;
                  class84 var4;
                  if (var3 == localPlayerIndex) {
                     var4 = class146.field1362;
                  } else {
                     var4 = field1527[var3];
                  }

                  if (var4 != null && var4.field949 >= 0 && var4.field949 < 13312 && var4.field963 >= 0 && var4.field963 < 13312) {
                     var1.method1518(var4.field949, var4.field963, method5733(var4.field949, var4.field963, var1.field598) - var1.field616, field1445);
                  }
               }

               var1.method1519(field1618);
               class109.field1065.method4452(class44.field306, (int)var1.field605, (int)var1.field606, (int)var1.field615, 60, var1, var1.field597, -1L, false);
            }
         } else {
            var1.method8116();
         }
      }

   }

   static final void method2557() {
      for(class64 var1 = (class64)field1571.method6706(); null != var1; var1 = (class64)field1571.method6687()) {
         if (var1.field503 == class44.field306 && !var1.field510) {
            if (field1445 >= var1.field508) {
               var1.method1384(field1618);
               if (var1.field510) {
                  var1.method8116();
               } else {
                  class109.field1065.method4452(var1.field503, var1.field504, var1.field505, var1.field506, 60, var1, 0, -1L, false);
               }
            }
         } else {
            var1.method8116();
         }
      }

   }

   public static class368 method5754() {
      return field1643;
   }

   static void method7793() {
      for(class233 var1 = (class233)field1726.method6706(); null != var1; var1 = (class233)field1726.method6687()) {
         var1.method8116();
      }

   }

   static void method2153(class233 var0) {
      if (null != var0 && var0.field2543 != null) {
         if (var0.field2543.field3607 >= 0) {
            Component var2 = Component.getComponent(var0.field2543.field3625);
            if (var2 == null || var2.field3743 == null || 0 == var2.field3743.length || var0.field2543.field3607 >= var2.field3743.length || var2.field3743[var0.field2543.field3607] != var0.field2543) {
               return;
            }
         }

         if (var0.field2543.field3608 == 11 && var0.field2540 == 0) {
            if (var0.field2543.method6261(var0.field2541, var0.field2542, 0, 0)) {
               switch (var0.field2543.method6235()) {
                  case 0:
                     class45.method1843(var0.field2543.method6237(), true, false);
                     break;
                  case 1:
                     int var3 = method2338(var0.field2543);
                     boolean var7 = 0 != (var3 >> 22 & 1);
                     if (var7) {
                        int[] var4 = var0.field2543.method6334();
                        if (var4 != null) {
                           class308 var5 = class308.method8607(ClientPacket.field3453, serverConnection.field1046);
                           var5.packet.writeShortLEAdd(var0.field2543.field3607);
                           var5.packet.writeIntME(var4[1]);
                           var5.packet.writeIntIME(var0.field2543.method6210());
                           var5.packet.writeIntLE(var4[2]);
                           var5.packet.writeIntLE(var4[0]);
                           var5.packet.writeIntIME(var0.field2543.field3606);
                           serverConnection.method2148(var5);
                        }
                     }
               }
            }
         } else if (12 == var0.field2543.field3608) {
            class327 var6 = var0.field2543.method6277();
            if (null != var6 && var6.method5954()) {
               switch (var0.field2540) {
                  case 0:
                     field1528.method4393(var0.field2543);
                     var6.method5902(true);
                     var6.method6169(var0.field2541, var0.field2542, field1666.method4103(82), field1666.method4103(81));
                     break;
                  case 1:
                     var6.method5942(var0.field2541, var0.field2542);
               }
            }
         }

      }
   }

   static boolean method4673() {
      return (field1560 & 1) != 0;
   }

   static boolean method6951() {
      return (field1560 & 2) != 0;
   }

   static boolean method1171(class84 var0) {
      if (0 == field1560) {
         return false;
      } else {
         boolean var2;
         if (class146.field1362 != var0) {
            var2 = (field1560 & 4) != 0;
            return var2 || method4673() && var0.method1779() || method6951() && var0.method1790();
         } else {
            var2 = 0 != (field1560 & 8);
            return var2;
         }
      }
   }

   static final void method5652(class102 var0, int var1, int var2, int var3, int var4, int var5) {
      if (null != var0 && var0.method2065()) {
         if (var0 instanceof class86) {
            class191 var7 = ((class86)var0).field776;
            if (var7.field2066 != null) {
               var7 = var7.method3652();
            }

            if (var7 == null) {
               return;
            }
         }

         int var76 = class116.field1116;
         int[] var8 = class116.field1120;
         boolean var9 = var1 < var76;
         int var10 = -2;
         if (var0.field971 != null && (!var9 || !var0.field950 && (4 == field1661 || !var0.field962 && (field1661 == 0 || field1661 == 3 || 1 == field1661 && ((class84)var0).method1779())))) {
            method2467(var0, var0.field1000);
            if (field1546 > -1 && field1447 < field1531) {
               field1638[field1447] = class316.field3504.method7225(var0.field971) / 2;
               field1537[field1447] = class316.field3504.field4527;
               field1667[field1447] = field1546;
               field1562[field1447] = field1665 - var10;
               field1539[field1447] = var0.field965;
               field1599[field1447] = var0.field966;
               field1495[field1447] = var0.field940;
               field1554[field1447] = var0.field947;
               field1543[field1447] = var0.field971;
               ++field1447;
               var10 += 12;
            }
         }

         int var16;
         int var23;
         int var24;
         if (!var0.field946.method6851()) {
            method2467(var0, var0.field1000 + 15);

            for(class100 var11 = (class100)var0.field946.method6847(); null != var11; var11 = (class100)var0.field946.method6849()) {
               class94 var12 = var11.method2047(field1445);
               if (var12 == null) {
                  if (var11.method2048()) {
                     var11.method8116();
                  }
               } else {
                  class183 var13 = var11.field925;
                  class523 var14 = var13.method3441();
                  class523 var15 = var13.method3446();
                  int var17 = 0;
                  if (null != var14 && null != var15) {
                     if (var13.field1901 * 2 < var15.field5148) {
                        var17 = var13.field1901;
                     }

                     var16 = var15.field5148 - var17 * 2;
                  } else {
                     var16 = var13.field1897;
                  }

                  int var18 = 255;
                  boolean var19 = true;
                  int var20 = field1445 - var12.field864;
                  int var21 = var12.field863 * var16 / var13.field1897;
                  int var22;
                  int var91;
                  if (var12.field861 > var20) {
                     var22 = var13.field1887 == 0 ? 0 : var13.field1887 * (var20 / var13.field1887);
                     var23 = var12.field862 * var16 / var13.field1897;
                     var91 = var23 + var22 * (var21 - var23) / var12.field861;
                  } else {
                     var91 = var21;
                     var22 = var12.field861 + var13.field1895 - var20;
                     if (var13.field1898 >= 0) {
                        var18 = (var22 << 8) / (var13.field1895 - var13.field1898);
                     }
                  }

                  if (var12.field863 > 0 && var91 < 1) {
                     var91 = 1;
                  }

                  if (var14 != null && null != var15) {
                     if (var16 == var91) {
                        var91 += var17 * 2;
                     } else {
                        var91 += var17;
                     }

                     var22 = var14.field5153;
                     var10 += var22;
                     var23 = field1546 + var2 - (var16 >> 1);
                     var24 = var3 + field1665 - var10;
                     var23 -= var17;
                     if (var18 >= 0 && var18 < 255) {
                        var14.method9041(var23, var24, var18);
                        class535.method9224(var23, var24, var23 + var91, var24 + var22);
                        var15.method9041(var23, var24, var18);
                     } else {
                        var14.method9139(var23, var24);
                        class535.method9224(var23, var24, var23 + var91, var24 + var22);
                        var15.method9139(var23, var24);
                     }

                     class535.method9304(var2, var3, var2 + var4, var3 + var5);
                     var10 += 2;
                  } else {
                     var10 += 5;
                     if (field1546 > -1) {
                        var22 = var2 + field1546 - (var16 >> 1);
                        var23 = field1665 + var3 - var10;
                        class535.method9231(var22, var23, var91, 5, 65280);
                        class535.method9231(var91 + var22, var23, var16 - var91, 5, 16711680);
                     }

                     var10 += 2;
                  }
               }
            }
         }

         if (var10 == -2) {
            var10 += 7;
         }

         class84 var77;
         if (var9 && var0.field985 == field1445 && method1171((class84)var0)) {
            var77 = (class84)var0;
            if (var9) {
               method2467(var0, var0.field1000 + 15);
               class407 var78 = (class407)field1498.get(class475.field4834);
               var10 += 4;
               var78.method7166(var77.field740.method9155(), var2 + field1546, var3 + field1665 - var10, 16777215, 0);
               var10 += 18;
            }
         }

         if (var9) {
            var77 = (class84)var0;
            if (var77.field760) {
               return;
            }

            if (var77.field739 != -1 || -1 != var77.field752) {
               method2467(var0, 15 + var0.field1000);
               if (field1546 > -1) {
                  if (var77.field739 != -1) {
                     var10 += 25;
                     class505.field5067[var77.field739].method9139(var2 + field1546 - 12, field1665 + var3 - var10);
                  }

                  if (-1 != var77.field752) {
                     var10 += 25;
                     class2.field12[var77.field752].method9139(field1546 + var2 - 12, field1665 + var3 - var10);
                  }
               }
            }

            if (var1 >= 0 && 10 == field1452 && field1454 == var8[var1]) {
               method2467(var0, var0.field1000 + 15);
               if (field1546 > -1) {
                  var10 += class357.field3957[1].field5153;
                  class357.field3957[1].method9139(field1546 + var2 - 12, var3 + field1665 - var10);
               }
            }
         } else {
            class86 var79 = (class86)var0;
            int[] var80 = var79.method1850();
            short[] var83 = var79.method1875();
            if (var83 != null && null != var80) {
               for(int var85 = 0; var85 < var83.length; ++var85) {
                  if (var83[var85] >= 0 && var80[var85] >= 0) {
                     long var87 = (long)var80[var85] << 8 | (long)var83[var85];
                     class523 var89 = (class523)field1722.method7645(var87);
                     if (var89 == null) {
                        class523[] var90 = class538.method8028(class379.field4382, var80[var85], 0);
                        if (var90 != null && var83[var85] < var90.length) {
                           var89 = var90[var83[var85]];
                           field1722.method7646(var87, var89);
                        }
                     }

                     if (null != var89) {
                        method2467(var0, 15 + var0.field1000);
                        if (field1546 > -1) {
                           var89.method9139(field1546 + var2 - (var89.field5148 >> 1), field1665 + (var3 - var89.field5153) - 4);
                        }
                     }
                  }
               }
            }

            if (field1452 == 1 && field1612 == field1491[var1 - var76] && field1445 % 20 < 10) {
               method2467(var0, 15 + var0.field1000);
               if (field1546 > -1) {
                  class357.field3957[0].method9139(field1546 + var2 - 12, field1665 + var3 - 28);
               }
            }
         }

         for(int var81 = 0; var81 < 4; ++var81) {
            int var82 = var0.field961[var81];
            int var84 = var0.field943[var81];
            class193 var86 = null;
            int var88 = 0;
            if (var84 >= 0) {
               if (var82 <= field1445) {
                  continue;
               }

               var86 = class193.method3287(var0.field943[var81]);
               var88 = var86.field2112;
               if (null != var86 && null != var86.field2119) {
                  var86 = var86.method3718();
                  if (null == var86) {
                     var0.field961[var81] = -1;
                     continue;
                  }
               }
            } else if (var82 < 0) {
               continue;
            }

            var16 = var0.field972[var81];
            class193 var93 = null;
            if (var16 >= 0) {
               var93 = class193.method3287(var16);
               if (var93 != null && var93.field2119 != null) {
                  var93 = var93.method3718();
               }
            }

            if (var82 - var88 <= field1445) {
               if (var86 == null) {
                  var0.field961[var81] = -1;
               } else {
                  method2467(var0, var0.field1000 / 2);
                  if (field1546 > -1) {
                     boolean var92 = true;
                     if (var81 == 1) {
                        field1665 -= 20;
                     }

                     if (var81 == 2) {
                        field1546 -= 15;
                        field1665 -= 10;
                     }

                     if (var81 == 3) {
                        field1546 += 15;
                        field1665 -= 10;
                     }

                     class523 var96 = null;
                     class523 var94 = null;
                     class523 var95 = null;
                     class523 var97 = null;
                     var23 = 0;
                     var24 = 0;
                     int var25 = 0;
                     int var26 = 0;
                     int var27 = 0;
                     int var28 = 0;
                     int var29 = 0;
                     int var30 = 0;
                     class523 var31 = null;
                     class523 var32 = null;
                     class523 var33 = null;
                     class523 var34 = null;
                     int var35 = 0;
                     int var36 = 0;
                     int var37 = 0;
                     int var38 = 0;
                     int var39 = 0;
                     int var40 = 0;
                     int var41 = 0;
                     int var42 = 0;
                     int var43 = 0;
                     var96 = var86.method3696();
                     int var44;
                     if (var96 != null) {
                        var23 = var96.field5148;
                        var44 = var96.field5153;
                        if (var44 > var43) {
                           var43 = var44;
                        }

                        var27 = var96.field5145;
                     }

                     var94 = var86.method3700();
                     if (null != var94) {
                        var24 = var94.field5148;
                        var44 = var94.field5153;
                        if (var44 > var43) {
                           var43 = var44;
                        }

                        var28 = var94.field5145;
                     }

                     var95 = var86.method3701();
                     if (var95 != null) {
                        var25 = var95.field5148;
                        var44 = var95.field5153;
                        if (var44 > var43) {
                           var43 = var44;
                        }

                        var29 = var95.field5145;
                     }

                     var97 = var86.method3702();
                     if (var97 != null) {
                        var26 = var97.field5148;
                        var44 = var97.field5153;
                        if (var44 > var43) {
                           var43 = var44;
                        }

                        var30 = var97.field5145;
                     }

                     if (null != var93) {
                        var31 = var93.method3696();
                        if (null != var31) {
                           var35 = var31.field5148;
                           var44 = var31.field5153;
                           if (var44 > var43) {
                              var43 = var44;
                           }

                           var39 = var31.field5145;
                        }

                        var32 = var93.method3700();
                        if (var32 != null) {
                           var36 = var32.field5148;
                           var44 = var32.field5153;
                           if (var44 > var43) {
                              var43 = var44;
                           }

                           var40 = var32.field5145;
                        }

                        var33 = var93.method3701();
                        if (var33 != null) {
                           var37 = var33.field5148;
                           var44 = var33.field5153;
                           if (var44 > var43) {
                              var43 = var44;
                           }

                           var41 = var33.field5145;
                        }

                        var34 = var93.method3702();
                        if (var34 != null) {
                           var38 = var34.field5148;
                           var44 = var34.field5153;
                           if (var44 > var43) {
                              var43 = var44;
                           }

                           var42 = var34.field5145;
                        }
                     }

                     class393 var98 = var86.method3729();
                     if (null == var98) {
                        var98 = class185.field1996;
                     }

                     class393 var45;
                     if (var93 != null) {
                        var45 = var93.method3729();
                        if (var45 == null) {
                           var45 = class185.field1996;
                        }
                     } else {
                        var45 = class185.field1996;
                     }

                     String var46 = null;
                     String var47 = null;
                     boolean var48 = false;
                     int var49 = 0;
                     var46 = var86.method3699(var0.field970[var81]);
                     int var99 = var98.method7225(var46);
                     if (null != var93) {
                        var47 = var93.method3699(var0.field973[var81]);
                        var49 = var45.method7225(var47);
                     }

                     int var50 = 0;
                     int var51 = 0;
                     if (var24 > 0) {
                        if (null == var95 && var97 == null) {
                           var50 = 1;
                        } else {
                           var50 = 1 + var99 / var24;
                        }
                     }

                     if (var93 != null && var36 > 0) {
                        if (var33 == null && null == var34) {
                           var51 = 1;
                        } else {
                           var51 = var49 / var36 + 1;
                        }
                     }

                     int var52 = 0;
                     int var53 = var52;
                     if (var23 > 0) {
                        var52 += var23;
                     }

                     var52 += 2;
                     int var54 = var52;
                     if (var25 > 0) {
                        var52 += var25;
                     }

                     int var55 = var52;
                     int var56 = var52;
                     int var57;
                     if (var24 > 0) {
                        var57 = var50 * var24;
                        var52 += var57;
                        var56 += (var57 - var99) / 2;
                     } else {
                        var52 += var99;
                     }

                     var57 = var52;
                     if (var26 > 0) {
                        var52 += var26;
                     }

                     int var58 = 0;
                     int var59 = 0;
                     int var60 = 0;
                     int var61 = 0;
                     int var62 = 0;
                     int var63;
                     if (var93 != null) {
                        var52 += 2;
                        var58 = var52;
                        if (var35 > 0) {
                           var52 += var35;
                        }

                        var52 += 2;
                        var59 = var52;
                        if (var37 > 0) {
                           var52 += var37;
                        }

                        var60 = var52;
                        var62 = var52;
                        if (var36 > 0) {
                           var63 = var36 * var51;
                           var52 += var63;
                           var62 += (var63 - var49) / 2;
                        } else {
                           var52 += var49;
                        }

                        var61 = var52;
                        if (var38 > 0) {
                           var52 += var38;
                        }
                     }

                     var63 = var0.field961[var81] - field1445;
                     int var64 = var86.field2118 - var86.field2118 * var63 / var86.field2112;
                     int var65 = -var86.field2114 + var63 * var86.field2114 / var86.field2112;
                     int var66 = var64 + (var2 + field1546 - (var52 >> 1));
                     int var67 = var65 + (field1665 + var3 - 12);
                     int var68 = var67;
                     int var69 = var67 + var43;
                     int var70 = var86.field2098 + var67 + 15;
                     int var71 = var70 - var98.field4525;
                     int var72 = var70 + var98.field4522;
                     if (var71 < var67) {
                        var68 = var71;
                     }

                     if (var72 > var69) {
                        var69 = var72;
                     }

                     int var73 = 0;
                     int var74;
                     int var75;
                     if (var93 != null) {
                        var73 = var67 + 15 + var93.field2098;
                        var74 = var73 - var45.field4525;
                        var75 = var45.field4522 + var73;
                        if (var74 < var68) {
                           ;
                        }

                        if (var75 > var69) {
                           ;
                        }
                     }

                     var74 = 255;
                     if (var86.field2115 >= 0) {
                        var74 = (var63 << 8) / (var86.field2112 - var86.field2115);
                     }

                     if (var74 >= 0 && var74 < 255) {
                        if (var96 != null) {
                           var96.method9041(var53 + var66 - var27, var67, var74);
                        }

                        if (null != var95) {
                           var95.method9041(var54 + var66 - var29, var67, var74);
                        }

                        if (var94 != null) {
                           for(var75 = 0; var75 < var50; ++var75) {
                              var94.method9041(var75 * var24 + (var55 + var66 - var28), var67, var74);
                           }
                        }

                        if (null != var97) {
                           var97.method9041(var66 + var57 - var30, var67, var74);
                        }

                        var98.method7164(var46, var66 + var56, var70, var86.field2107, 0, var74);
                        if (null != var93) {
                           if (var31 != null) {
                              var31.method9041(var66 + var58 - var39, var67, var74);
                           }

                           if (var33 != null) {
                              var33.method9041(var66 + var59 - var41, var67, var74);
                           }

                           if (null != var32) {
                              for(var75 = 0; var75 < var51; ++var75) {
                                 var32.method9041(var75 * var36 + (var66 + var60 - var40), var67, var74);
                              }
                           }

                           if (var34 != null) {
                              var34.method9041(var66 + var61 - var42, var67, var74);
                           }

                           var45.method7164(var47, var62 + var66, var73, var93.field2107, 0, var74);
                        }
                     } else {
                        if (var96 != null) {
                           var96.method9139(var53 + var66 - var27, var67);
                        }

                        if (null != var95) {
                           var95.method9139(var54 + var66 - var29, var67);
                        }

                        if (var94 != null) {
                           for(var75 = 0; var75 < var50; ++var75) {
                              var94.method9139(var55 + var66 - var28 + var24 * var75, var67);
                           }
                        }

                        if (var97 != null) {
                           var97.method9139(var66 + var57 - var30, var67);
                        }

                        var98.method7163(var46, var56 + var66, var70, var86.field2107 | -16777216, 0);
                        if (var93 != null) {
                           if (null != var31) {
                              var31.method9139(var66 + var58 - var39, var67);
                           }

                           if (var33 != null) {
                              var33.method9139(var66 + var59 - var41, var67);
                           }

                           if (null != var32) {
                              for(var75 = 0; var75 < var51; ++var75) {
                                 var32.method9139(var36 * var75 + (var60 + var66 - var40), var67);
                              }
                           }

                           if (null != var34) {
                              var34.method9139(var61 + var66 - var42, var67);
                           }

                           var45.method7163(var47, var66 + var62, var73, var93.field2107 | -16777216, 0);
                        }
                     }
                  }
               }
            }
         }

      }
   }

   static final void method2327(int var0, int var1, int var2, int var3) {
      field1447 = 0;
      boolean var5 = false;
      int var6 = -1;
      int var7 = -1;
      int var8 = class116.field1116;
      int[] var9 = class116.field1120;

      int var10;
      for(var10 = 0; var10 < var8 + field1565; ++var10) {
         Object var11;
         if (var10 < var8) {
            var11 = field1527[var9[var10]];
            if (var9[var10] == field1567) {
               var5 = true;
               var6 = var10;
               continue;
            }

            if (var11 == class146.field1362) {
               var7 = var10;
               continue;
            }
         } else {
            var11 = field1489[field1491[var10 - var8]];
         }

         method5652((class102)var11, var10, var0, var1, var2, var3);
      }

      if (field1682 && var7 != -1) {
         method5652(class146.field1362, var7, var0, var1, var2, var3);
      }

      if (var5) {
         method5652(field1527[field1567], var6, var0, var1, var2, var3);
      }

      for(var10 = 0; var10 < field1447; ++var10) {
         int var22 = field1667[var10];
         int var12 = field1562[var10];
         int var13 = field1638[var10];
         int var14 = field1537[var10];
         boolean var15 = true;

         while(var15) {
            var15 = false;

            for(int var16 = 0; var16 < var10; ++var16) {
               if (var12 + 2 > field1562[var16] - field1537[var16] && var12 - var14 < field1562[var16] + 2 && var22 - var13 < field1667[var16] + field1638[var16] && var13 + var22 > field1667[var16] - field1638[var16] && field1562[var16] - field1537[var16] < var12) {
                  var12 = field1562[var16] - field1537[var16];
                  var15 = true;
               }
            }
         }

         field1546 = field1667[var10];
         field1665 = field1562[var10] = var12;
         String var23 = field1543[var10];
         if (0 == field1604) {
            int var17 = 16776960;
            if (field1539[var10] < 6) {
               var17 = field1660[field1539[var10]];
            }

            if (6 == field1539[var10]) {
               var17 = field1545 % 20 < 10 ? 16711680 : 16776960;
            }

            if (field1539[var10] == 7) {
               var17 = field1545 % 20 < 10 ? 255 : '\uffff';
            }

            if (field1539[var10] == 8) {
               var17 = field1545 % 20 < 10 ? '\ub000' : 8454016;
            }

            int var18;
            if (9 == field1539[var10]) {
               var18 = 150 - field1495[var10];
               if (var18 < 50) {
                  var17 = 16711680 + var18 * 1280;
               } else if (var18 < 100) {
                  var17 = 16776960 - (var18 - 50) * 327680;
               } else if (var18 < 150) {
                  var17 = '\uff00' + 5 * (var18 - 100);
               }
            }

            if (10 == field1539[var10]) {
               var18 = 150 - field1495[var10];
               if (var18 < 50) {
                  var17 = var18 * 5 + 16711680;
               } else if (var18 < 100) {
                  var17 = 16711935 - 327680 * (var18 - 50);
               } else if (var18 < 150) {
                  var17 = (var18 - 100) * 327680 + 255 - 5 * (var18 - 100);
               }
            }

            if (11 == field1539[var10]) {
               var18 = 150 - field1495[var10];
               if (var18 < 50) {
                  var17 = 16777215 - var18 * 327685;
               } else if (var18 < 100) {
                  var17 = '\uff00' + 327685 * (var18 - 50);
               } else if (var18 < 150) {
                  var17 = 16777215 - (var18 - 100) * 327680;
               }
            }

            int var19;
            if (field1539[var10] == 12 && field1554[var10] == null) {
               var18 = var23.length();
               field1554[var10] = new int[var18];

               for(var19 = 0; var19 < var18; ++var19) {
                  int var20 = (int)((float)var19 / (float)var18 * 64.0F);
                  int var21 = var20 << 10 | 896 | 64;
                  field1554[var10][var19] = class468.field4798[var21];
               }
            }

            if (0 == field1599[var10]) {
               class316.field3504.method7210(var23, var0 + field1546, var1 + field1665, var17, 0, field1554[var10]);
            }

            if (1 == field1599[var10]) {
               class316.field3504.method7170(var23, field1546 + var0, field1665 + var1, var17, 0, field1545, field1554[var10]);
            }

            if (2 == field1599[var10]) {
               class316.field3504.method7171(var23, var0 + field1546, field1665 + var1, var17, 0, field1545, field1554[var10]);
            }

            if (field1599[var10] == 3) {
               class316.field3504.method7172(var23, var0 + field1546, field1665 + var1, var17, 0, field1545, 150 - field1495[var10], field1554[var10]);
            }

            if (field1599[var10] == 4) {
               var18 = (150 - field1495[var10]) * (class316.field3504.method7225(var23) + 100) / 150;
               class535.method9224(var0 + field1546 - 50, var1, var0 + field1546 + 50, var1 + var3);
               class316.field3504.method7203(var23, 50 + var0 + field1546 - var18, var1 + field1665, var17, 0, field1554[var10]);
               class535.method9304(var0, var1, var0 + var2, var1 + var3);
            }

            if (5 == field1599[var10]) {
               var18 = 150 - field1495[var10];
               var19 = 0;
               if (var18 < 25) {
                  var19 = var18 - 25;
               } else if (var18 > 125) {
                  var19 = var18 - 125;
               }

               class535.method9224(var0, field1665 + var1 - class316.field3504.field4527 - 1, var2 + var0, var1 + field1665 + 5);
               class316.field3504.method7210(var23, var0 + field1546, var1 + field1665 + var19, var17, 0, field1554[var10]);
               class535.method9304(var0, var1, var0 + var2, var1 + var3);
            }
         } else {
            class316.field3504.method7166(var23, field1546 + var0, field1665 + var1, 16776960, 0);
         }
      }

   }

   static final void method7789() {
      field1553 = 0;
      int var1 = (class146.field1362.field949 >> 7) + class342.field3837;
      int var2 = (class146.field1362.field963 >> 7) + class144.field1352;
      if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
         field1553 = 1;
      }

      if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
         field1553 = 1;
      }

      if (field1553 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
         field1553 = 0;
      }

   }

   static final void method2467(class102 var0, int var1) {
      method1033(var0.field949, var0.field963, var1);
   }

   static final void method1033(int var0, int var1, int var2) {
      if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
         int var4 = method5733(var0, var1, class44.field306) - var2;
         var0 -= class172.field1822;
         var4 -= class372.field4350;
         var1 -= class50.field362;
         int var5 = class229.field2511[class15.field74];
         int var6 = class229.field2512[class15.field74];
         int var7 = class229.field2511[class456.field4751];
         int var8 = class229.field2512[class456.field4751];
         int var9 = var1 * var7 + var8 * var0 >> 16;
         var1 = var8 * var1 - var0 * var7 >> 16;
         var0 = var9;
         var9 = var6 * var4 - var5 * var1 >> 16;
         var1 = var4 * var5 + var1 * var6 >> 16;
         if (var1 >= 50) {
            field1546 = field1715 * var0 / var1 + field1456 / 2;
            field1665 = field1714 / 2 + field1715 * var9 / var1;
         } else {
            field1546 = -1;
            field1665 = -1;
         }

      } else {
         field1546 = -1;
         field1665 = -1;
      }
   }

   static final int method5733(int var0, int var1, int var2) {
      int var4 = var0 >> 7;
      int var5 = var1 >> 7;
      if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
         int var6 = var2;
         if (var2 < 3 && 2 == (class88.field804[1][var4][var5] & 2)) {
            var6 = var2 + 1;
         }

         int var7 = var0 & 127;
         int var8 = var1 & 127;
         int var9 = class88.field797[var6][var4 + 1][var5] * var7 + class88.field797[var6][var4][var5] * (128 - var7) >> 7;
         int var10 = (128 - var7) * class88.field797[var6][var4][var5 + 1] + class88.field797[var6][var4 + 1][var5 + 1] * var7 >> 7;
         return var10 * var8 + var9 * (128 - var8) >> 7;
      } else {
         return 0;
      }
   }

   static int method7749(int var0, int var1) {
      int var3 = var1 - 334;
      if (var3 < 0) {
         var3 = 0;
      } else if (var3 > 100) {
         var3 = 100;
      }

      int var4 = (field1706 - field1515) * var3 / 100 + field1515;
      return var0 * var4 / 256;
   }

   static final void rebuildRegion(boolean isDynamic, PacketBuffer buf) {
      isDynamicRegion = isDynamic;
      int chunkY;
      int chunkX;
      int r;
      int i;
      int var8;
      if (!isDynamicRegion) {
         chunkY = buf.readUnsignedShort();
         chunkX = buf.readUnsignedShort();
         int regionCount = buf.readUnsignedShort();
         class4.xteaKeys = new int[regionCount][4];

         for(r = 0; r < regionCount; ++r) {
            for(i = 0; i < 4; ++i) {
               class4.xteaKeys[r][i] = buf.readInt();
            }
         }

         class299.regions = new int[regionCount];
         class118.regionMapArchiveIds = new int[regionCount];
         class173.regionLandArchiveIds = new int[regionCount];
         class139.regionLandArchives = new byte[regionCount][];
         class365.regionMapArchives = new byte[regionCount][];
         regionCount = 0;

         for(r = (chunkX - 6) / 8; r <= (chunkX + 6) / 8; ++r) {
            for(i = (chunkY - 6) / 8; i <= (chunkY + 6) / 8; ++i) {
               var8 = i + (r << 8);
               class299.regions[regionCount] = var8;
               class118.regionMapArchiveIds[regionCount] = Js5Index.mapsJs5.getGroupId("m" + r + "_" + i);
               class173.regionLandArchiveIds[regionCount] = Js5Index.mapsJs5.getGroupId("l" + r + "_" + i);
               ++regionCount;
            }
         }

         rebuildGpi(chunkX, chunkY, true);
      } else {
         chunkY = buf.readUnsignedShortAdd();
         chunkX = buf.readUnsignedShortLE();
         boolean shouldRebuildGpi = buf.readUnsignedByteSub() == 1;
         r = buf.readUnsignedShort();
         buf.method8476();

         int var9;
         int var10;
         for(i = 0; i < 4; ++i) {
            for(var8 = 0; var8 < 13; ++var8) {
               for(var9 = 0; var9 < 13; ++var9) {
                  var10 = buf.method8483(1);
                  if (var10 == 1) {
                     instanceChunkTemplates[i][var8][var9] = buf.method8483(26);
                  } else {
                     instanceChunkTemplates[i][var8][var9] = -1;
                  }
               }
            }
         }

         buf.method8482();
         class4.xteaKeys = new int[r][4];

         for(i = 0; i < r; ++i) {
            for(var8 = 0; var8 < 4; ++var8) {
               class4.xteaKeys[i][var8] = buf.readInt();
            }
         }

         class299.regions = new int[r];
         class118.regionMapArchiveIds = new int[r];
         class173.regionLandArchiveIds = new int[r];
         class139.regionLandArchives = new byte[r][];
         class365.regionMapArchives = new byte[r][];
         r = 0;

         for(i = 0; i < 4; ++i) {
            for(var8 = 0; var8 < 13; ++var8) {
               for(var9 = 0; var9 < 13; ++var9) {
                  var10 = instanceChunkTemplates[i][var8][var9];
                  if (var10 != -1) {
                     int var11 = var10 >> 14 & 1023;
                     int var12 = var10 >> 3 & 2047;
                     int var13 = (var11 / 8 << 8) + var12 / 8;

                     int var14;
                     for(var14 = 0; var14 < r; ++var14) {
                        if (class299.regions[var14] == var13) {
                           var13 = -1;
                           break;
                        }
                     }

                     if (var13 != -1) {
                        class299.regions[r] = var13;
                        var14 = var13 >> 8 & 255;
                        int var15 = var13 & 255;
                        class118.regionMapArchiveIds[r] = Js5Index.mapsJs5.getGroupId("m" + var14 + "_" + var15);
                        class173.regionLandArchiveIds[r] = Js5Index.mapsJs5.getGroupId("l" + var14 + "_" + var15);
                        ++r;
                     }
                  }
               }
            }
         }

         rebuildGpi(chunkY, chunkX, !shouldRebuildGpi);
      }

   }

   static final void rebuildGpi(int var0, int var1, boolean var2) {
      if (!var2 || class293.field3130 != var0 || class142.field1317 != var1) {
         class293.field3130 = var0;
         class142.field1317 = var1;
         updateGameState(25);
         method2100(class364.field4024, true);
         int var4 = class342.field3837;
         int var5 = class144.field1352;
         class342.field3837 = (var0 - 6) * 8;
         class144.field1352 = (var1 - 6) * 8;
         int var6 = class342.field3837 - var4;
         int var7 = class144.field1352 - var5;
         var4 = class342.field3837;
         var5 = class144.field1352;

         int var8;
         int var10;
         int[] var10000;
         for(var8 = 0; var8 < 65536; ++var8) {
            class86 var9 = field1489[var8];
            if (var9 != null) {
               for(var10 = 0; var10 < 10; ++var10) {
                  var10000 = var9.field945;
                  var10000[var10] -= var6;
                  var10000 = var9.field1012;
                  var10000[var10] -= var7;
               }

               var9.field949 -= var6 * 128;
               var9.field963 -= var7 * 128;
            }
         }

         for(var8 = 0; var8 < 2048; ++var8) {
            class84 var20 = field1527[var8];
            if (null != var20) {
               for(var10 = 0; var10 < 10; ++var10) {
                  var10000 = var20.field945;
                  var10000[var10] -= var6;
                  var10000 = var20.field1012;
                  var10000[var10] -= var7;
               }

               var20.field949 -= var6 * 128;
               var20.field963 -= var7 * 128;
            }
         }

         byte var19 = 0;
         byte var21 = 104;
         byte var22 = 1;
         if (var6 < 0) {
            var19 = 103;
            var21 = -1;
            var22 = -1;
         }

         byte var11 = 0;
         byte var12 = 104;
         byte var13 = 1;
         if (var7 < 0) {
            var11 = 103;
            var12 = -1;
            var13 = -1;
         }

         int var15;
         for(int var14 = var19; var21 != var14; var14 += var22) {
            for(var15 = var11; var12 != var15; var15 += var13) {
               int var16 = var6 + var14;
               int var17 = var7 + var15;

               for(int var18 = 0; var18 < 4; ++var18) {
                  if (var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104) {
                     field1568[var18][var14][var15] =  field1568[var18][var16][var17];
                  } else {
                     field1568[var18][var14][var15] = null;
                  }
               }
            }
         }

         for(class104 var23 = (class104)field1593.method6706(); var23 != null; var23 = (class104)field1593.method6687()) {
            var23.field1023 -= var6;
            var23.field1024 -= var7;
            if (var23.field1023 < 0 || var23.field1024 < 0 || var23.field1023 >= 104 || var23.field1024 >= 104) {
               var23.method8116();
            }
         }

         if (field1513 != 0) {
            field1513 -= var6;
            field1680 -= var7;
         }

         field1632 = 0;
         field1689 = false;
         class172.field1822 -= var6 << 7;
         class50.field362 -= var7 << 7;
         class468.field4805 -= var6 << 7;
         class44.field302 -= var7 << 7;
         field1674 = -1;
         field1571.method6692();
         field1439.method6692();

         for(var15 = 0; var15 < 4; ++var15) {
            field1504[var15].method4164();
         }

      }
   }

   static final void method4193(boolean var0) {
      method2290();
      ++serverConnection.field1052;
      if (serverConnection.field1052 >= 50 || var0) {
         serverConnection.field1052 = 0;
         if (!field1487 && serverConnection.method2137() != null) {
            class308 var2 = class308.method8607(ClientPacket.field3390, serverConnection.field1046);
            serverConnection.method2148(var2);

            try {
               serverConnection.method2131();
            } catch (IOException var4) {
               field1487 = true;
            }
         }

      }
   }

   static final void method2439() {
      method4193(false);
      field1646 = 0;
      boolean var1 = true;

      int var2;
      for(var2 = 0; var2 < class139.regionLandArchives.length; ++var2) {
         if (-1 != class118.regionMapArchiveIds[var2] && class139.regionLandArchives[var2] == null) {
            class139.regionLandArchives[var2] = Js5Index.mapsJs5.method6381(class118.regionMapArchiveIds[var2], 0);
            if (class139.regionLandArchives[var2] == null) {
               var1 = false;
               ++field1646;
            }
         }

         if (-1 != class173.regionLandArchiveIds[var2] && class365.regionMapArchives[var2] == null) {
            class365.regionMapArchives[var2] = Js5Index.mapsJs5.method6383(class173.regionLandArchiveIds[var2], 0, class4.xteaKeys[var2]);
            if (null == class365.regionMapArchives[var2]) {
               var1 = false;
               ++field1646;
            }
         }
      }

      if (!var1) {
         field1453 = 1;
      } else {
         field1595 = 0;
         var1 = true;

         int var4;
         int var5;
         for(var2 = 0; var2 < class139.regionLandArchives.length; ++var2) {
            byte[] var3 = class365.regionMapArchives[var2];
            if (null != var3) {
               var4 = (class299.regions[var2] >> 8) * 64 - class342.field3837;
               var5 = 64 * (class299.regions[var2] & 255) - class144.field1352;
               if (isDynamicRegion) {
                  var4 = 10;
                  var5 = 10;
               }

               var1 &= class292.method5655(var3, var4, var5);
            }
         }

         if (!var1) {
            field1453 = 2;
         } else {
            if (0 != field1453) {
               method2100(class364.field4024 + class90.field835 + class90.field831 + 100 + "%" + class90.field830, true);
            }

            method2290();
            class109.field1065.method4534();

            for(var2 = 0; var2 < 4; ++var2) {
               field1504[var2].method4164();
            }

            int var16;
            for(var2 = 0; var2 < 4; ++var2) {
               for(var16 = 0; var16 < 104; ++var16) {
                  for(var4 = 0; var4 < 104; ++var4) {
                     class88.field804[var2][var16][var4] = 0;
                  }
               }
            }

            method2290();
            class88.method6368();
            var2 = class139.regionLandArchives.length;
            class77.method2555();
            method4193(true);
            int var18;
            if (!isDynamicRegion) {
               byte[] var6;
               for(var16 = 0; var16 < var2; ++var16) {
                  var4 = (class299.regions[var16] >> 8) * 64 - class342.field3837;
                  var5 = (class299.regions[var16] & 255) * 64 - class144.field1352;
                  var6 = class139.regionLandArchives[var16];
                  if (null != var6) {
                     method2290();
                     class88.method1485(var6, var4, var5, class293.field3130 * 8 - 48, class142.field1317 * 8 - 48, field1504);
                  }
               }

               for(var16 = 0; var16 < var2; ++var16) {
                  var4 = (class299.regions[var16] >> 8) * 64 - class342.field3837;
                  var5 = 64 * (class299.regions[var16] & 255) - class144.field1352;
                  var6 = class139.regionLandArchives[var16];
                  if (null == var6 && class142.field1317 < 800) {
                     method2290();
                     class88.method3850(var4, var5, 64, 64);
                  }
               }

               method4193(true);

               for(var16 = 0; var16 < var2; ++var16) {
                  byte[] var17 = class365.regionMapArchives[var16];
                  if (null != var17) {
                     var5 = (class299.regions[var16] >> 8) * 64 - class342.field3837;
                     var18 = 64 * (class299.regions[var16] & 255) - class144.field1352;
                     method2290();
                     class88.method266(var17, var5, var18, class109.field1065, field1504);
                  }
               }
            }

            int var7;
            int var8;
            int var9;
            if (isDynamicRegion) {
               int var10;
               int var11;
               int var12;
               for(var16 = 0; var16 < 4; ++var16) {
                  method2290();

                  for(var4 = 0; var4 < 13; ++var4) {
                     for(var5 = 0; var5 < 13; ++var5) {
                        boolean var19 = false;
                        var7 = instanceChunkTemplates[var16][var4][var5];
                        if (var7 != -1) {
                           var8 = var7 >> 24 & 3;
                           var9 = var7 >> 1 & 3;
                           var10 = var7 >> 14 & 1023;
                           var11 = var7 >> 3 & 2047;
                           var12 = var11 / 8 + (var10 / 8 << 8);

                           for(int var13 = 0; var13 < class299.regions.length; ++var13) {
                              if (var12 == class299.regions[var13] && class139.regionLandArchives[var13] != null) {
                                 int var14 = 8 * (var10 - var4);
                                 int var15 = 8 * (var11 - var5);
                                 class88.method3289(class139.regionLandArchives[var13], var16, var4 * 8, var5 * 8, var8, (var10 & 7) * 8, (var11 & 7) * 8, var9, var14, var15, field1504);
                                 var19 = true;
                                 break;
                              }
                           }
                        }

                        if (!var19) {
                           class88.method1192(var16, var4 * 8, var5 * 8);
                        }
                     }
                  }
               }

               for(var16 = 0; var16 < 13; ++var16) {
                  for(var4 = 0; var4 < 13; ++var4) {
                     var5 = instanceChunkTemplates[0][var16][var4];
                     if (var5 == -1) {
                        class88.method3850(var16 * 8, var4 * 8, 8, 8);
                     }
                  }
               }

               method4193(true);

               for(var16 = 0; var16 < 4; ++var16) {
                  method2290();

                  for(var4 = 0; var4 < 13; ++var4) {
                     for(var5 = 0; var5 < 13; ++var5) {
                        var18 = instanceChunkTemplates[var16][var4][var5];
                        if (var18 != -1) {
                           var7 = var18 >> 24 & 3;
                           var8 = var18 >> 1 & 3;
                           var9 = var18 >> 14 & 1023;
                           var10 = var18 >> 3 & 2047;
                           var11 = (var9 / 8 << 8) + var10 / 8;

                           for(var12 = 0; var12 < class299.regions.length; ++var12) {
                              if (var11 == class299.regions[var12] && null != class365.regionMapArchives[var12]) {
                                 class88.method1906(class365.regionMapArchives[var12], var16, var4 * 8, var5 * 8, var7, 8 * (var9 & 7), (var10 & 7) * 8, var8, class109.field1065, field1504);
                                 break;
                              }
                           }
                        }
                     }
                  }
               }
            }

            method4193(true);
            method2290();
            class88.method7825(class109.field1065, field1504);
            method4193(true);
            var16 = class88.field798;
            if (var16 > class44.field306) {
               var16 = class44.field306;
            }

            if (var16 < class44.field306 - 1) {
               var16 = class44.field306 - 1;
            }

            if (isLowDetail) {
               class109.field1065.method4580(class88.field798);
            } else {
               class109.field1065.method4580(0);
            }

            for(var4 = 0; var4 < 104; ++var4) {
               for(var5 = 0; var5 < 104; ++var5) {
                  method6371(var4, var5);
               }
            }

            method2290();
            method1077();
            class184.field1914.method5637();
            class308 var20;
            if (class124.field1180.method690()) {
               var20 = class308.method8607(ClientPacket.field3427, serverConnection.field1046);
               var20.packet.writeInt(1057001181);
               serverConnection.method2148(var20);
            }

            if (!isDynamicRegion) {
               var4 = (class293.field3130 - 6) / 8;
               var5 = (6 + class293.field3130) / 8;
               var18 = (class142.field1317 - 6) / 8;
               var7 = (6 + class142.field1317) / 8;

               for(var8 = var4 - 1; var8 <= var5 + 1; ++var8) {
                  for(var9 = var18 - 1; var9 <= var7 + 1; ++var9) {
                     if (var8 < var4 || var8 > var5 || var9 < var18 || var9 > var7) {
                        Js5Index.mapsJs5.method6385("m" + var8 + "_" + var9);
                        Js5Index.mapsJs5.method6385("l" + var8 + "_" + var9);
                     }
                  }
               }
            }

            updateGameState(30);
            method2290();
            class88.method3293();
            var20 = class308.method8607(ClientPacket.field3440, serverConnection.field1046);
            serverConnection.method2148(var20);
            GameShell.method3439();
         }
      }
   }

   static final void method168(int var0) {
      int[] var2 = class247.field2715.field5147;
      int var3 = var2.length;

      int var4;
      for(var4 = 0; var4 < var3; ++var4) {
         var2[var4] = 0;
      }

      int var5;
      int var6;
      for(var4 = 1; var4 < 103; ++var4) {
         var5 = 24628 + 2048 * (103 - var4);

         for(var6 = 1; var6 < 103; ++var6) {
            if (0 == (class88.field804[var0][var6][var4] & 24)) {
               class109.field1065.method4441(var2, var5, 512, var0, var6, var4);
            }

            if (var0 < 3 && (class88.field804[var0 + 1][var6][var4] & 8) != 0) {
               class109.field1065.method4441(var2, var5, 512, var0 + 1, var6, var4);
            }

            var5 += 4;
         }
      }

      var4 = (238 + (int)(Math.random() * 20.0) - 10 << 16) + (238 + (int)(Math.random() * 20.0) - 10 << 8) + (238 + (int)(Math.random() * 20.0) - 10);
      var5 = 238 + (int)(Math.random() * 20.0) - 10 << 16;
      class247.field2715.method9027();

      int var7;
      for(var6 = 1; var6 < 103; ++var6) {
         for(var7 = 1; var7 < 103; ++var7) {
            if ((class88.field804[var0][var7][var6] & 24) == 0) {
               class297.method5686(var0, var7, var6, var4, var5);
            }

            if (var0 < 3 && 0 != (class88.field804[var0 + 1][var7][var6] & 8)) {
               class297.method5686(var0 + 1, var7, var6, var4, var5);
            }
         }
      }

      field1536 = 0;

      for(var6 = 0; var6 < 104; ++var6) {
         for(var7 = 0; var7 < 104; ++var7) {
            long var8 = class109.field1065.method4434(class44.field306, var6, var7);
            if (var8 != 0L) {
               int var10 = class252.method7841(var8);
               int var11 = class98.method2042(var10).field1933;
               if (var11 >= 0 && class197.method4100(var11).field2171) {
                  field1678[field1536] = class197.method4100(var11).method3771(false);
                  field1676[field1536] = var6;
                  field1492[field1536] = var7;
                  ++field1536;
               }
            }
         }
      }

      class159.field1749.method9185();
   }

   static final void method5397(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      class104 var11 = null;

      for(class104 var12 = (class104)field1593.method6706(); null != var12; var12 = (class104)field1593.method6687()) {
         if (var0 == var12.field1036 && var1 == var12.field1023 && var2 == var12.field1024 && var3 == var12.field1022) {
            var11 = var12;
            break;
         }
      }

      if (null == var11) {
         var11 = new class104();
         var11.field1036 = var0;
         var11.field1022 = var3;
         var11.field1023 = var1;
         var11.field1024 = var2;
         var11.field1030 = -1;
         method315(var11);
         field1593.method6680(var11);
      }

      var11.field1031 = var4;
      var11.field1028 = var5;
      var11.field1029 = var6;
      var11.field1033 = var8;
      var11.field1034 = var9;
      var11.method2115(var7);
   }

   static final void method1077() {
      for(class104 var1 = (class104)field1593.method6706(); null != var1; var1 = (class104)field1593.method6687()) {
         if (var1.field1034 == -1) {
            var1.field1033 = 0;
            method315(var1);
         } else {
            var1.method8116();
         }
      }

   }

   static final void method315(class104 var0) {
      long var2 = 0L;
      int var4 = -1;
      int var5 = 0;
      int var6 = 0;
      if (var0.field1022 == 0) {
         var2 = class109.field1065.method4431(var0.field1036, var0.field1023, var0.field1024);
      }

      if (1 == var0.field1022) {
         var2 = class109.field1065.method4432(var0.field1036, var0.field1023, var0.field1024);
      }

      if (var0.field1022 == 2) {
         var2 = class109.field1065.method4574(var0.field1036, var0.field1023, var0.field1024);
      }

      if (var0.field1022 == 3) {
         var2 = class109.field1065.method4434(var0.field1036, var0.field1023, var0.field1024);
      }

      if (var2 != 0L) {
         int var7 = class109.field1065.method4435(var0.field1036, var0.field1023, var0.field1024, var2);
         var4 = class252.method7841(var2);
         var5 = var7 & 31;
         var6 = var7 >> 6 & 3;
      }

      var0.field1025 = var4;
      var0.field1027 = var5;
      var0.field1026 = var6;
   }

   static final void method3852(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) {
         if (isLowDetail && var0 != class44.field306) {
            return;
         }

         long var9 = 0L;
         boolean var11 = true;
         boolean var12 = false;
         boolean var13 = false;
         if (var1 == 0) {
            var9 = class109.field1065.method4431(var0, var2, var3);
         }

         if (var1 == 1) {
            var9 = class109.field1065.method4432(var0, var2, var3);
         }

         if (var1 == 2) {
            var9 = class109.field1065.method4574(var0, var2, var3);
         }

         if (var1 == 3) {
            var9 = class109.field1065.method4434(var0, var2, var3);
         }

         int var14;
         if (var9 != 0L) {
            var14 = class109.field1065.method4435(var0, var2, var3, var9);
            int var38 = class252.method7841(var9);
            int var39 = var14 & 31;
            int var40 = var14 >> 6 & 3;
            class184 var15;
            if (var1 == 0) {
               class109.field1065.method4422(var0, var2, var3);
               var15 = class98.method2042(var38);
               if (0 != var15.field1922) {
                  field1504[var0].method4181(var2, var3, var39, var40, var15.field1905);
               }
            }

            if (var1 == 1) {
               class109.field1065.method4520(var0, var2, var3);
            }

            if (var1 == 2) {
               class109.field1065.method4424(var0, var2, var3);
               var15 = class98.method2042(var38);
               if (var15.field1940 + var2 > 103 || var15.field1940 + var3 > 103 || var15.field1944 + var2 > 103 || var15.field1944 + var3 > 103) {
                  return;
               }

               if (0 != var15.field1922) {
                  field1504[var0].method4171(var2, var3, var15.field1940, var15.field1944, var40, var15.field1905);
               }
            }

            if (var1 == 3) {
               class109.field1065.method4425(var0, var2, var3);
               var15 = class98.method2042(var38);
               if (var15.field1922 == 1) {
                  field1504[var0].method4173(var2, var3);
               }
            }
         }

         if (var4 >= 0) {
            var14 = var0;
            if (var0 < 3 && 2 == (class88.field804[1][var2][var3] & 2)) {
               var14 = var0 + 1;
            }

            class234 var41 = class109.field1065;
            class218 var16 = field1504[var0];
            class184 var17 = class98.method2042(var4);
            int var18 = var7 >= 0 ? var7 : var17.field1930;
            int var19;
            int var20;
            if (var5 != 1 && var5 != 3) {
               var19 = var17.field1940;
               var20 = var17.field1944;
            } else {
               var19 = var17.field1944;
               var20 = var17.field1940;
            }

            int var21;
            int var22;
            if (var2 + var19 <= 104) {
               var21 = var2 + (var19 >> 1);
               var22 = var2 + (var19 + 1 >> 1);
            } else {
               var21 = var2;
               var22 = var2 + 1;
            }

            int var23;
            int var24;
            if (var3 + var20 <= 104) {
               var23 = var3 + (var20 >> 1);
               var24 = var3 + (var20 + 1 >> 1);
            } else {
               var23 = var3;
               var24 = var3 + 1;
            }

            int[][] var25 = class88.field797[var14];
            int var26 = var25[var22][var24] + var25[var21][var23] + var25[var22][var23] + var25[var21][var24] >> 2;
            int var27 = (var2 << 7) + (var19 << 6);
            int var28 = (var3 << 7) + (var20 << 6);
            long var29 = class252.method7702(var2, var3, 2, 0 == var17.field1924, var4);
            int var31 = var6 + (var5 << 6);
            if (var17.field1945 == 1) {
               var31 += 256;
            }

            Object var32;
            if (var6 == 22) {
               if (var18 == -1 && var17.field1946 == null) {
                  var32 = var17.method3449(22, var5, var25, var27, var26, var28);
               } else {
                  var32 = new class95(var4, 22, var5, var14, var2, var3, var18, var17.field1954, (class228)null);
               }

               var41.method4411(var0, var2, var3, var26, (class228)var32, var29, var31);
               if (var17.field1922 == 1) {
                  var16.method4190(var2, var3);
               }
            } else if (var6 != 10 && var6 != 11) {
               if (var6 >= 12) {
                  if (var18 == -1 && var17.field1946 == null) {
                     var32 = var17.method3449(var6, var5, var25, var27, var26, var28);
                  } else {
                     var32 = new class95(var4, var6, var5, var14, var2, var3, var18, var17.field1954, (class228)null);
                  }

                  var41.method4415(var0, var2, var3, var26, 1, 1, (class228)var32, 0, var29, var31);
                  if (var17.field1922 != 0) {
                     var16.method4166(var2, var3, var19, var20, var17.field1905);
                  }
               } else if (var6 == 0) {
                  if (var18 == -1 && null == var17.field1946) {
                     var32 = var17.method3449(0, var5, var25, var27, var26, var28);
                  } else {
                     var32 = new class95(var4, 0, var5, var14, var2, var3, var18, var17.field1954, (class228)null);
                  }

                  var41.method4413(var0, var2, var3, var26, (class228)var32, (class228)null, class88.field802[var5], 0, var29, var31);
                  if (var17.field1922 != 0) {
                     var16.method4170(var2, var3, var6, var5, var17.field1905);
                  }
               } else if (var6 == 1) {
                  if (var18 == -1 && var17.field1946 == null) {
                     var32 = var17.method3449(1, var5, var25, var27, var26, var28);
                  } else {
                     var32 = new class95(var4, 1, var5, var14, var2, var3, var18, var17.field1954, (class228)null);
                  }

                  var41.method4413(var0, var2, var3, var26, (class228)var32, (class228)null, class88.field803[var5], 0, var29, var31);
                  if (var17.field1922 != 0) {
                     var16.method4170(var2, var3, var6, var5, var17.field1905);
                  }
               } else {
                  int var44;
                  if (var6 == 2) {
                     var44 = var5 + 1 & 3;
                     Object var33;
                     Object var34;
                     if (var18 == -1 && var17.field1946 == null) {
                        var33 = var17.method3449(2, var5 + 4, var25, var27, var26, var28);
                        var34 = var17.method3449(2, var44, var25, var27, var26, var28);
                     } else {
                        var33 = new class95(var4, 2, var5 + 4, var14, var2, var3, var18, var17.field1954, (class228)null);
                        var34 = new class95(var4, 2, var44, var14, var2, var3, var18, var17.field1954, (class228)null);
                     }

                     var41.method4413(var0, var2, var3, var26, (class228)var33, (class228)var34, class88.field802[var5], class88.field802[var44], var29, var31);
                     if (0 != var17.field1922) {
                        var16.method4170(var2, var3, var6, var5, var17.field1905);
                     }
                  } else if (var6 == 3) {
                     if (var18 == -1 && var17.field1946 == null) {
                        var32 = var17.method3449(3, var5, var25, var27, var26, var28);
                     } else {
                        var32 = new class95(var4, 3, var5, var14, var2, var3, var18, var17.field1954, (class228)null);
                     }

                     var41.method4413(var0, var2, var3, var26, (class228)var32, (class228)null, class88.field803[var5], 0, var29, var31);
                     if (var17.field1922 != 0) {
                        var16.method4170(var2, var3, var6, var5, var17.field1905);
                     }
                  } else if (var6 == 9) {
                     if (var18 == -1 && null == var17.field1946) {
                        var32 = var17.method3449(var6, var5, var25, var27, var26, var28);
                     } else {
                        var32 = new class95(var4, var6, var5, var14, var2, var3, var18, var17.field1954, (class228)null);
                     }

                     var41.method4415(var0, var2, var3, var26, 1, 1, (class228)var32, 0, var29, var31);
                     if (var17.field1922 != 0) {
                        var16.method4166(var2, var3, var19, var20, var17.field1905);
                     }
                  } else if (var6 == 4) {
                     if (var18 == -1 && var17.field1946 == null) {
                        var32 = var17.method3449(4, var5, var25, var27, var26, var28);
                     } else {
                        var32 = new class95(var4, 4, var5, var14, var2, var3, var18, var17.field1954, (class228)null);
                     }

                     var41.method4414(var0, var2, var3, var26, (class228)var32, (class228)null, class88.field802[var5], 0, 0, 0, var29, var31);
                  } else {
                     Object var35;
                     long var42;
                     if (var6 == 5) {
                        var44 = 16;
                        var42 = var41.method4431(var0, var2, var3);
                        if (0L != var42) {
                           var44 = class98.method2042(class252.method7841(var42)).field1929;
                        }

                        if (var18 == -1 && null == var17.field1946) {
                           var35 = var17.method3449(4, var5, var25, var27, var26, var28);
                        } else {
                           var35 = new class95(var4, 4, var5, var14, var2, var3, var18, var17.field1954, (class228)null);
                        }

                        var41.method4414(var0, var2, var3, var26, (class228)var35, (class228)null, class88.field802[var5], 0, var44 * class88.field812[var5], class88.field809[var5] * var44, var29, var31);
                     } else if (var6 == 6) {
                        var44 = 8;
                        var42 = var41.method4431(var0, var2, var3);
                        if (0L != var42) {
                           var44 = class98.method2042(class252.method7841(var42)).field1929 / 2;
                        }

                        if (var18 == -1 && var17.field1946 == null) {
                           var35 = var17.method3449(4, var5 + 4, var25, var27, var26, var28);
                        } else {
                           var35 = new class95(var4, 4, var5 + 4, var14, var2, var3, var18, var17.field1954, (class228)null);
                        }

                        var41.method4414(var0, var2, var3, var26, (class228)var35, (class228)null, 256, var5, var44 * class88.field806[var5], var44 * class88.field807[var5], var29, var31);
                     } else if (var6 == 7) {
                        int var43 = var5 + 2 & 3;
                        if (var18 == -1 && null == var17.field1946) {
                           var32 = var17.method3449(4, var43 + 4, var25, var27, var26, var28);
                        } else {
                           var32 = new class95(var4, 4, var43 + 4, var14, var2, var3, var18, var17.field1954, (class228)null);
                        }

                        var41.method4414(var0, var2, var3, var26, (class228)var32, (class228)null, 256, var43, 0, 0, var29, var31);
                     } else if (var6 == 8) {
                        var44 = 8;
                        var42 = var41.method4431(var0, var2, var3);
                        if (var42 != 0L) {
                           var44 = class98.method2042(class252.method7841(var42)).field1929 / 2;
                        }

                        int var37 = var5 + 2 & 3;
                        Object var36;
                        if (var18 == -1 && var17.field1946 == null) {
                           var35 = var17.method3449(4, var5 + 4, var25, var27, var26, var28);
                           var36 = var17.method3449(4, var37 + 4, var25, var27, var26, var28);
                        } else {
                           var35 = new class95(var4, 4, var5 + 4, var14, var2, var3, var18, var17.field1954, (class228)null);
                           var36 = new class95(var4, 4, var37 + 4, var14, var2, var3, var18, var17.field1954, (class228)null);
                        }

                        var41.method4414(var0, var2, var3, var26, (class228)var35, (class228)var36, 256, var5, var44 * class88.field806[var5], var44 * class88.field807[var5], var29, var31);
                     }
                  }
               }
            } else {
               if (var18 == -1 && null == var17.field1946) {
                  var32 = var17.method3449(10, var5, var25, var27, var26, var28);
               } else {
                  var32 = new class95(var4, 10, var5, var14, var2, var3, var18, var17.field1954, (class228)null);
               }

               if (var32 != null) {
                  var41.method4415(var0, var2, var3, var26, var19, var20, (class228)var32, var6 == 11 ? 256 : 0, var29, var31);
               }

               if (0 != var17.field1922) {
                  var16.method4166(var2, var3, var19, var20, var17.field1905);
               }
            }
         }
      }

   }

   static final void method6371(int var0, int var1) {
      class368 var3 = field1568[class44.field306][var0][var1];
      if (null == var3) {
         class109.field1065.method4426(class44.field306, var0, var1);
      } else {
         long var4 = -99999999L;
         class124 var6 = null;

         class124 var7;
         for(var7 = (class124)var3.method6706(); null != var7; var7 = (class124)var3.method6687()) {
            class185 var8 = class185.method2355(var7.field1174);
            long var9 = (long)var8.field1976;
            if (1 == var8.field1975) {
               var9 *= var7.field1178 < Integer.MAX_VALUE ? (long)(var7.field1178 + 1) : (long)var7.field1178;
            }

            if (var9 > var4) {
               var4 = var9;
               var6 = var7;
            }
         }

         if (var6 == null) {
            class109.field1065.method4426(class44.field306, var0, var1);
         } else {
            var3.method6681(var6);
            class124 var12 = null;
            class124 var13 = null;

            for(var7 = (class124)var3.method6706(); var7 != null; var7 = (class124)var3.method6687()) {
               if (var6.field1174 != var7.field1174) {
                  if (var12 == null) {
                     var12 = var7;
                  }

                  if (var7.field1174 != var12.field1174 && var13 == null) {
                     var13 = var7;
                  }
               }
            }

            long var10 = class252.method7702(var0, var1, 3, false, 0);
            class109.field1065.method4412(class44.field306, var0, var1, method5733(64 + var0 * 128, var1 * 128 + 64, class44.field306), var6, var10, var12, var13);
         }
      }
   }

   static final void method1190(PacketBuffer var0) {
      var0.method8476();
      int var2 = var0.method8483(8);
      int var3;
      if (var2 < field1565) {
         for(var3 = var2; var3 < field1565; ++var3) {
            field1517[++field1561 - 1] = field1491[var3];
         }
      }

      if (var2 > field1565) {
         throw new RuntimeException("");
      } else {
         field1565 = 0;

         for(var3 = 0; var3 < var2; ++var3) {
            int var4 = field1491[var3];
            class86 var5 = field1489[var4];
            int var6 = var0.method8483(1);
            if (var6 == 0) {
               field1491[++field1565 - 1] = var4;
               var5.field999 = field1445;
            } else {
               int var7 = var0.method8483(2);
               if (var7 == 0) {
                  field1491[++field1565 - 1] = var4;
                  var5.field999 = field1445;
                  field1503[++field1717 - 1] = var4;
               } else {
                  int var8;
                  int var9;
                  if (var7 == 1) {
                     field1491[++field1565 - 1] = var4;
                     var5.field999 = field1445;
                     var8 = var0.method8483(3);
                     var5.method1846(var8, class223.field2457);
                     var9 = var0.method8483(1);
                     if (var9 == 1) {
                        field1503[++field1717 - 1] = var4;
                     }
                  } else if (var7 == 2) {
                     field1491[++field1565 - 1] = var4;
                     var5.field999 = field1445;
                     if (var0.method8483(1) == 1) {
                        var8 = var0.method8483(3);
                        var5.method1846(var8, class223.field2450);
                        var9 = var0.method8483(3);
                        var5.method1846(var9, class223.field2450);
                     } else {
                        var8 = var0.method8483(3);
                        var5.method1846(var8, class223.field2451);
                     }

                     var8 = var0.method8483(1);
                     if (var8 == 1) {
                        field1503[++field1717 - 1] = var4;
                     }
                  } else if (var7 == 3) {
                     field1517[++field1561 - 1] = var4;
                  }
               }
            }
         }

      }
   }

   static void method3032(class86 var0) {
      var0.field981 = var0.field776.field2049;
      var0.field1009 = var0.field776.field2079;
      var0.field993 = var0.field776.field2083;
      var0.field1004 = var0.field776.field2061;
      var0.field1001 = var0.field776.field2057;
      var0.field984 = var0.field776.field2058;
      var0.field989 = var0.field776.field2052;
      var0.field995 = var0.field776.field2050;
      var0.field948 = var0.field776.field2054;
      var0.field953 = var0.field776.field2043;
      var0.field952 = var0.field776.field2060;
      var0.field955 = var0.field776.field2045;
      var0.field956 = var0.field776.field2062;
      var0.field969 = var0.field776.field2063;
      var0.field958 = var0.field776.field2064;
      var0.field959 = var0.field776.field2065;
      var0.field960 = var0.field776.field2071;
   }

   static final void method1483(class84 var0, int var1, int var2, class223 var3) {
      int var5 = var0.field945[0];
      int var6 = var0.field1012[0];
      int var7 = var0.method1788();
      if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7) {
         if (var1 >= var7 && var1 < 104 - var7 && var2 >= var7 && var2 < 104 - var7) {
            int var9 = var0.method1788();
            field1731.field2447 = var1;
            field1731.field2445 = var2;
            field1731.field2446 = 1;
            field1731.field2444 = 1;
            class67 var10 = field1731;
            class218 var12 = field1504[var0.field759];
            int[] var13 = field1711;
            int[] var14 = field1653;
            int var8 = class283.method5407(var5, var6, var9, var10, var12, true, var13, var14, class210.field2260[0]);
            if (var8 >= 1) {
               for(int var16 = 0; var16 < var8 - 1; ++var16) {
                  var0.method1792(field1711[var16], field1653[var16], var3);
               }

            }
         }
      }
   }

   static void method1758() {
      field1594 = 0;
      field1576 = false;
      field1583[0] = class364.field4177;
      field1584[0] = "";
      field1580[0] = 1006;
      field1585[0] = false;
      field1594 = 1;
   }

   static final void method5888(int var0, int var1) {
      if (field1594 >= 2 || field1494 != 0 || field1657) {
         if (field1617) {
            int var3 = method1537();
            String var4;
            if (1 == field1494 && field1594 < 2) {
               var4 = class364.field4277 + class364.field4194 + field1473 + " " + class90.field828;
            } else if (field1657 && field1594 < 2) {
               var4 = field1552 + class364.field4194 + field1650 + " " + class90.field828;
            } else {
               String var5;
               if (var3 < 0) {
                  var5 = "";
               } else if (field1584[var3].length() > 0) {
                  var5 = field1583[var3] + class364.field4194 + field1584[var3];
               } else {
                  var5 = field1583[var3];
               }

               var4 = var5;
            }

            if (field1594 > 2) {
               var4 = var4 + class90.method5890(16777215) + " " + '/' + " " + (field1594 - 2) + class364.field4026;
            }

            class316.field3504.method7176(var4, var0 + 4, var1 + 15, 16777215, 0, field1445 / 1000);
         }
      }
   }

   static final boolean method2054() {
      return field1576;
   }

   static final void method4202(int var0, int var1, int var2, int var3) {
      for(int var5 = 0; var5 < field1648; ++var5) {
         if (field1655[var5] + field1581[var5] > var0 && field1581[var5] < var0 + var2 && field1654[var5] + field1656[var5] > var1 && field1654[var5] < var3 + var1) {
            field1634[var5] = true;
         }
      }

   }

   static void method2651(int var0, int var1) {
      int var3 = class316.field3504.method7225(class364.field4187);

      int var4;
      for(var4 = 0; var4 < field1594; ++var4) {
         class393 var5 = class316.field3504;
         String var6;
         if (var4 < 0) {
            var6 = "";
         } else if (field1584[var4].length() > 0) {
            var6 = field1583[var4] + class364.field4194 + field1584[var4];
         } else {
            var6 = field1583[var4];
         }

         int var7 = var5.method7225(var6);
         if (var7 > var3) {
            var3 = var7;
         }
      }

      var3 += 8;
      var4 = 22 + field1594 * 15;
      int var8 = var0 - var3 / 2;
      if (var3 + var8 > class343.field3838) {
         var8 = class343.field3838 - var3;
      }

      if (var8 < 0) {
         var8 = 0;
      }

      int var9 = var1;
      if (var4 + var1 > class488.field4948) {
         var9 = class488.field4948 - var4;
      }

      if (var9 < 0) {
         var9 = 0;
      }

      Js5Index.field40 = var8;
      class128.field1214 = var9;
      class109.field1067 = var3;
      class388.field4438 = field1594 * 15 + 22;
   }

   static final boolean method2249(int var0) {
      if (var0 < 0) {
         return false;
      } else {
         int var2 = field1580[var0];
         if (var2 >= 2000) {
            var2 -= 2000;
         }

         return var2 == 1007;
      }
   }

   static final void method505(int var0) {
      if (var0 >= 0) {
         int var2 = field1578[var0];
         int var3 = field1579[var0];
         int var4 = field1580[var0];
         int var5 = field1704[var0];
         int var6 = field1582[var0];
         String var7 = field1583[var0];
         String var8 = field1584[var0];
         method1172(var2, var3, var4, var5, var6, var7, var8, class41.field257, class41.field258);
      }
   }

   static final void method1172(int var0, int var1, int var2, int var3, int var4, String var5, String var6, int var7, int var8) {
      if (var2 >= 2000) {
         var2 -= 2000;
      }

      class86 var10;
      class308 var12;
      if (var2 == 1003) {
         field1548 = var7;
         field1442 = var8;
         field1551 = 2;
         field1681 = 0;
         var10 = field1489[var3];
         if (var10 != null) {
            class191 var11 = var10.field776;
            if (null != var11.field2066) {
               var11 = var11.method3652();
            }

            if (null != var11) {
               var12 = class308.method8607(ClientPacket.field3387, serverConnection.field1046);
               var12.packet.writeShortAdd(var11.field2047);
               serverConnection.method2148(var12);
            }
         }
      }

      class308 var14;
      if (var2 == 7) {
         var10 = field1489[var3];
         if (null != var10) {
            field1548 = var7;
            field1442 = var8;
            field1551 = 2;
            field1681 = 0;
            field1513 = var0;
            field1680 = var1;
            var14 = class308.method8607(ClientPacket.field3426, serverConnection.field1046);
            var14.packet.writeShortAdd(class306.field3338);
            var14.packet.writeShortLEAdd(class103.field1020);
            var14.packet.writeIntIME(class354.field3921);
            var14.packet.writeShortAdd(var3);
            var14.packet.writeByte(field1666.method4103(82) ? 1 : 0);
            serverConnection.method2148(var14);
         }
      }

      class84 var13;
      if (var2 == 49) {
         var13 = field1527[var3];
         if (var13 != null) {
            field1548 = var7;
            field1442 = var8;
            field1551 = 2;
            field1681 = 0;
            field1513 = var0;
            field1680 = var1;
            var14 = class308.method8607(ClientPacket.field3407, serverConnection.field1046);
            var14.packet.writeShortLEAdd(var3);
            var14.packet.writeByteSub(field1666.method4103(82) ? 1 : 0);
            serverConnection.method2148(var14);
         }
      }

      if (var2 == 9) {
         var10 = field1489[var3];
         if (null != var10) {
            field1548 = var7;
            field1442 = var8;
            field1551 = 2;
            field1681 = 0;
            field1513 = var0;
            field1680 = var1;
            var14 = class308.method8607(ClientPacket.field3393, serverConnection.field1046);
            var14.packet.writeByte(field1666.method4103(82) ? 1 : 0);
            var14.packet.writeShortLEAdd(var3);
            serverConnection.method2148(var14);
         }
      }

      if (var2 == 45) {
         var13 = field1527[var3];
         if (null != var13) {
            field1548 = var7;
            field1442 = var8;
            field1551 = 2;
            field1681 = 0;
            field1513 = var0;
            field1680 = var1;
            var14 = class308.method8607(ClientPacket.field3419, serverConnection.field1046);
            var14.packet.writeShortLEAdd(var3);
            var14.packet.writeByteNeg(field1666.method4103(82) ? 1 : 0);
            serverConnection.method2148(var14);
         }
      }

      if (var2 == 51) {
         var13 = field1527[var3];
         if (var13 != null) {
            field1548 = var7;
            field1442 = var8;
            field1551 = 2;
            field1681 = 0;
            field1513 = var0;
            field1680 = var1;
            var14 = class308.method8607(ClientPacket.field3383, serverConnection.field1046);
            var14.packet.writeShortLEAdd(var3);
            var14.packet.writeByteSub(field1666.method4103(82) ? 1 : 0);
            serverConnection.method2148(var14);
         }
      }

      class308 var15;
      if (var2 == 1002) {
         field1548 = var7;
         field1442 = var8;
         field1551 = 2;
         field1681 = 0;
         var15 = class308.method8607(ClientPacket.field3433, serverConnection.field1046);
         var15.packet.writeShort(var3);
         serverConnection.method2148(var15);
      }

      if (var2 == 48) {
         var13 = field1527[var3];
         if (null != var13) {
            field1548 = var7;
            field1442 = var8;
            field1551 = 2;
            field1681 = 0;
            field1513 = var0;
            field1680 = var1;
            var14 = class308.method8607(ClientPacket.field3423, serverConnection.field1046);
            var14.packet.writeShortAdd(var3);
            var14.packet.writeByteNeg(field1666.method4103(82) ? 1 : 0);
            serverConnection.method2148(var14);
         }
      }

      if (var2 == 1001) {
         field1548 = var7;
         field1442 = var8;
         field1551 = 2;
         field1681 = 0;
         field1513 = var0;
         field1680 = var1;
         var15 = class308.method8607(ClientPacket.field3392, serverConnection.field1046);
         var15.packet.writeByte(field1666.method4103(82) ? 1 : 0);
         var15.packet.writeShortLEAdd(var3);
         var15.packet.writeShortLEAdd(class144.field1352 + var1);
         var15.packet.writeShortLEAdd(var0 + class342.field3837);
         serverConnection.method2148(var15);
      }

      if (var2 == 12) {
         var10 = field1489[var3];
         if (null != var10) {
            field1548 = var7;
            field1442 = var8;
            field1551 = 2;
            field1681 = 0;
            field1513 = var0;
            field1680 = var1;
            var14 = class308.method8607(ClientPacket.field3442, serverConnection.field1046);
            var14.packet.writeShortLE(var3);
            var14.packet.writeByte(field1666.method4103(82) ? 1 : 0);
            serverConnection.method2148(var14);
         }
      }

      Component var17;
      if (var2 == 58) {
         var17 = Component.method1772(var1, var0);
         if (var17 != null) {
            if (null != var17.field3611) {
               class87 var18 = new class87();
               var18.field786 = var17;
               var18.field791 = var3;
               var18.field793 = var6;
               var18.field790 = var17.field3611;
               class63.method1516(var18);
            }

            var14 = class308.method8607(ClientPacket.field3377, serverConnection.field1046);
            var14.packet.writeShortAdd(field1597);
            var14.packet.writeShortLE(var0);
            var14.packet.writeShortAdd(field1596);
            var14.packet.writeShortLEAdd(var4);
            var14.packet.writeIntME(class48.field347);
            var14.packet.writeIntME(var1);
            serverConnection.method2148(var14);
         }
      }

      if (var2 == 8) {
         var10 = field1489[var3];
         if (var10 != null) {
            field1548 = var7;
            field1442 = var8;
            field1551 = 2;
            field1681 = 0;
            field1513 = var0;
            field1680 = var1;
            var14 = class308.method8607(ClientPacket.field3370, serverConnection.field1046);
            var14.packet.writeIntIME(class48.field347);
            var14.packet.writeShortLE(field1596);
            var14.packet.writeShortLE(field1597);
            var14.packet.writeShortLE(var3);
            var14.packet.writeByte(field1666.method4103(82) ? 1 : 0);
            serverConnection.method2148(var14);
         }
      }

      if (var2 == 1) {
         field1548 = var7;
         field1442 = var8;
         field1551 = 2;
         field1681 = 0;
         field1513 = var0;
         field1680 = var1;
         var15 = class308.method8607(ClientPacket.field3401, serverConnection.field1046);
         var15.packet.writeShortLE(var3);
         var15.packet.writeShortLE(class103.field1020);
         var15.packet.writeShortLE(class306.field3338);
         var15.packet.writeShortLE(class342.field3837 + var0);
         var15.packet.writeByteAdd(field1666.method4103(82) ? 1 : 0);
         var15.packet.writeInt(class354.field3921);
         var15.packet.writeShortLE(class144.field1352 + var1);
         serverConnection.method2148(var15);
      }

      if (var2 == 47) {
         var13 = field1527[var3];
         if (var13 != null) {
            field1548 = var7;
            field1442 = var8;
            field1551 = 2;
            field1681 = 0;
            field1513 = var0;
            field1680 = var1;
            var14 = class308.method8607(ClientPacket.field3417, serverConnection.field1046);
            var14.packet.writeShortAdd(var3);
            var14.packet.writeByte(field1666.method4103(82) ? 1 : 0);
            serverConnection.method2148(var14);
         }
      }

      if (var2 == 44) {
         var13 = field1527[var3];
         if (null != var13) {
            field1548 = var7;
            field1442 = var8;
            field1551 = 2;
            field1681 = 0;
            field1513 = var0;
            field1680 = var1;
            var14 = class308.method8607(ClientPacket.field3441, serverConnection.field1046);
            var14.packet.writeShortLEAdd(var3);
            var14.packet.writeByteSub(field1666.method4103(82) ? 1 : 0);
            serverConnection.method2148(var14);
         }
      }

      if (var2 == 11) {
         var10 = field1489[var3];
         if (var10 != null) {
            field1548 = var7;
            field1442 = var8;
            field1551 = 2;
            field1681 = 0;
            field1513 = var0;
            field1680 = var1;
            var14 = class308.method8607(ClientPacket.field3429, serverConnection.field1046);
            var14.packet.writeShort(var3);
            var14.packet.writeByteAdd(field1666.method4103(82) ? 1 : 0);
            serverConnection.method2148(var14);
         }
      }

      int var16;
      Component var19;
      if (var2 == 29) {
         var15 = class308.method8607(ClientPacket.field3458, serverConnection.field1046);
         var15.packet.writeInt(var1);
         serverConnection.method2148(var15);
         var19 = Component.getComponent(var1);
         if (var19 != null && null != var19.field3727 && var19.field3727[0][0] == 5) {
            var16 = var19.field3727[0][1];
            if (class329.field3577[var16] != var19.field3604[0]) {
               class329.field3577[var16] = var19.field3604[0];
               method1195(var16);
            }
         }
      }

      if (var2 == 22) {
         field1548 = var7;
         field1442 = var8;
         field1551 = 2;
         field1681 = 0;
         field1513 = var0;
         field1680 = var1;
         var15 = class308.method8607(ClientPacket.field3362, serverConnection.field1046);
         var15.packet.writeShortAdd(class342.field3837 + var0);
         var15.packet.writeByteAdd(field1666.method4103(82) ? 1 : 0);
         var15.packet.writeShortAdd(var3);
         var15.packet.writeShortAdd(class144.field1352 + var1);
         serverConnection.method2148(var15);
      }

      if (var2 == 50) {
         var13 = field1527[var3];
         if (var13 != null) {
            field1548 = var7;
            field1442 = var8;
            field1551 = 2;
            field1681 = 0;
            field1513 = var0;
            field1680 = var1;
            var14 = class308.method8607(ClientPacket.field3456, serverConnection.field1046);
            var14.packet.writeShort(var3);
            var14.packet.writeByteNeg(field1666.method4103(82) ? 1 : 0);
            serverConnection.method2148(var14);
         }
      }

      if (var2 == 14) {
         var13 = field1527[var3];
         if (null != var13) {
            field1548 = var7;
            field1442 = var8;
            field1551 = 2;
            field1681 = 0;
            field1513 = var0;
            field1680 = var1;
            var14 = class308.method8607(ClientPacket.field3446, serverConnection.field1046);
            var14.packet.writeShortLEAdd(class103.field1020);
            var14.packet.writeShortLEAdd(class306.field3338);
            var14.packet.writeIntLE(class354.field3921);
            var14.packet.writeShort(var3);
            var14.packet.writeByte(field1666.method4103(82) ? 1 : 0);
            serverConnection.method2148(var14);
         }
      }

      if (var2 == 26) {
         class402.method7065();
      }

      if (var2 == 23) {
         if (field1576) {
            class109.field1065.method4445();
         } else {
            class109.field1065.method4529(class44.field306, var0, var1, true);
         }
      }

      if (var2 == 16) {
         field1548 = var7;
         field1442 = var8;
         field1551 = 2;
         field1681 = 0;
         field1513 = var0;
         field1680 = var1;
         var15 = class308.method8607(ClientPacket.field3397, serverConnection.field1046);
         var15.packet.writeShortLE(class306.field3338);
         var15.packet.writeShortLE(class103.field1020);
         var15.packet.writeShortLE(var3);
         var15.packet.writeShortLE(class144.field1352 + var1);
         var15.packet.writeShortLEAdd(class342.field3837 + var0);
         var15.packet.writeByteAdd(field1666.method4103(82) ? 1 : 0);
         var15.packet.writeIntME(class354.field3921);
         serverConnection.method2148(var15);
      }

      if (var2 == 57 || var2 == 1007) {
         var17 = Component.method1772(var1, var0);
         if (null != var17) {
            method7794(var3, var1, var0, var4, var6);
         }
      }

      if (var2 == 25) {
         var17 = Component.method1772(var1, var0);
         if (var17 != null) {
            method521();
            method6520(var1, var0, class323.method5357(method2338(var17)), var4);
            field1494 = 0;
            field1552 = method348(var17);
            if (field1552 == null) {
               field1552 = class364.field4028;
            }

            if (var17.field3605) {
               field1650 = var17.field3686 + class90.method5890(16777215);
            } else {
               field1650 = class90.method5890(65280) + var17.field3735 + class90.method5890(16777215);
            }
         }

      } else {
         if (var2 == 1008 || var2 == 1009 || var2 == 1010 || var2 == 1011 || var2 == 1012) {
            class115.field1095.method8261(var2, var3, new class330(var0), new class330(var1));
         }

         if (var2 == 46) {
            var13 = field1527[var3];
            if (null != var13) {
               field1548 = var7;
               field1442 = var8;
               field1551 = 2;
               field1681 = 0;
               field1513 = var0;
               field1680 = var1;
               var14 = class308.method8607(ClientPacket.field3402, serverConnection.field1046);
               var14.packet.writeByte(field1666.method4103(82) ? 1 : 0);
               var14.packet.writeShort(var3);
               serverConnection.method2148(var14);
            }
         }

         if (var2 == 15) {
            var13 = field1527[var3];
            if (null != var13) {
               field1548 = var7;
               field1442 = var8;
               field1551 = 2;
               field1681 = 0;
               field1513 = var0;
               field1680 = var1;
               var14 = class308.method8607(ClientPacket.field3452, serverConnection.field1046);
               var14.packet.writeShortAdd(var3);
               var14.packet.writeIntME(class48.field347);
               var14.packet.writeByte(field1666.method4103(82) ? 1 : 0);
               var14.packet.writeShort(field1597);
               var14.packet.writeShortLE(field1596);
               serverConnection.method2148(var14);
            }
         }

         if (var2 == 6) {
            field1548 = var7;
            field1442 = var8;
            field1551 = 2;
            field1681 = 0;
            field1513 = var0;
            field1680 = var1;
            var15 = class308.method8607(ClientPacket.field3421, serverConnection.field1046);
            var15.packet.writeShortLEAdd(class144.field1352 + var1);
            var15.packet.writeShortLE(class342.field3837 + var0);
            var15.packet.writeShort(var3);
            var15.packet.writeByteAdd(field1666.method4103(82) ? 1 : 0);
            serverConnection.method2148(var15);
         }

         if (var2 == 20) {
            field1548 = var7;
            field1442 = var8;
            field1551 = 2;
            field1681 = 0;
            field1513 = var0;
            field1680 = var1;
            var15 = class308.method8607(ClientPacket.field3434, serverConnection.field1046);
            var15.packet.writeShortAdd(var0 + class342.field3837);
            var15.packet.writeShortAdd(var3);
            var15.packet.writeShortLE(var1 + class144.field1352);
            var15.packet.writeByteNeg(field1666.method4103(82) ? 1 : 0);
            serverConnection.method2148(var15);
         }

         if (var2 == 17) {
            field1548 = var7;
            field1442 = var8;
            field1551 = 2;
            field1681 = 0;
            field1513 = var0;
            field1680 = var1;
            var15 = class308.method8607(ClientPacket.field3425, serverConnection.field1046);
            var15.packet.writeShortLE(var1 + class144.field1352);
            var15.packet.writeShortAdd(field1596);
            var15.packet.writeShortAdd(var3);
            var15.packet.writeIntLE(class48.field347);
            var15.packet.writeShortAdd(field1597);
            var15.packet.writeByteNeg(field1666.method4103(82) ? 1 : 0);
            var15.packet.writeShort(var0 + class342.field3837);
            serverConnection.method2148(var15);
         }

         if (var2 == 19) {
            field1548 = var7;
            field1442 = var8;
            field1551 = 2;
            field1681 = 0;
            field1513 = var0;
            field1680 = var1;
            var15 = class308.method8607(ClientPacket.field3420, serverConnection.field1046);
            var15.packet.writeShortLE(class342.field3837 + var0);
            var15.packet.writeByteNeg(field1666.method4103(82) ? 1 : 0);
            var15.packet.writeShortLE(var3);
            var15.packet.writeShortLEAdd(var1 + class144.field1352);
            serverConnection.method2148(var15);
         }

         if (var2 == 10) {
            var10 = field1489[var3];
            if (var10 != null) {
               field1548 = var7;
               field1442 = var8;
               field1551 = 2;
               field1681 = 0;
               field1513 = var0;
               field1680 = var1;
               var14 = class308.method8607(ClientPacket.field3438, serverConnection.field1046);
               var14.packet.writeByte(field1666.method4103(82) ? 1 : 0);
               var14.packet.writeShortLE(var3);
               serverConnection.method2148(var14);
            }
         }

         if (var2 == 2) {
            field1548 = var7;
            field1442 = var8;
            field1551 = 2;
            field1681 = 0;
            field1513 = var0;
            field1680 = var1;
            var15 = class308.method8607(ClientPacket.field3451, serverConnection.field1046);
            var15.packet.writeByteNeg(field1666.method4103(82) ? 1 : 0);
            var15.packet.writeShort(field1597);
            var15.packet.writeShort(var3);
            var15.packet.writeShort(var1 + class144.field1352);
            var15.packet.writeShortAdd(var0 + class342.field3837);
            var15.packet.writeShortLE(field1596);
            var15.packet.writeIntIME(class48.field347);
            serverConnection.method2148(var15);
         }

         if (var2 == 3) {
            field1548 = var7;
            field1442 = var8;
            field1551 = 2;
            field1681 = 0;
            field1513 = var0;
            field1680 = var1;
            var15 = class308.method8607(ClientPacket.field3399, serverConnection.field1046);
            var15.packet.writeShortLE(class144.field1352 + var1);
            var15.packet.writeShortLE(class342.field3837 + var0);
            var15.packet.writeByteSub(field1666.method4103(82) ? 1 : 0);
            var15.packet.writeShort(var3);
            serverConnection.method2148(var15);
         }

         if (var2 == 24) {
            var17 = Component.getComponent(var1);
            if (var17 != null) {
               boolean var20 = true;
               if (var17.field3631 > 0) {
                  var20 = method8095(var17);
               }

               if (var20) {
                  var12 = class308.method8607(ClientPacket.field3458, serverConnection.field1046);
                  var12.packet.writeInt(var1);
                  serverConnection.method2148(var12);
               }
            }
         }

         if (var2 == 5) {
            field1548 = var7;
            field1442 = var8;
            field1551 = 2;
            field1681 = 0;
            field1513 = var0;
            field1680 = var1;
            var15 = class308.method8607(ClientPacket.field3413, serverConnection.field1046);
            var15.packet.writeShortAdd(var0 + class342.field3837);
            var15.packet.writeByteSub(field1666.method4103(82) ? 1 : 0);
            var15.packet.writeShortAdd(var1 + class144.field1352);
            var15.packet.writeShortLEAdd(var3);
            serverConnection.method2148(var15);
         }

         if (var2 == 21) {
            field1548 = var7;
            field1442 = var8;
            field1551 = 2;
            field1681 = 0;
            field1513 = var0;
            field1680 = var1;
            var15 = class308.method8607(ClientPacket.field3415, serverConnection.field1046);
            var15.packet.writeByteSub(field1666.method4103(82) ? 1 : 0);
            var15.packet.writeShortLE(var3);
            var15.packet.writeShortLEAdd(var1 + class144.field1352);
            var15.packet.writeShortLEAdd(class342.field3837 + var0);
            serverConnection.method2148(var15);
         }

         if (var2 == 18) {
            field1548 = var7;
            field1442 = var8;
            field1551 = 2;
            field1681 = 0;
            field1513 = var0;
            field1680 = var1;
            var15 = class308.method8607(ClientPacket.field3369, serverConnection.field1046);
            var15.packet.writeByteSub(field1666.method4103(82) ? 1 : 0);
            var15.packet.writeShortLEAdd(var1 + class144.field1352);
            var15.packet.writeShortLEAdd(var3);
            var15.packet.writeShortLEAdd(var0 + class342.field3837);
            serverConnection.method2148(var15);
         }

         if (var2 == 30 && meslayerPauseButtonComponent == null) {
            method5003(var1, var0);
            meslayerPauseButtonComponent = Component.method1772(var1, var0);
            setDirty(meslayerPauseButtonComponent);
         }

         if (var2 == 1004) {
            field1548 = var7;
            field1442 = var8;
            field1551 = 2;
            field1681 = 0;
            var15 = class308.method8607(ClientPacket.field3374, serverConnection.field1046);
            var15.packet.writeShortLE(var0 + class342.field3837);
            var15.packet.writeShortAdd(var3);
            var15.packet.writeShortLEAdd(class144.field1352 + var1);
            serverConnection.method2148(var15);
         }

         if (var2 == 4) {
            field1548 = var7;
            field1442 = var8;
            field1551 = 2;
            field1681 = 0;
            field1513 = var0;
            field1680 = var1;
            var15 = class308.method8607(ClientPacket.field3371, serverConnection.field1046);
            var15.packet.writeShortLE(var1 + class144.field1352);
            var15.packet.writeShortLEAdd(var3);
            var15.packet.writeByte(field1666.method4103(82) ? 1 : 0);
            var15.packet.writeShortAdd(class342.field3837 + var0);
            serverConnection.method2148(var15);
         }

         if (var2 == 28) {
            var15 = class308.method8607(ClientPacket.field3458, serverConnection.field1046);
            var15.packet.writeInt(var1);
            serverConnection.method2148(var15);
            var19 = Component.getComponent(var1);
            if (null != var19 && null != var19.field3727 && 5 == var19.field3727[0][0]) {
               var16 = var19.field3727[0][1];
               class329.field3577[var16] = 1 - class329.field3577[var16];
               method1195(var16);
            }
         }

         if (var2 == 13) {
            var10 = field1489[var3];
            if (var10 != null) {
               field1548 = var7;
               field1442 = var8;
               field1551 = 2;
               field1681 = 0;
               field1513 = var0;
               field1680 = var1;
               var14 = class308.method8607(ClientPacket.field3431, serverConnection.field1046);
               var14.packet.writeByteSub(field1666.method4103(82) ? 1 : 0);
               var14.packet.writeShort(var3);
               serverConnection.method2148(var14);
            }
         }

         if (0 != field1494) {
            field1494 = 0;
            setDirty(Component.getComponent(class354.field3921));
         }

         if (field1657) {
            method521();
         }

      }
   }

   static void method6520(int var0, int var1, int var2, int var3) {
      Component var5 = Component.method1772(var0, var1);
      if (var5 != null && null != var5.field3716) {
         class87 var6 = new class87();
         var6.field786 = var5;
         var6.field790 = var5.field3716;
         class63.method1516(var6);
      }

      field1597 = var3;
      field1657 = true;
      class48.field347 = var0;
      field1596 = var1;
      class37.field195 = var2;
      setDirty(var5);
   }

   static void method521() {
      if (field1657) {
         Component var1 = Component.method1772(class48.field347, field1596);
         if (var1 != null && var1.field3706 != null) {
            class87 var2 = new class87();
            var2.field786 = var1;
            var2.field790 = var1.field3706;
            class63.method1516(var2);
         }

         field1597 = -1;
         field1657 = false;
         setDirty(var1);
      }
   }

   static void method5003(int var0, int var1) {
      class308 var3 = class308.method8607(ClientPacket.field3430, serverConnection.field1046);
      var3.packet.writeShortLEAdd(var1);
      var3.packet.writeIntME(var0);
      serverConnection.method2148(var3);
   }

   static void method7794(int var0, int var1, int var2, int var3, String var4) {
      Component var6 = Component.method1772(var1, var2);
      if (null != var6) {
         if (var6.field3713 != null) {
            class87 var7 = new class87();
            var7.field786 = var6;
            var7.field791 = var0;
            var7.field793 = var4;
            var7.field790 = var6.field3713;
            class63.method1516(var7);
         }

         boolean var12 = true;
         if (var6.field3631 > 0) {
            var12 = method8095(var6);
         }

         if (var12) {
            int var9 = method2338(var6);
            int var10 = var0 - 1;
            boolean var8 = (var9 >> var10 + 1 & 1) != 0;
            if (var8) {
               class308 var11;
               if (var0 == 1) {
                  var11 = class308.method8607(ClientPacket.field3396, serverConnection.field1046);
                  var11.packet.writeInt(var1);
                  var11.packet.writeShort(var2);
                  var11.packet.writeShort(var3);
                  serverConnection.method2148(var11);
               }

               if (var0 == 2) {
                  var11 = class308.method8607(ClientPacket.field3445, serverConnection.field1046);
                  var11.packet.writeInt(var1);
                  var11.packet.writeShort(var2);
                  var11.packet.writeShort(var3);
                  serverConnection.method2148(var11);
               }

               if (var0 == 3) {
                  var11 = class308.method8607(ClientPacket.field3363, serverConnection.field1046);
                  var11.packet.writeInt(var1);
                  var11.packet.writeShort(var2);
                  var11.packet.writeShort(var3);
                  serverConnection.method2148(var11);
               }

               if (var0 == 4) {
                  var11 = class308.method8607(ClientPacket.field3398, serverConnection.field1046);
                  var11.packet.writeInt(var1);
                  var11.packet.writeShort(var2);
                  var11.packet.writeShort(var3);
                  serverConnection.method2148(var11);
               }

               if (var0 == 5) {
                  var11 = class308.method8607(ClientPacket.field3394, serverConnection.field1046);
                  var11.packet.writeInt(var1);
                  var11.packet.writeShort(var2);
                  var11.packet.writeShort(var3);
                  serverConnection.method2148(var11);
               }

               if (var0 == 6) {
                  var11 = class308.method8607(ClientPacket.field3367, serverConnection.field1046);
                  var11.packet.writeInt(var1);
                  var11.packet.writeShort(var2);
                  var11.packet.writeShort(var3);
                  serverConnection.method2148(var11);
               }

               if (var0 == 7) {
                  var11 = class308.method8607(ClientPacket.field3444, serverConnection.field1046);
                  var11.packet.writeInt(var1);
                  var11.packet.writeShort(var2);
                  var11.packet.writeShort(var3);
                  serverConnection.method2148(var11);
               }

               if (var0 == 8) {
                  var11 = class308.method8607(ClientPacket.field3418, serverConnection.field1046);
                  var11.packet.writeInt(var1);
                  var11.packet.writeShort(var2);
                  var11.packet.writeShort(var3);
                  serverConnection.method2148(var11);
               }

               if (var0 == 9) {
                  var11 = class308.method8607(ClientPacket.field3386, serverConnection.field1046);
                  var11.packet.writeInt(var1);
                  var11.packet.writeShort(var2);
                  var11.packet.writeShort(var3);
                  serverConnection.method2148(var11);
               }

               if (var0 == 10) {
                  var11 = class308.method8607(ClientPacket.field3384, serverConnection.field1046);
                  var11.packet.writeInt(var1);
                  var11.packet.writeShort(var2);
                  var11.packet.writeShort(var3);
                  serverConnection.method2148(var11);
               }

            }
         }
      }
   }

   static final void method2465() {
      boolean var1 = false;

      while(!var1) {
         var1 = true;

         for(int var2 = 0; var2 < field1594 - 1; ++var2) {
            if (field1580[var2] < 1000 && field1580[var2 + 1] > 1000) {
               String var3 = field1584[var2];
               field1584[var2] = field1584[var2 + 1];
               field1584[var2 + 1] = var3;
               String var4 = field1583[var2];
               field1583[var2] = field1583[var2 + 1];
               field1583[var2 + 1] = var4;
               int var5 = field1580[var2];
               field1580[var2] = field1580[var2 + 1];
               field1580[var2 + 1] = var5;
               var5 = field1578[var2];
               field1578[var2] = field1578[var2 + 1];
               field1578[var2 + 1] = var5;
               var5 = field1579[var2];
               field1579[var2] = field1579[var2 + 1];
               field1579[var2 + 1] = var5;
               var5 = field1704[var2];
               field1704[var2] = field1704[var2 + 1];
               field1704[var2 + 1] = var5;
               var5 = field1582[var2];
               field1582[var2] = field1582[var2 + 1];
               field1582[var2 + 1] = var5;
               boolean var6 = field1585[var2];
               field1585[var2] = field1585[var2 + 1];
               field1585[var2 + 1] = var6;
               var1 = false;
            }
         }
      }

   }

   public static final void method3242(String var0, String var1, int var2, int var3, int var4, int var5) {
      method360(var0, var1, var2, var3, var4, var5, -1, false);
   }

   static final void method2656(String var0, String var1, int var2, int var3, int var4, int var5, int var6) {
      method360(var0, var1, var2, var3, var4, var5, var6, false);
   }

   static final void method360(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      if (!field1576) {
         if (field1594 < 500) {
            field1583[field1594] = var0;
            field1584[field1594] = var1;
            field1580[field1594] = var2;
            field1704[field1594] = var3;
            field1578[field1594] = var4;
            field1579[field1594] = var5;
            field1582[field1594] = var6;
            field1585[field1594] = var7;
            ++field1594;
         }

      }
   }

   static final int method1537() {
      return field1594 - 1;
   }

   static final void method1541(int var0, int var1, int var2, int var3) {
      if (0 == field1494 && !field1657) {
         method3242(class364.field4189, "", 23, 0, var0 - var2, var1 - var3);
      }

      long var5 = -1L;
      long var7 = -1L;

      int var9;
      for(var9 = 0; var9 < class252.method8084(); ++var9) {
         long var10 = class252.field2843[var9];
         if (var7 != var10) {
            var7 = var10;
            int var14 = class252.method6950(var9);
            int var15 = class252.method3572(class252.field2843[var9]);
            int var17 = class252.method110(class252.field2843[var9]);
            int var19 = class252.method7841(class252.field2843[var9]);
            int var24;
            int var25;
            if (var17 == 2 && class109.field1065.method4435(class44.field306, var14, var15, var10) >= 0) {
               class184 var21 = class98.method2042(var19);
               if (null != var21.field1946) {
                  var21 = var21.method3456();
               }

               if (null == var21) {
                  continue;
               }

               class104 var22 = null;

               for(class104 var23 = (class104)field1593.method6706(); null != var23; var23 = (class104)field1593.method6687()) {
                  if (var23.field1036 == class44.field306 && var23.field1023 == var14 && var15 == var23.field1024 && var23.field1031 == var19) {
                     var22 = var23;
                     break;
                  }
               }

               if (1 == field1494) {
                  method3242(class364.field4277, field1473 + " " + class90.field828 + " " + class90.method5890(65535) + var21.field1904, 1, var19, var14, var15);
               } else if (field1657) {
                  if ((class37.field195 & 4) == 4) {
                     method3242(field1552, field1650 + " " + class90.field828 + " " + class90.method5890(65535) + var21.field1904, 2, var19, var14, var15);
                  }
               } else {
                  String[] var31 = var21.field1932;
                  if (null != var31) {
                     for(var24 = 4; var24 >= 0; --var24) {
                        if ((null == var22 || var22.method2111(var24)) && var31[var24] != null) {
                           var25 = 0;
                           if (var24 == 0) {
                              var25 = 3;
                           }

                           if (var24 == 1) {
                              var25 = 4;
                           }

                           if (var24 == 2) {
                              var25 = 5;
                           }

                           if (var24 == 3) {
                              var25 = 6;
                           }

                           if (var24 == 4) {
                              var25 = 1001;
                           }

                           method3242(var31[var24], class90.method5890(65535) + var21.field1904, var25, var19, var14, var15);
                        }
                     }
                  }

                  method3242(class364.field4185, class90.method5890(65535) + var21.field1904, 1002, var21.field1912, var14, var15);
               }
            }

            int var30;
            class86 var32;
            int[] var33;
            class84 var37;
            if (var17 == 1) {
               class86 var27 = field1489[var19];
               if (var27 == null) {
                  continue;
               }

               if (var27.field776.field2049 == 1 && (var27.field949 & 127) == 64 && 64 == (var27.field963 & 127)) {
                  for(var30 = 0; var30 < field1565; ++var30) {
                     var32 = field1489[field1491[var30]];
                     if (var32 != null && var32 != var27 && 1 == var32.field776.field2049 && var27.field949 == var32.field949 && var27.field963 == var32.field963) {
                        class189.method3596(var32, field1491[var30], var14, var15);
                     }
                  }

                  var30 = class116.field1116;
                  var33 = class116.field1120;

                  for(var24 = 0; var24 < var30; ++var24) {
                     var37 = field1527[var33[var24]];
                     if (var37 != null && var27.field949 == var37.field949 && var27.field963 == var37.field963) {
                        method5342(var37, var33[var24], var14, var15);
                     }
                  }
               }

               class189.method3596(var27, var19, var14, var15);
            }

            if (var17 == 0) {
               class84 var28 = field1527[var19];
               if (null == var28) {
                  continue;
               }

               if (64 == (var28.field949 & 127) && 64 == (var28.field963 & 127)) {
                  for(var30 = 0; var30 < field1565; ++var30) {
                     var32 = field1489[field1491[var30]];
                     if (var32 != null && var32.field776.field2049 == 1 && var28.field949 == var32.field949 && var32.field963 == var28.field963) {
                        class189.method3596(var32, field1491[var30], var14, var15);
                     }
                  }

                  var30 = class116.field1116;
                  var33 = class116.field1120;

                  for(var24 = 0; var24 < var30; ++var24) {
                     var37 = field1527[var33[var24]];
                     if (null != var37 && var37 != var28 && var28.field949 == var37.field949 && var28.field963 == var37.field963) {
                        method5342(var37, var33[var24], var14, var15);
                     }
                  }
               }

               if (field1567 != var19) {
                  method5342(var28, var19, var14, var15);
               } else {
                  var5 = var10;
               }
            }

            if (var17 == 3) {
               class368 var29 = field1568[class44.field306][var14][var15];
               if (var29 != null) {
                  for(class124 var34 = (class124)var29.method6695(); null != var34; var34 = (class124)var29.method6704()) {
                     class185 var35 = class185.method2355(var34.field1174);
                     if (1 == field1494) {
                        method3242(class364.field4277, field1473 + " " + class90.field828 + " " + class90.method5890(16748608) + var35.field1998, 16, var34.field1174, var14, var15);
                     } else if (field1657) {
                        if ((class37.field195 & 1) == 1) {
                           method3242(field1552, field1650 + " " + class90.field828 + " " + class90.method5890(16748608) + var35.field1998, 17, var34.field1174, var14, var15);
                        }
                     } else {
                        String[] var36 = var35.field1959;

                        for(var25 = 4; var25 >= 0; --var25) {
                           if (var34.method2341(var25)) {
                              if (var36 != null && null != var36[var25]) {
                                 byte var26 = 0;
                                 if (var25 == 0) {
                                    var26 = 18;
                                 }

                                 if (var25 == 1) {
                                    var26 = 19;
                                 }

                                 if (var25 == 2) {
                                    var26 = 20;
                                 }

                                 if (var25 == 3) {
                                    var26 = 21;
                                 }

                                 if (var25 == 4) {
                                    var26 = 22;
                                 }

                                 method3242(var36[var25], class90.method5890(16748608) + var35.field1998, var26, var34.field1174, var14, var15);
                              } else if (var25 == 2) {
                                 method3242(class364.field4021, class90.method5890(16748608) + var35.field1998, 20, var34.field1174, var14, var15);
                              }
                           }
                        }

                        method3242(class364.field4185, class90.method5890(16748608) + var35.field1998, 1004, var34.field1174, var14, var15);
                     }
                  }
               }
            }
         }
      }

      if (-1L != var5) {
         var9 = (int)(var5 >>> 0 & 127L);
         int var11 = class252.method3572(var5);
         class84 var12 = field1527[field1567];
         method5342(var12, field1567, var9, var11);
      }

   }

   static final void method5342(class84 var0, int var1, int var2, int var3) {
      if (var0 != class146.field1362) {
         if (field1594 < 400) {
            String var5;
            int var8;
            if (0 == var0.field761) {
               String var6 = var0.field742[0] + var0.field740 + var0.field742[1];
               var8 = var0.field743;
               int var9 = class146.field1362.field743;
               int var10 = var9 - var8;
               String var7;
               if (var10 < -9) {
                  var7 = class90.method5890(16711680);
               } else if (var10 < -6) {
                  var7 = class90.method5890(16723968);
               } else if (var10 < -3) {
                  var7 = class90.method5890(16740352);
               } else if (var10 < 0) {
                  var7 = class90.method5890(16756736);
               } else if (var10 > 9) {
                  var7 = class90.method5890(65280);
               } else if (var10 > 6) {
                  var7 = class90.method5890(4259584);
               } else if (var10 > 3) {
                  var7 = class90.method5890(8453888);
               } else if (var10 > 0) {
                  var7 = class90.method5890(12648192);
               } else {
                  var7 = class90.method5890(16776960);
               }

               var5 = var6 + var7 + " " + class90.field831 + class364.field4253 + var0.field743 + class90.field830 + var0.field742[2];
            } else {
               var5 = var0.field742[0] + var0.field740 + var0.field742[1] + " " + class90.field831 + class364.field4191 + var0.field761 + class90.field830 + var0.field742[2];
            }

            int var11;
            if (1 == field1494) {
               method3242(class364.field4277, field1473 + " " + class90.field828 + " " + class90.method5890(16777215) + var5, 14, var1, var2, var3);
            } else if (field1657) {
               if ((class37.field195 & 8) == 8) {
                  method3242(field1552, field1650 + " " + class90.field828 + " " + class90.method5890(16777215) + var5, 15, var1, var2, var3);
               }
            } else {
               for(var11 = 7; var11 >= 0; --var11) {
                  if (field1577[var11] != null) {
                     short var13 = 0;
                     if (field1577[var11].equalsIgnoreCase(class364.field4186)) {
                        if (field1460 == class101.field934) {
                           continue;
                        }

                        if (field1460 == class101.field933 || field1460 == class101.field932 && var0.field743 > class146.field1362.field743) {
                           var13 = 2000;
                        }

                        if (0 != class146.field1362.field757 && 0 != var0.field757) {
                           if (class146.field1362.field757 == var0.field757) {
                              var13 = 2000;
                           } else {
                              var13 = 0;
                           }
                        } else if (class101.field935 == field1460 && var0.method1787()) {
                           var13 = 2000;
                        }
                     } else if (field1683[var11]) {
                        var13 = 2000;
                     }

                     boolean var12 = false;
                     var8 = field1563[var11] + var13;
                     method3242(field1577[var11], class90.method5890(16777215) + var5, var8, var1, var2, var3);
                  }
               }
            }

            for(var11 = 0; var11 < field1594; ++var11) {
               if (field1580[var11] == 23) {
                  field1584[var11] = class90.method5890(16777215) + var5;
                  break;
               }
            }

         }
      }
   }

   static final void method377(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (Component.method1200(var0)) {
         class271.field2990 = null;
         method588(class96.interfaces[var0], -1, var1, var2, var3, var4, var5, var6, var7);
         if (null != class271.field2990) {
            method588(class271.field2990, -1412584499, var1, var2, var3, var4, class300.field3171, class266.field2966, var7);
            class271.field2990 = null;
         }

      } else {
         if (var7 != -1) {
            field1634[var7] = true;
         } else {
            for(int var9 = 0; var9 < 100; ++var9) {
               field1634[var9] = true;
            }
         }

      }
   }

   static final void method588(Component[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      class535.method9304(var2, var3, var4, var5);
      class229.method4291();

      for(int var10 = 0; var10 < var0.length; ++var10) {
         Component var11 = var0[var10];
         if (var11 != null && (var1 == var11.field3625 || var1 == -1412584499 && field1512 == var11)) {
            int var12;
            if (var8 == -1) {
               field1581[field1648] = var6 + var11.field3619;
               field1654[field1648] = var11.field3620 + var7;
               field1655[field1648] = var11.field3598;
               field1656[field1648] = var11.field3622;
               var12 = ++field1648 - 1;
            } else {
               var12 = var8;
            }

            var11.field3609 = var12;
            var11.field3669 = field1445;
            if (!var11.field3605 || !method6526(var11)) {
               if (var11.field3631 > 0) {
                  method3762(var11);
               }

               int var13 = var11.field3619 + var6;
               int var14 = var11.field3620 + var7;
               int var15 = var11.field3637;
               int var16;
               int var17;
               if (var11 == field1512) {
                  if (var1 != -1412584499 && !var11.field3691) {
                     class271.field2990 = var0;
                     class300.field3171 = var6;
                     class266.field2966 = var7;
                     continue;
                  }

                  if (field1516 && field1677) {
                     var16 = class41.field249;
                     var17 = class41.field250;
                     var16 -= field1614;
                     var17 -= field1615;
                     if (var16 < field1564) {
                        var16 = field1564;
                     }

                     if (var11.field3598 + var16 > field1520.field3598 + field1564) {
                        var16 = field1520.field3598 + field1564 - var11.field3598;
                     }

                     if (var17 < field1619) {
                        var17 = field1619;
                     }

                     if (var17 + var11.field3622 > field1619 + field1520.field3622) {
                        var17 = field1619 + field1520.field3622 - var11.field3622;
                     }

                     var13 = var16;
                     var14 = var17;
                  }

                  if (!var11.field3691) {
                     var15 = 128;
                  }
               }

               int var18;
               int var19;
               int var20;
               int var21;
               int var22;
               int var23;
               if (var11.field3608 == 9) {
                  var20 = var13;
                  var21 = var14;
                  var22 = var13 + var11.field3598;
                  var23 = var14 + var11.field3622;
                  if (var22 < var13) {
                     var20 = var22;
                     var22 = var13;
                  }

                  if (var23 < var14) {
                     var21 = var23;
                     var23 = var14;
                  }

                  ++var22;
                  ++var23;
                  var16 = var20 > var2 ? var20 : var2;
                  var17 = var21 > var3 ? var21 : var3;
                  var18 = var22 < var4 ? var22 : var4;
                  var19 = var23 < var5 ? var23 : var5;
               } else {
                  var20 = var11.field3598 + var13;
                  var21 = var11.field3622 + var14;
                  var16 = var13 > var2 ? var13 : var2;
                  var17 = var14 > var3 ? var14 : var3;
                  var18 = var20 < var4 ? var20 : var4;
                  var19 = var21 < var5 ? var21 : var5;
               }

               if (!var11.field3605 || var16 < var18 && var17 < var19) {
                  if (var11.field3631 != 0) {
                     if (var11.field3631 == 1336) {
                        if (class141.clientPreferences.method1694()) {
                           var14 += 15;
                           class112.field1079.method7165("Fps:" + GameShell.field274, var11.field3598 + var13, var14, 16776960, -1);
                           var14 += 15;
                           Runtime var41 = Runtime.getRuntime();
                           var21 = (int)((var41.totalMemory() - var41.freeMemory()) / 1024L);
                           var22 = 16776960;
                           if (var21 > 327680 && !isLowDetail) {
                              var22 = 16711680;
                           }

                           class112.field1079.method7165("Mem:" + var21 + "k", var13 + var11.field3598, var14, var22, -1);
                           var14 += 15;
                        }
                        continue;
                     }

                     if (1337 == var11.field3631) {
                        field1589 = var13;
                        field1590 = var14;
                        method428(var13, var14, var11.field3598, var11.field3622);
                        field1634[var11.field3609] = true;
                        class535.method9304(var2, var3, var4, var5);
                        continue;
                     }

                     if (var11.field3631 == 1338) {
                        class240.method4651(var11, var13, var14, var12);
                        class535.method9304(var2, var3, var4, var5);
                        continue;
                     }

                     if (1339 == var11.field3631) {
                        method260(var11, var13, var14, var12);
                        class535.method9304(var2, var3, var4, var5);
                        continue;
                     }

                     if (var11.field3631 == 1400) {
                        class115.field1095.method8398(var13, var14, var11.field3598, var11.field3622, field1445);
                     }

                     if (var11.field3631 == 1401) {
                        class115.field1095.method8294(var13, var14, var11.field3598, var11.field3622);
                     }

                     if (1402 == var11.field3631) {
                        class169.field1805.method2029(var13, field1445);
                     }
                  }

                  if (0 == var11.field3608) {
                     if (!var11.field3605 && method6526(var11) && class269.field2984 != var11) {
                        continue;
                     }

                     if (!var11.field3605) {
                        if (var11.field3628 > var11.field3719 - var11.field3622) {
                           var11.field3628 = var11.field3719 - var11.field3622;
                        }

                        if (var11.field3628 < 0) {
                           var11.field3628 = 0;
                        }
                     }

                     method588(var0, var11.field3606, var16, var17, var18, var19, var13 - var11.field3627, var14 - var11.field3628, var12);
                     if (var11.field3743 != null) {
                        method588(var11.field3743, var11.field3606, var16, var17, var18, var19, var13 - var11.field3627, var14 - var11.field3628, var12);
                     }

                     SubInterface var29 = (SubInterface) activeSubInterfaces.get((long)var11.field3606);
                     if (null != var29) {
                        method377(var29.id, var16, var17, var18, var19, var13, var14, var12);
                     }

                     class535.method9304(var2, var3, var4, var5);
                     class229.method4291();
                  } else if (var11.field3608 == 11) {
                     if (method6526(var11) && class269.field2984 != var11) {
                        continue;
                     }

                     if (var11.field3743 != null) {
                        method588(var11.field3743, var11.field3606, var16, var17, var18, var19, var13 - var11.field3627, var14 - var11.field3628, var12);
                     }

                     class535.method9304(var2, var3, var4, var5);
                     class229.method4291();
                  }

                  if (isResizable || field1652[var12] || field1588 > 1) {
                     if (0 == var11.field3608 && !var11.field3605 && var11.field3719 > var11.field3622) {
                        method2548(var11.field3598 + var13, var14, var11.field3628, var11.field3622, var11.field3719);
                     }

                     if (1 != var11.field3608) {
                        if (var11.field3608 == 3) {
                           if (method1514(var11)) {
                              var20 = var11.field3632;
                              if (class269.field2984 == var11 && 0 != var11.field3634) {
                                 var20 = var11.field3634;
                              }
                           } else {
                              var20 = var11.field3718;
                              if (var11 == class269.field2984 && var11.field3633 != 0) {
                                 var20 = var11.field3633;
                              }
                           }

                           if (var11.field3721) {
                              switch (var11.field3636.field5140) {
                                 case 1:
                                    class535.method9225(var13, var14, var11.field3598, var11.field3622, var11.field3718, var11.field3632);
                                    break;
                                 case 2:
                                    class535.method9233(var13, var14, var11.field3598, var11.field3622, var11.field3718, var11.field3632, 255 - (var11.field3637 & 255), 255 - (var11.field3638 & 255));
                                    break;
                                 default:
                                    if (var15 == 0) {
                                       class535.method9231(var13, var14, var11.field3598, var11.field3622, var20);
                                    } else {
                                       class535.method9230(var13, var14, var11.field3598, var11.field3622, var20, 256 - (var15 & 255));
                                    }
                              }
                           } else if (var15 == 0) {
                              class535.method9223(var13, var14, var11.field3598, var11.field3622, var20);
                           } else {
                              class535.method9236(var13, var14, var11.field3598, var11.field3622, var20, 256 - (var15 & 255));
                           }
                        } else if (var11.field3608 == 4) {
                           class393 var36 = var11.method6220();
                           if (null == var36) {
                              if (Component.field3737) {
                                 setDirty(var11);
                              }
                           } else {
                              String var45 = var11.field3621;
                              if (method1514(var11)) {
                                 var21 = var11.field3632;
                                 if (var11 == class269.field2984 && var11.field3634 != 0) {
                                    var21 = var11.field3634;
                                 }

                                 if (var11.field3670.length() > 0) {
                                    var45 = var11.field3670;
                                 }
                              } else {
                                 var21 = var11.field3718;
                                 if (class269.field2984 == var11 && 0 != var11.field3633) {
                                    var21 = var11.field3633;
                                 }
                              }

                              if (var11.field3605 && -1 != var11.field3739) {
                                 class185 var46 = class185.method2355(var11.field3739);
                                 var45 = var46.field1998;
                                 if (var45 == null) {
                                    var45 = class364.field4028;
                                 }

                                 if ((var46.field1975 == 1 || 1 != var11.field3630) && var11.field3630 != -1) {
                                    var45 = class90.method5890(16748608) + var45 + class90.field833 + " " + 'x' + method3816(var11.field3630);
                                 }
                              }

                              if (var11 == meslayerPauseButtonComponent) {
                                 var45 = class364.field4037;
                                 var21 = var11.field3718;
                              }

                              if (!var11.field3605) {
                                 var45 = method5339(var45, var11);
                              }

                              var36.method7168(var45, var13, var14, var11.field3598, var11.field3622, var21, var11.field3688 ? 0 : -1, class468.method8086(var11.field3637), var11.field3672, var11.field3673, var11.field3671);
                           }
                        } else {
                           int var25;
                           int var26;
                           int var42;
                           if (var11.field3608 == 5) {
                              class523 var32;
                              if (!var11.field3605) {
                                 var32 = var11.method6215(method1514(var11), class261.field2935);
                                 if (var32 != null) {
                                    var32.method9139(var13, var14);
                                 } else if (Component.field3737) {
                                    setDirty(var11);
                                 }
                              } else {
                                 if (var11.field3739 != -1) {
                                    var32 = class238.method4614(var11.field3739, var11.field3630, var11.field3696, var11.field3709, var11.field3667, false);
                                 } else {
                                    var32 = var11.method6215(false, class261.field2935);
                                 }

                                 if (null == var32) {
                                    if (Component.field3737) {
                                       setDirty(var11);
                                    }
                                 } else {
                                    var21 = var32.field5144;
                                    var22 = var32.field5142;
                                    if (!var11.field3645) {
                                       var23 = var11.field3598 * 4096 / var21;
                                       if (var11.field3644 != 0) {
                                          var32.method9105(var13 + var11.field3598 / 2, var14 + var11.field3622 / 2, var11.field3644, var23);
                                       } else if (var15 != 0) {
                                          var32.method9043(var13, var14, var11.field3598, var11.field3622, 256 - (var15 & 255));
                                       } else if (var21 == var11.field3598 && var22 == var11.field3622) {
                                          var32.method9139(var13, var14);
                                       } else {
                                          var32.method9038(var13, var14, var11.field3598, var11.field3622);
                                       }
                                    } else {
                                       class535.method9224(var13, var14, var11.field3598 + var13, var14 + var11.field3622);
                                       var23 = (var21 - 1 + var11.field3598) / var21;
                                       var42 = (var11.field3622 + (var22 - 1)) / var22;

                                       for(var25 = 0; var25 < var23; ++var25) {
                                          for(var26 = 0; var26 < var42; ++var26) {
                                             if (var11.field3644 != 0) {
                                                var32.method9105(var21 / 2 + var21 * var25 + var13, var26 * var22 + var14 + var22 / 2, var11.field3644, 4096);
                                             } else if (var15 != 0) {
                                                var32.method9041(var21 * var25 + var13, var26 * var22 + var14, 256 - (var15 & 255));
                                             } else {
                                                var32.method9139(var25 * var21 + var13, var22 * var26 + var14);
                                             }
                                          }
                                       }

                                       class535.method9304(var2, var3, var4, var5);
                                    }
                                 }
                              }
                           } else {
                              int var27;
                              if (6 == var11.field3608) {
                                 boolean var31 = method1514(var11);
                                 if (var31) {
                                    var21 = var11.field3728;
                                 } else {
                                    var21 = var11.field3654;
                                 }

                                 class249 var37 = null;
                                 var23 = 0;
                                 if (-1 != var11.field3739) {
                                    class185 var38 = class185.method2355(var11.field3739);
                                    if (null != var38) {
                                       var38 = var38.method3502(var11.field3630);
                                       var37 = var38.method3501(1);
                                       if (null != var37) {
                                          var37.method4763();
                                          var23 = var37.field2507 / 2;
                                       } else {
                                          setDirty(var11);
                                       }
                                    }
                                 } else if (5 == var11.field3650) {
                                    if (var11.field3603 == 0) {
                                       var37 = field1630.method5801((class215)null, -1, (class215)null, -1);
                                    } else {
                                       var37 = class146.field1362.method4273();
                                    }
                                 } else if (7 == var11.field3650) {
                                    var37 = var11.field3664.method5801((class215)null, -1, class215.method2582(class146.field1362.field989), class146.field1362.field1011);
                                 } else {
                                    class191 var39 = null;
                                    class201 var40 = null;
                                    if (6 == var11.field3650) {
                                       var26 = var11.field3603;
                                       if (var26 >= 0 && var26 < field1489.length) {
                                          class86 var44 = field1489[var26];
                                          if (var44 != null) {
                                             var39 = var44.field776;
                                             var40 = var44.method1856();
                                          }
                                       }
                                    }

                                    class215 var43 = null;
                                    var27 = -1;
                                    if (var21 != -1) {
                                       var43 = class215.method2582(var21);
                                       var27 = var11.field3741;
                                    }

                                    var37 = var11.method6221(var43, var27, var31, class146.field1362.field764, var39, var40);
                                    if (var37 == null && Component.field3737) {
                                       setDirty(var11);
                                    }
                                 }

                                 class229.method4294(var13 + var11.field3598 / 2, var14 + var11.field3622 / 2);
                                 var42 = var11.field3661 * class229.field2511[var11.field3646] >> 16;
                                 var25 = class229.field2512[var11.field3646] * var11.field3661 >> 16;
                                 if (var37 != null) {
                                    if (!var11.field3605) {
                                       var37.method4780(0, var11.field3659, 0, var11.field3646, 0, var42, var25);
                                    } else {
                                       var37.method4763();
                                       if (var11.field3665) {
                                          var37.method4781(0, var11.field3659, var11.field3750, var11.field3646, var11.field3656, var11.field3657 + var23 + var42, var25 + var11.field3657, var11.field3661);
                                       } else {
                                          var37.method4780(0, var11.field3659, var11.field3750, var11.field3646, var11.field3656, var23 + var42 + var11.field3657, var11.field3657 + var25);
                                       }
                                    }
                                 }

                                 class229.method4293();
                              } else {
                                 class393 var33;
                                 if (var11.field3608 == 8 && class404.field4504 == var11 && field1592 == field1591) {
                                    var20 = 0;
                                    var21 = 0;
                                    var33 = class112.field1079;
                                    String var35 = var11.field3621;

                                    String var24;
                                    for(var35 = method5339(var35, var11); var35.length() > 0; var21 += var33.field4527 + 1) {
                                       var25 = var35.indexOf(class90.field835);
                                       if (var25 != -1) {
                                          var24 = var35.substring(0, var25);
                                          var35 = var35.substring(var25 + 4);
                                       } else {
                                          var24 = var35;
                                          var35 = "";
                                       }

                                       var26 = var33.method7225(var24);
                                       if (var26 > var20) {
                                          var20 = var26;
                                       }
                                    }

                                    var20 += 6;
                                    var21 += 7;
                                    var25 = var13 + var11.field3598 - 5 - var20;
                                    var26 = var14 + var11.field3622 + 5;
                                    if (var25 < var13 + 5) {
                                       var25 = var13 + 5;
                                    }

                                    if (var25 + var20 > var4) {
                                       var25 = var4 - var20;
                                    }

                                    if (var21 + var26 > var5) {
                                       var26 = var5 - var21;
                                    }

                                    class535.method9231(var25, var26, var20, var21, 16777120);
                                    class535.method9223(var25, var26, var20, var21, 0);
                                    var35 = var11.field3621;
                                    var27 = var33.field4527 + var26 + 2;

                                    for(var35 = method5339(var35, var11); var35.length() > 0; var27 += var33.field4527 + 1) {
                                       int var28 = var35.indexOf(class90.field835);
                                       if (var28 != -1) {
                                          var24 = var35.substring(0, var28);
                                          var35 = var35.substring(var28 + 4);
                                       } else {
                                          var24 = var35;
                                          var35 = "";
                                       }

                                       var33.method7163(var24, var25 + 3, var27, 0, -1);
                                    }
                                 }

                                 if (9 == var11.field3608) {
                                    if (var11.field3708) {
                                       var21 = var14 + var11.field3622;
                                       var22 = var13 + var11.field3598;
                                       var23 = var14;
                                    } else {
                                       var21 = var14;
                                       var22 = var13 + var11.field3598;
                                       var23 = var14 + var11.field3622;
                                    }

                                    if (var11.field3639 == 1) {
                                       class535.method9281(var13, var21, var22, var23, var11.field3718);
                                    } else {
                                       method224(var13, var21, var22, var23, var11.field3718, var11.field3639);
                                    }
                                 } else if (var11.field3608 == 12) {
                                    class327 var30 = var11.method6277();
                                    class337 var34 = var11.method6242();
                                    if (null != var30 && null != var34 && var30.method5958()) {
                                       var33 = var11.method6220();
                                       if (null != var33) {
                                          field1642.method9201(var13, var14, var11.field3598, var11.field3622, var30.method6058(), var30.method5960(), var30.method5956(), var30.method5957(), var30.method6030());
                                          var23 = var11.field3688 ? var11.field3709 : -1;
                                          if (!var30.method5953() && var30.method6006().method7279()) {
                                             field1642.method9208(var34.field3783, var23, var34.field3781, var34.field3782);
                                             field1642.method9199(var30.method6157(), var33);
                                          } else {
                                             field1642.method9208(var11.field3718, var23, var34.field3781, var34.field3782);
                                             field1642.method9199(var30.method6006(), var33);
                                          }

                                          class535.method9304(var2, var3, var4, var5);
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }

   static final void method224(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var7 = var2 - var0;
      int var8 = var3 - var1;
      int var9 = var7 >= 0 ? var7 : -var7;
      int var10 = var8 >= 0 ? var8 : -var8;
      int var11 = var9;
      if (var9 < var10) {
         var11 = var10;
      }

      if (var11 != 0) {
         int var12 = (var7 << 16) / var11;
         int var13 = (var8 << 16) / var11;
         if (var13 <= var12) {
            var12 = -var12;
         } else {
            var13 = -var13;
         }

         int var14 = var13 * var5 >> 17;
         int var15 = 1 + var13 * var5 >> 17;
         int var16 = var5 * var12 >> 17;
         int var17 = var5 * var12 + 1 >> 17;
         var0 -= class535.field5208;
         var1 -= class535.field5206;
         int var18 = var14 + var0;
         int var19 = var0 - var15;
         int var20 = var7 + var0 - var15;
         int var21 = var14 + var7 + var0;
         int var22 = var16 + var1;
         int var23 = var1 - var17;
         int var24 = var1 + var8 - var17;
         int var25 = var1 + var8 + var16;
         class229.method4318(var18, var19, var20);
         class229.method4331(var22, var23, var24, var18, var19, var20, 0.0F, 0.0F, 0.0F, var4);
         class229.method4318(var18, var20, var21);
         class229.method4331(var22, var24, var25, var18, var20, var21, 0.0F, 0.0F, 0.0F, var4);
      }
   }

   static String method5339(String var0, Component var1) {
      if (var0.indexOf("%") != -1) {
         for(int var3 = 1; var3 <= 5; ++var3) {
            while(true) {
               int var4 = var0.indexOf("%" + var3);
               if (var4 == -1) {
                  break;
               }

               String var5 = var0.substring(0, var4);
               int var7 = method3587(var1, var3 - 1);
               String var6;
               if (var7 < 999999999) {
                  var6 = Integer.toString(var7);
               } else {
                  var6 = "*";
               }

               var0 = var5 + var6 + var0.substring(var4 + 2);
            }
         }
      }

      return var0;
   }

   static final String method3816(int var0) {
      String var2 = Integer.toString(var0);

      for(int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
         var2 = var2.substring(0, var3) + class90.field829 + var2.substring(var3);
      }

      if (var2.length() > 9) {
         return " " + class90.method5890(65408) + var2.substring(0, var2.length() - 8) + class364.field4195 + " " + class90.field831 + var2 + class90.field830 + class90.field833;
      } else {
         return var2.length() > 6 ? " " + class90.method5890(16777215) + var2.substring(0, var2.length() - 4) + class364.field4162 + " " + class90.field831 + var2 + class90.field830 + class90.field833 : " " + class90.method5890(16776960) + var2 + class90.field833;
      }
   }

   static void method834(Component[] var0, int var1, int var2, int var3, boolean var4) {
      for(int var6 = 0; var6 < var0.length; ++var6) {
         Component var7 = var0[var6];
         if (var7 != null && var1 == var7.field3625) {
            class56.method1161(var7, var2, var3, var4);
            method15(var7, var2, var3);
            if (var7.field3627 > var7.field3629 - var7.field3598) {
               var7.field3627 = var7.field3629 - var7.field3598;
            }

            if (var7.field3627 < 0) {
               var7.field3627 = 0;
            }

            if (var7.field3628 > var7.field3719 - var7.field3622) {
               var7.field3628 = var7.field3719 - var7.field3622;
            }

            if (var7.field3628 < 0) {
               var7.field3628 = 0;
            }

            if (0 == var7.field3608) {
               class34.calculateLayerDimensions(var0, var7, var4);
            }
         }
      }

   }

   static void method15(Component var0, int var1, int var2) {
      if (0 == var0.field3700) {
         var0.field3619 = var0.field3615;
      } else if (var0.field3700 == 1) {
         var0.field3619 = var0.field3615 + (var1 - var0.field3598) / 2;
      } else if (2 == var0.field3700) {
         var0.field3619 = var1 - var0.field3598 - var0.field3615;
      } else if (3 == var0.field3700) {
         var0.field3619 = var1 * var0.field3615 >> 14;
      } else if (4 == var0.field3700) {
         var0.field3619 = (var1 - var0.field3598) / 2 + (var1 * var0.field3615 >> 14);
      } else {
         var0.field3619 = var1 - var0.field3598 - (var1 * var0.field3615 >> 14);
      }

      if (var0.field3612 == 0) {
         var0.field3620 = var0.field3616;
      } else if (1 == var0.field3612) {
         var0.field3620 = var0.field3616 + (var2 - var0.field3622) / 2;
      } else if (var0.field3612 == 2) {
         var0.field3620 = var2 - var0.field3622 - var0.field3616;
      } else if (var0.field3612 == 3) {
         var0.field3620 = var0.field3616 * var2 >> 14;
      } else if (4 == var0.field3612) {
         var0.field3620 = (var0.field3616 * var2 >> 14) + (var2 - var0.field3622) / 2;
      } else {
         var0.field3620 = var2 - var0.field3622 - (var2 * var0.field3616 >> 14);
      }

   }

   static final void method2464(Component var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (field1732) {
         field1514 = 32;
      } else {
         field1514 = 0;
      }

      field1732 = false;
      int var8;
      if (class41.field248 == 1 || !class40.field238 && 4 == class41.field248) {
         if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
            var0.field3628 -= 4;
            setDirty(var0);
         } else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 + var3 - 16 && var6 < var3 + var2) {
            var0.field3628 += 4;
            setDirty(var0);
         } else if (var5 >= var1 - field1514 && var5 < field1514 + var1 + 16 && var6 >= var2 + 16 && var6 < var2 + var3 - 16) {
            var8 = (var3 - 32) * var3 / var4;
            if (var8 < 8) {
               var8 = 8;
            }

            int var9 = var6 - var2 - 16 - var8 / 2;
            int var10 = var3 - 32 - var8;
            var0.field3628 = var9 * (var4 - var3) / var10;
            setDirty(var0);
            field1732 = true;
         }
      }

      if (0 != field1641) {
         var8 = var0.field3598;
         if (var5 >= var1 - var8 && var6 >= var2 && var5 < var1 + 16 && var6 <= var2 + var3) {
            var0.field3628 += field1641 * 45;
            setDirty(var0);
         }
      }

   }

   static final void method2548(int var0, int var1, int var2, int var3, int var4) {
      class302.field3190[0].method9316(var0, var1);
      class302.field3190[1].method9316(var0, var3 + var1 - 16);
      class535.method9231(var0, var1 + 16, 16, var3 - 32, field1509);
      int var6 = var3 * (var3 - 32) / var4;
      if (var6 < 8) {
         var6 = 8;
      }

      int var7 = (var3 - 32 - var6) * var2 / (var4 - var3);
      class535.method9231(var0, var7 + var1 + 16, 16, var6, field1510);
      class535.method9239(var0, var7 + var1 + 16, var6, field1688);
      class535.method9239(var0 + 1, var7 + var1 + 16, var6, field1688);
      class535.method9237(var0, var1 + 16 + var7, 16, field1688);
      class535.method9237(var0, var1 + 17 + var7, 16, field1688);
      class535.method9239(var0 + 15, var7 + var1 + 16, var6, field1511);
      class535.method9239(var0 + 14, var1 + 17 + var7, var6 - 1, field1511);
      class535.method9237(var0, var1 + 15 + var7 + var6, 16, field1511);
      class535.method9237(var0 + 1, var1 + 14 + var7 + var6, 15, field1511);
   }

   static final boolean method1514(Component var0) {
      if (var0.field3733 == null) {
         return false;
      } else {
         for(int var2 = 0; var2 < var0.field3733.length; ++var2) {
            int var3 = method3587(var0, var2);
            int var4 = var0.field3604[var2];
            if (var0.field3733[var2] == 2) {
               if (var3 >= var4) {
                  return false;
               }
            } else if (var0.field3733[var2] == 3) {
               if (var3 <= var4) {
                  return false;
               }
            } else if (var0.field3733[var2] == 4) {
               if (var4 == var3) {
                  return false;
               }
            } else if (var3 != var4) {
               return false;
            }
         }

         return true;
      }
   }

   static final int method3587(Component var0, int var1) {
      if (null != var0.field3727 && var1 < var0.field3727.length) {
         try {
            int[] var3 = var0.field3727[var1];
            int var4 = 0;
            int var5 = 0;
            byte var6 = 0;

            while(true) {
               int var7 = var3[var5++];
               int var8 = 0;
               byte var9 = 0;
               if (var7 == 0) {
                  return var4;
               }

               if (var7 == 1) {
                  var8 = field1572[var3[var5++]];
               }

               if (var7 == 2) {
                  var8 = field1493[var3[var5++]];
               }

               if (var7 == 3) {
                  var8 = field1574[var3[var5++]];
               }

               int var10;
               Component var11;
               int var12;
               int var13;
               if (var7 == 4) {
                  var10 = var3[var5++] << 16;
                  var10 += var3[var5++];
                  var11 = Component.getComponent(var10);
                  var12 = var3[var5++];
                  if (var12 != -1 && (!class185.method2355(var12).field1980 || field1435)) {
                     for(var13 = 0; var13 < var11.field3602.length; ++var13) {
                        if (var11.field3602[var13] == var12 + 1) {
                           var8 += var11.field3738[var13];
                        }
                     }
                  }
               }

               if (var7 == 5) {
                  var8 = class329.field3577[var3[var5++]];
               }

               if (var7 == 6) {
                  var8 = class346.field3848[field1493[var3[var5++]] - 1];
               }

               if (var7 == 7) {
                  var8 = class329.field3577[var3[var5++]] * 100 / '\ub71b';
               }

               if (var7 == 8) {
                  var8 = class146.field1362.field743;
               }

               if (var7 == 9) {
                  for(var10 = 0; var10 < 25; ++var10) {
                     if (class346.field3846[var10]) {
                        var8 += field1493[var10];
                     }
                  }
               }

               if (var7 == 10) {
                  var10 = var3[var5++] << 16;
                  var10 += var3[var5++];
                  var11 = Component.getComponent(var10);
                  var12 = var3[var5++];
                  if (var12 != -1 && (!class185.method2355(var12).field1980 || field1435)) {
                     for(var13 = 0; var13 < var11.field3602.length; ++var13) {
                        if (var12 + 1 == var11.field3602[var13]) {
                           var8 = 999999999;
                           break;
                        }
                     }
                  }
               }

               if (var7 == 11) {
                  var8 = field1606;
               }

               if (var7 == 12) {
                  var8 = field1607;
               }

               if (var7 == 13) {
                  var10 = class329.field3577[var3[var5++]];
                  int var15 = var3[var5++];
                  var8 = 0 != (var10 & 1 << var15) ? 1 : 0;
               }

               if (var7 == 14) {
                  var10 = var3[var5++];
                  var8 = class254.method5005(var10);
               }

               if (var7 == 15) {
                  var9 = 1;
               }

               if (var7 == 16) {
                  var9 = 2;
               }

               if (var7 == 17) {
                  var9 = 3;
               }

               if (var7 == 18) {
                  var8 = class342.field3837 + (class146.field1362.field949 >> 7);
               }

               if (var7 == 19) {
                  var8 = (class146.field1362.field963 >> 7) + class144.field1352;
               }

               if (var7 == 20) {
                  var8 = var3[var5++];
               }

               if (var9 == 0) {
                  if (var6 == 0) {
                     var4 += var8;
                  }

                  if (var6 == 1) {
                     var4 -= var8;
                  }

                  if (var6 == 2 && var8 != 0) {
                     var4 /= var8;
                  }

                  if (var6 == 3) {
                     var4 *= var8;
                  }

                  var6 = 0;
               } else {
                  var6 = var9;
               }
            }
         } catch (Exception var14) {
            return -1;
         }
      } else {
         return -2;
      }
   }

   static final void method5857(Component var0) {
      if (1 == var0.field3689) {
         method2656(var0.field3736, "", 24, 0, 0, var0.field3606, var0.field3739);
      }

      String var2;
      if (var0.field3689 == 2 && !field1657) {
         var2 = method348(var0);
         if (null != var2) {
            method2656(var2, class90.method5890(65280) + var0.field3735, 25, 0, -1, var0.field3606, var0.field3739);
         }
      }

      if (var0.field3689 == 3) {
         method3242(class364.field4179, "", 26, 0, 0, var0.field3606);
      }

      if (var0.field3689 == 4) {
         method3242(var0.field3736, "", 28, 0, 0, var0.field3606);
      }

      if (5 == var0.field3689) {
         method3242(var0.field3736, "", 29, 0, 0, var0.field3606);
      }

      if (6 == var0.field3689 && meslayerPauseButtonComponent == null) {
         method3242(var0.field3736, "", 30, 0, -1, var0.field3606);
      }

      if (var0.field3605) {
         if (field1657) {
            if (class323.method5338(method2338(var0)) && 32 == (class37.field195 & 32)) {
               method2656(field1552, field1650 + " " + class90.field828 + " " + var0.field3686, 58, 0, var0.field3607, var0.field3606, var0.field3739);
            }
         } else {
            for(int var7 = 9; var7 >= 5; --var7) {
               String var3 = method4403(var0, var7);
               if (null != var3) {
                  method2656(var3, var0.field3686, 1007, var7 + 1, var0.field3607, var0.field3606, var0.field3739);
               }
            }

            var2 = method348(var0);
            if (var2 != null) {
               method2656(var2, var0.field3686, 25, 0, var0.field3607, var0.field3606, var0.field3739);
            }

            for(int var8 = 4; var8 >= 0; --var8) {
               int var6 = method2338(var0);
               boolean var5 = 0 != (var6 >> var8 + 1 & 1);
               String var4;
               if (!var5 && null == var0.field3713) {
                  var4 = null;
               } else if (null != var0.field3647 && var0.field3647.length > var8 && null != var0.field3647[var8] && var0.field3647[var8].trim().length() != 0) {
                  var4 = var0.field3647[var8];
               } else {
                  var4 = null;
               }

               if (var4 != null) {
                  method360(var4, var0.field3686, 57, var8 + 1, var0.field3607, var0.field3606, var0.field3739, var0.field3755);
               }
            }

            int var10 = method2338(var0);
            boolean var9 = (var10 & 1) != 0;
            if (var9) {
               method3242(class364.field4227, "", 30, 0, var0.field3607, var0.field3606);
            }
         }
      }

   }

   static void method5889(boolean var0) {
      field1587 = var0;
   }

   static boolean method2575() {
      return field1587;
   }

   static final void method2579(Component[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for(int var9 = 0; var9 < var0.length; ++var9) {
         Component var10 = var0[var9];
         if (null != var10 && var10.field3625 == var1 && (var10.method6278() || method2338(var10) != 0 || var10 == field1520)) {
            if (var10.field3605) {
               if (method6526(var10)) {
                  continue;
               }
            } else if (var10.field3608 == 0 && class269.field2984 != var10 && method6526(var10)) {
               continue;
            }

            if (var10.field3608 == 11) {
               if (var10.method6239(class261.field2935)) {
                  if (var10.method6232()) {
                     setDirty(var10);
                     class34.calculateLayerDimensions(var10.field3743, var10, true);
                  }

                  if (null != var10.field3730) {
                     class87 var11 = new class87();
                     var11.field786 = var10;
                     var11.field790 = var10.field3730;
                     field1643.method6680(var11);
                  }
               }
            } else if (var10.field3608 == 12 && var10.method6246()) {
               setDirty(var10);
            }

            int var27 = var6 + var10.field3619;
            int var12 = var7 + var10.field3620;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            if (var10.field3608 == 9) {
               var17 = var27;
               var18 = var12;
               var19 = var10.field3598 + var27;
               int var20 = var10.field3622 + var12;
               if (var19 < var27) {
                  var17 = var19;
                  var19 = var27;
               }

               if (var20 < var12) {
                  var18 = var20;
                  var20 = var12;
               }

               ++var19;
               ++var20;
               var13 = var17 > var2 ? var17 : var2;
               var14 = var18 > var3 ? var18 : var3;
               var15 = var19 < var4 ? var19 : var4;
               var16 = var20 < var5 ? var20 : var5;
            } else {
               var17 = var27 + var10.field3598;
               var18 = var12 + var10.field3622;
               var13 = var27 > var2 ? var27 : var2;
               var14 = var12 > var3 ? var12 : var3;
               var15 = var17 < var4 ? var17 : var4;
               var16 = var18 < var5 ? var18 : var5;
            }

            if (var10 == field1512) {
               field1725 = true;
               field1621 = var27;
               field1622 = var12;
            }

            boolean var28 = false;
            if (var10.field3681) {
               switch (field1533) {
                  case 0:
                     var28 = true;
                  case 1:
                  default:
                     break;
                  case 2:
                     if (var10.field3606 >>> 16 == field1603) {
                        var28 = true;
                     }
                     break;
                  case 3:
                     if (field1603 == var10.field3606) {
                        var28 = true;
                     }
               }
            }

            if (var28 || !var10.field3605 || var13 < var15 && var14 < var16) {
               if (var10.field3605) {
                  class87 var29;
                  if (var10.field3753) {
                     if (class41.field249 >= var13 && class41.field250 >= var14 && class41.field249 < var15 && class41.field250 < var16) {
                        for(var29 = (class87)field1643.method6706(); var29 != null; var29 = (class87)field1643.method6687()) {
                           if (var29.field785) {
                              var29.method8116();
                              var29.field786.field3744 = false;
                           }
                        }

                        method7793();
                        if (class143.field1342 == 0) {
                           field1512 = null;
                           field1520 = null;
                        }

                        if (!field1576) {
                           method1758();
                        }
                     }
                  } else if (var10.field3754 && class41.field249 >= var13 && class41.field250 >= var14 && class41.field249 < var15 && class41.field250 < var16) {
                     for(var29 = (class87)field1643.method6706(); var29 != null; var29 = (class87)field1643.method6687()) {
                        if (var29.field785 && var29.field786.field3715 == var29.field790) {
                           var29.method8116();
                        }
                     }
                  }
               }

               var18 = class41.field249;
               var19 = class41.field250;
               if (class41.field256 != 0) {
                  var18 = class41.field257;
                  var19 = class41.field258;
               }

               boolean var30 = var18 >= var13 && var19 >= var14 && var18 < var15 && var19 < var16;
               if (var10.field3631 == 1337) {
                  if (!field1598 && !field1576 && var30) {
                     method1541(var18, var19, var13, var14);
                  }
               } else if (1338 == var10.field3631) {
                  method3426(var10, var27, var12);
               } else {
                  if (1400 == var10.field3631) {
                     class115.field1095.method8207(class41.field249, class41.field250, var30, var27, var12, var10.field3598, var10.field3622);
                  }

                  if (!field1576 && var30) {
                     if (var10.field3631 == 1400) {
                        class115.field1095.method8259(var27, var12, var10.field3598, var10.field3622, var18, var19);
                     } else {
                        method5857(var10);
                     }
                  }

                  boolean var22;
                  int var24;
                  if (var28) {
                     for(int var21 = 0; var21 < var10.field3694.length; ++var21) {
                        var22 = false;
                        boolean var23 = false;
                        if (!var22 && var10.field3694[var21] != null) {
                           for(var24 = 0; var24 < var10.field3694[var21].length; ++var24) {
                              boolean var25 = false;
                              if (null != var10.field3752) {
                                 var25 = field1666.method4103(var10.field3694[var21][var24]);
                              }

                              if (method6366(var10.field3694[var21][var24]) || var25) {
                                 var22 = true;
                                 if (null != var10.field3752 && var10.field3752[var21] > field1445) {
                                    break;
                                 }

                                 byte var26 = var10.field3683[var21][var24];
                                 if (var26 == 0 || (0 == (var26 & 8) || !field1666.method4103(86) && !field1666.method4103(82) && !field1666.method4103(81)) && (0 == (var26 & 2) || field1666.method4103(86)) && ((var26 & 1) == 0 || field1666.method4103(82)) && (0 == (var26 & 4) || field1666.method4103(81))) {
                                    var23 = true;
                                    break;
                                 }
                              }
                           }
                        }

                        if (var23) {
                           if (var21 < 10) {
                              method7794(var21 + 1, var10.field3606, var10.field3607, var10.field3739, "");
                           } else if (var21 == 10) {
                              method521();
                              method6520(var10.field3606, var10.field3607, class323.method5357(method2338(var10)), var10.field3739);
                              field1552 = method348(var10);
                              if (null == field1552) {
                                 field1552 = class364.field4028;
                              }

                              field1650 = var10.field3686 + class90.method5890(16777215);
                           }

                           var24 = var10.field3640[var21];
                           if (null == var10.field3752) {
                              var10.field3752 = new int[var10.field3694.length];
                           }

                           if (var10.field3613 == null) {
                              var10.field3613 = new int[var10.field3694.length];
                           }

                           if (var24 != 0) {
                              if (var10.field3752[var21] == 0) {
                                 var10.field3752[var21] = var10.field3613[var21] + var24 + field1445;
                              } else {
                                 var10.field3752[var21] = field1445 + var24;
                              }
                           } else {
                              var10.field3752[var21] = Integer.MAX_VALUE;
                           }
                        }

                        if (!var22 && null != var10.field3752) {
                           var10.field3752[var21] = 0;
                        }
                     }
                  }

                  if (var10.field3605) {
                     if (class41.field249 >= var13 && class41.field250 >= var14 && class41.field249 < var15 && class41.field250 < var16) {
                        var30 = true;
                     } else {
                        var30 = false;
                     }

                     boolean var31 = false;
                     if ((class41.field248 == 1 || !class40.field238 && class41.field248 == 4) && var30) {
                        var31 = true;
                     }

                     var22 = false;
                     if ((1 == class41.field256 || !class40.field238 && class41.field256 == 4) && class41.field257 >= var13 && class41.field258 >= var14 && class41.field257 < var15 && class41.field258 < var16) {
                        var22 = true;
                     }

                     if (var22) {
                        method6574(var10, class41.field257 - var27, class41.field258 - var12);
                     }

                     if (var10.method6225()) {
                        if (var22) {
                           field1726.method6680(new class233(0, class41.field249 - var27, class41.field250 - var12, var10));
                        }

                        if (var31) {
                           field1726.method6680(new class233(1, class41.field249 - var27, class41.field250 - var12, var10));
                        }
                     }

                     if (1400 == var10.field3631) {
                        class115.field1095.method8208(var18, var19, var30 & var31, var30 & var22);
                     }

                     if (field1512 != null && var10 != field1512 && var30 && class323.method6365(method2338(var10))) {
                        field1616 = var10;
                     }

                     if (var10 == field1520) {
                        field1677 = true;
                        field1564 = var27;
                        field1619 = var12;
                     }

                     if (var10.field3747) {
                        class87 var32;
                        if (var30 && field1641 != 0 && var10.field3715 != null) {
                           var32 = new class87();
                           var32.field785 = true;
                           var32.field786 = var10;
                           var32.field788 = field1641;
                           var32.field790 = var10.field3715;
                           field1643.method6680(var32);
                        }

                        if (field1512 != null || field1576) {
                           var22 = false;
                           var31 = false;
                           var30 = false;
                        }

                        if (!var10.field3745 && var22) {
                           var10.field3745 = true;
                           if (null != var10.field3695) {
                              var32 = new class87();
                              var32.field785 = true;
                              var32.field786 = var10;
                              var32.field787 = class41.field257 - var27;
                              var32.field788 = class41.field258 - var12;
                              var32.field790 = var10.field3695;
                              field1643.method6680(var32);
                           }
                        }

                        if (var10.field3745 && var31 && null != var10.field3693) {
                           var32 = new class87();
                           var32.field785 = true;
                           var32.field786 = var10;
                           var32.field787 = class41.field249 - var27;
                           var32.field788 = class41.field250 - var12;
                           var32.field790 = var10.field3693;
                           field1643.method6680(var32);
                        }

                        if (var10.field3745 && !var31) {
                           var10.field3745 = false;
                           if (var10.field3697 != null) {
                              var32 = new class87();
                              var32.field785 = true;
                              var32.field786 = var10;
                              var32.field787 = class41.field249 - var27;
                              var32.field788 = class41.field250 - var12;
                              var32.field790 = var10.field3697;
                              field1645.method6680(var32);
                           }
                        }

                        if (var31 && var10.field3698 != null) {
                           var32 = new class87();
                           var32.field785 = true;
                           var32.field786 = var10;
                           var32.field787 = class41.field249 - var27;
                           var32.field788 = class41.field250 - var12;
                           var32.field790 = var10.field3698;
                           field1643.method6680(var32);
                        }

                        if (!var10.field3744 && var30) {
                           var10.field3744 = true;
                           if (null != var10.field3699) {
                              var32 = new class87();
                              var32.field785 = true;
                              var32.field786 = var10;
                              var32.field787 = class41.field249 - var27;
                              var32.field788 = class41.field250 - var12;
                              var32.field790 = var10.field3699;
                              field1643.method6680(var32);
                           }
                        }

                        if (var10.field3744 && var30 && var10.field3660 != null) {
                           var32 = new class87();
                           var32.field785 = true;
                           var32.field786 = var10;
                           var32.field787 = class41.field249 - var27;
                           var32.field788 = class41.field250 - var12;
                           var32.field790 = var10.field3660;
                           field1643.method6680(var32);
                        }

                        if (var10.field3744 && !var30) {
                           var10.field3744 = false;
                           if (var10.field3701 != null) {
                              var32 = new class87();
                              var32.field785 = true;
                              var32.field786 = var10;
                              var32.field787 = class41.field249 - var27;
                              var32.field788 = class41.field250 - var12;
                              var32.field790 = var10.field3701;
                              field1645.method6680(var32);
                           }
                        }

                        if (var10.field3687 != null) {
                           var32 = new class87();
                           var32.field786 = var10;
                           var32.field790 = var10.field3687;
                           field1644.method6680(var32);
                        }

                        int var35;
                        class87 var37;
                        int var38;
                        if (var10.field3668 != null && field1626 > var10.field3731) {
                           if (var10.field3707 != null && field1626 - var10.field3731 <= 32) {
                              label644:
                              for(var38 = var10.field3731; var38 < field1626; ++var38) {
                                 var24 = field1625[var38 & 31];

                                 for(var35 = 0; var35 < var10.field3707.length; ++var35) {
                                    if (var10.field3707[var35] == var24) {
                                       var37 = new class87();
                                       var37.field786 = var10;
                                       var37.field790 = var10.field3668;
                                       field1643.method6680(var37);
                                       break label644;
                                    }
                                 }
                              }
                           } else {
                              var32 = new class87();
                              var32.field786 = var10;
                              var32.field790 = var10.field3668;
                              field1643.method6680(var32);
                           }

                           var10.field3731 = field1626;
                        }

                        if (null != var10.field3685 && field1602 > var10.field3658) {
                           if (null != var10.field3704 && field1602 - var10.field3658 <= 32) {
                              label620:
                              for(var38 = var10.field3658; var38 < field1602; ++var38) {
                                 var24 = field1723[var38 & 31];

                                 for(var35 = 0; var35 < var10.field3704.length; ++var35) {
                                    if (var10.field3704[var35] == var24) {
                                       var37 = new class87();
                                       var37.field786 = var10;
                                       var37.field790 = var10.field3685;
                                       field1643.method6680(var37);
                                       break label620;
                                    }
                                 }
                              }
                           } else {
                              var32 = new class87();
                              var32.field786 = var10;
                              var32.field790 = var10.field3685;
                              field1643.method6680(var32);
                           }

                           var10.field3658 = field1602;
                        }

                        if (var10.field3710 != null && field1627 > var10.field3749) {
                           if (var10.field3711 != null && field1627 - var10.field3749 <= 32) {
                              label596:
                              for(var38 = var10.field3749; var38 < field1627; ++var38) {
                                 var24 = field1629[var38 & 31];

                                 for(var35 = 0; var35 < var10.field3711.length; ++var35) {
                                    if (var24 == var10.field3711[var35]) {
                                       var37 = new class87();
                                       var37.field786 = var10;
                                       var37.field790 = var10.field3710;
                                       field1643.method6680(var37);
                                       break label596;
                                    }
                                 }
                              }
                           } else {
                              var32 = new class87();
                              var32.field786 = var10;
                              var32.field790 = var10.field3710;
                              field1643.method6680(var32);
                           }

                           var10.field3749 = field1627;
                        }

                        if (field1633 > var10.field3746 && var10.field3751 != null) {
                           var32 = new class87();
                           var32.field786 = var10;
                           var32.field790 = var10.field3751;
                           field1643.method6680(var32);
                        }

                        if (field1679 > var10.field3746 && null != var10.field3720) {
                           var32 = new class87();
                           var32.field786 = var10;
                           var32.field790 = var10.field3720;
                           field1643.method6680(var32);
                        }

                        if (field1635 > var10.field3746 && null != var10.field3623) {
                           var32 = new class87();
                           var32.field786 = var10;
                           var32.field790 = var10.field3623;
                           field1643.method6680(var32);
                        }

                        if (field1469 > var10.field3746 && var10.field3722 != null) {
                           var32 = new class87();
                           var32.field786 = var10;
                           var32.field790 = var10.field3722;
                           field1643.method6680(var32);
                        }

                        if (field1538 > var10.field3746 && null != var10.field3723) {
                           var32 = new class87();
                           var32.field786 = var10;
                           var32.field790 = var10.field3723;
                           field1643.method6680(var32);
                        }

                        if (field1637 > var10.field3746 && var10.field3635 != null) {
                           var32 = new class87();
                           var32.field786 = var10;
                           var32.field790 = var10.field3635;
                           field1643.method6680(var32);
                        }

                        if (field1639 > var10.field3746 && null != var10.field3729) {
                           var32 = new class87();
                           var32.field786 = var10;
                           var32.field790 = var10.field3729;
                           field1643.method6680(var32);
                        }

                        if (field1640 > var10.field3746 && null != var10.field3724) {
                           var32 = new class87();
                           var32.field786 = var10;
                           var32.field790 = var10.field3724;
                           field1643.method6680(var32);
                        }

                        var10.field3746 = field1624;
                        if (var10.field3717 != null) {
                           for(var38 = 0; var38 < field1668; ++var38) {
                              class87 var36 = new class87();
                              var36.field786 = var10;
                              var36.field784 = field1670[var38];
                              var36.field792 = field1669[var38];
                              var36.field790 = var10.field3717;
                              field1643.method6680(var36);
                           }
                        }

                        class87 var39;
                        int[] var40;
                        if (null != var10.field3601) {
                           var40 = field1666.method4124();

                           for(var24 = 0; var24 < var40.length; ++var24) {
                              var39 = new class87();
                              var39.field786 = var10;
                              var39.field784 = var40[var24];
                              var39.field790 = var10.field3601;
                              field1643.method6680(var39);
                           }
                        }

                        if (null != var10.field3618) {
                           var40 = field1666.method4106();

                           for(var24 = 0; var24 < var40.length; ++var24) {
                              var39 = new class87();
                              var39.field786 = var10;
                              var39.field784 = var40[var24];
                              var39.field790 = var10.field3618;
                              field1643.method6680(var39);
                           }
                        }
                     }
                  }

                  if (!var10.field3605) {
                     if (null != field1512 || field1576) {
                        continue;
                     }

                     if ((var10.field3589 >= 0 || 0 != var10.field3633) && class41.field249 >= var13 && class41.field250 >= var14 && class41.field249 < var15 && class41.field250 < var16) {
                        if (var10.field3589 >= 0) {
                           class269.field2984 = var0[var10.field3589];
                        } else {
                           class269.field2984 = var10;
                        }
                     }

                     if (var10.field3608 == 8 && class41.field249 >= var13 && class41.field250 >= var14 && class41.field249 < var15 && class41.field250 < var16) {
                        class404.field4504 = var10;
                     }

                     if (var10.field3719 > var10.field3622) {
                        method2464(var10, var10.field3598 + var27, var12, var10.field3622, var10.field3719, class41.field249, class41.field250);
                     }
                  }

                  if (var10.field3608 == 0) {
                     method2579(var0, var10.field3606, var13, var14, var15, var16, var27 - var10.field3627, var12 - var10.field3628);
                     if (var10.field3743 != null) {
                        method2579(var10.field3743, var10.field3606, var13, var14, var15, var16, var27 - var10.field3627, var12 - var10.field3628);
                     }

                     SubInterface var33 = (SubInterface) activeSubInterfaces.get((long)var10.field3606);
                     if (var33 != null) {
                        if (0 == var33.type && class41.field249 >= var13 && class41.field250 >= var14 && class41.field249 < var15 && class41.field250 < var16 && !field1576) {
                           for(class87 var34 = (class87)field1643.method6706(); var34 != null; var34 = (class87)field1643.method6687()) {
                              if (var34.field785) {
                                 var34.method8116();
                                 var34.field786.field3744 = false;
                              }
                           }

                           if (class143.field1342 == 0) {
                              field1512 = null;
                              field1520 = null;
                           }

                           if (!field1576) {
                              method1758();
                           }
                        }

                        class17.method297(var33.id, var13, var14, var15, var16, var27, var12);
                     }
                  }
               }
            }
         }
      }

   }

   static boolean method6366(int var0) {
      for(int var2 = 0; var2 < field1668; ++var2) {
         if (field1670[var2] == var0) {
            return true;
         }
      }

      return false;
   }

   static final void destroyInterface(int var0, int var1) {
      if (Component.method1200(var0)) {
         method7498(class96.interfaces[var0], var1);
      }
   }

   static final void method7498(Component[] var0, int var1) {
      for(int var3 = 0; var3 < var0.length; ++var3) {
         Component var4 = var0[var3];
         if (null != var4) {
            if (var4.field3608 == 0) {
               if (var4.field3743 != null) {
                  method7498(var4.field3743, var1);
               }

               SubInterface var5 = (SubInterface) activeSubInterfaces.get((long)var4.field3606);
               if (var5 != null) {
                  destroyInterface(var5.id, var1);
               }
            }

            class87 var6;
            if (var1 == 0 && var4.field3725 != null) {
               var6 = new class87();
               var6.field786 = var4;
               var6.field790 = var4.field3725;
               class63.method1516(var6);
            }

            if (var1 == 1 && null != var4.field3726) {
               if (var4.field3607 >= 0) {
                  Component var7 = Component.getComponent(var4.field3606);
                  if (var7 == null || null == var7.field3743 || var4.field3607 >= var7.field3743.length || var7.field3743[var4.field3607] != var4) {
                     continue;
                  }
               }

               var6 = new class87();
               var6.field786 = var4;
               var6.field790 = var4.field3726;
               class63.method1516(var6);
            }
         }
      }

   }

   static final void method6574(Component var0, int var1, int var2) {
      if (field1512 == null && !field1576) {
         if (var0 != null && method8605(var0) != null) {
            field1512 = var0;
            field1520 = method8605(var0);
            field1614 = var1;
            field1615 = var2;
            class143.field1342 = 0;
            field1516 = false;
            int var4 = method1537();
            if (var4 != -1) {
               method6928(var4);
            }

         }
      }
   }

   static void method6928(int var0) {
      class256.field2911 = new class60();
      class256.field2911.field421 = field1578[var0];
      class256.field2911.field426 = field1579[var0];
      class256.field2911.field420 = field1580[var0];
      class256.field2911.field422 = field1704[var0];
      class256.field2911.field424 = field1582[var0];
      class256.field2911.field425 = field1583[var0];
      class256.field2911.field423 = field1584[var0];
   }

   public static void setDirty(Component var0) {
      if (null != var0 && var0.field3669 == field1444) {
         field1634[var0.field3609] = true;
      }

   }

   static void method8708() {
      for(SubInterface var1 = (SubInterface) activeSubInterfaces.method8186(); null != var1; var1 = (SubInterface) activeSubInterfaces.method8194()) {
         int var2 = var1.id;
         if (Component.method1200(var2)) {
            boolean var3 = true;
            Component[] var4 = class96.interfaces[var2];

            int var5;
            for(var5 = 0; var5 < var4.length; ++var5) {
               if (null != var4[var5]) {
                  var3 = var4[var5].field3605;
                  break;
               }
            }

            if (!var3) {
               var5 = (int)var1.field4816;
               Component var6 = Component.getComponent(var5);
               if (null != var6) {
                  setDirty(var6);
               }
            }
         }
      }

   }

   static Component method8605(Component var0) {
      Component var2 = method5299(var0);
      if (null == var2) {
         var2 = var0.field3714;
      }

      return var2;
   }

   static final void resetAnimation(int var0) {
      if (Component.method1200(var0)) {
         Component[] var2 = class96.interfaces[var0];

         for(int var3 = 0; var3 < var2.length; ++var3) {
            Component var4 = var2[var3];
            if (null != var4) {
               var4.field3741 = 0;
               var4.field3742 = 0;
            }
         }

      }
   }

   static final void method2496(Component[] var0, int var1) {
      for(int var3 = 0; var3 < var0.length; ++var3) {
         Component var4 = var0[var3];
         if (null != var4 && var4.field3625 == var1 && (!var4.field3605 || !method6526(var4))) {
            int var6;
            if (0 == var4.field3608) {
               if (!var4.field3605 && method6526(var4) && var4 != class269.field2984) {
                  continue;
               }

               method2496(var0, var4.field3606);
               if (var4.field3743 != null) {
                  method2496(var4.field3743, var4.field3606);
               }

               SubInterface var5 = (SubInterface) activeSubInterfaces.get((long)var4.field3606);
               if (var5 != null) {
                  var6 = var5.id;
                  if (Component.method1200(var6)) {
                     method2496(class96.interfaces[var6], -1);
                  }
               }
            }

            if (6 == var4.field3608) {
               if (var4.field3654 != -1 || -1 != var4.field3728) {
                  boolean var9 = method1514(var4);
                  if (var9) {
                     var6 = var4.field3728;
                  } else {
                     var6 = var4.field3654;
                  }

                  if (var6 != -1) {
                     class215 var7 = class215.method2582(var6);
                     if (!var7.method4058()) {
                        for(var4.field3742 += field1618; var4.field3742 > var7.field2344[var4.field3741]; setDirty(var4)) {
                           var4.field3742 -= var7.field2344[var4.field3741];
                           ++var4.field3741;
                           if (var4.field3741 >= var7.field2336.length) {
                              var4.field3741 -= var7.field2355;
                              if (var4.field3741 < 0 || var4.field3741 >= var7.field2336.length) {
                                 var4.field3741 = 0;
                              }
                           }
                        }
                     } else {
                        var4.field3741 += field1618;
                        int var8 = var7.method4059();
                        if (var4.field3741 >= var8) {
                           var4.field3741 -= var7.field2355;
                           if (var4.field3741 < 0 || var4.field3741 >= var8) {
                              var4.field3741 = 0;
                           }
                        }

                        setDirty(var4);
                     }
                  }
               }

               if (0 != var4.field3663 && !var4.field3605) {
                  int var10 = var4.field3663 >> 16;
                  var6 = var4.field3663 << 16 >> 16;
                  var10 *= field1618;
                  var6 *= field1618;
                  var4.field3646 = var10 + var4.field3646 & 2047;
                  var4.field3659 = var6 + var4.field3659 & 2047;
                  setDirty(var4);
               }
            }
         }
      }

   }

   static final void method2230(int var0) {
      var0 = Math.max(Math.min(var0, 100), 0);
      var0 = 100 - var0;
      float var2 = 0.5F + (float)var0 / 200.0F;
      class229.method4279((double)var2);
      ((class236)class229.field2513.field2815).method4586((double)var2);
      class185.method2046();
      class141.clientPreferences.method1623((double)var2);
   }

   static final int method3234() {
      float var1 = 200.0F * ((float)class141.clientPreferences.method1624() - 0.5F);
      return 100 - Math.round(var1);
   }

   static final void method7572(int var0) {
      var0 = Math.min(Math.max(var0, 0), 127);
      class141.clientPreferences.method1627(var0);
   }

   static final void method1274(int var0) {
      var0 = Math.min(Math.max(var0, 0), 127);
      class141.clientPreferences.method1704(var0);
   }

   static final void method1195(int var0) {
      method8708();
      class77.method261();
      int var2 = class189.method3216(var0).field2028;
      if (var2 != 0) {
         int var3 = class329.field3577[var0];
         if (var2 == 1) {
            if (var3 == 1) {
               class229.method4279(0.9);
               ((class236)class229.field2513.field2815).method4586(0.9);
               class185.method2046();
               class141.clientPreferences.method1623(0.9);
            }

            if (var3 == 2) {
               class229.method4279(0.8);
               ((class236)class229.field2513.field2815).method4586(0.8);
               class185.method2046();
               class141.clientPreferences.method1623(0.8);
            }

            if (var3 == 3) {
               class229.method4279(0.7);
               ((class236)class229.field2513.field2815).method4586(0.7);
               class185.method2046();
               class141.clientPreferences.method1623(0.7);
            }

            if (var3 == 4) {
               class229.method4279(0.6);
               ((class236)class229.field2513.field2815).method4586(0.6);
               class185.method2046();
               class141.clientPreferences.method1623(0.6);
            }
         }

         if (var2 == 3) {
            if (var3 == 0) {
               class359.method6580(255);
            }

            if (var3 == 1) {
               class359.method6580(192);
            }

            if (var3 == 2) {
               class359.method6580(128);
            }

            if (var3 == 3) {
               class359.method6580(64);
            }

            if (var3 == 4) {
               class359.method6580(0);
            }
         }

         if (var2 == 4) {
            if (var3 == 0) {
               method7572(127);
            }

            if (var3 == 1) {
               method7572(96);
            }

            if (var3 == 2) {
               method7572(64);
            }

            if (var3 == 3) {
               method7572(32);
            }

            if (var3 == 4) {
               method7572(0);
            }
         }

         if (var2 == 5) {
            field1575 = var3 == 1;
         }

         if (var2 == 6) {
            field1604 = var3;
         }

         if (var2 == 9) {
         }

         if (var2 == 10) {
            if (var3 == 0) {
               method1274(127);
            }

            if (var3 == 1) {
               method1274(96);
            }

            if (var3 == 2) {
               method1274(64);
            }

            if (var3 == 3) {
               method1274(32);
            }

            if (var3 == 4) {
               method1274(0);
            }
         }

         if (var2 == 17) {
            field1609 = var3 & '\uffff';
         }

         if (var2 == 18) {
            field1460 = (class101)class373.method1724(class101.method4402(), var3);
            if (null == field1460) {
               field1460 = class101.field932;
            }
         }

         if (var2 == 19) {
            if (var3 == -1) {
               field1567 = -1;
            } else {
               field1567 = var3 & 2047;
            }
         }

         if (var2 == 22) {
            field1461 = (class101)class373.method1724(class101.method4402(), var3);
            if (field1461 == null) {
               field1461 = class101.field932;
            }
         }

      }
   }

   static final void method3762(Component var0) {
      int var2 = var0.field3631;
      if (var2 == 324) {
         if (field1636 == -1) {
            field1636 = var0.field3641;
            field1718 = var0.field3642;
         }

         if (field1630.field3486 == 1) {
            var0.field3641 = field1636;
         } else {
            var0.field3641 = field1718;
         }

      } else if (var2 == 325) {
         if (field1636 == -1) {
            field1636 = var0.field3641;
            field1718 = var0.field3642;
         }

         if (field1630.field3486 == 1) {
            var0.field3641 = field1718;
         } else {
            var0.field3641 = field1636;
         }

      } else if (var2 == 327) {
         var0.field3646 = 150;
         var0.field3659 = (int)(Math.sin((double)field1445 / 40.0) * 256.0) & 2047;
         var0.field3650 = 5;
         var0.field3603 = 0;
      } else if (var2 == 328) {
         var0.field3646 = 150;
         var0.field3659 = (int)(Math.sin((double)field1445 / 40.0) * 256.0) & 2047;
         var0.field3650 = 5;
         var0.field3603 = 1;
      }
   }

   static final SubInterface openSubInterface(int component, int id, int type) {
      SubInterface interf = new SubInterface();
      interf.id = id;
      interf.type = type;
      activeSubInterfaces.put(interf, (long)component);
      resetAnimation(id);
      Component comp = Component.getComponent(component);
      setDirty(comp);
      if (meslayerPauseButtonComponent != null) {
         setDirty(meslayerPauseButtonComponent);
         meslayerPauseButtonComponent = null;
      }

      class34.calculateLayerDimensions(class96.interfaces[component >> 16], comp, false);
      class63.executeLoadHook(id);
      if (rootInterface != -1) {
         destroyInterface(rootInterface, 1);
      }

      return interf;
   }

   static final boolean method8095(Component var0) {
      int var2 = var0.field3631;
      if (var2 == 205) {
         field1542 = 250;
         return true;
      } else {
         int var3;
         int var4;
         if (var2 >= 300 && var2 <= 313) {
            var3 = (var2 - 300) / 2;
            var4 = var2 & 1;
            field1630.method5833(var3, var4 == 1);
         }

         if (var2 >= 314 && var2 <= 323) {
            var3 = (var2 - 314) / 2;
            var4 = var2 & 1;
            field1630.method5819(var3, var4 == 1);
         }

         if (var2 == 324) {
            field1630.method5798(0);
         }

         if (var2 == 325) {
            field1630.method5798(1);
         }

         if (var2 == 326) {
            class308 var5 = class308.method8607(ClientPacket.field3378, serverConnection.field1046);
            field1630.method5799(var5.packet);
            serverConnection.method2148(var5);
            return true;
         } else {
            return false;
         }
      }
   }

   static final void method260(Component var0, int var1, int var2, int var3) {
      class321 var5 = var0.method6222(false);
      if (var5 != null) {
         if (field1586 < 3) {
            class17.field95.method9052(var1, var2, var5.field3517, var5.field3518, 25, 25, field1569, 256, var5.field3520, var5.field3519);
         } else {
            class535.method9232(var1, var2, 0, var5.field3520, var5.field3519);
         }

      }
   }

   static final void method3217(int var0, int var1, int var2, int var3, class523 var4, class321 var5) {
      int var7 = var3 * var3 + var2 * var2;
      if (var7 > 4225 && var7 < 90000) {
         int var8 = field1569 & 2047;
         int var9 = class229.field2511[var8];
         int var10 = class229.field2512[var8];
         int var11 = var10 * var2 + var9 * var3 >> 16;
         int var12 = var10 * var3 - var9 * var2 >> 16;
         double var13 = Math.atan2((double)var11, (double)var12);
         int var15 = var5.field3517 / 2 - 25;
         int var16 = (int)(Math.sin(var13) * (double)var15);
         int var17 = (int)(Math.cos(var13) * (double)var15);
         byte var18 = 20;
         class34.field170.method9124(var16 + (var0 + var5.field3517 / 2 - var18 / 2), var5.field3518 / 2 + var1 - var18 / 2 - var17 - 10, var18, var18, 15, 15, var13, 256);
      } else {
         method819(var0, var1, var2, var3, var4, var5);
      }

   }

   static final void method819(int var0, int var1, int var2, int var3, class523 var4, class321 var5) {
      if (null != var4) {
         int var7 = field1569 & 2047;
         int var8 = var3 * var3 + var2 * var2;
         if (var8 <= 6400) {
            int var9 = class229.field2511[var7];
            int var10 = class229.field2512[var7];
            int var11 = var10 * var2 + var3 * var9 >> 16;
            int var12 = var3 * var10 - var9 * var2 >> 16;
            if (var8 > 2500) {
               var4.method9051(var11 + var5.field3517 / 2 - var4.field5144 / 2, var5.field3518 / 2 - var12 - var4.field5142 / 2, var0, var1, var5.field3517, var5.field3518, var5.field3520, var5.field3519);
            } else {
               var4.method9139(var5.field3517 / 2 + var0 + var11 - var4.field5144 / 2, var1 + var5.field3518 / 2 - var12 - var4.field5142 / 2);
            }

         }
      }
   }

   static final void method6488() {
      Iterator var1 = class119.field1135.iterator();

      while(var1.hasNext()) {
         class76 var2 = (class76)var1.next();
         var2.method1542();
      }

      if (null != Js5Index.field42) {
         Js5Index.field42.method7621();
      }

   }

   static final void method4209() {
      field1469 = field1624;
      class445.field4699 = true;
   }

   static final void method5752(String var0) {
      if (Js5Index.field42 != null) {
         class308 var2 = class308.method8607(ClientPacket.field3408, serverConnection.field1046);
         var2.packet.writeByte(Buffer.getJagStringSize(var0));
         var2.packet.writeString(var0);
         serverConnection.method2148(var2);
      }
   }

   static final void method2470(String var0) {
      if (!var0.equals("")) {
         class308 var2 = class308.method8607(ClientPacket.field3376, serverConnection.field1046);
         var2.packet.writeByte(Buffer.getJagStringSize(var0));
         var2.packet.writeString(var0);
         serverConnection.method2148(var2);
      }
   }

   static final void method4204() {
      class308 var1 = class308.method8607(ClientPacket.field3376, serverConnection.field1046);
      var1.packet.writeByte(0);
      serverConnection.method2148(var1);
   }

   static final void method3214(int var0, int var1) {
      class164 var3 = var0 >= 0 ? field1673[var0] : class244.field2690;
      if (null != var3 && var1 >= 0 && var1 < var3.method3279()) {
         class152 var4 = (class152)var3.field1772.get(var1);
         if (var4.field1391 == -1) {
            String var5 = var4.field1389.method9155();
            class308 var6 = class308.method8607(ClientPacket.field3373, serverConnection.field1046);
            var6.packet.writeByte(3 + Buffer.getJagStringSize(var5));
            var6.packet.writeByte(var0);
            var6.packet.writeShort(var1);
            var6.packet.writeString(var5);
            serverConnection.method2148(var6);
         }
      }
   }

   static final void method8718(int var0, int var1) {
      if (field1673[var0] != null) {
         if (var1 >= 0 && var1 < field1673[var0].method3279()) {
            class152 var3 = (class152)field1673[var0].field1772.get(var1);
            if (var3.field1391 == -1) {
               class308 var4 = class308.method8607(ClientPacket.field3388, serverConnection.field1046);
               var4.packet.writeByte(3 + Buffer.getJagStringSize(var3.field1389.method9155()));
               var4.packet.writeByte(var0);
               var4.packet.writeShort(var1);
               var4.packet.writeString(var3.field1389.method9155());
               serverConnection.method2148(var4);
            }
         }
      }
   }

   static final void method2519(int var0, int var1, boolean var2) {
      if (null != field1673[var0]) {
         if (var1 >= 0 && var1 < field1673[var0].method3279()) {
            class152 var4 = (class152)field1673[var0].field1772.get(var1);
            class308 var5 = class308.method8607(ClientPacket.field3406, serverConnection.field1046);
            var5.packet.writeByte(4 + Buffer.getJagStringSize(var4.field1389.method9155()));
            var5.packet.writeByte(var0);
            var5.packet.writeShort(var1);
            var5.packet.writeBoolean(var2);
            var5.packet.writeString(var4.field1389.method9155());
            serverConnection.method2148(var5);
         }
      }
   }

   static int method2338(Component var0) {
      class492 var2 = (class492)field1647.get((long)var0.field3607 + ((long)var0.field3606 << 32));
      return var2 != null ? var2.field4960 : var0.field3680;
   }

   static Component method5299(Component var0) {
      int var2 = class323.method5755(method2338(var0));
      if (var2 == 0) {
         return null;
      } else {
         for(int var3 = 0; var3 < var2; ++var3) {
            var0 = Component.getComponent(var0.field3625);
            if (null == var0) {
               return null;
            }
         }

         return var0;
      }
   }

   static boolean method6526(Component var0) {
      return var0.field3626;
   }

   static String method4403(Component var0, int var1) {
      int var4 = method2338(var0);
      boolean var3 = 0 != (var4 >> var1 + 1 & 1);
      if (!var3 && null == var0.field3713) {
         return null;
      } else {
         return var0.field3647 != null && var0.field3647.length > var1 && var0.field3647[var1] != null && var0.field3647[var1].trim().length() != 0 ? var0.field3647[var1] : null;
      }
   }

   static String method348(Component var0) {
      if (class323.method5357(method2338(var0)) == 0) {
         return null;
      } else {
         return var0.field3692 != null && var0.field3692.trim().length() != 0 ? var0.field3692 : null;
      }
   }

   static String method2209(String var0, boolean var1) {
      String var3 = var1 ? "https://" : "http://";
      if (1 == field1434) {
         var0 = var0 + "-wtrc";
      } else if (2 == field1434) {
         var0 = var0 + "-wtqa";
      } else if (3 == field1434) {
         var0 = var0 + "-wtwip";
      } else if (field1434 == 5) {
         var0 = var0 + "-wti";
      } else if (field1434 == 4) {
         var0 = "local";
      }

      String var4 = "";
      if (class44.field305 != null) {
         var4 = "/p=" + class44.field305;
      }

      String var5 = "runescape.com";
      return var3 + var0 + "." + var5 + "/l=" + class63.field496 + "/a=" + class37.field183 + var4 + "/";
   }

   static void method7899(String var0) {
      class44.field305 = var0;

      try {
         String var2 = class124.field1180.getParameter(Integer.toString(18));
         String var3 = class124.field1180.getParameter(Integer.toString(13));
         String var4 = var2 + "settings=" + var0 + "; version=1; path=/; domain=" + var3;
         if (var0.length() == 0) {
            var4 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
         } else {
            String var5 = var4 + "; Expires=";
            long var7 = class302.safeTime() + 94608000000L;
            class316.field3503.setTime(new Date(var7));
            int var9 = class316.field3503.get(7);
            int var10 = class316.field3503.get(5);
            int var11 = class316.field3503.get(2);
            int var12 = class316.field3503.get(1);
            int var13 = class316.field3503.get(11);
            int var14 = class316.field3503.get(12);
            int var15 = class316.field3503.get(13);
            String var6 = class316.field3501[var9 - 1] + ", " + var10 / 10 + var10 % 10 + "-" + class316.field3502[0][var11] + "-" + var12 + " " + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + ":" + var15 / 10 + var15 % 10 + " GMT";
            var4 = var5 + var6 + "; Max-Age=" + 94608000L;
         }

         class30.method441(class124.field1180, "document.cookie=\"" + var4 + "\"");
      } catch (Throwable var16) {
      }

   }

   static void method2566(String var0, boolean var1) {
      var0 = var0.toLowerCase();
      short[] var3 = new short[16];
      int var4 = 0;

      for(int var5 = 0; var5 < class242.field2685; ++var5) {
         class185 var6 = class185.method2355(var5);
         if ((!var1 || var6.field2008) && var6.field1999 == -1 && var6.field1998.toLowerCase().indexOf(var0) != -1) {
            if (var4 >= 250) {
               class160.field1760 = -1;
               class83.field730 = null;
               return;
            }

            if (var4 >= var3.length) {
               short[] var7 = new short[var3.length * 2];

               for(int var8 = 0; var8 < var4; ++var8) {
                  var7[var8] = var3[var8];
               }

               var3 = var7;
            }

            var3[var4++] = (short)var5;
         }
      }

      class83.field730 = var3;
      class154.field1419 = 0;
      class160.field1760 = var4;
      String[] var9 = new String[class160.field1760];

      for(int var10 = 0; var10 < class160.field1760; ++var10) {
         var9[var10] = class185.method2355(var3[var10]).field1998;
      }

      class502.method8173(var9, class83.field730);
   }

   static void method6929(byte[] var0, int var1) {
      if (null == field1488) {
         field1488 = new byte[24];
      }

      class415.method7428(var0, var1, field1488, 0, 24);
   }

   static void method7097(Buffer var0, int var1) {
      method6929(var0.data, var1);
      class265.method5209(var0, var1);
   }

   static void method4735(Buffer var0) {
      if (field1488 != null) {
         var0.writeBytes(field1488, 0, field1488.length);
      } else {
         byte[] var2 = class160.method4268();
         var0.writeBytes(var2, 0, var2.length);
      }
   }

   public static boolean method3215() {
      return privilege >= 2;
   }

   static void method7633(int var0) {
      field1521 = var0;
   }

   static void method2329() {
      if (field1521 == 1) {
         field1529 = true;
      }

   }

   static void method7939() {
      if (field1529 && class146.field1362 != null) {
         int var1 = class146.field1362.field945[0];
         int var2 = class146.field1362.field1012[0];
         if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
            return;
         }

         class468.field4805 = class146.field1362.field949;
         int var3 = method5733(class146.field1362.field949, class146.field1362.field963, class44.field306) - field1522;
         if (var3 < class98.field916) {
            class98.field916 = var3;
         }

         class44.field302 = class146.field1362.field963;
         field1529 = false;
      }

   }

   static String method7581(String var0) {
      class361[] var2 = class361.method2121();

      for(int var3 = 0; var3 < var2.length; ++var3) {
         class361 var4 = var2[var3];
         if (-1 != var4.field3995 && var0.startsWith(class90.method2108(var4.field3995))) {
            var0 = var0.substring(6 + Integer.toString(var4.field3995).length());
            break;
         }
      }

      return var0;
   }

   static void updateLoginStage(int var0) {
      if (var0 != loginStage) {
         loginStage = var0;
      }
   }

   static void method299(boolean var0) {
      field1575 = var0;
   }

   static class518 method8125(int var0) {
      class518 var2 = (class518)field1475.method5643((long)var0);
      if (null == var2) {
         var2 = new class518(class182.field1885, class511.method4906(var0), class511.method1574(var0));
         field1475.method5640(var2, (long)var0);
      }

      return var2;
   }

   static class518 method3241(int var0) {
      class518 var2 = (class518)field1724.method5643((long)var0);
      if (null == var2) {
         var2 = new class518(class182.field1885, var0);
      }

      return var2;
   }

   public static Clipboard method2581() {
      return class124.field1180.method656();
   }

   static void method316(int var0) {
      class215 var2 = class215.method2582(var0);
      if (var2.method4058()) {
         if (class215.method5358(var2.field2338) == 2) {
            field1570.add(var2.field2338);
         }

      }
   }

   static void method2558() {
      for(int var1 = 0; var1 < field1570.size(); ++var1) {
         if (class215.method5358((Integer)field1570.get(var1)) != 2) {
            field1570.remove(var1);
            --var1;
         }
      }

   }

   protected final void method744() {
   }

   public final void init() {
      if (this.method668()) {
         for(int var1 = 0; var1 <= 28; ++var1) {
            String var2 = this.getParameter(Integer.toString(var1));
            if (null != var2) {
               int var4;
               switch (var1) {
                  case 3:
                     if (var2.equalsIgnoreCase(class90.field827)) {
                        field1435 = true;
                     } else {
                        field1435 = false;
                     }
                     break;
                  case 4:
                     if (clientType == -1) {
                        clientType = Integer.parseInt(var2);
                     }
                     break;
                  case 5:
                     field1433 = Integer.parseInt(var2);
                     break;
                  case 6:
                     var4 = Integer.parseInt(var2);
                     class384 var14;
                     if (var4 >= 0 && var4 < class384.field4406.length) {
                        var14 = class384.field4406[var4];
                     } else {
                        var14 = null;
                     }

                     class63.field496 = var14;
                     break;
                  case 7:
                     var4 = Integer.parseInt(var2);
                     class347[] var5 = new class347[]{class347.field3854, class347.field3852, class347.field3855, class347.field3858};
                     int var7 = 0;

                     class347 var13;
                     while(true) {
                        if (var7 >= var5.length) {
                           var13 = null;
                           break;
                        }

                        class347 var8 = var5[var7];
                        if (var4 == var8.field3856) {
                           var13 = var8;
                           break;
                        }

                        ++var7;
                     }

                     class96.field883 = var13;
                     break;
                  case 8:
                     if (var2.equalsIgnoreCase(class90.field827)) {
                     }
                     break;
                  case 9:
                     class44.field305 = var2;
                     break;
                  case 10:
                     class359[] var12 = new class359[]{class359.field3966, class359.field3967, class359.field3970, class359.field3969, class359.field3963, class359.field3964};
                     class12.field65 = (class359)class373.method1724(var12, Integer.parseInt(var2));
                     if (class359.field3967 == class12.field65) {
                        class454.field4743 = class477.field4854;
                     } else {
                        class454.field4743 = class477.field4855;
                     }
                     break;
                  case 11:
                     class105.field1041 = var2;
                     break;
                  case 12:
                     field1432 = Integer.parseInt(var2);
                  case 13:
                  case 16:
                  case 18:
                  case 19:
                  case 20:
                  case 22:
                  case 23:
                  case 24:
                  default:
                     break;
                  case 14:
                     class37.field183 = Integer.parseInt(var2);
                     break;
                  case 15:
                     field1434 = Integer.parseInt(var2);
                     break;
                  case 17:
                     class307.field3346 = var2;
                     break;
                  case 21:
                     field1437 = Integer.parseInt(var2);
                     break;
                  case 25:
                     int var3 = var2.indexOf(".");
                     if (var3 == -1) {
                        revision = Integer.parseInt(var2);
                     } else {
                        revision = Integer.parseInt(var2.substring(0, var3));
                        Integer.parseInt(var2.substring(var3 + 1));
                     }
               }
            }
         }

         method1972();
         class196.field2146 = this.getCodeBase().getHost();
         Js5NetQueue.field1356 = new class355();
         String var10 = class96.field883.field3853;
         byte var11 = 0;
         if (0 != (field1433 & 65536)) {
            class189.field2035 = "beta";
         }

         try {
            class160.method3851("oldschool", class189.field2035, var10, var11, 22);
         } catch (Exception var9) {
            class524.method5856((String)null, var9);
         }

         class124.field1180 = this;
         class524.field5157 = clientType;
         method2099();
         if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
            this.field1478 = true;
         }

         if (-1 == platformType) {
            if (!this.method2695() && !this.method2884()) {
               platformType = 0;
            } else {
               platformType = 5;
            }
         }

         this.method665(765, 503, 215, 1);
      }
   }

   protected void finalize() throws Throwable {
      class303.field3200.remove(this);
      super.finalize();
   }

   public void setOtlTokenRequester(OtlTokenRequester var1) {
      if (null != var1) {
         this.field1476 = var1;
         Login.method6370(10);
      }
   }

   public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
      if (var1 != null) {
         this.field1480 = var1;
      }
   }

   public boolean isOnLoginScreen() {
      return gameState == 10;
   }

   public long getAccountHash() {
      return this.serverSeed;
   }

   boolean method2695() {
      return null != class3.field21 && !class3.field21.trim().isEmpty() && class81.field719 != null && !class81.field719.trim().isEmpty();
   }

   boolean method2884() {
      return null != class20.field114 && !class20.field114.trim().isEmpty() && null != Login.field468 && !Login.field468.trim().isEmpty();
   }

   boolean method3185() {
      return null != this.field1476;
   }

   void method2698(String var1) throws IOException {
      HashMap var3 = new HashMap();
      var3.put("grant_type", "refresh_token");
      var3.put("scope", "gamesso.token.create");
      var3.put("refresh_token", var1);
      URL var4 = new URL(class105.field1041 + "shield/oauth/token" + (new class466(var3)).method8075());
      class418 var5 = new class418();
      var5.method7479(field1482);
      var5.method7476("Host", (new URL(class105.field1041)).getHost());
      var5.method7483(class461.field4764);
      class16 var6 = class16.field84;
      RefreshAccessTokenRequester var7 = this.field1480;
      if (var7 != null) {
         this.field1481 = var7.request(var6.method272(), var4, var5.method7493(), "");
      } else {
         class17 var8 = new class17(var4, var6, var5, this.field1478);
         this.field1479 = this.field1474.method2(var8);
      }
   }

   void method2699(String var1) throws IOException {
      URL var3 = new URL(class105.field1041 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
      class418 var4 = new class418();
      var4.method7480(var1);
      class16 var5 = class16.field78;
      OtlTokenRequester var6 = this.field1476;
      if (null != var6) {
         this.field1477 = var6.request(var5.method272(), var3, var4.method7493(), "");
      } else {
         class17 var7 = new class17(var3, var5, var4, this.field1478);
         this.field1550 = this.field1474.method2(var7);
      }
   }

   void method2700(String var1, String var2) throws IOException, JSONException {
      URL var4 = new URL(class105.field1041 + "game-session/v1/tokens");
      class17 var5 = new class17(var4, class16.field84, this.field1478);
      var5.method284().method7480(var1);
      var5.method284().method7483(class461.field4764);
      JSONObject var6 = new JSONObject();
      var6.put("accountId", var2);
      var5.method285(new class447(var6));
      this.field1550 = this.field1474.method2(var5);
   }

   protected final void method681() {
      int[] var2 = new int[]{20, 260, 10000};
      int[] var3 = new int[]{1000, 100, 500};
      if (var2 != null && var3 != null) {
         class401.field4486 = var2;
         class126.field1201 = new int[var2.length];
         class135.field1253 = new byte[var2.length][][];

         for(int var4 = 0; var4 < class401.field4486.length; ++var4) {
            class135.field1253[var4] = new byte[var3[var4]][];
            class401.field4487.add(var2[var4]);
         }

         Collections.sort(class401.field4487);
      } else {
         class401.field4486 = null;
         class126.field1201 = null;
         class135.field1253 = (byte[][][])null;
         class401.field4487.clear();
         class401.field4487.add(100);
         class401.field4487.add(5000);
         class401.field4487.add(10000);
         class401.field4487.add(30000);
      }

      Login.field433 = 0 == field1434 ? '\uaa4a' : '\u9c40' + field1432;
      class20.field108 = field1434 == 0 ? 443 : field1432 + '\uc350';
      class329.field3580 = Login.field433;
      class48.field350 = class319.field3516;
      class164.field1774 = class319.field3515;
      class252.field2847 = class319.field3513;
      class265.field2961 = class319.field3514;
      class261.field2935 = new class112(this.field1478, 215);
      this.method657();
      this.method663();
      class289.field3115 = this.method717();
      this.method659(field1528, 0);
      this.method659(field1666, 1);
      class157.field1740 = new class449(255, class160.field1750, class160.field1753, 500000);
      class141.clientPreferences = class79.method2441();
      this.method654();
      class45.method5201(this, class331.field3586);
      class222.method4213(class141.clientPreferences.method1635());
      class165.field1782 = new class56(class454.field4743);
      this.field1474 = new class1("tokenRequest", 1, 1);
      class303.method1739(this);
      class210.field2260 = new class225[1];
      class226 var5 = class226.field2477;
      class210.field2260[0] = new class225(var5.field2485, var5.field2486);
   }

   protected final void method682() {
      ++field1445;
      this.method2702();
      class350.method7876();
      boolean var2 = SubInterface.method1973(field1445);
      if (var2 && field1490 && class194.field2126 != null) {
         class194.field2126.method584();
      }

      method2290();
      field1666.method4118();
      this.method658();
      synchronized(class41.field240) {
         class41.field248 = class41.field244;
         class41.field249 = class41.field260;
         class41.field250 = class41.field246;
         class41.field251 = class41.field242;
         class41.field256 = class41.field252;
         class41.field257 = class41.field253;
         class41.field258 = class41.field254;
         class41.field259 = class41.field241;
         class41.field252 = 0;
      }

      if (class289.field3115 != null) {
         int var3 = class289.field3115.method3244();
         field1641 = var3;
      }

      if (gameState == 0) {
         method4206();
         GameShell.method3439();
      } else if (5 == gameState) {
         Login.method3299(this, class185.field1996, class112.field1079);
         method4206();
         GameShell.method3439();
      } else if (10 != gameState && 11 != gameState) {
         if (gameState == 20) {
            Login.method3299(this, class185.field1996, class112.field1079);
            this.method2705();
         } else if (gameState == 50) {
            Login.method3299(this, class185.field1996, class112.field1079);
            this.method2705();
         } else if (gameState == 25) {
            method2439();
         }
      } else {
         Login.method3299(this, class185.field1996, class112.field1079);
      }

      if (gameState == 30) {
         this.method2706();
      } else if (40 == gameState || gameState == 45) {
         this.method2705();
      }

   }

   protected final void method683(boolean var1) {
      if ((10 == gameState || gameState == 20 || 30 == gameState) && 0L != field1658 && class302.safeTime() > field1658) {
         class222.method4213(method5791());
      }

      int var3;
      if (var1) {
         for(var3 = 0; var3 < 100; ++var3) {
            field1634[var3] = true;
         }
      }

      if (0 == gameState) {
         this.method684(Login.field450, Login.field436, var1);
      } else if (5 == gameState) {
         Login.method7420(class316.field3504, class185.field1996, class112.field1079);
      } else if (gameState != 10 && gameState != 11) {
         if (gameState == 20) {
            Login.method7420(class316.field3504, class185.field1996, class112.field1079);
         } else if (50 == gameState) {
            Login.method7420(class316.field3504, class185.field1996, class112.field1079);
         } else if (gameState == 25) {
            if (field1453 == 1) {
               if (field1646 > field1500) {
                  field1500 = field1646;
               }

               var3 = (field1500 * 50 - field1646 * 50) / field1500;
               method2100(class364.field4024 + class90.field835 + class90.field831 + var3 + "%" + class90.field830, false);
            } else if (2 == field1453) {
               if (field1595 > field1502) {
                  field1502 = field1595;
               }

               var3 = (field1502 * 50 - field1595 * 50) / field1502 + 50;
               method2100(class364.field4024 + class90.field835 + class90.field831 + var3 + "%" + class90.field830, false);
            } else {
               method2100(class364.field4024, false);
            }
         } else if (gameState == 30) {
            this.method2709();
         } else if (40 == gameState) {
            method2100(class364.field4032 + class90.field835 + class364.field4033, false);
         } else if (gameState == 45) {
            method2100(class364.field4037, false);
         }
      } else {
         Login.method7420(class316.field3504, class185.field1996, class112.field1079);
      }

      if (30 == gameState && 0 == field1588 && !var1 && !isResizable) {
         for(var3 = 0; var3 < field1648; ++var3) {
            if (field1651[var3]) {
               class159.field1749.method9187(field1581[var3], field1654[var3], field1655[var3], field1656[var3]);
               field1651[var3] = false;
            }
         }
      } else if (gameState > 0) {
         class159.field1749.method9186(0, 0);

         for(var3 = 0; var3 < field1648; ++var3) {
            field1651[var3] = false;
         }
      }

   }

   protected final void method759() {
      if (class104.field1038.method2361()) {
         class104.field1038.method2378();
      }

      if (null != class514.field5111) {
         class514.field5111.field736 = false;
      }

      class514.field5111 = null;
      serverConnection.method2146();
      if (null != class41.field240) {
         synchronized(class41.field240) {
            class41.field240 = null;
         }
      }

      class289.field3115 = null;
      if (null != class194.field2126) {
         class194.field2126.method547();
      }

      Js5NetQueue.field1356.method6540();
      class350.method6519();
      if (class261.field2935 != null) {
         class261.field2935.method2227();
         class261.field2935 = null;
      }

      try {
         class160.field1750.method8661();

         for(int var2 = 0; var2 < class160.field1757; ++var2) {
            class302.field3191[var2].method8661();
         }

         class160.field1753.method8661();
         class160.field1755.method8661();
      } catch (Exception var5) {
      }

      this.field1474.method4();
   }

   void method2702() {
      if (1000 != gameState) {
         boolean var2 = Js5NetQueue.field1356.method6545();
         if (!var2) {
            this.doCycleJs5Connect();
         }

      }
   }

   void doCycleJs5Connect() {
      if (Js5NetQueue.field1356.crcMismatches >= 4) {
         this.error("js5crc");
         updateGameState(1000);
      } else {
         if (Js5NetQueue.field1356.ioExceptions >= 4) {
            if (gameState <= 5) {
               this.error("js5io");
               updateGameState(1000);
               return;
            }

            field1465 = 3000;
            Js5NetQueue.field1356.ioExceptions = 3;
         }

         if (--field1465 + 1 <= 0) {
            try {
               if (0 == js5ConnectState) {
                  class292.js5SocketTask = GameShell.field272.newSocketTask(class196.field2146, class329.field3580);
                  ++js5ConnectState;
               }

               if (1 == js5ConnectState) {
                  if (class292.js5SocketTask.field1859 == 2) {
                     this.method3196(-1);
                     return;
                  }

                  if (class292.js5SocketTask.field1859 == 1) {
                     ++js5ConnectState;
                  }
               }

               if (2 == js5ConnectState) {
                  class149.js5Socket = class424.newSocketStream((Socket)class292.js5SocketTask.result, 40000, 5000);
                  Buffer var2 = new Buffer(5);
                  var2.writeByte(15);
                  var2.writeInt(215);
                  class149.js5Socket.write(var2.data, 0, 5);
                  ++js5ConnectState;
                  class186.field2023 = class302.safeTime();
               }

               if (3 == js5ConnectState) {
                  if (class149.js5Socket.available() > 0) {
                     int var4 = class149.js5Socket.readUnsignedByte();
                     if (var4 != 0) {
                        this.method3196(var4);
                        return;
                     }

                     ++js5ConnectState;
                  } else if (class302.safeTime() - class186.field2023 > 30000L) {
                     this.method3196(-2);
                     return;
                  }
               }

               if (js5ConnectState == 4) {
                  Js5NetQueue.field1356.method6533(class149.js5Socket, gameState > 20);
                  class292.js5SocketTask = null;
                  class149.js5Socket = null;
                  js5ConnectState = 0;
                  field1466 = 0;
               }
            } catch (IOException var3) {
               this.method3196(-3);
            }

         }
      }
   }

   void method3196(int var1) {
      class292.js5SocketTask = null;
      class149.js5Socket = null;
      js5ConnectState = 0;
      if (class329.field3580 == Login.field433) {
         class329.field3580 = class20.field108;
      } else {
         class329.field3580 = Login.field433;
      }

      ++field1466;
      if (field1466 < 2 || var1 != 7 && var1 != 9) {
         if (field1466 >= 2 && var1 == 6) {
            this.error("js5connect_outofdate");
            updateGameState(1000);
         } else if (field1466 >= 4) {
            if (gameState <= 5) {
               this.error("js5connect");
               updateGameState(1000);
            } else {
               field1465 = 3000;
            }
         }
      } else if (gameState <= 5) {
         this.error("js5connect_full");
         updateGameState(1000);
      } else {
         field1465 = 3000;
      }

   }

   final void method2705() {
      class424 loginConnection = serverConnection.method2137();
      PacketBuffer packetBuf = serverConnection.buffer;

      try {
         if (0 == loginStage) {
            if (class204.secureRandom == null && (field1484.method1080() || field1468 > 250)) {
               class204.secureRandom = field1484.method1081();
               field1484.method1079();
               field1484 = null;
            }

            if (null != class204.secureRandom) {
               if (loginConnection != null) {
                  loginConnection.method7589();
                  loginConnection = null;
               }

               class454.field4744 = null;
               field1487 = false;
               field1468 = 0;
               if (loginMethod.isOAuth()) {
                  if (this.method2695()) {
                     try {
                        this.method2698(class81.field719);
                        updateLoginStage(21);
                     } catch (Throwable var21) {
                        class524.method5856((String)null, var21);
                        class343.method6479(65);
                        return;
                     }
                  } else {
                     if (!this.method2884()) {
                        class343.method6479(65);
                        return;
                     }

                     try {
                        this.method2700(class20.field114, Login.field468);
                        updateLoginStage(20);
                     } catch (Exception var20) {
                        class524.method5856((String)null, var20);
                        class343.method6479(65);
                        return;
                     }
                  }
               } else {
                  updateLoginStage(1);
               }
            }
         }

         class3 var23;
         if (loginStage == 21) {
            if (this.field1481 != null) {
               if (!this.field1481.isDone()) {
                  return;
               }

               if (this.field1481.isCancelled()) {
                  class343.method6479(65);
                  this.field1481 = null;
                  return;
               }

               try {
                  RefreshAccessTokenResponse var4 = (RefreshAccessTokenResponse)this.field1481.get();
                  if (!var4.isSuccess()) {
                     class343.method6479(65);
                     this.field1481 = null;
                     return;
                  }

                  class3.field21 = var4.getAccessToken();
                  class81.field719 = var4.getRefreshToken();
                  this.field1481 = null;
               } catch (Exception var19) {
                  class524.method5856((String)null, var19);
                  class343.method6479(65);
                  this.field1481 = null;
                  return;
               }
            } else {
               if (null == this.field1479) {
                  class343.method6479(65);
                  return;
               }

               if (!this.field1479.method71()) {
                  return;
               }

               if (this.field1479.method74()) {
                  class524.method5856(this.field1479.method73(), (Throwable)null);
                  class343.method6479(65);
                  this.field1479 = null;
                  return;
               }

               var23 = this.field1479.method76();
               if (var23.method56() != 200) {
                  class343.method6479(65);
                  this.field1479 = null;
                  return;
               }

               field1468 = 0;
               class447 var5 = new class447(var23.method58());

               try {
                  class3.field21 = var5.method7848().getString("access_token");
                  class81.field719 = var5.method7848().getString("refresh_token");
               } catch (Exception var18) {
                  class524.method5856("Error parsing tokens", var18);
                  class343.method6479(65);
                  this.field1479 = null;
                  return;
               }
            }

            this.method2699(class3.field21);
            updateLoginStage(20);
         }

         if (loginStage == 20) {
            if (null != this.field1477) {
               if (!this.field1477.isDone()) {
                  return;
               }

               if (this.field1477.isCancelled()) {
                  class343.method6479(65);
                  this.field1477 = null;
                  return;
               }

               try {
                  OtlTokenResponse var24 = (OtlTokenResponse)this.field1477.get();
                  if (!var24.isSuccess()) {
                     class343.method6479(65);
                     this.field1477 = null;
                     return;
                  }

                  this.oauthToken = var24.getToken();
                  this.field1477 = null;
               } catch (Exception var17) {
                  class524.method5856((String)null, var17);
                  class343.method6479(65);
                  this.field1477 = null;
                  return;
               }
            } else {
               if (this.field1550 == null) {
                  class343.method6479(65);
                  return;
               }

               if (!this.field1550.method71()) {
                  return;
               }

               if (this.field1550.method74()) {
                  class524.method5856(this.field1550.method73(), (Throwable)null);
                  class343.method6479(65);
                  this.field1550 = null;
                  return;
               }

               var23 = this.field1550.method76();
               if (var23.method56() != 200) {
                  class524.method5856("Response code: " + var23.method56() + "Response body: " + var23.method58(), (Throwable)null);
                  class343.method6479(65);
                  this.field1550 = null;
                  return;
               }

               List var25 = (List)var23.method57().get("Content-Type");
               if (var25 != null && var25.contains(class461.field4764.method8040())) {
                  try {
                     JSONObject var6 = new JSONObject(var23.method58());
                     this.oauthToken = var6.getString("token");
                  } catch (JSONException var16) {
                     class524.method5856((String)null, var16);
                     class343.method6479(65);
                     this.field1550 = null;
                     return;
                  }
               } else {
                  this.oauthToken = var23.method58();
               }

               this.field1550 = null;
            }

            field1468 = 0;
            updateLoginStage(1);
         }

         if (loginStage == 1) {
            if (class454.field4744 == null) {
               class454.field4744 = GameShell.field272.newSocketTask(class196.field2146, class329.field3580);
            }

            if (class454.field4744.field1859 == 2) {
               throw new IOException();
            }

            if (class454.field4744.field1859 == 1) {
               loginConnection = class424.newSocketStream((Socket)class454.field4744.result, 40000, 5000);
               serverConnection.method2133(loginConnection);
               class454.field4744 = null;
               updateLoginStage(2);
            }
         }

         class308 var27;
         if (loginStage == 2) {
            serverConnection.clearQueue();
            var27 = class308.method2535();
            var27.field3360 = null;
            var27.field3352 = 0;
            var27.packet = new PacketBuffer(5000);
            var27.packet.writeByte(LoginType.field3462.opcode);
            serverConnection.method2148(var27);
            serverConnection.method2131();
            packetBuf.offset = 0;
            updateLoginStage(3);
         }

         int var26;
         if (loginStage == 3) {
            if (null != class194.field2126) {
               class194.field2126.method532();
            }

            if (loginConnection.method7597(1)) {
               var26 = loginConnection.readUnsignedByte();
               if (class194.field2126 != null) {
                  class194.field2126.method532();
               }

               if (var26 != 0) {
                  class343.method6479(var26);
                  return;
               }

               packetBuf.offset = 0;
               updateLoginStage(4);
            }
         }

         if (4 == loginStage) {
            if (packetBuf.offset < 8) {
               var26 = loginConnection.available();
               if (var26 > 8 - packetBuf.offset) {
                  var26 = 8 - packetBuf.offset;
               }

               if (var26 > 0) {
                  loginConnection.readBytes(packetBuf.data, packetBuf.offset, var26);
                  packetBuf.offset += var26;
               }
            }

            if (packetBuf.offset == 8) {
               packetBuf.offset = 0;
               class318.serverSeed = packetBuf.readLong();
               updateLoginStage(5);
            }
         }

         if (loginStage == 5) {
            serverConnection.buffer.offset = 0;
            serverConnection.clearQueue();
            PacketBuffer rsaBuf = new PacketBuffer(500);
            int[] xteas = new int[]{class204.secureRandom.nextInt(), class204.secureRandom.nextInt(), class204.secureRandom.nextInt(), class204.secureRandom.nextInt()};
            rsaBuf.offset = 0;
            rsaBuf.writeByte(1);
            rsaBuf.writeInt(xteas[0]);
            rsaBuf.writeInt(xteas[1]);
            rsaBuf.writeInt(xteas[2]);
            rsaBuf.writeInt(xteas[3]);
            rsaBuf.writeLong(class318.serverSeed);
            if (40 == gameState) {
               rsaBuf.writeInt(class375.field4361[0]);
               rsaBuf.writeInt(class375.field4361[1]);
               rsaBuf.writeInt(class375.field4361[2]);
               rsaBuf.writeInt(class375.field4361[3]);
            } else {
               if (gameState == 50) {
                  rsaBuf.writeByte(class132.field1245.serialId());
                  rsaBuf.writeInt(class70.field576);
               } else {
                  rsaBuf.writeByte(authType.serialId());
                  switch (authType.ordinal) {
                     case 1:
                     case 4:
                        rsaBuf.writeMedium(class428.field4629);
                        ++rsaBuf.offset;
                        break;
                     case 2:
                        rsaBuf.offset += 4;
                        break;
                     case 3:
                        rsaBuf.writeInt(class141.clientPreferences.method1638(Login.loginUsername));
                  }
               }

               if (loginMethod.isOAuth()) {
                  rsaBuf.writeByte(LoginMethod.OAUTH.serialId());
                  rsaBuf.writeString(this.oauthToken);
               } else {
                  rsaBuf.writeByte(LoginMethod.NORMAL.serialId());
                  rsaBuf.writeString(Login.loginPassword);
               }
            }

            rsaBuf.encryptRsa(LoginEncryption.rsaExponent, LoginEncryption.rsaModulus);
            class375.field4361 = xteas;
            class308 buf = class308.method2535();
            buf.field3360 = null;
            buf.field3352 = 0;
            buf.packet = new PacketBuffer(5000);
            buf.packet.offset = 0;
            if (gameState == 40) {
               buf.packet.writeByte(LoginType.RECONNECT.opcode);
            } else {
               buf.packet.writeByte(LoginType.NORMAL.opcode);
            }

            buf.packet.writeShort(0);
            int var8 = buf.packet.offset;
            buf.packet.writeInt(215);
            buf.packet.writeInt(1);
            buf.packet.writeByte(clientType);
            buf.packet.writeByte(platformType);
            byte var9 = 0;
            buf.packet.writeByte(var9);
            buf.packet.writeBytes(rsaBuf.data, 0, rsaBuf.offset);
            int var10 = buf.packet.offset;
            buf.packet.writeString(Login.loginUsername);
            buf.packet.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0));
            buf.packet.writeShort(class343.field3838);
            buf.packet.writeShort(class488.field4948);
            method4735(buf.packet);
            buf.packet.writeString(class44.field305);
            buf.packet.writeInt(class37.field183);
            if (revision > 213) {
               buf.packet.writeByte(0);
            }

            Buffer var11 = new Buffer(class191.field2089.method8453());
            class191.field2089.method8451(var11);
            buf.packet.writeBytes(var11.data, 0, var11.data.length);
            buf.packet.writeByte(clientType);
            buf.packet.writeInt(0);
            buf.packet.writeIntME(class186.field2015.field3831);
            buf.packet.writeIntLE(class63.field498.field3831);
            buf.packet.writeIntME(class150.field1383.field3831);
            buf.packet.writeIntLE(0);
            buf.packet.writeIntME(class260.field2931.field3831);
            buf.packet.writeIntIME(class70.field570.field3831);
            buf.packet.writeInt(class131.field1236.field3831);
            buf.packet.writeIntIME(class26.field133.field3831);
            buf.packet.writeIntLE(class130.field1226.field3831);
            buf.packet.writeIntLE(Js5Index.mapsJs5.field3831);
            buf.packet.writeIntME(class124.field1182.field3831);
            buf.packet.writeIntME(class200.field2181.field3831);
            buf.packet.writeIntIME(class127.field1209.field3831);
            buf.packet.writeIntLE(class379.field4382.field3831);
            buf.packet.writeInt(class73.field589.field3831);
            buf.packet.writeIntIME(class475.field4839.field3831);
            buf.packet.writeInt(class107.field1059.field3831);
            buf.packet.writeIntME(class49.field361.field3831);
            buf.packet.writeIntIME(class144.field1347.field3831);
            buf.packet.writeIntME(class136.field1254.field3831);
            buf.packet.writeIntIME(class24.field121.field3831);
            buf.packet.method8773(xteas, var10, buf.packet.offset);
            buf.packet.writeLengthShort(buf.packet.offset - var8);
            serverConnection.method2148(buf);
            serverConnection.method2131();
            serverConnection.field1046 = new class540(xteas);
            int[] var12 = new int[4];

            for(int var13 = 0; var13 < 4; ++var13) {
               var12[var13] = xteas[var13] + 50;
            }

            packetBuf.method8475(var12);
            updateLoginStage(6);
         }

         int var29;
         if (6 == loginStage && loginConnection.available() > 0) {
            var26 = loginConnection.readUnsignedByte();
            if (var26 == 61) {
               var29 = loginConnection.available();
               class76.field635 = var29 == 1 && loginConnection.readUnsignedByte() == 1;
               updateLoginStage(5);
            }

            if (var26 == 21 && 20 == gameState) {
               updateLoginStage(12);
            } else if (var26 == 2) {
               updateLoginStage(14);
            } else if (var26 == 15 && 40 == gameState) {
               serverConnection.packetLength = -1;
               updateLoginStage(19);
            } else if (var26 == 64) {
               updateLoginStage(10);
            } else if (var26 == 23 && field1712 < 1) {
               ++field1712;
               updateLoginStage(0);
            } else if (var26 == 29) {
               updateLoginStage(17);
            } else {
               if (var26 != 69) {
                  class343.method6479(var26);
                  return;
               }

               updateLoginStage(7);
            }
         }

         if (7 == loginStage && loginConnection.available() >= 2) {
            loginConnection.readBytes(packetBuf.data, 0, 2);
            packetBuf.offset = 0;
            class379.field4380 = packetBuf.readUnsignedShort();
            updateLoginStage(8);
         }

         if (8 == loginStage && loginConnection.available() >= class379.field4380) {
            packetBuf.offset = 0;
            loginConnection.readBytes(packetBuf.data, packetBuf.offset, class379.field4380);
            class7 var35 = class7.method5783()[packetBuf.readUnsignedByte()];

            try {
               class13 var32 = class19.method1377(var35);
               this.field1486 = new class26(packetBuf, var32);
               updateLoginStage(9);
            } catch (Exception var15) {
               class343.method6479(22);
               return;
            }
         }

         if (loginStage == 9 && this.field1486.method369()) {
            this.field1485 = this.field1486.method363();
            this.field1486.method362();
            this.field1486 = null;
            if (this.field1485 == null) {
               class343.method6479(22);
               return;
            }

            serverConnection.clearQueue();
            var27 = class308.method2535();
            var27.field3360 = null;
            var27.field3352 = 0;
            var27.packet = new PacketBuffer(5000);
            var27.packet.writeByte(LoginType.field3466.opcode);
            var27.packet.writeShort(this.field1485.offset);
            var27.packet.writeBytes(this.field1485);
            serverConnection.method2148(var27);
            serverConnection.method2131();
            this.field1485 = null;
            updateLoginStage(6);
         }

         if (loginStage == 10 && loginConnection.available() > 0) {
            class291.field3123 = loginConnection.readUnsignedByte();
            updateLoginStage(11);
         }

         if (11 == loginStage && loginConnection.available() >= class291.field3123) {
            loginConnection.readBytes(packetBuf.data, 0, class291.field3123);
            packetBuf.offset = 0;
            updateLoginStage(6);
         }

         if (loginStage == 12 && loginConnection.available() > 0) {
            field1470 = (loginConnection.readUnsignedByte() + 3) * 60;
            updateLoginStage(13);
         }

         if (loginStage == 13) {
            field1468 = 0;
            Login.method2098(class364.field4063, class364.field4064, field1470 / 60 + class364.field4325);
            if (--field1470 <= 0) {
               updateLoginStage(0);
            }

         } else {
            if (14 == loginStage && loginConnection.available() >= 1) {
               class40.field231 = loginConnection.readUnsignedByte();
               updateLoginStage(15);
            }

            if (15 == loginStage && loginConnection.available() >= class40.field231) {
               boolean var39 = loginConnection.readUnsignedByte() == 1;
               loginConnection.readBytes(packetBuf.data, 0, 4);
               packetBuf.offset = 0;
               boolean var36 = false;
               if (var39) {
                  var29 = packetBuf.method8478() << 24;
                  var29 |= packetBuf.method8478() << 16;
                  var29 |= packetBuf.method8478() << 8;
                  var29 |= packetBuf.method8478();
                  class141.clientPreferences.method1636(Login.loginUsername, var29);
               }

               if (isUsernameRemembered) {
                  class141.clientPreferences.method1630(Login.loginUsername);
               } else {
                  class141.clientPreferences.method1630((String)null);
               }

               class79.saveClientPreferences();
               privilege = loginConnection.readUnsignedByte();
               isPlayerMod = loginConnection.readUnsignedByte() == 1;
               localPlayerIndex = loginConnection.readUnsignedByte();
               localPlayerIndex <<= 8;
               localPlayerIndex += loginConnection.readUnsignedByte();
               isMember = loginConnection.readUnsignedByte();
               loginConnection.readBytes(packetBuf.data, 0, 8);
               packetBuf.offset = 0;
               this.serverSeed = packetBuf.readLong();
               loginConnection.readBytes(packetBuf.data, 0, 8);
               packetBuf.offset = 0;
               serverUUIDMaybeIdk = packetBuf.readLong();
               if (revision >= 214) {
                  loginConnection.readBytes(packetBuf.data, 0, 8);
                  packetBuf.offset = 0;
                  packetBuf.readLong();
               }

               loginConnection.readBytes(packetBuf.data, 0, 1);
               packetBuf.offset = 0;
               ServerPacket[] serverPackets = ServerPacket.values();
               int opcode = packetBuf.readOpcode();
               if (opcode < 0 || opcode >= serverPackets.length) {
                  throw new IOException(opcode + " " + packetBuf.offset);
               }

               serverConnection.serverPacket = serverPackets[opcode];
               serverConnection.packetLength = serverConnection.serverPacket.length;
               loginConnection.readBytes(packetBuf.data, 0, 2);
               packetBuf.offset = 0;
               serverConnection.packetLength = packetBuf.readUnsignedShort();

               try {
                  Client var41 = class124.field1180;
                  //JSObject.getWindow(var41).call("zap", (Object[])null);
               } catch (Throwable var14) {
               }

               updateLoginStage(16);
            }

            if (loginStage == 16) {
               if (loginConnection.available() >= serverConnection.packetLength) {
                  packetBuf.offset = 0;
                  loginConnection.readBytes(packetBuf.data, 0, serverConnection.packetLength);
                  field1497.method7070();
                  field1446 = -1L;
                  class514.field5111.field731 = 0;
                  class331.field3587 = true;
                  field1450 = true;
                  field1566 = -1L;
                  class44.method264();
                  serverConnection.clearQueue();
                  serverConnection.buffer.offset = 0;
                  serverConnection.serverPacket = null;
                  serverConnection.field1049 = null;
                  serverConnection.field1054 = null;
                  serverConnection.field1055 = null;
                  serverConnection.packetLength = 0;
                  serverConnection.field1056 = 0;
                  field1451 = 0;
                  field1542 = 0;
                  field1452 = 0;
                  field1594 = 0;
                  field1576 = false;
                  class41.method1415(0);
                  class119.method503();
                  field1494 = 0;
                  field1657 = false;
                  field1632 = 0;
                  field1569 = 0;
                  field1521 = 0;
                  class121.field1152 = null;
                  field1586 = 0;
                  field1674 = -1;
                  field1513 = 0;
                  field1680 = 0;
                  field1460 = class101.field934;
                  field1461 = class101.field934;
                  field1565 = 0;
                  class116.method4187();

                  for(var26 = 0; var26 < 2048; ++var26) {
                     field1527[var26] = null;
                  }

                  for(var26 = 0; var26 < 65536; ++var26) {
                     field1489[var26] = null;
                  }

                  field1567 = -1;
                  field1439.method6692();
                  field1571.method6692();

                  for(var26 = 0; var26 < 4; ++var26) {
                     for(var29 = 0; var29 < 104; ++var29) {
                        for(int var38 = 0; var38 < 104; ++var38) {
                           field1568[var26][var29][var38] = null;
                        }
                     }
                  }

                  field1593 = new class368();
                  class165.field1782.method1094();

                  for(var26 = 0; var26 < class189.field2029; ++var26) {
                     class189 var44 = class189.method3216(var26);
                     if (null != var44) {
                        class329.field3576[var26] = 0;
                        class329.field3577[var26] = 0;
                     }
                  }

                  class104.field1038.method2366();
                  field1609 = -1;
                  if (-1 != rootInterface) {
                     var26 = rootInterface;
                     if (var26 != -1 && Component.field3674[var26]) {
                        class96.field885.method6396(var26);
                        if (null != class96.interfaces[var26]) {
                           for(var29 = 0; var29 < class96.interfaces[var26].length; ++var29) {
                              if (class96.interfaces[var26][var29] != null) {
                                 class96.interfaces[var26][var29] = null;
                              }
                           }

                           class96.interfaces[var26] = null;
                           Component.field3674[var26] = false;
                        }
                     }
                  }

                  for(SubInterface var43 = (SubInterface) activeSubInterfaces.method8186(); var43 != null; var43 = (SubInterface) activeSubInterfaces.method8194()) {
                     class102.closeSubInterface(var43, true);
                  }

                  rootInterface = -1;
                  activeSubInterfaces = new class481(8);
                  meslayerPauseButtonComponent = null;
                  field1594 = 0;
                  field1576 = false;
                  field1630.method5795((int[])null, (int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1);

                  for(var26 = 0; var26 < 8; ++var26) {
                     field1577[var26] = null;
                     field1683[var26] = false;
                  }

                  class93.field858 = new class481(32);
                  field1598 = true;

                  for(var26 = 0; var26 < 100; ++var26) {
                     field1634[var26] = true;
                  }

                  method7275();
                  Js5Index.field42 = null;
                  class20.field109 = null;
                  Arrays.fill(field1628, (Object)null);
                  class244.field2690 = null;
                  Arrays.fill(field1673, (Object)null);

                  for(var26 = 0; var26 < 8; ++var26) {
                     field1720[var26] = new class367();
                  }

                  class40.field234 = null;
                  field1443 = false;
                  class116.method3290(packetBuf);
                  class293.field3130 = -1;
                  rebuildRegion(false, packetBuf);
                  serverConnection.serverPacket = null;
               }

            } else {
               if (17 == loginStage && loginConnection.available() >= 2) {
                  packetBuf.offset = 0;
                  loginConnection.readBytes(packetBuf.data, 0, 2);
                  packetBuf.offset = 0;
                  class265.field2960 = packetBuf.readUnsignedShort();
                  updateLoginStage(18);
               }

               if (loginStage == 18 && loginConnection.available() >= class265.field2960) {
                  packetBuf.offset = 0;
                  loginConnection.readBytes(packetBuf.data, 0, class265.field2960);
                  packetBuf.offset = 0;
                  String var40 = packetBuf.readString();
                  String var42 = packetBuf.readString();
                  String var33 = packetBuf.readString();
                  Login.method2098(var40, var42, var33);
                  updateGameState(10);
                  if (loginMethod.isOAuth()) {
                     Login.method6370(9);
                  }
               }

               if (19 != loginStage) {
                  ++field1468;
                  if (field1468 > 2000) {
                     if (field1712 < 1) {
                        if (Login.field433 == class329.field3580) {
                           class329.field3580 = class20.field108;
                        } else {
                           class329.field3580 = Login.field433;
                        }

                        ++field1712;
                        updateLoginStage(0);
                     } else {
                        class343.method6479(-3);
                     }
                  }
               } else {
                  if (serverConnection.packetLength == -1) {
                     if (loginConnection.available() < 2) {
                        return;
                     }

                     loginConnection.readBytes(packetBuf.data, 0, 2);
                     packetBuf.offset = 0;
                     serverConnection.packetLength = packetBuf.readUnsignedShort();
                  }

                  if (loginConnection.available() >= serverConnection.packetLength) {
                     loginConnection.readBytes(packetBuf.data, 0, serverConnection.packetLength);
                     packetBuf.offset = 0;
                     var26 = serverConnection.packetLength;
                     field1497.method7072();
                     serverConnection.clearQueue();
                     serverConnection.buffer.offset = 0;
                     serverConnection.serverPacket = null;
                     serverConnection.field1049 = null;
                     serverConnection.field1054 = null;
                     serverConnection.field1055 = null;
                     serverConnection.packetLength = 0;
                     serverConnection.field1056 = 0;
                     field1451 = 0;
                     field1594 = 0;
                     field1576 = false;
                     field1586 = 0;
                     field1513 = 0;

                     for(var29 = 0; var29 < 2048; ++var29) {
                        field1527[var29] = null;
                     }

                     class146.field1362 = null;

                     for(var29 = 0; var29 < field1489.length; ++var29) {
                        class86 var34 = field1489[var29];
                        if (var34 != null) {
                           var34.field975 = -1;
                           var34.field976 = false;
                        }
                     }

                     class93.field858 = new class481(32);
                     updateGameState(30);

                     for(var29 = 0; var29 < 100; ++var29) {
                        field1634[var29] = true;
                     }

                     method7275();
                     class116.method3290(packetBuf);
                     if (var26 != packetBuf.offset) {
                        throw new RuntimeException();
                     }
                  }
               }
            }
         }
      } catch (IOException var22) {
         if (field1712 < 1) {
            if (Login.field433 == class329.field3580) {
               class329.field3580 = class20.field108;
            } else {
               class329.field3580 = Login.field433;
            }

            ++field1712;
            updateLoginStage(0);
         } else {
            class343.method6479(-2);
         }
      }
   }

   final void method2706() {
      if (field1451 > 1) {
         --field1451;
      }

      if (field1542 > 0) {
         --field1542;
      }

      if (field1487) {
         field1487 = false;
         method2043();
      } else {
         if (!field1576) {
            method1758();
         }

         int var2;
         for(var2 = 0; var2 < 100 && this.method2712(serverConnection); ++var2) {
         }

         if (gameState == 30) {
            int var3;
            class308 var17;
            while(class44.method1389()) {
               var17 = class308.method8607(ClientPacket.field3437, serverConnection.field1046);
               var17.packet.writeByte(0);
               var3 = var17.packet.offset;
               class44.method6521(var17.packet);
               var17.packet.writeLengthByte(var17.packet.offset - var3);
               serverConnection.method2148(var17);
            }

            if (field1497.field4492) {
               var17 = class308.method8607(ClientPacket.field3372, serverConnection.field1046);
               var17.packet.writeByte(0);
               var3 = var17.packet.offset;
               field1497.method7073(var17.packet);
               var17.packet.writeLengthByte(var17.packet.offset - var3);
               serverConnection.method2148(var17);
               field1497.method7071();
            }

            int var4;
            int var5;
            int var6;
            int var7;
            int var8;
            int var9;
            int var10;
            int var11;
            int var12;
            int var13;
            synchronized(class514.field5111.field735) {
               if (!field1547) {
                  class514.field5111.field731 = 0;
               } else if (0 != class41.field256 || class514.field5111.field731 >= 40) {
                  class308 var19 = null;
                  var4 = 0;
                  var5 = 0;
                  var6 = 0;
                  var7 = 0;

                  for(var8 = 0; var8 < class514.field5111.field731 && (var19 == null || var19.packet.offset - var4 < 246); ++var8) {
                     var5 = var8;
                     var9 = class514.field5111.field729[var8];
                     if (var9 < -1) {
                        var9 = -1;
                     } else if (var9 > 65534) {
                        var9 = 65534;
                     }

                     var10 = class514.field5111.field732[var8];
                     if (var10 < -1) {
                        var10 = -1;
                     } else if (var10 > 65534) {
                        var10 = 65534;
                     }

                     if (field1659 != var10 || field1448 != var9) {
                        if (null == var19) {
                           var19 = class308.method8607(ClientPacket.field3382, serverConnection.field1046);
                           var19.packet.writeByte(0);
                           var4 = var19.packet.offset;
                           PacketBuffer var10000 = var19.packet;
                           var10000.offset += 2;
                           var6 = 0;
                           var7 = 0;
                        }

                        if (-1L != field1449) {
                           var11 = var10 - field1659;
                           var12 = var9 - field1448;
                           var13 = (int)((class514.field5111.field734[var8] - field1449) / 20L);
                           var6 = (int)((long)var6 + (class514.field5111.field734[var8] - field1449) % 20L);
                        } else {
                           var11 = var10;
                           var12 = var9;
                           var13 = Integer.MAX_VALUE;
                        }

                        field1659 = var10;
                        field1448 = var9;
                        if (var13 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                           var11 += 32;
                           var12 += 32;
                           var19.packet.writeShort((var13 << 12) + (var11 << 6) + var12);
                        } else if (var13 < 32 && var11 >= -128 && var11 <= 127 && var12 >= -128 && var12 <= 127) {
                           var11 += 128;
                           var12 += 128;
                           var19.packet.writeByte(var13 + 128);
                           var19.packet.writeShort(var12 + (var11 << 8));
                        } else if (var13 < 32) {
                           var19.packet.writeByte(var13 + 192);
                           if (var10 != -1 && var9 != -1) {
                              var19.packet.writeInt(var10 | var9 << 16);
                           } else {
                              var19.packet.writeInt(Integer.MIN_VALUE);
                           }
                        } else {
                           var19.packet.writeShort('\ue000' + (var13 & 8191));
                           if (var10 != -1 && var9 != -1) {
                              var19.packet.writeInt(var10 | var9 << 16);
                           } else {
                              var19.packet.writeInt(Integer.MIN_VALUE);
                           }
                        }

                        ++var7;
                        field1449 = class514.field5111.field734[var8];
                     }
                  }

                  if (var19 != null) {
                     var19.packet.writeLengthByte(var19.packet.offset - var4);
                     var8 = var19.packet.offset;
                     var19.packet.offset = var4;
                     var19.packet.writeByte(var6 / var7);
                     var19.packet.writeByte(var6 % var7);
                     var19.packet.offset = var8;
                     serverConnection.method2148(var19);
                  }

                  if (var5 >= class514.field5111.field731) {
                     class514.field5111.field731 = 0;
                  } else {
                     class83 var48 = class514.field5111;
                     var48.field731 -= var5;
                     System.arraycopy(class514.field5111.field732, var5, class514.field5111.field732, 0, class514.field5111.field731);
                     System.arraycopy(class514.field5111.field729, var5, class514.field5111.field729, 0, class514.field5111.field731);
                     System.arraycopy(class514.field5111.field734, var5, class514.field5111.field734, 0, class514.field5111.field731);
                  }
               }
            }

            class308 var29;
            if (1 == class41.field256 || !class40.field238 && class41.field256 == 4 || 2 == class41.field256) {
               long var18 = class41.field259 - field1446;
               if (var18 > 32767L) {
                  var18 = 32767L;
               }

               field1446 = class41.field259;
               var4 = class41.field258;
               if (var4 < 0) {
                  var4 = 0;
               } else if (var4 > class488.field4948) {
                  var4 = class488.field4948;
               }

               var5 = class41.field257;
               if (var5 < 0) {
                  var5 = 0;
               } else if (var5 > class343.field3838) {
                  var5 = class343.field3838;
               }

               var6 = (int)var18;
               var29 = class308.method8607(ClientPacket.field3404, serverConnection.field1046);
               var29.packet.writeShort((var6 << 1) + (class41.field256 == 2 ? 1 : 0));
               var29.packet.writeShort(var5);
               var29.packet.writeShort(var4);
               serverConnection.method2148(var29);
            }

            if (0 != field1641) {
               var17 = class308.method8607(ClientPacket.field3457, serverConnection.field1046);
               var17.packet.writeShort(field1641);
               serverConnection.method2148(var17);
            }

            if (field1666.field2372 > 0) {
               var17 = class308.method8607(ClientPacket.field3428, serverConnection.field1046);
               var17.packet.writeShort(0);
               var3 = var17.packet.offset;
               long var20 = class302.safeTime();

               for(var6 = 0; var6 < field1666.field2372; ++var6) {
                  long var32 = var20 - field1566;
                  if (var32 > 16777215L) {
                     var32 = 16777215L;
                  }

                  field1566 = var20;
                  var17.packet.writeMediumLE((int)var32);
                  var17.packet.writeByteAdd(field1666.field2360[var6]);
               }

               var17.packet.writeLengthShort(var17.packet.offset - var3);
               serverConnection.method2148(var17);
            }

            if (field1530 > 0) {
               --field1530;
            }

            if (field1666.method4103(96) || field1666.method4103(97) || field1666.method4103(98) || field1666.method4103(99)) {
               field1623 = true;
            }

            if (field1623 && field1530 <= 0) {
               field1530 = 20;
               field1623 = false;
               var17 = class308.method8607(ClientPacket.field3368, serverConnection.field1046);
               var17.packet.writeShort(field1569);
               var17.packet.writeShort(field1649);
               serverConnection.method2148(var17);
            }

            if (class331.field3587 && !field1450) {
               field1450 = true;
               var17 = class308.method8607(ClientPacket.field3411, serverConnection.field1046);
               var17.packet.writeByte(1);
               serverConnection.method2148(var17);
            }

            if (!class331.field3587 && field1450) {
               field1450 = false;
               var17 = class308.method8607(ClientPacket.field3411, serverConnection.field1046);
               var17.packet.writeByte(0);
               serverConnection.method2148(var17);
            }

            if (null != class115.field1095) {
               class115.field1095.method8206();
            }

            class84 var21;
            if (class95.field868) {
               if (null != Js5Index.field42) {
                  Js5Index.field42.method7729();
               }

               for(var2 = 0; var2 < class116.field1116; ++var2) {
                  var21 = field1527[class116.field1120[var2]];
                  var21.method1785();
               }

               class95.field868 = false;
            }

            if (class445.field4699) {
               for(var2 = 0; var2 < class116.field1116; ++var2) {
                  var21 = field1527[class116.field1120[var2]];
                  var21.method1805();
               }

               class445.field4699 = false;
            }

            if (class44.field306 != field1674) {
               field1674 = class44.field306;
               method168(class44.field306);
            }

            if (30 == gameState) {
               for(class104 var22 = (class104)field1593.method6706(); null != var22; var22 = (class104)field1593.method6687()) {
                  if (var22.field1034 > 0) {
                     --var22.field1034;
                  }

                  if (var22.field1034 == 0) {
                     if (var22.field1025 < 0 || class88.method259(var22.field1025, var22.field1027)) {
                        method3852(var22.field1036, var22.field1022, var22.field1023, var22.field1024, var22.field1025, var22.field1026, var22.field1027, var22.field1030);
                        var22.method8116();
                     }
                  } else {
                     if (var22.field1033 > 0) {
                        --var22.field1033;
                     }

                     if (var22.field1033 == 0 && var22.field1023 >= 1 && var22.field1024 >= 1 && var22.field1023 <= 102 && var22.field1024 <= 102 && (var22.field1031 < 0 || class88.method259(var22.field1031, var22.field1028))) {
                        method3852(var22.field1036, var22.field1022, var22.field1023, var22.field1024, var22.field1031, var22.field1029, var22.field1028, var22.field1030);
                        var22.field1033 = -1;
                        if (var22.field1025 == var22.field1031 && var22.field1025 == -1) {
                           var22.method8116();
                        } else if (var22.field1025 == var22.field1031 && var22.field1026 == var22.field1029 && var22.field1028 == var22.field1027) {
                           var22.method8116();
                        }
                     }
                  }
               }

               int var10002;
               for(var2 = 0; var2 < field1632; ++var2) {
                  var10002 = field1686[var2]--;
                  if (field1686[var2] >= -10) {
                     class29 var23 = field1727[var2];
                     if (null == var23) {
                        class29 var49 = (class29)null;
                        var23 = class29.method434(class136.field1254, field1684[var2], 0);
                        if (var23 == null) {
                           continue;
                        }

                        int[] var50 = field1686;
                        var50[var2] += var23.method429();
                        field1727[var2] = var23;
                     }

                     if (field1686[var2] < 0) {
                        if (field1501[var2] != 0) {
                           var5 = (field1501[var2] & 255) * 128;
                           var6 = field1501[var2] >> 16 & 255;
                           var7 = 64 + var6 * 128 - class146.field1362.field949;
                           if (var7 < 0) {
                              var7 = -var7;
                           }

                           var8 = field1501[var2] >> 8 & 255;
                           var9 = 64 + var8 * 128 - class146.field1362.field963;
                           if (var9 < 0) {
                              var9 = -var9;
                           }

                           var10 = var9 + var7 - 128;
                           if (var10 > var5) {
                              field1686[var2] = -100;
                              continue;
                           }

                           if (var10 < 0) {
                              var10 = 0;
                           }

                           var4 = (var5 - var10) * class141.clientPreferences.method1629() / var5;
                        } else {
                           var4 = class141.clientPreferences.method1628();
                        }

                        if (var4 > 0) {
                           class35 var25 = var23.method430().method523(class34.field167);
                           class46 var33 = class46.method848(var25, 100, var4);
                           var33.method851(field1685[var2] - 1);
                           class103.field1019.method449(var33);
                        }

                        field1686[var2] = -100;
                     }
                  } else {
                     --field1632;

                     for(var3 = var2; var3 < field1632; ++var3) {
                        field1684[var3] = field1684[var3 + 1];
                        field1727[var3] = field1727[var3 + 1];
                        field1685[var3] = field1685[var3 + 1];
                        field1686[var3] = field1686[var3 + 1];
                        field1501[var3] = field1501[var3 + 1];
                     }

                     --var2;
                  }
               }

               if (field1490 && !class303.method1987()) {
                  if (class141.clientPreferences.method1626() != 0 && class303.method3904()) {
                     class363 var36 = class24.field121;
                     var3 = class141.clientPreferences.method1626();
                     if (!class303.field3198.isEmpty()) {
                        ArrayList var24 = new ArrayList();
                        Iterator var26 = class303.field3198.iterator();

                        while(var26.hasNext()) {
                           class322 var34 = (class322)var26.next();
                           var34.field3525 = false;
                           var34.field3530 = false;
                           var34.field3532 = false;
                           var34.field3531 = var36;
                           var34.field3527 = var3;
                           var34.field3528 = 0.0F;
                           var24.add(var34);
                        }

                        class303.method2298(var24, class303.field3192, class303.field3202, class303.field3203, class303.field3207, false);
                     }
                  }

                  field1490 = false;
               }

               ++serverConnection.field1056;
               if (serverConnection.field1056 > 750) {
                  method2043();
               } else {
                  method425();
                  method2494();
                  int[] var38 = class116.field1120;

                  for(var3 = 0; var3 < class116.field1116; ++var3) {
                     class84 var27 = field1527[var38[var3]];
                     if (var27 != null && var27.field940 > 0) {
                        --var27.field940;
                        if (0 == var27.field940) {
                           var27.field971 = null;
                        }
                     }
                  }

                  for(var3 = 0; var3 < field1565; ++var3) {
                     var4 = field1491[var3];
                     class86 var28 = field1489[var4];
                     if (var28 != null && var28.field940 > 0) {
                        --var28.field940;
                        if (var28.field940 == 0) {
                           var28.field971 = null;
                        }
                     }
                  }

                  ++field1618;
                  if (0 != field1551) {
                     field1681 += 20;
                     if (field1681 >= 400) {
                        field1551 = 0;
                     }
                  }

                  Component var39 = class269.field2984;
                  Component var40 = class404.field4504;
                  class269.field2984 = null;
                  class404.field4504 = null;
                  field1616 = null;
                  field1725 = false;
                  field1677 = false;
                  field1668 = 0;

                  while(field1666.method4109() && field1668 < 128) {
                     if (privilege >= 2 && field1666.method4103(82) && 66 == field1666.field2371) {
                        StringBuilder var30 = new StringBuilder();

                        class76 var43;
                        for(Iterator var37 = class119.field1135.iterator(); var37.hasNext(); var30.append(var43.field626).append('\n')) {
                           var43 = (class76)var37.next();
                           if (var43.field628 != null && !var43.field628.isEmpty()) {
                              var30.append(var43.field628).append(':');
                           }
                        }

                        String var31 = var30.toString();
                        class124.field1180.method798(var31);
                     } else if (1 != field1521 || field1666.field2370 <= 0) {
                        field1670[field1668] = field1666.field2371;
                        field1669[field1668] = field1666.field2370;
                        ++field1668;
                     }
                  }

                  if (method3215() && field1666.method4103(82) && field1666.method4103(81) && 0 != field1641) {
                     var4 = class146.field1362.field759 - field1641;
                     if (var4 < 0) {
                        var4 = 0;
                     } else if (var4 > 3) {
                        var4 = 3;
                     }

                     if (var4 != class146.field1362.field759) {
                        var5 = class146.field1362.field945[0] + class342.field3837;
                        var6 = class146.field1362.field1012[0] + class144.field1352;
                        var29 = class308.method8607(ClientPacket.field3432, serverConnection.field1046);
                        var29.packet.writeIntME(0);
                        var29.packet.writeShortLEAdd(var5);
                        var29.packet.writeByteAdd(var4);
                        var29.packet.writeShortAdd(var6);
                        serverConnection.method2148(var29);
                     }

                     field1641 = 0;
                  }

                  if (class41.field256 == 1) {
                     field1528.method4390();
                  }

                  if (-1 != rootInterface) {
                     class17.method297(rootInterface, 0, 0, class343.field3838, class488.field4948, 0, 0);
                  }

                  ++field1624;

                  while(true) {
                     Component var35;
                     class87 var41;
                     Component var42;
                     do {
                        var41 = (class87)field1644.method6683();
                        if (var41 == null) {
                           while(true) {
                              do {
                                 var41 = (class87)field1645.method6683();
                                 if (null == var41) {
                                    while(true) {
                                       do {
                                          var41 = (class87)field1643.method6683();
                                          if (null == var41) {
                                             while(true) {
                                                class233 var45 = (class233)field1726.method6683();
                                                if (var45 == null) {
                                                   this.method2951();
                                                   if (null != class115.field1095) {
                                                      class115.field1095.method8216(class44.field306, class342.field3837 + (class146.field1362.field949 >> 7), class144.field1352 + (class146.field1362.field963 >> 7), false);
                                                      class115.field1095.method8296();
                                                   }

                                                   if (field1512 != null) {
                                                      this.method2718();
                                                   }

                                                   if (class234.method4476()) {
                                                      var4 = class234.field2610;
                                                      var5 = class234.field2583;
                                                      class308 var46 = class308.method8607(ClientPacket.field3455, serverConnection.field1046);
                                                      var46.packet.writeByte(5);
                                                      var46.packet.writeShort(class342.field3837 + var4);
                                                      var46.packet.writeByteAdd(field1666.method4103(82) ? (field1666.method4103(81) ? 2 : 1) : 0);
                                                      var46.packet.writeShortLE(class144.field1352 + var5);
                                                      serverConnection.method2148(var46);
                                                      class234.method4447();
                                                      field1548 = class41.field257;
                                                      field1442 = class41.field258;
                                                      field1551 = 1;
                                                      field1681 = 0;
                                                      field1513 = var4;
                                                      field1680 = var5;
                                                   }

                                                   if (var39 != class269.field2984) {
                                                      if (null != var39) {
                                                         setDirty(var39);
                                                      }

                                                      if (class269.field2984 != null) {
                                                         setDirty(class269.field2984);
                                                      }
                                                   }

                                                   if (class404.field4504 != var40 && field1592 == field1591) {
                                                      if (var40 != null) {
                                                         setDirty(var40);
                                                      }

                                                      if (class404.field4504 != null) {
                                                         setDirty(class404.field4504);
                                                      }
                                                   }

                                                   if (null != class404.field4504) {
                                                      if (field1591 < field1592) {
                                                         ++field1591;
                                                         if (field1592 == field1591) {
                                                            setDirty(class404.field4504);
                                                         }
                                                      }
                                                   } else if (field1591 > 0) {
                                                      --field1591;
                                                   }

                                                   if (0 == field1521) {
                                                      var4 = class146.field1362.field949;
                                                      var5 = class146.field1362.field963;
                                                      if (class468.field4805 - var4 < -500 || class468.field4805 - var4 > 500 || class44.field302 - var5 < -500 || class44.field302 - var5 > 500) {
                                                         class468.field4805 = var4;
                                                         class44.field302 = var5;
                                                      }

                                                      if (class468.field4805 != var4) {
                                                         class468.field4805 += (var4 - class468.field4805) / 16;
                                                      }

                                                      if (class44.field302 != var5) {
                                                         class44.field302 += (var5 - class44.field302) / 16;
                                                      }

                                                      var6 = class468.field4805 >> 7;
                                                      var7 = class44.field302 >> 7;
                                                      var8 = method5733(class468.field4805, class44.field302, class44.field306);
                                                      var9 = 0;
                                                      if (var6 > 3 && var7 > 3 && var6 < 100 && var7 < 100) {
                                                         for(var10 = var6 - 4; var10 <= var6 + 4; ++var10) {
                                                            for(var11 = var7 - 4; var11 <= var7 + 4; ++var11) {
                                                               var12 = class44.field306;
                                                               if (var12 < 3 && 2 == (class88.field804[1][var10][var11] & 2)) {
                                                                  ++var12;
                                                               }

                                                               var13 = var8 - class88.field797[var12][var10][var11];
                                                               if (var13 > var9) {
                                                                  var9 = var13;
                                                               }
                                                            }
                                                         }
                                                      }

                                                      var10 = var9 * 192;
                                                      if (var10 > 98048) {
                                                         var10 = 98048;
                                                      }

                                                      if (var10 < 32768) {
                                                         var10 = 32768;
                                                      }

                                                      if (var10 > field1532) {
                                                         field1532 += (var10 - field1532) / 24;
                                                      } else if (var10 < field1532) {
                                                         field1532 += (var10 - field1532) / 80;
                                                      }

                                                      class98.field916 = method5733(class146.field1362.field949, class146.field1362.field963, class44.field306) - field1522;
                                                   } else if (1 == field1521) {
                                                      method7939();
                                                      short var47 = -1;
                                                      if (field1666.method4103(33)) {
                                                         var47 = 0;
                                                      } else if (field1666.method4103(49)) {
                                                         var47 = 1024;
                                                      }

                                                      if (field1666.method4103(48)) {
                                                         if (var47 == 0) {
                                                            var47 = 1792;
                                                         } else if (var47 == 1024) {
                                                            var47 = 1280;
                                                         } else {
                                                            var47 = 1536;
                                                         }
                                                      } else if (field1666.method4103(50)) {
                                                         if (var47 == 0) {
                                                            var47 = 256;
                                                         } else if (var47 == 1024) {
                                                            var47 = 768;
                                                         } else {
                                                            var47 = 512;
                                                         }
                                                      }

                                                      byte var44 = 0;
                                                      if (field1666.method4103(35)) {
                                                         var44 = -1;
                                                      } else if (field1666.method4103(51)) {
                                                         var44 = 1;
                                                      }

                                                      var6 = 0;
                                                      if (var47 >= 0 || var44 != 0) {
                                                         var6 = field1666.method4103(81) ? field1702 : field1526;
                                                         var6 *= 16;
                                                         field1524 = var47;
                                                         field1525 = var44;
                                                      }

                                                      if (field1499 < var6) {
                                                         field1499 += var6 / 8;
                                                         if (field1499 > var6) {
                                                            field1499 = var6;
                                                         }
                                                      } else if (field1499 > var6) {
                                                         field1499 = field1499 * 9 / 10;
                                                      }

                                                      if (field1499 > 0) {
                                                         var7 = field1499 / 16;
                                                         if (field1524 >= 0) {
                                                            var4 = field1524 - class456.field4751 & 2047;
                                                            var8 = class229.field2511[var4];
                                                            var9 = class229.field2512[var4];
                                                            class468.field4805 += var7 * var8 / 65536;
                                                            class44.field302 += var9 * var7 / 65536;
                                                         }

                                                         if (0 != field1525) {
                                                            class98.field916 += var7 * field1525;
                                                            if (class98.field916 > 0) {
                                                               class98.field916 = 0;
                                                            }
                                                         }
                                                      } else {
                                                         field1524 = -1;
                                                         field1525 = -1;
                                                      }

                                                      if (field1666.method4103(13)) {
                                                         serverConnection.method2148(class308.method8607(ClientPacket.field3366, serverConnection.field1046));
                                                         field1521 = 0;
                                                      }
                                                   }

                                                   if (class41.field248 == 4 && class40.field238) {
                                                      var4 = class41.field250 - field1733;
                                                      field1518 = var4 * 2;
                                                      field1733 = var4 != -1 && var4 != 1 ? (field1733 + class41.field250) / 2 : class41.field250;
                                                      var5 = field1519 - class41.field249;
                                                      field1690 = var5 * 2;
                                                      field1519 = var5 != -1 && var5 != 1 ? (field1519 + class41.field249) / 2 : class41.field249;
                                                   } else {
                                                      if (field1666.method4103(96)) {
                                                         field1690 += (-24 - field1690) / 2;
                                                      } else if (field1666.method4103(97)) {
                                                         field1690 += (24 - field1690) / 2;
                                                      } else {
                                                         field1690 /= 2;
                                                      }

                                                      if (field1666.method4103(98)) {
                                                         field1518 += (12 - field1518) / 2;
                                                      } else if (field1666.method4103(99)) {
                                                         field1518 += (-12 - field1518) / 2;
                                                      } else {
                                                         field1518 /= 2;
                                                      }

                                                      field1733 = class41.field250;
                                                      field1519 = class41.field249;
                                                   }

                                                   field1569 = field1569 + field1690 / 2 & 2047;
                                                   field1649 += field1518 / 2;
                                                   if (field1649 < 128) {
                                                      field1649 = 128;
                                                   }

                                                   if (field1649 > 383) {
                                                      field1649 = 383;
                                                   }

                                                   if (field1697) {
                                                      method1765(class437.field4665, class392.field4450, class388.field4442);
                                                      method3795(class169.field1810, class19.field102);
                                                      if (class172.field1822 == class437.field4665 && class392.field4450 == class372.field4350 && class388.field4442 == class50.field362 && class169.field1810 == class15.field74 && class456.field4751 == class19.field102) {
                                                         field1697 = false;
                                                         field1689 = false;
                                                         field1691 = false;
                                                         field1713 = false;
                                                         Js5Index.field39 = 0;
                                                         class204.field2200 = 0;
                                                         class475.field4835 = 0;
                                                         class4.field24 = 0;
                                                         class172.field1823 = 0;
                                                         class55.field397 = 0;
                                                         field1671 = 0;
                                                         class241.field2683 = 0;
                                                         class137.field1265 = 0;
                                                         class388.field4440 = 0;
                                                         field1694 = null;
                                                         field1559 = null;
                                                         field1695 = null;
                                                      }
                                                   } else if (field1689) {
                                                      if (!field1691) {
                                                         var4 = class241.field2683 * 128 + 64;
                                                         var5 = 64 + class137.field1265 * 128;
                                                         var6 = method5733(var4, var5, class44.field306) - class388.field4440;
                                                         method1765(var4, var6, var5);
                                                      } else if (field1694 != null) {
                                                         class172.field1822 = field1694.method8178();
                                                         class50.field362 = field1694.method8175();
                                                         if (field1698) {
                                                            class372.field4350 = field1694.method8176();
                                                         } else {
                                                            class372.field4350 = method5733(class172.field1822, class50.field362, class44.field306) - field1694.method8176();
                                                         }

                                                         field1694.method8170();
                                                      }

                                                      if (!field1713) {
                                                         var4 = Js5Index.field39 * 128 + 64;
                                                         var5 = class204.field2200 * 128 + 64;
                                                         var6 = method5733(var4, var5, class44.field306) - class475.field4835;
                                                         var7 = var4 - class172.field1822;
                                                         var8 = var6 - class372.field4350;
                                                         var9 = var5 - class50.field362;
                                                         var10 = (int)Math.sqrt((double)(var9 * var9 + var7 * var7));
                                                         var11 = (int)(Math.atan2((double)var8, (double)var10) * 325.9490051269531) & 2047;
                                                         var12 = (int)(Math.atan2((double)var7, (double)var9) * -325.9490051269531) & 2047;
                                                         method3795(var11, var12);
                                                      } else {
                                                         if (field1559 != null) {
                                                            class15.field74 = field1559.method8410();
                                                            class15.field74 = Math.min(Math.max(class15.field74, 128), 383);
                                                            field1559.method8170();
                                                         }

                                                         if (field1695 != null) {
                                                            class456.field4751 = field1695.method8410() & 2047;
                                                            field1695.method8170();
                                                         }
                                                      }
                                                   }

                                                   for(var4 = 0; var4 < 5; ++var4) {
                                                      var10002 = field1687[var4]++;
                                                   }

                                                   class104.field1038.method2395();
                                                   var4 = ++class41.field247 - 1;
                                                   var6 = GameShell.method359();
                                                   if (var4 > 15000 && var6 > 15000) {
                                                      field1542 = 250;
                                                      class41.method1415(14500);
                                                      var29 = class308.method8607(ClientPacket.field3364, serverConnection.field1046);
                                                      serverConnection.method2148(var29);
                                                   }

                                                   class165.field1782.method1090();
                                                   method2558();
                                                   ++serverConnection.field1052;
                                                   if (serverConnection.field1052 > 50) {
                                                      var29 = class308.method8607(ClientPacket.field3390, serverConnection.field1046);
                                                      serverConnection.method2148(var29);
                                                   }

                                                   try {
                                                      serverConnection.method2131();
                                                   } catch (IOException var15) {
                                                      method2043();
                                                   }

                                                   return;
                                                }

                                                method2153(var45);
                                             }
                                          }

                                          var35 = var41.field786;
                                          if (var35.field3607 < 0) {
                                             break;
                                          }

                                          var42 = Component.getComponent(var35.field3625);
                                       } while(var42 == null || var42.field3743 == null || var35.field3607 >= var42.field3743.length || var42.field3743[var35.field3607] != var35);

                                       class63.method1516(var41);
                                    }
                                 }

                                 var35 = var41.field786;
                                 if (var35.field3607 < 0) {
                                    break;
                                 }

                                 var42 = Component.getComponent(var35.field3625);
                              } while(null == var42 || var42.field3743 == null || var35.field3607 >= var42.field3743.length || var42.field3743[var35.field3607] != var35);

                              class63.method1516(var41);
                           }
                        }

                        var35 = var41.field786;
                        if (var35.field3607 < 0) {
                           break;
                        }

                        var42 = Component.getComponent(var35.field3625);
                     } while(var42 == null || null == var42.field3743 || var35.field3607 >= var42.field3743.length || var42.field3743[var35.field3607] != var35);

                     class63.method1516(var41);
                  }
               }
            }
         }
      }
   }

   public void method5899(int var1, int var2) {
      if (serverConnection != null && null != serverConnection.field1046) {
         if (var1 > -1 && class141.clientPreferences.method1626() > 0 && !field1490) {
            class308 var4 = class308.method8607(ClientPacket.field3449, serverConnection.field1046);
            var4.packet.writeInt(var1);
            serverConnection.method2148(var4);
         }

      }
   }

   protected final void method662() {
      field1658 = class302.safeTime() + 500L;
      this.method2708();
      if (rootInterface != -1) {
         this.resizeRoot(true);
      }

   }

   void method2708() {
      int var2 = class343.field3838;
      int var3 = class488.field4948;
      if (super.field292 < var2) {
         var2 = super.field292;
      }

      if (super.field269 < var3) {
         var3 = super.field269;
      }

      if (null != class141.clientPreferences) {
         try {
            class30.method443(class124.field1180, "resize", new Object[]{method5791()});
         } catch (Throwable var5) {
         }
      }

   }

   final void method2709() {
      int var2;
      if (rootInterface != -1) {
         var2 = rootInterface;
         if (Component.method1200(var2)) {
            method2496(class96.interfaces[var2], -1);
         }
      }

      for(var2 = 0; var2 < field1648; ++var2) {
         if (field1634[var2]) {
            field1651[var2] = true;
         }

         field1652[var2] = field1634[var2];
         field1634[var2] = false;
      }

      field1444 = field1445;
      field1589 = -1;
      field1590 = -1;
      if (-1 != rootInterface) {
         field1648 = 0;
         method377(rootInterface, 0, 0, class343.field3838, class488.field4948, 0, 0, -1);
      }

      class535.method9222();
      if (field1555) {
         if (field1551 == 1) {
            class231.field2524[field1681 / 100].method9139(field1548 - 8, field1442 - 8);
         }

         if (2 == field1551) {
            class231.field2524[4 + field1681 / 100].method9139(field1548 - 8, field1442 - 8);
         }
      }

      if (!field1576) {
         if (-1 != field1589) {
            method5888(field1589, field1590);
         }
      } else {
         var2 = Js5Index.field40;
         int var3 = class128.field1214;
         int var4 = class109.field1067;
         int var5 = class388.field4438;
         int var6 = 6116423;
         class535.method9231(var2, var3, var4, var5, var6);
         class535.method9231(var2 + 1, var3 + 1, var4 - 2, 16, 0);
         class535.method9223(var2 + 1, var3 + 18, var4 - 2, var5 - 19, 0);
         class316.field3504.method7163(class364.field4187, var2 + 3, var3 + 14, var6, -1);
         int var7 = class41.field249;
         int var8 = class41.field250;

         int var9;
         int var10;
         int var11;
         for(var9 = 0; var9 < field1594; ++var9) {
            var10 = var3 + 31 + (field1594 - 1 - var9) * 15;
            var11 = 16777215;
            if (var7 > var2 && var7 < var4 + var2 && var8 > var10 - 13 && var8 < var10 + 3) {
               var11 = 16776960;
            }

            class393 var12 = class316.field3504;
            String var13;
            if (var9 < 0) {
               var13 = "";
            } else if (field1584[var9].length() > 0) {
               var13 = field1583[var9] + class364.field4194 + field1584[var9];
            } else {
               var13 = field1583[var9];
            }

            var12.method7163(var13, var2 + 3, var10, var11, 0);
         }

         var9 = Js5Index.field40;
         var10 = class128.field1214;
         var11 = class109.field1067;
         int var14 = class388.field4438;

         for(int var15 = 0; var15 < field1648; ++var15) {
            if (field1655[var15] + field1581[var15] > var9 && field1581[var15] < var9 + var11 && field1654[var15] + field1656[var15] > var10 && field1654[var15] < var14 + var10) {
               field1651[var15] = true;
            }
         }
      }

      if (field1588 == 3) {
         for(var2 = 0; var2 < field1648; ++var2) {
            if (field1652[var2]) {
               class535.method9230(field1581[var2], field1654[var2], field1655[var2], field1656[var2], 16711935, 128);
            } else if (field1651[var2]) {
               class535.method9230(field1581[var2], field1654[var2], field1655[var2], field1656[var2], 16711680, 128);
            }
         }
      }

      class77.method8024(class44.field306, class146.field1362.field949, class146.field1362.field963, field1618);
      field1618 = 0;
   }

   boolean method2932(class106 var1, int var2) {
      if (var1.packetLength == 0) {
         Js5Index.field42 = null;
      } else {
         if (null == Js5Index.field42) {
            Js5Index.field42 = new class427(class454.field4743, class124.field1180);
         }

         Js5Index.field42.method7618(var1.buffer, var2);
      }

      field1635 = field1624;
      class95.field868 = true;
      var1.serverPacket = null;
      return true;
   }

   boolean method2711(class106 var1) {
      if (null != Js5Index.field42) {
         Js5Index.field42.method7628(var1.buffer);
      }

      field1635 = field1624;
      class95.field868 = true;
      var1.serverPacket = null;
      return true;
   }

   final boolean method2712(class106 var1) {
      class424 var3 = var1.method2137();
      PacketBuffer buffer = var1.buffer;
      if (null == var3) {
         return false;
      } else {
         String var6;
         int var7;
         try {
            int fromComponent;
            if (var1.serverPacket == null) {
               if (var1.field1050) {
                  if (!var3.method7597(1)) {
                     return false;
                  }

                  var3.readBytes(var1.buffer.data, 0, 1);
                  var1.field1056 = 0;
                  var1.field1050 = false;
               }

               buffer.offset = 0;
               if (buffer.method8479()) {
                  if (!var3.method7597(1)) {
                     return false;
                  }

                  var3.readBytes(var1.buffer.data, 1, 1);
                  var1.field1056 = 0;
               }

               var1.field1050 = true;
               ServerPacket[] var5 = ServerPacket.values();
               fromComponent = buffer.readOpcode();
               if (fromComponent < 0 || fromComponent >= var5.length) {
                  throw new IOException(fromComponent + " " + buffer.offset);
               }

               var1.serverPacket = var5[fromComponent];
               var1.packetLength = var1.serverPacket.length;
            }

            if (-1 == var1.packetLength) {
               if (!var3.method7597(1)) {
                  return false;
               }

               var1.method2137().readBytes(buffer.data, 0, 1);
               var1.packetLength = buffer.data[0] & 255;
            }

            if (var1.packetLength == -2) {
               if (!var3.method7597(2)) {
                  return false;
               }

               var1.method2137().readBytes(buffer.data, 0, 2);
               buffer.offset = 0;
               var1.packetLength = buffer.readUnsignedShort();
            }

            if (!var3.method7597(var1.packetLength)) {
               return false;
            }

            buffer.offset = 0;
            var3.readBytes(buffer.data, 0, var1.packetLength);
            var1.field1056 = 0;
            field1497.method7081();
            var1.field1055 = var1.field1054;
            var1.field1054 = var1.field1049;
            var1.field1049 = var1.serverPacket;
            int toComponent;
            Component var27;
            if (ServerPacket.field3224 == var1.serverPacket) {
               toComponent = buffer.writeIntME();
               var6 = buffer.readString();
               var27 = Component.getComponent(toComponent);
               if (!var6.equals(var27.field3621)) {
                  var27.field3621 = var6;
                  setDirty(var27);
               }

               var1.serverPacket = null;
               return true;
            }

            int var8;
            int var9;
            int var32;
            int var38;
            int var44;
            if (ServerPacket.field3248 == var1.serverPacket) {
               var38 = buffer.readUnsignedByteNeg();
               var7 = buffer.readUnsignedMediumME();
               toComponent = var7 >> 16;
               fromComponent = var7 >> 8 & 255;
               var8 = (var7 >> 4 & 7) + toComponent;
               var9 = (var7 & 7) + fromComponent;
               var32 = buffer.readUnsignedShort();
               var44 = buffer.readUnsignedShort();
               if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
                  var8 = var8 * 128 + 64;
                  var9 = 64 + var9 * 128;
                  class64 var72 = new class64(var32, class44.field306, var8, var9, method5733(var8, var9, class44.field306) - var38, var44, field1445);
                  field1571.method6680(var72);
               }

               var1.serverPacket = null;
               return true;
            }

            boolean var13;
            boolean var52;
            int var54;
            if (ServerPacket.field3223 == var1.serverPacket) {
               field1689 = true;
               field1697 = false;
               field1691 = true;
               class241.field2683 = buffer.readUnsignedByte();
               class137.field1265 = buffer.readUnsignedByte();
               toComponent = buffer.readUnsignedShort();
               fromComponent = buffer.readUnsignedByte() * 128 + 64;
               var7 = buffer.readUnsignedByte() * 128 + 64;
               var8 = buffer.readUnsignedShort();
               field1698 = buffer.readBoolean();
               var9 = buffer.readUnsignedByte();
               var32 = class241.field2683 * 128 + 64;
               var38 = 64 + class137.field1265 * 128;
               var52 = false;
               var13 = false;
               if (field1698) {
                  var44 = class372.field4350;
                  var54 = method5733(var32, var38, class44.field306) - toComponent;
               } else {
                  var44 = method5733(class172.field1822, class50.field362, class44.field306) - class372.field4350;
                  var54 = toComponent;
               }

               field1694 = new class471(class172.field1822, class50.field362, var44, var32, var38, var54, fromComponent, var7, var8, var9);
               var1.serverPacket = null;
               return true;
            }

            if (var1.serverPacket == ServerPacket.field3328) {
               var7 = buffer.readUnsignedByteAdd();
               toComponent = buffer.readUnsignedShortLE();
               fromComponent = buffer.readUnsignedShortLE();
               if (fromComponent == 65535) {
                  fromComponent = -1;
               }

               class86 var83 = field1489[toComponent];
               if (null != var83) {
                  if (fromComponent == var83.field968 && fromComponent != -1) {
                     var9 = class215.method2582(fromComponent).field2346;
                     if (var9 == 1) {
                        var83.field986 = 0;
                        var83.field987 = 0;
                        var83.field988 = var7;
                        var83.field957 = 0;
                     } else if (var9 == 2) {
                        var83.field957 = 0;
                     }
                  } else if (fromComponent == -1 || var83.field968 == -1 || class215.method2582(fromComponent).field2330 >= class215.method2582(var83.field968).field2330) {
                     var83.field968 = fromComponent;
                     var83.field986 = 0;
                     var83.field987 = 0;
                     var83.field988 = var7;
                     var83.field957 = 0;
                     var83.field1015 = var83.field1010;
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3238 == var1.serverPacket) {
               method8708();
               toComponent = buffer.writeIntIME();
               fromComponent = buffer.readUnsignedByte();
               var7 = buffer.readUnsignedByteNeg();
               field1574[var7] = toComponent;
               field1572[var7] = fromComponent;
               field1493[var7] = 1;

               for(var8 = 0; var8 < 98; ++var8) {
                  if (toComponent >= class346.field3848[var8]) {
                     field1493[var7] = var8 + 2;
                  }
               }

               field1629[++field1627 - 1 & 31] = var7;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3253 == var1.serverPacket) {
               for(toComponent = 0; toComponent < field1527.length; ++toComponent) {
                  if (null != field1527[toComponent]) {
                     field1527[toComponent].field968 = -1;
                  }
               }

               for(toComponent = 0; toComponent < field1489.length; ++toComponent) {
                  if (field1489[toComponent] != null) {
                     field1489[toComponent].field968 = -1;
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (var1.serverPacket == ServerPacket.field3310) {
               toComponent = buffer.readUnsignedByte();
               method6483(toComponent);
               var1.serverPacket = null;
               return false;
            }

            String var81;
            if (ServerPacket.field3220 == var1.serverPacket) {
               byte[] var91 = new byte[var1.packetLength];
               buffer.method8505(var91, 0, var91.length);
               Buffer var90 = new Buffer(var91);
               var81 = var90.readString();
               class45.method1843(var81, true, false);
               var1.serverPacket = null;
               return true;
            }

            Component var88;
            if (ServerPacket.field3321 == var1.serverPacket) {
               toComponent = buffer.writeIntIME();
               var88 = Component.getComponent(toComponent);
               var88.field3650 = 3;
               var88.field3603 = class146.field1362.field764.method5803();
               setDirty(var88);
               var1.serverPacket = null;
               return true;
            }

            if (var1.serverPacket == ServerPacket.field3226) {
               class28.method412(class301.field3183);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3215 == var1.serverPacket) {
               var8 = buffer.readUnsignedShortLEAdd();
               fromComponent = buffer.readUnsignedShortLEAdd();
               var9 = buffer.readUnsignedShort();
               var7 = buffer.readUnsignedShortAdd();
               toComponent = buffer.readUnsignedShortAdd();
               if (toComponent == 65535) {
                  toComponent = -1;
               }

               ArrayList var80 = new ArrayList();
               var80.add(toComponent);
               method3492(var80, fromComponent, var7, var8, var9);
               var1.serverPacket = null;
               return true;
            }

            int var15;
            int var16;
            if (var1.serverPacket == ServerPacket.field3313) {
               field1689 = true;
               field1697 = false;
               field1713 = true;
               Js5Index.field39 = buffer.readUnsignedByte();
               class204.field2200 = buffer.readUnsignedByte();
               class475.field4835 = buffer.readUnsignedShort();
               toComponent = buffer.readUnsignedShort();
               fromComponent = buffer.readUnsignedByte();
               var7 = 64 + Js5Index.field39 * 128;
               var8 = class204.field2200 * 128 + 64;
               var9 = method5733(var7, var8, class44.field306) - class475.field4835;
               var32 = var7 - class172.field1822;
               var38 = var9 - class372.field4350;
               var44 = var8 - class50.field362;
               double var63 = Math.sqrt((double)(var44 * var44 + var32 * var32));
               var15 = method1193((int)(Math.atan2((double)var38, var63) * 325.9490051269531) & 2047);
               var16 = method307((int)(Math.atan2((double)var32, (double)var44) * -325.9490051269531) & 2047);
               field1559 = new class487(class15.field74, var15, toComponent, fromComponent);
               field1695 = new class487(class456.field4751, var16, toComponent, fromComponent);
               var1.serverPacket = null;
               return true;
            }

            if (var1.serverPacket == ServerPacket.field3308) {
               var1.serverPacket = null;
               return true;
            }

            if (var1.serverPacket == ServerPacket.field3314) {
               field1689 = true;
               field1697 = false;
               field1713 = true;
               toComponent = buffer.readShort();
               fromComponent = buffer.readShort();
               var7 = method1193(fromComponent + class15.field74 & 2027);
               var8 = toComponent + class456.field4751;
               var9 = buffer.readUnsignedShort();
               var32 = buffer.readUnsignedByte();
               field1559 = new class487(class15.field74, var7, var9, var32);
               field1695 = new class487(class456.field4751, var8, var9, var32);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3274 == var1.serverPacket) {
               field1689 = true;
               field1697 = false;
               field1713 = false;
               Js5Index.field39 = buffer.readUnsignedByte();
               class204.field2200 = buffer.readUnsignedByte();
               class475.field4835 = buffer.readUnsignedShort();
               class4.field24 = buffer.readUnsignedByte();
               class172.field1823 = buffer.readUnsignedByte();
               if (class172.field1823 >= 100) {
                  toComponent = 64 + Js5Index.field39 * 128;
                  fromComponent = class204.field2200 * 128 + 64;
                  var7 = method5733(toComponent, fromComponent, class44.field306) - class475.field4835;
                  var8 = toComponent - class172.field1822;
                  var9 = var7 - class372.field4350;
                  var32 = fromComponent - class50.field362;
                  var38 = (int)Math.sqrt((double)(var8 * var8 + var32 * var32));
                  class15.field74 = (int)(Math.atan2((double)var9, (double)var38) * 325.9490051269531) & 2047;
                  class456.field4751 = (int)(Math.atan2((double)var8, (double)var32) * -325.9490051269531) & 2047;
                  if (class15.field74 < 128) {
                     class15.field74 = 128;
                  }

                  if (class15.field74 > 383) {
                     class15.field74 = 383;
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3302 == var1.serverPacket) {
               toComponent = buffer.readUnsignedShortLE();
               fromComponent = buffer.readInt();
               var7 = toComponent >> 10 & 31;
               var8 = toComponent >> 5 & 31;
               var9 = toComponent & 31;
               var32 = (var9 << 3) + (var8 << 11) + (var7 << 19);
               Component var73 = Component.getComponent(fromComponent);
               if (var32 != var73.field3718) {
                  var73.field3718 = var32;
                  setDirty(var73);
               }

               var1.serverPacket = null;
               return true;
            }

            if (var1.serverPacket == ServerPacket.field3214) {
               method8708();
               field1607 = buffer.readShort();
               field1640 = field1624;
               var1.serverPacket = null;
               return true;
            }

            boolean var59;
            if (var1.serverPacket == ServerPacket.field3247) {
               var59 = buffer.readUnsignedByte() == 1;
               if (var59) {
                  class194.field2128 = class302.safeTime() - buffer.readLong();
                  class40.field234 = new class345(buffer, true);
               } else {
                  class40.field234 = null;
               }

               field1639 = field1624;
               var1.serverPacket = null;
               return true;
            }

            if (var1.serverPacket == ServerPacket.field3265) {
               return this.method2932(var1, 1);
            }

            if (ServerPacket.field3218 == var1.serverPacket) {
               toComponent = buffer.readInt();
               if (field1540 != toComponent) {
                  field1540 = toComponent;
                  method2329();
               }

               var1.serverPacket = null;
               return true;
            }

            if (var1.serverPacket == ServerPacket.field3216 && field1689) {
               field1697 = true;
               field1713 = false;
               field1691 = false;

               for(toComponent = 0; toComponent < 5; ++toComponent) {
                  field1534[toComponent] = false;
               }

               var1.serverPacket = null;
               return true;
            }

            if (var1.serverPacket == ServerPacket.field3268) {
               toComponent = buffer.readShortAdd();
               fromComponent = buffer.readInt();
               var27 = Component.getComponent(fromComponent);
               if (toComponent != var27.field3654 || toComponent == -1) {
                  var27.field3654 = toComponent;
                  var27.field3741 = 0;
                  var27.field3742 = 0;
                  setDirty(var27);
               }

               var1.serverPacket = null;
               return true;
            }

            long var28;
            String var37;
            long var47;
            long var50;
            long var56;
            String var69;
            if (ServerPacket.field3287 == var1.serverPacket) {
               var37 = buffer.readString();
               var47 = buffer.readLong();
               var28 = (long) buffer.readUnsignedShort();
               var50 = (long) buffer.readUnsignedMedium();
               class361 var60 = (class361)class373.method1724(class361.method2121(), buffer.readUnsignedByte());
               var56 = (var28 << 32) + var50;
               boolean var79 = false;

               for(var16 = 0; var16 < 100; ++var16) {
                  if (field1664[var16] == var56) {
                     var79 = true;
                     break;
                  }
               }

               if (var60.field3997 && class165.field1782.method1096(new class526(var37, class454.field4743))) {
                  var79 = true;
               }

               if (!var79 && field1553 == 0) {
                  field1664[field1556] = var56;
                  field1556 = (field1556 + 1) % 100;
                  var69 = class407.method7161(class380.method2549(class307.method5741(buffer)));
                  if (var60.field3995 != -1) {
                     class119.method4130(9, class90.method2108(var60.field3995) + var37, var69, class365.method3380(var47));
                  } else {
                     class119.method4130(9, var37, var69, class365.method3380(var47));
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3329 == var1.serverPacket) {
               fromComponent = buffer.readUnsignedShortLEAdd();
               toComponent = buffer.readUnsignedShortLEAdd();
               class303.method4211(toComponent, fromComponent);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3311 == var1.serverPacket) {
               method5258();
               var1.serverPacket = null;
               return false;
            }

            if (ServerPacket.field3266 == var1.serverPacket) {
               toComponent = buffer.readUnsignedSmartByteShort();
               boolean var89 = buffer.readUnsignedByte() == 1;
               var81 = "";
               boolean var78 = false;
               if (var89) {
                  var81 = buffer.readString();
                  if (class165.field1782.method1096(new class526(var81, class454.field4743))) {
                     var78 = true;
                  }
               }

               String var66 = buffer.readString();
               if (!var78) {
                  class119.method7274(toComponent, var81, var66);
               }

               var1.serverPacket = null;
               return true;
            }

            if (var1.serverPacket == ServerPacket.field3263) {
               toComponent = buffer.readIntLE();
               fromComponent = buffer.readUnsignedShort();
               var27 = Component.getComponent(toComponent);
               if (var27 != null && var27.field3608 == 0) {
                  if (fromComponent > var27.field3719 - var27.field3622) {
                     fromComponent = var27.field3719 - var27.field3622;
                  }

                  if (fromComponent < 0) {
                     fromComponent = 0;
                  }

                  if (var27.field3628 != fromComponent) {
                     var27.field3628 = fromComponent;
                     setDirty(var27);
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3290 == var1.serverPacket) {
               field1697 = false;
               field1689 = false;
               field1691 = false;
               field1713 = false;
               Js5Index.field39 = 0;
               class204.field2200 = 0;
               class475.field4835 = 0;
               field1698 = false;
               class4.field24 = 0;
               class172.field1823 = 0;
               class55.field397 = 0;
               field1671 = 0;
               class241.field2683 = 0;
               class137.field1265 = 0;
               class388.field4440 = 0;
               field1694 = null;
               field1559 = null;
               field1695 = null;

               for(toComponent = 0; toComponent < 5; ++toComponent) {
                  field1534[toComponent] = false;
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3219 == var1.serverPacket) {
               class28.method412(class301.field3180);
               var1.serverPacket = null;
               return true;
            }

            if (var1.serverPacket == ServerPacket.field3317) {
               class28.method412(class301.field3181);
               var1.serverPacket = null;
               return true;
            }

            int var14;
            byte var26;
            String var57;
            if (var1.serverPacket == ServerPacket.field3301) {
               var26 = buffer.readByte();
               var47 = (long) buffer.readUnsignedShort();
               var28 = (long) buffer.readUnsignedMedium();
               var50 = var28 + (var47 << 32);
               var52 = false;
               class164 var61 = var26 >= 0 ? field1673[var26] : class244.field2690;
               if (var61 == null) {
                  var52 = true;
               } else {
                  for(var14 = 0; var14 < 100; ++var14) {
                     if (var50 == field1664[var14]) {
                        var52 = true;
                        break;
                     }
                  }
               }

               if (!var52) {
                  field1664[field1556] = var50;
                  field1556 = (field1556 + 1) % 100;
                  var57 = class307.method5741(buffer);
                  var15 = var26 >= 0 ? 43 : 46;
                  class119.method4130(var15, "", var57, var61.field1775);
               }

               var1.serverPacket = null;
               return true;
            }

            int var17;
            if (var1.serverPacket == ServerPacket.field3232) {
               byte var64 = buffer.readByte();
               int var19 = buffer.readUnsignedByteAdd();
               int var18 = buffer.readUnsignedByte();
               var15 = buffer.readUnsignedByte() * 4;
               byte var67 = buffer.readByteAdd();
               var14 = buffer.readUnsignedByteNeg() * 4;
               var7 = buffer.readUnsignedMediumME();
               toComponent = var7 >> 16;
               fromComponent = var7 >> 8 & 255;
               var8 = toComponent + (var7 >> 4 & 7);
               var9 = (var7 & 7) + fromComponent;
               var44 = buffer.readMedium();
               var54 = buffer.readUnsignedShortLEAdd();
               var17 = buffer.readUnsignedShortAdd();
               var16 = buffer.readUnsignedShortLEAdd();
               var32 = var64 + var8;
               var38 = var67 + var9;
               if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104 && var32 >= 0 && var38 >= 0 && var32 < 104 && var38 < 104 && var54 != 65535) {
                  var8 = 64 + var8 * 128;
                  var9 = 64 + var9 * 128;
                  var32 = 64 + var32 * 128;
                  var38 = 64 + var38 * 128;
                  class74 var20 = new class74(var54, class44.field306, var8, var9, method5733(var8, var9, class44.field306) - var14, field1445 + var16, var17 + field1445, var18, var19, var44, var15);
                  var20.method1518(var32, var38, method5733(var32, var38, class44.field306) - var15, var16 + field1445);
                  field1439.method6680(var20);
               }

               var1.serverPacket = null;
               return true;
            }

            SubInterface subInterf;
            if (var1.serverPacket == ServerPacket.field3212) {
               toComponent = buffer.offset + var1.packetLength;
               fromComponent = buffer.readUnsignedShort();
               if (fromComponent == 65535) {
                  fromComponent = -1;
               }

               var7 = buffer.readUnsignedShort();
               if (fromComponent != rootInterface) {
                  rootInterface = fromComponent;
                  this.resizeRoot(false);
                  resetAnimation(rootInterface);
                  class63.executeLoadHook(rootInterface);

                  for(var8 = 0; var8 < 100; ++var8) {
                     field1634[var8] = true;
                  }
               }

               SubInterface var55;
               for(; var7-- > 0; var55.field852 = true) {
                  var8 = buffer.readInt();
                  var9 = buffer.readUnsignedShort();
                  var32 = buffer.readUnsignedByte();
                  var55 = (SubInterface) activeSubInterfaces.get((long)var8);
                  if (null != var55 && var9 != var55.id) {
                     class102.closeSubInterface(var55, true);
                     var55 = null;
                  }

                  if (null == var55) {
                     var55 = openSubInterface(var8, var9, var32);
                  }
               }

               for(subInterf = (SubInterface) activeSubInterfaces.method8186(); null != subInterf; subInterf = (SubInterface) activeSubInterfaces.method8194()) {
                  if (subInterf.field852) {
                     subInterf.field852 = false;
                  } else {
                     class102.closeSubInterface(subInterf, true);
                  }
               }

               field1647 = new class481(512);

               while(buffer.offset < toComponent) {
                  var8 = buffer.readInt();
                  var9 = buffer.readUnsignedShort();
                  var32 = buffer.readUnsignedShort();
                  var38 = buffer.readInt();

                  for(var44 = var9; var44 <= var32; ++var44) {
                     var56 = ((long)var8 << 32) + (long)var44;
                     field1647.put(new class492(var38), var56);
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3298 == var1.serverPacket) {
               return this.method2932(var1, 2);
            }

            if (var1.serverPacket == ServerPacket.field3305) {
               toComponent = buffer.readInt();
               var88 = Component.getComponent(toComponent);

               for(var7 = 0; var7 < var88.field3602.length; ++var7) {
                  var88.field3602[var7] = -1;
                  var88.field3602[var7] = 0;
               }

               setDirty(var88);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3319 == var1.serverPacket) {
               method7899(buffer.readString());
               var1.serverPacket = null;
               return true;
            }

            if (var1.serverPacket == ServerPacket.field3280) {
               toComponent = buffer.readUnsignedShortLE();
               class84 var53;
               if (localPlayerIndex == toComponent) {
                  var53 = class146.field1362;
               } else {
                  var53 = field1527[toComponent];
               }

               var8 = buffer.readUnsignedByte();
               fromComponent = buffer.readUnsignedShortLEAdd();
               var7 = buffer.writeIntIME();
               if (var53 != null) {
                  var53.method2080(var8, fromComponent, var7 >> 16, var7 & '\uffff');
               }

               var1.serverPacket = null;
               return true;
            }

            if (var1.serverPacket == ServerPacket.field3271) {
               buffer.offset += 28;
               if (buffer.verifyCrc()) {
                  method7097(buffer, buffer.offset - 28);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3315 == var1.serverPacket) {
               var37 = buffer.readString();
               Object[] var87 = new Object[var37.length() + 1];

               for(var7 = var37.length() - 1; var7 >= 0; --var7) {
                  if (var37.charAt(var7) == 's') {
                     var87[var7 + 1] = buffer.readString();
                  } else {
                     var87[var7 + 1] = new Integer(buffer.readInt());
                  }
               }

               var87[0] = new Integer(buffer.readInt());
               class87 var84 = new class87();
               var84.field790 = var87;
               class63.method1516(var84);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3243 == var1.serverPacket) {
               var59 = buffer.readBoolean();
               if (var59) {
                  if (class121.field1152 == null) {
                     class121.field1152 = new class381();
                  }
               } else {
                  class121.field1152 = null;
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3278 == var1.serverPacket) {
               if (rootInterface != -1) {
                  destroyInterface(rootInterface, 0);
               }

               var1.serverPacket = null;
               return true;
            }

            Component var33;
            if (var1.serverPacket == ServerPacket.field3239) {
               toComponent = buffer.readUnsignedShortLE();
               if (toComponent == 65535) {
                  toComponent = -1;
               }

               fromComponent = buffer.readIntLE();
               var7 = buffer.readIntLE();
               var33 = Component.getComponent(fromComponent);
               class185 var51;
               if (!var33.field3605) {
                  if (toComponent == -1) {
                     var33.field3650 = 0;
                     var1.serverPacket = null;
                     return true;
                  }

                  var51 = class185.method2355(toComponent).method3502(var7);
                  var33.field3650 = 4;
                  var33.field3603 = toComponent;
                  var33.field3646 = var51.field1970;
                  var33.field3659 = var51.field1960;
                  var33.field3661 = var51.field1969 * 100 / var7;
                  setDirty(var33);
               } else {
                  var33.field3739 = toComponent;
                  var33.field3630 = var7;
                  var51 = class185.method2355(toComponent).method3502(var7);
                  var33.field3646 = var51.field1970;
                  var33.field3659 = var51.field1960;
                  var33.field3750 = var51.field1972;
                  var33.field3656 = var51.field1973;
                  var33.field3657 = var51.field1971;
                  var33.field3661 = var51.field1969;
                  if (var51.field1975 == 1) {
                     var33.field3667 = 1;
                  } else {
                     var33.field3667 = 2;
                  }

                  if (var33.field3662 > 0) {
                     var33.field3661 = var33.field3661 * 32 / var33.field3662;
                  } else if (var33.field3732 > 0) {
                     var33.field3661 = var33.field3661 * 32 / var33.field3732;
                  }

                  setDirty(var33);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3272 == var1.serverPacket) {
               toComponent = buffer.readUnsignedShortLE();
               fromComponent = buffer.readIntLE();
               var7 = buffer.readUnsignedShortLE();
               var33 = Component.getComponent(fromComponent);
               var33.field3663 = toComponent + (var7 << 16);
               var1.serverPacket = null;
               return true;
            }

            if (var1.serverPacket == ServerPacket.field3283) {
               field1452 = buffer.readUnsignedByte();
               if (1 == field1452) {
                  field1612 = buffer.readUnsignedShort();
               }

               if (field1452 >= 2 && field1452 <= 6) {
                  if (2 == field1452) {
                     field1458 = 64;
                     field1459 = 64;
                  }

                  if (field1452 == 3) {
                     field1458 = 0;
                     field1459 = 64;
                  }

                  if (4 == field1452) {
                     field1458 = 128;
                     field1459 = 64;
                  }

                  if (5 == field1452) {
                     field1458 = 64;
                     field1459 = 0;
                  }

                  if (6 == field1452) {
                     field1458 = 64;
                     field1459 = 128;
                  }

                  field1452 = 2;
                  field1455 = buffer.readUnsignedShort();
                  field1523 = buffer.readUnsignedShort();
                  field1457 = buffer.readUnsignedByte();
               }

               if (10 == field1452) {
                  field1454 = buffer.readUnsignedShort();
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3237 == var1.serverPacket) {
               toComponent = buffer.readInt();
               SubInterface var85 = (SubInterface) activeSubInterfaces.get((long) toComponent);
               if (null != var85) {
                  class102.closeSubInterface(var85, true);
               }

               if (null != meslayerPauseButtonComponent) {
                  setDirty(meslayerPauseButtonComponent);
                  meslayerPauseButtonComponent = null;
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3309 == var1.serverPacket) {
               class153.field1393 = new class462(class339.field3793);
               var1.serverPacket = null;
               return true;
            }

            if (var1.serverPacket == ServerPacket.field3252) {
               class380.field4386 = buffer.readUnsignedByte();
               class265.field2959 = buffer.readUnsignedByte();
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3230 == var1.serverPacket) {
               field1689 = true;
               field1697 = false;
               field1713 = true;
               toComponent = method307(buffer.readShort() & 2027);
               fromComponent = method1193(buffer.readShort() & 2027);
               var7 = buffer.readUnsignedShort();
               var8 = buffer.readUnsignedByte();
               field1559 = new class487(class15.field74, fromComponent, var7, var8);
               field1695 = new class487(class456.field4751, toComponent, var7, var8);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3293 == var1.serverPacket) {
               if (class153.field1393 == null) {
                  class153.field1393 = new class462(class339.field3793);
               }

               class525 var86 = class339.field3793.method8013(buffer);
               class153.field1393.field4766.method8142(var86.field5163, var86.field5162);
               field1631[++field1709 - 1 & 31] = var86.field5163;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3210 == var1.serverPacket) {
               var32 = buffer.readUnsignedByteSub();
               var38 = var32 >> 2;
               var44 = var32 & 3;
               var54 = field1507[var38];
               var14 = buffer.readUnsignedShort();
               var7 = buffer.readUnsignedMedium();
               toComponent = var7 >> 16;
               fromComponent = var7 >> 8 & 255;
               var8 = toComponent + (var7 >> 4 & 7);
               var9 = fromComponent + (var7 & 7);
               if (var8 >= 0 && var9 >= 0 && var8 < 103 && var9 < 103) {
                  if (var54 == 0) {
                     class239 var76 = class109.field1065.method4427(class44.field306, var8, var9);
                     if (null != var76) {
                        var16 = class252.method7841(var76.field2654);
                        if (var38 == 2) {
                           var76.field2647 = new class95(var16, 2, var44 + 4, class44.field306, var8, var9, var14, false, var76.field2647);
                           var76.field2653 = new class95(var16, 2, var44 + 1 & 3, class44.field306, var8, var9, var14, false, var76.field2653);
                        } else {
                           var76.field2647 = new class95(var16, var38, var44, class44.field306, var8, var9, var14, false, var76.field2647);
                        }
                     }
                  } else if (var54 == 1) {
                     class254 var74 = class109.field1065.method4462(class44.field306, var8, var9);
                     if (null != var74) {
                        var16 = class252.method7841(var74.field2869);
                        if (var38 != 4 && var38 != 5) {
                           if (var38 == 6) {
                              var74.field2867 = new class95(var16, 4, var44 + 4, class44.field306, var8, var9, var14, false, var74.field2867);
                           } else if (var38 == 7) {
                              var74.field2867 = new class95(var16, 4, (var44 + 2 & 3) + 4, class44.field306, var8, var9, var14, false, var74.field2867);
                           } else if (var38 == 8) {
                              var74.field2867 = new class95(var16, 4, var44 + 4, class44.field306, var8, var9, var14, false, var74.field2867);
                              var74.field2862 = new class95(var16, 4, (var44 + 2 & 3) + 4, class44.field306, var8, var9, var14, false, var74.field2862);
                           }
                        } else {
                           var74.field2867 = new class95(var16, 4, var44, class44.field306, var8, var9, var14, false, var74.field2867);
                        }
                     }
                  } else if (var54 == 2) {
                     class237 var70 = class109.field1065.method4429(class44.field306, var8, var9);
                     if (var38 == 11) {
                        var38 = 10;
                     }

                     if (var70 != null) {
                        var70.field2627 = new class95(class252.method7841(var70.field2639), var38, var44, class44.field306, var8, var9, var14, false, var70.field2627);
                     }
                  } else if (var54 == 3) {
                     class224 var71 = class109.field1065.method4430(class44.field306, var8, var9);
                     if (null != var71) {
                        var71.field2461 = new class95(class252.method7841(var71.field2464), 22, var44, class44.field306, var8, var9, var14, false, var71.field2461);
                     }
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (var1.serverPacket == ServerPacket.field3331) {
               fromComponent = buffer.readUnsignedShort();
               var8 = buffer.readUnsignedShort();
               toComponent = buffer.readUnsignedShortLE();
               var7 = buffer.readUnsignedShortLE();
               class303.method8062(toComponent, fromComponent, var7, var8);
               var1.serverPacket = null;
               return true;
            }

            if (var1.serverPacket == ServerPacket.field3217) {
               toComponent = buffer.readUnsignedByteNeg();
               fromComponent = buffer.readUnsignedByteNeg();
               var81 = buffer.readString();
               if (toComponent >= 1 && toComponent <= 8) {
                  if (var81.equalsIgnoreCase(class364.field4028)) {
                     var81 = null;
                  }

                  field1577[toComponent - 1] = var81;
                  field1683[toComponent - 1] = fromComponent == 0;
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3330 == var1.serverPacket) {
               toComponent = buffer.readUnsignedByteNeg();
               fromComponent = buffer.readUnsignedShortAdd();
               if (fromComponent == 65535) {
                  fromComponent = -1;
               }

               class265.method5208(class146.field1362, fromComponent, toComponent);
               var1.serverPacket = null;
               return true;
            }

            if (var1.serverPacket == ServerPacket.field3246) {
               class28.method412(class301.field3176);
               var1.serverPacket = null;
               return true;
            }

            if (var1.serverPacket == ServerPacket.field3324) {
               toComponent = buffer.readUnsignedShort();
               fromComponent = buffer.writeIntME();
               var27 = Component.getComponent(fromComponent);
               if (var27.field3650 != 6 || toComponent != var27.field3603) {
                  var27.field3650 = 6;
                  var27.field3603 = toComponent;
                  setDirty(var27);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3299 == var1.serverPacket) {
               field1513 = buffer.readUnsignedByte();
               if (255 == field1513) {
                  field1513 = 0;
               }

               field1680 = buffer.readUnsignedByte();
               if (255 == field1680) {
                  field1680 = 0;
               }

               var1.serverPacket = null;
               return true;
            }

            if (var1.serverPacket == ServerPacket.field3306) {
               field1538 = field1624;
               var26 = buffer.readByte();
               class175 var82 = new class175(buffer);
               class164 var77;
               if (var26 >= 0) {
                  var77 = field1673[var26];
               } else {
                  var77 = class244.field2690;
               }

               var82.method3384(var77);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3296 == var1.serverPacket) {
               var9 = buffer.readUnsignedShortLEAdd();
               fromComponent = buffer.readUnsignedShort();
               if (fromComponent == 65535) {
                  fromComponent = -1;
               }

               toComponent = buffer.readUnsignedShortAdd();
               if (toComponent == 65535) {
                  toComponent = -1;
               }

               var32 = buffer.readUnsignedShort();
               var8 = buffer.readUnsignedShortAdd();
               var7 = buffer.readUnsignedShortLEAdd();
               ArrayList var49 = new ArrayList();
               var49.add(toComponent);
               var49.add(fromComponent);
               method3492(var49, var7, var8, var9, var32);
               var1.serverPacket = null;
               return true;
            }

            if (var1.serverPacket == ServerPacket.field3267) {
               toComponent = buffer.readInt();
               fromComponent = buffer.readUnsignedShort();
               if (toComponent < -70000) {
                  fromComponent += 32768;
               }

               if (toComponent >= 0) {
                  var27 = Component.getComponent(toComponent);
               } else {
                  var27 = null;
               }

               if (null != var27) {
                  for(var8 = 0; var8 < var27.field3602.length; ++var8) {
                     var27.field3602[var8] = 0;
                     var27.field3738[var8] = 0;
                  }
               }

               class348.method6500(fromComponent);
               var8 = buffer.readUnsignedShort();

               for(var9 = 0; var9 < var8; ++var9) {
                  var32 = buffer.readUnsignedByteSub();
                  if (var32 == 255) {
                     var32 = buffer.readInt();
                  }

                  var38 = buffer.readUnsignedShortLE();
                  if (var27 != null && var9 < var27.field3602.length) {
                     var27.field3602[var9] = var38;
                     var27.field3738[var9] = var32;
                  }

                  class93.method3491(fromComponent, var9, var38 - 1, var32);
               }

               if (var27 != null) {
                  setDirty(var27);
               }

               method8708();
               field1723[++field1602 - 1 & 31] = fromComponent & 32767;
               var1.serverPacket = null;
               return true;
            }

            if (var1.serverPacket == ServerPacket.field3289) {
               var59 = this.method7791() == null;
               class116.method1963(buffer, var1.packetLength);
               class265.method5207();
               if (var59 && this.method7791() != null && this.method7791().method9156().equalsIgnoreCase("nin")) {
                  class119.method7274(4, "", "$jmod_luck = true");
               }

               var1.serverPacket = null;
               return true;
            }

            if (var1.serverPacket == ServerPacket.field3326) {
               var26 = buffer.readByte();
               var6 = buffer.readString();
               long var68 = (long) buffer.readUnsignedShort();
               long var39 = (long) buffer.readUnsignedMedium();
               class361 var45 = (class361)class373.method1724(class361.method2121(), buffer.readUnsignedByte());
               long var42 = var39 + (var68 << 32);
               boolean var58 = false;
               class164 var65 = null;
               var65 = var26 >= 0 ? field1673[var26] : class244.field2690;
               if (null == var65) {
                  var58 = true;
               } else {
                  var16 = 0;

                  while(true) {
                     if (var16 >= 100) {
                        if (var45.field3997 && class165.field1782.method1096(new class526(var6, class454.field4743))) {
                           var58 = true;
                        }
                        break;
                     }

                     if (var42 == field1664[var16]) {
                        var58 = true;
                        break;
                     }

                     ++var16;
                  }
               }

               if (!var58) {
                  field1664[field1556] = var42;
                  field1556 = (1 + field1556) % 100;
                  var69 = class407.method7161(class307.method5741(buffer));
                  var17 = var26 >= 0 ? 41 : 44;
                  if (var45.field3995 != -1) {
                     class119.method4130(var17, class90.method2108(var45.field3995) + var6, var69, var65.field1775);
                  } else {
                     class119.method4130(var17, var6, var69, var65.field1775);
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (var1.serverPacket == ServerPacket.field3300) {
               toComponent = buffer.readUnsignedShortLEAdd();
               if (toComponent == 65535) {
                  toComponent = -1;
               }

               fromComponent = buffer.writeIntIME();
               var7 = buffer.readUnsignedShortLE();
               if (var7 == 65535) {
                  var7 = -1;
               }

               var8 = buffer.writeIntIME();

               for(var9 = toComponent; var9 <= var7; ++var9) {
                  var50 = (long)var9 + ((long)var8 << 32);
                  class470 var12 = field1647.get(var50);
                  if (var12 != null) {
                     var12.method8116();
                  }

                  field1647.put(new class492(fromComponent), var50);
               }

               var1.serverPacket = null;
               return true;
            }

            if (var1.serverPacket == ServerPacket.field3279) {
               toComponent = buffer.writeIntME();
               fromComponent = buffer.readInt();
               var27 = Component.getComponent(toComponent);
               Component.method2415(var27, fromComponent);
               setDirty(var27);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3270 == var1.serverPacket) {
               toComponent = buffer.readIntLE();
               fromComponent = buffer.readUnsignedShortAdd();
               var27 = Component.getComponent(toComponent);
               if (var27.field3650 != 1 || var27.field3603 != fromComponent) {
                  var27.field3650 = 1;
                  var27.field3603 = fromComponent;
                  setDirty(var27);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3251 == var1.serverPacket) {
               class165.field1782.method1137(buffer, var1.packetLength);
               field1679 = field1624;
               var1.serverPacket = null;
               return true;
            }

            if (var1.serverPacket == ServerPacket.IF_OPENSUB) {
               int component = buffer.readInt();
               int type = buffer.readUnsignedByte();
               int interfaceId = buffer.readUnsignedShortLEAdd();
               subInterf = (SubInterface) activeSubInterfaces.get((long)component);
               if (null != subInterf) {
                  class102.closeSubInterface(subInterf, interfaceId != subInterf.id);
               }

               openSubInterface(component, interfaceId, type);
               var1.serverPacket = null;

               int parent = component >> 16;
               int child = component & 0xFFFF;
               System.out.println("[ServerPacket] IF_OPENSUB(parent: "+parent+", child: "+child+", interfaceId: "+interfaceId+", type: "+type+")");

               return true;
            }

            if (var1.serverPacket == ServerPacket.field3250) {
               field1662 = buffer.readUnsignedByteAdd();
               field1661 = buffer.readUnsignedByteNeg();
               var1.serverPacket = null;
               return true;
            }

            if (var1.serverPacket == ServerPacket.field3284) {
               for(toComponent = 0; toComponent < class189.field2029; ++toComponent) {
                  class189 var75 = class189.method3216(toComponent);
                  if (var75 != null) {
                     class329.field3576[toComponent] = 0;
                     class329.field3577[toComponent] = 0;
                  }
               }

               method8708();
               field1626 += 32;
               var1.serverPacket = null;
               return true;
            }

            if (var1.serverPacket == ServerPacket.field3327) {
               var59 = buffer.readUnsignedByteAdd() == 1;
               fromComponent = buffer.readIntLE();
               var27 = Component.getComponent(fromComponent);
               Component.method4653(var27, class146.field1362.field764, var59);
               setDirty(var27);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3241 == var1.serverPacket) {
               toComponent = buffer.readUnsignedByteAdd();
               fromComponent = buffer.readUnsignedByteSub();
               var7 = buffer.writeIntME();
               var33 = Component.getComponent(var7);
               Component.method5687(var33, fromComponent, toComponent);
               setDirty(var33);
               var1.serverPacket = null;
               return true;
            }

            if (var1.serverPacket == ServerPacket.field3227) {
               toComponent = buffer.readInt();
               fromComponent = buffer.readUnsignedByteSub();
               var27 = Component.getComponent(toComponent);
               Component.method3413(var27, class146.field1362.field764.field3486, fromComponent);
               setDirty(var27);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3262 == var1.serverPacket) {
               toComponent = buffer.readUnsignedShort();
               if (toComponent == 65535) {
                  toComponent = -1;
               }

               method5202(toComponent);
               var1.serverPacket = null;
               return true;
            }

            if (var1.serverPacket == ServerPacket.field3255) {
               toComponent = buffer.readUnsignedMediumLE();
               fromComponent = buffer.readUnsignedShortLEAdd();
               if (fromComponent == 65535) {
                  fromComponent = -1;
               }

               method1303(fromComponent, toComponent);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3233 == var1.serverPacket) {
               class1.field7 = class536.method4387(buffer.readUnsignedByte());
               var1.serverPacket = null;
               return true;
            }

            if (var1.serverPacket == ServerPacket.field3294) {
               field1538 = field1624;
               var26 = buffer.readByte();
               if (1 == var1.packetLength) {
                  if (var26 >= 0) {
                     field1673[var26] = null;
                  } else {
                     class244.field2690 = null;
                  }

                  var1.serverPacket = null;
                  return true;
               }

               if (var26 >= 0) {
                  field1673[var26] = new class164(buffer);
               } else {
                  class244.field2690 = new class164(buffer);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3273 == var1.serverPacket) {
               toComponent = buffer.readUnsignedByte();
               if (buffer.readUnsignedByte() == 0) {
                  field1720[toComponent] = new class367();
                  buffer.offset += 18;
               } else {
                  --buffer.offset;
                  field1720[toComponent] = new class367(buffer, false);
               }

               field1637 = field1624;
               var1.serverPacket = null;
               return true;
            }

            if (var1.serverPacket == ServerPacket.field3244) {
               class28.method412(class301.field3182);
               var1.serverPacket = null;
               return true;
            }

            if (var1.serverPacket == ServerPacket.field3322) {
               class28.method412(class301.field3175);
               var1.serverPacket = null;
               return true;
            }

            if (var1.serverPacket == ServerPacket.field3303) {
               method4209();
               var26 = buffer.readByte();
               class148 var62 = new class148(buffer);
               class154 var46;
               if (var26 >= 0) {
                  var46 = field1628[var26];
               } else {
                  var46 = class20.field109;
               }

               var62.method2563(var46);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3240 == var1.serverPacket) {
               var59 = buffer.readUnsignedByteSub() == 1;
               fromComponent = buffer.readIntLE();
               var27 = Component.getComponent(fromComponent);
               if (var59 != var27.field3626) {
                  var27.field3626 = var59;
                  setDirty(var27);
               }

               var1.serverPacket = null;
               return true;
            }

            Component activeComp;
            if (ServerPacket.IF_MOVESUB == var1.serverPacket) {
               toComponent = buffer.writeIntIME();
               fromComponent = buffer.readIntLE();
               SubInterface toInterf = (SubInterface) activeSubInterfaces.get((long)fromComponent);
               SubInterface fromInterf = (SubInterface) activeSubInterfaces.get((long) toComponent);
               if (fromInterf != null) {
                  class102.closeSubInterface(fromInterf, toInterf == null || fromInterf.id != toInterf.id);
               }

               if (null != toInterf) {
                  toInterf.method8116();
                  activeSubInterfaces.put(toInterf, (long) toComponent);
               }

               activeComp = Component.getComponent(fromComponent);
               if (activeComp != null) {
                  setDirty(activeComp);
               }

               activeComp = Component.getComponent(toComponent);
               if (activeComp != null) {
                  setDirty(activeComp);
                  class34.calculateLayerDimensions(class96.interfaces[activeComp.field3606 >>> 16], activeComp, true);
               }

               if (-1 != rootInterface) {
                  destroyInterface(rootInterface, 1);
               }

               var1.serverPacket = null;

               int fromParent = fromComponent >> 16;
               int fromChild = fromComponent & 0xFFFF;
               int toParent = toComponent >> 16;
               int toChild = toComponent & 0xFFFF;

               System.out.println("[ServerPacket] IF_MOVESUB(from: " + fromParent + ":" + fromChild + " - to: " + toParent + ":" + toChild + ")");

               return true;
            }

            if (ServerPacket.field3282 == var1.serverPacket) {
               toComponent = buffer.readShortAdd();
               fromComponent = buffer.writeIntIME();
               var7 = buffer.readShortLE();
               var33 = Component.getComponent(fromComponent);
               if (toComponent != var33.field3615 || var7 != var33.field3616 || 0 != var33.field3700 || 0 != var33.field3612) {
                  var33.field3615 = toComponent;
                  var33.field3616 = var7;
                  var33.field3700 = 0;
                  var33.field3612 = 0;
                  setDirty(var33);
                  this.method2717(var33);
                  if (var33.field3608 == 0) {
                     class34.calculateLayerDimensions(class96.interfaces[fromComponent >> 16], var33, false);
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3259 == var1.serverPacket) {
               for(toComponent = 0; toComponent < class329.field3577.length; ++toComponent) {
                  if (class329.field3576[toComponent] != class329.field3577[toComponent]) {
                     class329.field3577[toComponent] = class329.field3576[toComponent];
                     method1195(toComponent);
                     field1625[++field1626 - 1 & 31] = toComponent;
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (var1.serverPacket == ServerPacket.field3275) {
               class153.field1393 = null;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3254 == var1.serverPacket) {
               toComponent = buffer.readUnsignedShort();
               fromComponent = buffer.readUnsignedByte();
               var7 = buffer.readUnsignedShort();
               method21(toComponent, fromComponent, var7);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3325 == var1.serverPacket) {
               class362.method6594(true, buffer);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3297 == var1.serverPacket) {
               toComponent = buffer.readUnsignedByte();
               method7633(toComponent);
               var1.serverPacket = null;
               return true;
            }

            class86 var31;
            if (var1.serverPacket == ServerPacket.field3235) {
               fromComponent = buffer.writeIntME();
               var7 = buffer.readUnsignedShortAdd();
               toComponent = buffer.readUnsignedShortLEAdd();
               var31 = field1489[toComponent];
               var8 = buffer.readUnsignedByte();
               if (null != var31) {
                  var31.method2080(var8, var7, fromComponent >> 16, fromComponent & '\uffff');
               }

               var1.serverPacket = null;
               return true;
            }

            if (var1.serverPacket == ServerPacket.field3211) {
               class28.method412(class301.field3177);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3276 == var1.serverPacket) {
               field1586 = buffer.readUnsignedByte();
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3225 == var1.serverPacket) {
               return this.method2711(var1);
            }

            if (var1.serverPacket == ServerPacket.field3229) {
               var37 = buffer.readString();
               var6 = class407.method7161(class380.method2549(class307.method5741(buffer)));
               class119.method7274(6, var37, var6);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3213 == var1.serverPacket) {
               toComponent = buffer.readInt();
               fromComponent = buffer.readInt();
               var7 = GameShell.method406();
               class308 var30 = class308.method8607(ClientPacket.field3395, serverConnection.field1046);
               var30.packet.writeByteNeg(var7);
               var30.packet.writeByteAdd(GameShell.field274);
               var30.packet.writeIntLE(toComponent);
               var30.packet.writeInt(fromComponent);
               serverConnection.method2148(var30);
               var1.serverPacket = null;
               return true;
            }

            if (var1.serverPacket == ServerPacket.field3286) {
               method4209();
               var26 = buffer.readByte();
               if (var1.packetLength == 1) {
                  if (var26 >= 0) {
                     field1628[var26] = null;
                  } else {
                     class20.field109 = null;
                  }

                  var1.serverPacket = null;
                  return true;
               }

               if (var26 >= 0) {
                  field1628[var26] = new class154(buffer);
               } else {
                  class20.field109 = new class154(buffer);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3295 == var1.serverPacket) {
               class44.method4045(buffer, var1.packetLength);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.REBUILD_NORMAL == var1.serverPacket) {
               rebuildRegion(false, var1.buffer);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3264 == var1.serverPacket) {
               rebuildRegion(true, var1.buffer);
               var1.serverPacket = null;
               return true;
            }

            if (var1.serverPacket == ServerPacket.field3257) {
               var37 = buffer.readString();
               var47 = (long) buffer.readUnsignedShort();
               var28 = (long) buffer.readUnsignedMedium();
               class361 var48 = (class361)class373.method1724(class361.method2121(), buffer.readUnsignedByte());
               long var43 = (var47 << 32) + var28;
               var13 = false;

               for(var14 = 0; var14 < 100; ++var14) {
                  if (var43 == field1664[var14]) {
                     var13 = true;
                     break;
                  }
               }

               if (class165.field1782.method1096(new class526(var37, class454.field4743))) {
                  var13 = true;
               }

               if (!var13 && field1553 == 0) {
                  field1664[field1556] = var43;
                  field1556 = (field1556 + 1) % 100;
                  var57 = class407.method7161(class380.method2549(class307.method5741(buffer)));
                  if (var48.field3996) {
                     var15 = 7;
                  } else {
                     var15 = 3;
                  }

                  if (-1 != var48.field3995) {
                     class119.method7274(var15, class90.method2108(var48.field3995) + var37, var57);
                  } else {
                     class119.method7274(var15, var37, var57);
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3304 == var1.serverPacket) {
               class70 var35 = new class70();
               var35.field571 = buffer.readString();
               var35.field565 = buffer.readUnsignedShort();
               fromComponent = buffer.readInt();
               var35.field568 = fromComponent;
               if (var35.method1432()) {
                  var35.field564 = "beta";
               }

               updateGameState(45);
               var3.method7589();
               var3 = null;
               Login.method2662(var35);
               var1.serverPacket = null;
               return false;
            }

            if (ServerPacket.field3307 == var1.serverPacket) {
               method8708();
               field1606 = buffer.readUnsignedShort();
               field1640 = field1624;
               var1.serverPacket = null;
               return true;
            }

            if (var1.serverPacket == ServerPacket.field3291) {
               toComponent = buffer.writeIntIME();
               short var41 = (short) buffer.readShortLE();
               var7 = buffer.readUnsignedByteAdd();
               var8 = buffer.readUnsignedShortLE();
               var31 = field1489[var8];
               if (var31 != null) {
                  var31.method1851(var7, toComponent, var41);
               }

               var1.serverPacket = null;
               return true;
            }

            if (var1.serverPacket == ServerPacket.IF_OPENTOP) {
               toComponent = buffer.readUnsignedShortLEAdd();
               if (toComponent == 65535) {
                  toComponent = -1;
               }

               rootInterface = toComponent;
               this.resizeRoot(false);
               resetAnimation(toComponent);
               class63.executeLoadHook(rootInterface);

               for(fromComponent = 0; fromComponent < 100; ++fromComponent) {
                  field1634[fromComponent] = true;
               }

               var1.serverPacket = null;
               return true;
            }

            if (var1.serverPacket == ServerPacket.field3228) {
               toComponent = buffer.readUnsignedShortLE();
               class93.method1534(toComponent);
               field1723[++field1602 - 1 & 31] = toComponent & 32767;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3285 == var1.serverPacket) {
               class165.field1782.method1091();
               field1679 = field1624;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3281 == var1.serverPacket) {
               class28.method412(class301.field3179);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3245 == var1.serverPacket) {
               class28.method412(class301.field3184);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3323 == var1.serverPacket) {
               class28.method412(class301.field3178);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3312 == var1.serverPacket) {
               class380.field4386 = buffer.readUnsignedByteSub();
               class265.field2959 = buffer.readUnsignedByteNeg();

               while(buffer.offset < var1.packetLength) {
                  toComponent = buffer.readUnsignedByte();
                  class301 var36 = class301.method4923()[toComponent];
                  class28.method412(var36);
               }

               var1.serverPacket = null;
               return true;
            }

            if (var1.serverPacket == ServerPacket.field3258) {
               class165.field1782.field402.method7674(buffer, var1.packetLength);
               method6488();
               field1679 = field1624;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3256 == var1.serverPacket) {
               field1451 = buffer.readUnsignedShortAdd() * 30;
               field1640 = field1624;
               var1.serverPacket = null;
               return true;
            }

            if (var1.serverPacket == ServerPacket.field3260) {
               toComponent = buffer.readUnsignedShortAdd();
               fromComponent = buffer.readInt();
               var7 = buffer.readUnsignedShortAdd();
               var8 = buffer.readUnsignedShortAdd();
               activeComp = Component.getComponent(fromComponent);
               if (activeComp.field3646 != var8 || toComponent != activeComp.field3659 || activeComp.field3661 != var7) {
                  activeComp.field3646 = var8;
                  activeComp.field3659 = toComponent;
                  activeComp.field3661 = var7;
                  setDirty(activeComp);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3277 == var1.serverPacket) {
               toComponent = buffer.readInt();
               fromComponent = buffer.readUnsignedShort();
               if (toComponent < -70000) {
                  fromComponent += 32768;
               }

               if (toComponent >= 0) {
                  var27 = Component.getComponent(toComponent);
               } else {
                  var27 = null;
               }

               for(; buffer.offset < var1.packetLength; class93.method3491(fromComponent, var8, var9 - 1, var32)) {
                  var8 = buffer.readUnsignedSmartByteShort();
                  var9 = buffer.readUnsignedShort();
                  var32 = 0;
                  if (var9 != 0) {
                     var32 = buffer.readUnsignedByte();
                     if (var32 == 255) {
                        var32 = buffer.readInt();
                     }
                  }

                  if (null != var27 && var8 >= 0 && var8 < var27.field3602.length) {
                     var27.field3602[var8] = var9;
                     var27.field3738[var8] = var32;
                  }
               }

               if (var27 != null) {
                  setDirty(var27);
               }

               method8708();
               field1723[++field1602 - 1 & 31] = fromComponent & 32767;
               var1.serverPacket = null;
               return true;
            }

            if (var1.serverPacket == ServerPacket.field3249) {
               var26 = buffer.readByteSub();
               fromComponent = buffer.readUnsignedShort();
               class329.field3576[fromComponent] = var26;
               if (var26 != class329.field3577[fromComponent]) {
                  class329.field3577[fromComponent] = var26;
               }

               method1195(fromComponent);
               field1625[++field1626 - 1 & 31] = fromComponent;
               var1.serverPacket = null;
               return true;
            }

            if (var1.serverPacket == ServerPacket.field3320) {
               class28.method412(class301.field3185);
               var1.serverPacket = null;
               return true;
            }

            if (var1.serverPacket == ServerPacket.field3261) {
               class380.field4386 = buffer.readUnsignedByte();
               class265.field2959 = buffer.readUnsignedByte();

               for(toComponent = class265.field2959; toComponent < class265.field2959 + 8; ++toComponent) {
                  for(fromComponent = class380.field4386; fromComponent < 8 + class380.field4386; ++fromComponent) {
                     if (null != field1568[class44.field306][toComponent][fromComponent]) {
                        field1568[class44.field306][toComponent][fromComponent] = null;
                        method6371(toComponent, fromComponent);
                     }
                  }
               }

               for(class104 var25 = (class104)field1593.method6706(); var25 != null; var25 = (class104)field1593.method6687()) {
                  if (var25.field1023 >= class265.field2959 && var25.field1023 < class265.field2959 + 8 && var25.field1024 >= class380.field4386 && var25.field1024 < 8 + class380.field4386 && class44.field306 == var25.field1036) {
                     var25.field1034 = 0;
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3236 == var1.serverPacket) {
               toComponent = buffer.readUnsignedShortLE();
               fromComponent = buffer.writeIntIME();
               var27 = Component.getComponent(fromComponent);
               if (2 != var27.field3650 || toComponent != var27.field3603) {
                  var27.field3650 = 2;
                  var27.field3603 = toComponent;
                  setDirty(var27);
               }

               var1.serverPacket = null;
               return true;
            }

            if (var1.serverPacket == ServerPacket.field3234) {
               toComponent = buffer.readUnsignedByte();
               fromComponent = buffer.readUnsignedByte();
               var7 = buffer.readUnsignedByte();
               var8 = buffer.readUnsignedByte();
               field1534[toComponent] = true;
               field1699[toComponent] = fromComponent;
               field1700[toComponent] = var7;
               field1701[toComponent] = var8;
               field1687[toComponent] = 0;
               var1.serverPacket = null;
               return true;
            }

            if (var1.serverPacket == ServerPacket.field3222) {
               class362.method6594(false, buffer);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3318 == var1.serverPacket) {
               field1689 = true;
               field1697 = false;
               field1691 = false;
               class241.field2683 = buffer.readUnsignedByte();
               class137.field1265 = buffer.readUnsignedByte();
               class388.field4440 = buffer.readUnsignedShort();
               field1671 = buffer.readUnsignedByte();
               class55.field397 = buffer.readUnsignedByte();
               if (class55.field397 >= 100) {
                  class172.field1822 = class241.field2683 * 128 + 64;
                  class50.field362 = 64 + class137.field1265 * 128;
                  class372.field4350 = method5733(class172.field1822, class50.field362, class44.field306) - class388.field4440;
               }

               var1.serverPacket = null;
               return true;
            }

            if (var1.serverPacket == ServerPacket.field3231) {
               toComponent = buffer.readUnsignedShortLEAdd();
               fromComponent = buffer.writeIntIME();
               class329.field3576[toComponent] = fromComponent;
               if (class329.field3577[toComponent] != fromComponent) {
                  class329.field3577[toComponent] = fromComponent;
               }

               method1195(toComponent);
               field1625[++field1626 - 1 & 31] = toComponent;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3292 == var1.serverPacket) {
               field1689 = true;
               field1697 = false;
               field1691 = true;
               class241.field2683 = buffer.readUnsignedByte();
               class137.field1265 = buffer.readUnsignedByte();
               toComponent = buffer.readUnsignedShort();
               fromComponent = buffer.readUnsignedShort();
               field1698 = buffer.readBoolean();
               var7 = buffer.readUnsignedByte();
               var8 = 64 + class241.field2683 * 128;
               var9 = 64 + class137.field1265 * 128;
               boolean var10 = false;
               boolean var11 = false;
               if (field1698) {
                  var32 = class372.field4350;
                  var38 = method5733(var8, var9, class44.field306) - toComponent;
               } else {
                  var32 = method5733(class172.field1822, class50.field362, class44.field306) - class372.field4350;
                  var38 = toComponent;
               }

               field1694 = new class472(class172.field1822, class50.field362, var32, var8, var9, var38, fromComponent, var7);
               var1.serverPacket = null;
               return true;
            }

            class524.method5856("" + (var1.serverPacket != null ? var1.serverPacket.field3332 : -1) + class90.field829 + (null != var1.field1054 ? var1.field1054.field3332 : -1) + class90.field829 + (null != var1.field1055 ? -1448898935 * var1.field1055.field3332 * 1217808313 : -1) + class90.field829 + var1.packetLength, (Throwable)null);
            method5258();
         } catch (IOException var21) {
            method2043();
         } catch (Exception var22) {
            var6 = "" + (null != var1.serverPacket ? -1448898935 * var1.serverPacket.field3332 * 1217808313 : -1) + class90.field829 + (var1.field1054 != null ? -1448898935 * var1.field1054.field3332 * 1217808313 : -1) + class90.field829 + (null != var1.field1055 ? -1448898935 * var1.field1055.field3332 * 1217808313 : -1) + class90.field829 + var1.packetLength + class90.field829 + (class342.field3837 + class146.field1362.field945[0]) + class90.field829 + (class144.field1352 + class146.field1362.field1012[0]) + class90.field829;

            for(var7 = 0; var7 < var1.packetLength && var7 < 50; ++var7) {
               var6 = var6 + buffer.data[var7] + class90.field829;
            }

            class524.method5856(var6, var22);
            method5258();
         }

         return true;
      }
   }

   final void method2951() {
      method2465();
      if (null == field1512) {
         int var2 = class41.field256;
         int var3;
         if (field1576) {
            int var4;
            if (var2 != 1 && (class40.field238 || var2 != 4)) {
               var3 = class41.field249;
               var4 = class41.field250;
               if (var3 < Js5Index.field40 - 10 || var3 > Js5Index.field40 + class109.field1067 + 10 || var4 < class128.field1214 - 10 || var4 > class128.field1214 + class388.field4438 + 10) {
                  field1576 = false;
                  method4202(Js5Index.field40, class128.field1214, class109.field1067, class388.field4438);
               }
            }

            if (var2 == 1 || !class40.field238 && var2 == 4) {
               var3 = Js5Index.field40;
               var4 = class128.field1214;
               int var5 = class109.field1067;
               int var6 = class41.field257;
               int var7 = class41.field258;
               int var8 = -1;

               for(int var9 = 0; var9 < field1594; ++var9) {
                  int var10 = (field1594 - 1 - var9) * 15 + var4 + 31;
                  if (var6 > var3 && var6 < var3 + var5 && var7 > var10 - 13 && var7 < var10 + 3) {
                     var8 = var9;
                  }
               }

               if (var8 != -1) {
                  method505(var8);
               }

               field1576 = false;
               method4202(Js5Index.field40, class128.field1214, class109.field1067, class388.field4438);
            }
         } else {
            var3 = method1537();
            if ((var2 == 1 || !class40.field238 && var2 == 4) && this.method2714()) {
               var2 = 2;
            }

            if ((var2 == 1 || !class40.field238 && var2 == 4) && field1594 > 0) {
               method505(var3);
            }

            if (var2 == 2 && field1594 > 0) {
               this.method2715(class41.field257, class41.field258);
            }
         }

      }
   }

   final boolean method2714() {
      int var2 = method1537();
      return (field1575 && field1594 > 2 || method2249(var2)) && !field1585[var2];
   }

   final void method2715(int var1, int var2) {
      method2651(var1, var2);
      var1 -= field1705;
      var2 -= field1541;
      class109.field1065.method4529(class44.field306, var1, var2, false);
      field1576 = true;
   }

   final void resizeRoot(boolean var1) {
      int var3 = rootInterface;
      int var4 = class343.field3838;
      int var5 = class488.field4948;
      if (Component.method1200(var3)) {
         method834(class96.interfaces[var3], -1, var4, var5, var1);
      }

   }

   void method2717(Component var1) {
      Component var3 = var1.field3625 == -1 ? null : Component.getComponent(var1.field3625);
      int var4;
      int var5;
      if (var3 == null) {
         var4 = class343.field3838;
         var5 = class488.field4948;
      } else {
         var4 = var3.field3598;
         var5 = var3.field3622;
      }

      class56.method1161(var1, var4, var5, false);
      method15(var1, var4, var5);
   }

   final void method2718() {
      setDirty(field1512);
      ++class143.field1342;
      int var2;
      int var3;
      if (field1725 && field1677) {
         var2 = class41.field249;
         var3 = class41.field250;
         var2 -= field1614;
         var3 -= field1615;
         if (var2 < field1564) {
            var2 = field1564;
         }

         if (var2 + field1512.field3598 > field1520.field3598 + field1564) {
            var2 = field1520.field3598 + field1564 - field1512.field3598;
         }

         if (var3 < field1619) {
            var3 = field1619;
         }

         if (var3 + field1512.field3622 > field1520.field3622 + field1619) {
            var3 = field1619 + field1520.field3622 - field1512.field3622;
         }

         int var12 = var2 - field1621;
         int var5 = var3 - field1622;
         int var6 = field1512.field3651;
         if (class143.field1342 > field1512.field3690 && (var12 > var6 || var12 < -var6 || var5 > var6 || var5 < -var6)) {
            field1516 = true;
         }

         int var7 = field1520.field3627 + (var2 - field1564);
         int var8 = field1520.field3628 + (var3 - field1619);
         class87 var9;
         if (field1512.field3702 != null && field1516) {
            var9 = new class87();
            var9.field786 = field1512;
            var9.field787 = var7;
            var9.field788 = var8;
            var9.field790 = field1512.field3702;
            class63.method1516(var9);
         }

         if (0 == class41.field248) {
            if (field1516) {
               if (null != field1512.field3703) {
                  var9 = new class87();
                  var9.field786 = field1512;
                  var9.field787 = var7;
                  var9.field788 = var8;
                  var9.field794 = field1616;
                  var9.field790 = field1512.field3703;
                  class63.method1516(var9);
               }

               if (null != field1616 && method5299(field1512) != null) {
                  class308 var13 = class308.method8607(ClientPacket.field3450, serverConnection.field1046);
                  var13.packet.writeShort(field1512.field3739);
                  var13.packet.writeShortLE(field1512.field3607);
                  var13.packet.writeShort(field1616.field3607);
                  var13.packet.writeShortLEAdd(field1616.field3739);
                  var13.packet.writeIntLE(field1512.field3606);
                  var13.packet.writeIntME(field1616.field3606);
                  serverConnection.method2148(var13);
               }
            } else if (this.method2714()) {
               this.method2715(field1614 + field1621, field1615 + field1622);
            } else if (field1594 > 0) {
               int var14 = field1614 + field1621;
               int var10 = field1615 + field1622;
               class60 var11 = class256.field2911;
               if (var11 != null) {
                  method1172(var11.field421, var11.field426, var11.field420, var11.field422, var11.field424, var11.field425, var11.field423, var14, var10);
               }

               class256.field2911 = null;
            }

            field1512 = null;
         }

      } else {
         if (class143.field1342 > 1) {
            if (!field1516 && field1594 > 0) {
               var2 = field1614 + field1621;
               var3 = field1622 + field1615;
               class60 var4 = class256.field2911;
               if (var4 != null) {
                  method1172(var4.field421, var4.field426, var4.field420, var4.field422, var4.field424, var4.field425, var4.field423, var2, var3);
               }

               class256.field2911 = null;
            }

            field1512 = null;
         }

      }
   }

   public class526 method7791() {
      return class146.field1362 != null ? class146.field1362.field740 : null;
   }
}
