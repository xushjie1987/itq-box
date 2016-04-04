package com.itq.box.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TQChestBox {
    public static final Integer     MAX_ROW  = 12;

    public static final Integer     MAX_COL  = 6;

    public static final Integer[][] STEP_X_Y = new Integer[][] {
                                             // 1
                                             { 0x00, 0x00 },
                                             // 2
                                             { 0x80, 0x3F },
                                             // 3
                                             { 0x00, 0x40 },
                                             // 4
                                             { 0x40, 0x40 },
                                             // 5
                                             { 0x80, 0x40 },
                                             // 6
                                             { 0xA0, 0x40 },
                                             // 7
                                             { 0xC0, 0x40 },
                                             // 8
                                             { 0xE0, 0x40 },
                                             // 9
                                             { 0x00, 0x41 },
                                             // 10
                                             { 0x10, 0x41 },
                                             // 11
                                             { 0x20, 0x41 },
                                             // 12
                                             { 0x30, 0x41 } };
    private int[][]                 boxMap   = new int[][] {
                                             // 1
                                             { 0, 0, 0, 0, 0, 0 },
                                             // 2
                                             { 0, 0, 0, 0, 0, 0 },
                                             // 3
                                             { 0, 0, 0, 0, 0, 0 },
                                             // 4
                                             { 0, 0, 0, 0, 0, 0 },
                                             // 5
                                             { 0, 0, 0, 0, 0, 0 },
                                             // 6
                                             { 0, 0, 0, 0, 0, 0 },
                                             // 7
                                             { 0, 0, 0, 0, 0, 0 },
                                             // 8
                                             { 0, 0, 0, 0, 0, 0 },
                                             // 9
                                             { 0, 0, 0, 0, 0, 0 },
                                             // 10
                                             { 0, 0, 0, 0, 0, 0 },
                                             // 11
                                             { 0, 0, 0, 0, 0, 0 },
                                             // 12
                                             { 0, 0, 0, 0, 0, 0 } };

    private Integer[]               count    = new Integer[] { 0, 0, 0, 0 };

    private List<TQChestItem>       items    = new ArrayList<>();

    /**
     * 添加一组相同类型的装备 <br>
     * 
     * @param dbrs
     * @param weapon
     * @return
     */
    public boolean addBatchItems(List<String> dbrs, TQChestWeapon weapon) {
        //
        items.clear();
        //
        Collection<Integer> rows = weapon.getRowIndexes();
        //
        Collection<Integer> cols = weapon.getColIndexes();
        //
        int index = 0;
        for (Integer r : rows) {
            for (Integer c : cols) {
                //
                if (index < dbrs.size()) {
                    //
                    String dbr = dbrs.get(index++);
                    //
                    TQChestItem item = new TQChestItem();
                    //
                    item.setDbrFile(dbr);
                    //
                    item.setPosition(STEP_X_Y[c][0], STEP_X_Y[c][1], STEP_X_Y[r][0], STEP_X_Y[r][1]);
                    //
                    items.add(item);
                    //
                    count[0]++;
                }
            }
        }
        return true;
    }

    public Integer[] getCount() {
        return count;
    }

    public void setCount(Integer[] count) {
        this.count = count;
    }

    public List<TQChestItem> getItems() {
        return items;
    }

    public void setItems(List<TQChestItem> items) {
        this.items = items;
    }

    public int[][] getBoxMap() {
        return boxMap;
    }

    public void setBoxMap(int[][] boxMap) {
        this.boxMap = boxMap;
    }

}
