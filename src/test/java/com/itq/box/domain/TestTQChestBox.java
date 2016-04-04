package com.itq.box.domain;

import java.io.File;

import org.junit.Assert;
import org.junit.Test;

public class TestTQChestBox {
    @Test
    public void testAddBatchItems_01() {
        Integer i = new Integer(1);
        i++;
        System.out.println(i);
        Assert.assertEquals(2, i.intValue());
    }

    @Test
    public void testSetDbrFile_01() {
        String filename = "D:\\game\\THQ\\database\\records\\xpack\\item\\equipmentweapons\\sword\\u_l_002.dbr";
        File file = new File(filename);
        System.out.println(file.getAbsoluteFile().getName());
        System.out.println(filename.split("\\\\")[filename.split("\\\\").length - 1]);
    }

    @Test
    public void testSetDbrFile_02() {
        System.out.println("ab_".matches("\\w+"));
        System.out.println("ab_!".matches("\\w+"));
    }
}
