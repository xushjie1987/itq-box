package com.itq.box.util;

import java.io.File;

import org.junit.Test;

public class TestTQChestUtil {
    private static final String TEST_ROOT = TestTQChestUtil.class.getResource("/")
                                                                 .getFile();
    
    private static final String TQC_PATH  = "META-INF/test/util/tqc/";
    
    @Test
    public void testWrite32bitIntBytes_01() {
        TQChestUtil.write32bitIntBytes(new File(TEST_ROOT +
                                                TQC_PATH +
                                                "testWrite32bitIntBytes_01.dat"),
                                       4,
                                       false);
    }
    
    @Test
    public void testWrite32bitIntBytes_02() {
        TQChestUtil.write32bitIntBytes(new File(TEST_ROOT +
                                                TQC_PATH +
                                                "testWrite32bitIntBytes_02.dat"),
                                       0x00000004,
                                       false);
    }
    
    @Test
    public void testWrite32bitIntBytes_03() {
        TQChestUtil.write32bitIntBytes(new File(TEST_ROOT +
                                                TQC_PATH +
                                                "testWrite32bitIntBytes_03.dat"),
                                       04,
                                       false);
    }
    
    @Test
    public void testWrite32bitIntBytes_04() {
        TQChestUtil.write32bitIntBytes(new File(TEST_ROOT +
                                                TQC_PATH +
                                                "testWrite32bitIntBytes_04.dat"),
                                       0b00000100,
                                       false);
    }
    
    @Test
    public void testWrite8bitIntBytes_01() {
        TQChestUtil.write8bitIntBytes(new File(TEST_ROOT +
                                               TQC_PATH +
                                               "testWrite8bitIntBytes_01.dat"),
                                      4,
                                      false);
    }
    
    @Test
    public void testWriteASCIIStringBytes_01() {
        TQChestUtil.writeASCIIStringBytes(new File(TEST_ROOT +
                                                   TQC_PATH +
                                                   "testWriteASCIIStringBytes_01.dat"),
                                          "a",
                                          false);
    }
    
    @Test
    public void testWriteASCIIStringBytes_02() {
        TQChestUtil.writeASCIIStringBytes(new File(TEST_ROOT +
                                                   TQC_PATH +
                                                   "testWriteASCIIStringBytes_02.dat"),
                                          "我",
                                          false);
    }
    
    @Test
    public void testWriteUTF8StringBytes_01() {
        TQChestUtil.writeUTF8StringBytes(new File(TEST_ROOT +
                                                  TQC_PATH +
                                                  "testWriteUTF8StringBytes_01.dat"),
                                         "a",
                                         false);
    }
    
    @Test
    public void testWriteUTF8StringBytes_02() {
        TQChestUtil.writeUTF8StringBytes(new File(TEST_ROOT +
                                                  TQC_PATH +
                                                  "testWriteUTF8StringBytes_02.dat"),
                                         "我",
                                         false);
    }
}
