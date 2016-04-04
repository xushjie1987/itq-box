package com.itq.box.util;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import com.itq.box.domain.TQChestBox;
import com.itq.box.domain.TQChestItem;

public class TQChestUtil {
    public static boolean write32bitIntBytes(File file,
                                             Integer data) {
        return write32bitIntBytes(file,
                                  data,
                                  true);
    }
    
    /**
     * 大端模式 <br>
     * 写32bits的Integer整型 <br>
     * 
     * @param file
     * @param data
     * @param append
     * @return
     */
    public static boolean write32bitIntBytes(File file,
                                             Integer data,
                                             boolean append) {
        FileOutputStream fos = null;
        DataOutputStream dos = null;
        try {
            fos = FileUtils.openOutputStream(file,
                                             append);
            dos = new DataOutputStream(fos);
            dos.writeInt(data.intValue());
            dos.flush();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } finally {
            IOUtils.closeQuietly(fos);
            IOUtils.closeQuietly(dos);
        }
    }
    
    public static boolean write8bitIntBytes(File file,
                                            Integer data) {
        return write8bitIntBytes(file,
                                 data,
                                 true);
    }
    
    /**
     * 大端模式 <br>
     * 写8bits的Integer整型 <br>
     * 
     * @param file
     * @param data
     * @param append
     * @return
     */
    public static boolean write8bitIntBytes(File file,
                                            Integer data,
                                            boolean append) {
        FileOutputStream fos = null;
        DataOutputStream dos = null;
        try {
            fos = FileUtils.openOutputStream(file,
                                             append);
            dos = new DataOutputStream(fos);
            dos.writeByte(data.intValue());
            dos.flush();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } finally {
            IOUtils.closeQuietly(fos);
            IOUtils.closeQuietly(dos);
        }
    }
    
    public static boolean writeASCIIStringBytes(File file,
                                                String data) {
        return writeASCIIStringBytes(file,
                                     data,
                                     true);
    }
    
    /**
     * 写ASCII的字符串，如果传递一个包含UTF-8的字符串，写入结果将是错误的 <br>
     * 
     * @param file
     * @param data
     * @param append
     * @return
     */
    public static boolean writeASCIIStringBytes(File file,
                                                String data,
                                                boolean append) {
        FileOutputStream fos = null;
        DataOutputStream dos = null;
        try {
            fos = FileUtils.openOutputStream(file,
                                             append);
            dos = new DataOutputStream(fos);
            dos.writeBytes(data);
            dos.flush();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } finally {
            IOUtils.closeQuietly(fos);
            IOUtils.closeQuietly(dos);
        }
    }
    
    public static boolean writeUTF8StringBytes(File file,
                                               String data) {
        return writeUTF8StringBytes(file,
                                    data,
                                    true);
    }
    
    /**
     * 写入UTF-8编码的字符串，更加通用 <br>
     * 
     * @param file
     * @param data
     * @param append
     * @return
     */
    public static boolean writeUTF8StringBytes(File file,
                                               String data,
                                               boolean append) {
        FileOutputStream fos = null;
        DataOutputStream dos = null;
        try {
            fos = FileUtils.openOutputStream(file,
                                             append);
            dos = new DataOutputStream(fos);
            dos.write(data.getBytes("UTF-8"));
            dos.flush();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } finally {
            IOUtils.closeQuietly(fos);
            IOUtils.closeQuietly(dos);
        }
    }
    
    public static boolean writeTQChestBoxBytes(File file,
                                               TQChestBox box) {
        //
        for (Integer c : box.getCount()) {
            write8bitIntBytes(file,
                              c);
        }
        //
        for (TQChestItem item : box.getItems()) {
            writeTQChestItemBytes(file,
                                  item);
        }
        return true;
    }
    
    /**
     * 追加一个Item <br>
     * 
     * @param file
     * @param item
     * @return
     */
    public static boolean writeTQChestItemBytes(File file,
                                                TQChestItem item) {
        return writeTQChestItemBytes(file,
                                     item,
                                     true);
    }
    
    public static boolean writeTQChestItemBytes(File file,
                                                TQChestItem item,
                                                boolean append) {
        //
        write32bitIntBytes(file,
                           item.getHead(),
                           append);
        //
        writeASCIIStringBytes(file,
                              item.getStackCount(),
                              append);
        //
        for (Integer s : item.getStack()) {
            write32bitIntBytes(file,
                               s,
                               append);
        }
        //
        writeASCIIStringBytes(file,
                              item.getBeginBlock(),
                              append);
        //
        for (Integer b : item.getBegin()) {
            write32bitIntBytes(file,
                               b,
                               append);
        }
        //
        writeASCIIStringBytes(file,
                              item.getBaseName(),
                              append);
        //
        for (Integer b : item.getBase()) {
            write8bitIntBytes(file,
                              b,
                              append);
        }
        //
        writeASCIIStringBytes(file,
                              item.getDbrFile(),
                              append);
        //
        write32bitIntBytes(file,
                           item.getTail(),
                           append);
        //
        writeASCIIStringBytes(file,
                              item.getPrefixName(),
                              append);
        //
        for (Integer p : item.getPrefix()) {
            write32bitIntBytes(file,
                               p,
                               append);
        }
        //
        writeASCIIStringBytes(file,
                              item.getSuffixName(),
                              append);
        //
        for (Integer s : item.getSuffix()) {
            write32bitIntBytes(file,
                               s,
                               append);
        }
        //
        writeASCIIStringBytes(file,
                              item.getRelicName(),
                              append);
        //
        for (Integer r : item.getRelic()) {
            write32bitIntBytes(file,
                               r,
                               append);
        }
        //
        writeASCIIStringBytes(file,
                              item.getRelicBonus(),
                              append);
        //
        for (Integer b : item.getBonus()) {
            write32bitIntBytes(file,
                               b,
                               append);
        }
        //
        writeASCIIStringBytes(file,
                              item.getSeed(),
                              append);
        //
        for (Integer s : item.getSd()) {
            write32bitIntBytes(file,
                               s,
                               append);
        }
        //
        writeASCIIStringBytes(file,
                              item.getVar1(),
                              append);
        //
        for (Integer v : item.getVr()) {
            write32bitIntBytes(file,
                               v,
                               append);
        }
        //
        writeASCIIStringBytes(file,
                              item.getEndBlock(),
                              append);
        //
        for (Integer e : item.getEnd()) {
            write32bitIntBytes(file,
                               e,
                               append);
        }
        //
        writeASCIIStringBytes(file,
                              item.getxOffset(),
                              append);
        //
        for (Integer x : item.getX()) {
            write8bitIntBytes(file,
                              x,
                              append);
        }
        //
        writeASCIIStringBytes(file,
                              item.getyOffset(),
                              append);
        //
        for (Integer y : item.getY()) {
            write8bitIntBytes(file,
                              y,
                              append);
        }
        return true;
    }
    
}
