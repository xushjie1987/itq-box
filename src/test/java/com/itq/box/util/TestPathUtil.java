package com.itq.box.util;

import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;

public class TestPathUtil {
    @Test
    public void testGetAbsolutePath_01() {
        Assert.assertEquals("E:\\github\\asf\\commons-io\\itq-box", PathUtil.getAbsolutePath(""));
    }

    @Test
    public void testIsDirectory_01() {
        Assert.assertTrue(PathUtil.isDirectory(""));
    }

    @Test
    public void testGetRecords_01() {
        Collection<String> records = PathUtil.getRecords("D:\\game\\THQ\\database\\records\\xpack\\item\\equipmentweapons\\staff", false);
        Assert.assertEquals(70, records.size());
    }

    @Test
    public void testGetRecords_02() {
        Collection<String> records = PathUtil.getRecords("D:\\game\\THQ\\database\\records\\xpack\\item\\equipmentweapons\\shield", false);
        int i = 1;
        for (String r : records) {
            System.out.println(r);
            if (i % 12 == 0) {
                System.out.println("============================================================================================");
            }
            i++;
        }
    }

    @Test
    public void testGetRecords_03() {
        Collection<String> records = PathUtil.getRecords("D:\\game\\THQ\\database\\records\\item\\equipmentshield", false);
        int i = 1;
        int bat = 0;
        for (String r : records) {
            System.out.println(r);
            if (i % 12 == 0) {
                System.out.println("===============" + bat++ + "==================");
            }
            i++;
        }
    }
}
