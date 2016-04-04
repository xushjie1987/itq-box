package com.itq.box.domain;

import java.util.ArrayList;
import java.util.Collection;

public enum TQChestWeapon {
    // 臂
    ARMBAND(2, 4),
    // 斧
    AXE(2, 4),
    // 弓
    BOW(2, 4),
    // 锤
    CLUB(2, 4),
    // 腿
    GREAVES(2, 4),
    // 冠
    HELM(2, 4),
    // 盾
    SHIELD(2, 3),
    // 矛
    SPEAR(2, 4),
    // 杖
    STAFF(2, 4),
    // 剑
    SWORD(2, 4),
    // 胸
    ARMOR(2, 4),
    // 饰
    AMULET(2, 4),
    // 戒
    RING(2, 4),
    // 卷
    SCROLL(2, 4);

    private final Integer width;

    private final Integer height;

    private final Integer max;

    private TQChestWeapon(Integer width, Integer height) {
        this.width = width;
        this.height = height;
        this.max = (TQChestBox.MAX_ROW / height) * (TQChestBox.MAX_COL / width);
    }

    public Collection<Integer> getRowIndexes() {
        Collection<Integer> indexes = new ArrayList<>();
        int row = 0;
        while (row < TQChestBox.MAX_ROW) {
            indexes.add(row);
            row += height;
        }
        return indexes;
    }

    public Collection<Integer> getColIndexes() {
        Collection<Integer> indexes = new ArrayList<>();
        int col = 0;
        while (col < TQChestBox.MAX_COL) {
            indexes.add(col);
            col += width;
        }
        return indexes;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getMax() {
        return max;
    }

}
