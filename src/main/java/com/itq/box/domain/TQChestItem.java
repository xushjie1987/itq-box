package com.itq.box.domain;

import java.util.HashMap;
import java.util.Map;

public class TQChestItem {
    private static final Map<String, Integer> itBaseNameMap = new HashMap<String, Integer>();

    private static final Map<String, Integer> baseNameMap   = new HashMap<String, Integer>();

    private Integer                           head          = 0x0A000000;

    private String                            stackCount    = "stackCount";

    private Integer[]                         stack         = new Integer[] { 0x00000000, 0x0B000000 };

    private String                            beginBlock    = "begin_block";

    private Integer[]                         begin         = new Integer[] { 0xCEFA1DB0, 0x08000000 };

    private String                            baseName      = "baseName";

    private Integer[]                         base          = new Integer[] { 0, 0, 0, 0 };

    private String                            dbrFile       = "";

    private Integer                           tail          = 0x0A000000;

    private String                            prefixName    = "prefixName";

    private Integer[]                         prefix        = new Integer[] { 0x00000000, 0x0A000000 };

    private String                            suffixName    = "suffixName";

    private Integer[]                         suffix        = new Integer[] { 0x00000000, 0x09000000 };

    private String                            relicName     = "relicName";

    private Integer[]                         relic         = new Integer[] { 0x00000000, 0x0A000000 };

    private String                            relicBonus    = "relicBonus";

    private Integer[]                         bonus         = new Integer[] { 0x00000000, 0x04000000 };

    private String                            seed          = "seed";

    private Integer[]                         sd            = new Integer[] { 0x00000000, 0x04000000 };

    private String                            var1          = "var1";

    private Integer[]                         vr            = new Integer[] { 0x00000000, 0x09000000 };

    private String                            endBlock      = "end_block";

    private Integer[]                         end           = new Integer[] { 0xDEC0ADDE, 0x07000000 };

    private String                            xOffset       = "xOffset";

    private Integer[]                         x             = new Integer[] { 0, 0, 0, 0, 7, 0, 0, 0 };

    private String                            yOffset       = "yOffset";

    private Integer[]                         y             = new Integer[] { 0, 0, 0, 0 };

    /**
     * 初始化映射条目 <br>
     */
    static {
        // tqit
        itBaseNameMap.put("^m_.+\\.dbr$", 0x2B); // m_e_arachnos.dbr
        itBaseNameMap.put("^egyptslavehat.*\\.dbr$", 0x2C); // egyptslavehat.dbr
        itBaseNameMap.put("^femalenpchair.*\\.dbr$", 0x2E); // femalenpchair01.dbr
        itBaseNameMap.put("^um_.+\\.dbr$", 0x32); // um_e_orpheusgarland.dbr
        itBaseNameMap.put("^usm_.+\\.dbr$", 0x36); // usm_e_raimentofthestorm.dbr
        itBaseNameMap.put("^u_.+_.+\\.dbr$", 0x36); // u_e_001.dbr
        itBaseNameMap.put("^us_.+\\.dbr$", 0x37); // us_l_001.dbr
        itBaseNameMap.put("^z_santa.*\\.dbr$", 0x38); // z_santa01.dbr
        itBaseNameMap.put("^z_france.*\\.dbr$", 0x39); // z_france01.dbr
        itBaseNameMap.put("^z_germany.*\\.dbr$", 0x3A); // z_germany01.dbr
        itBaseNameMap.put("^c\\d*_.+\\.dbr$", 0x3B); // c01_shield01.dbr
        itBaseNameMap.put("^mi_.+\\.dbr$", 0x3C); // mi_n_formicid.dbr
        itBaseNameMap.put("^u_[^_]+\\.dbr$", 0x40); // u_shield03prtdeco.dbr
        // tq
        baseNameMap.put("^c\\d*_.+\\.dbr$", 0x2D); // c01_shield01.dbr
        baseNameMap.put("^mi_e_.+\\.dbr$", 0x2D); // mi_e_formicid.dbr
        baseNameMap.put("^mi_l_.+\\.dbr$", 0x2E); // mi_l_formicid.dbr
        baseNameMap.put("^mi_n_.+\\.dbr$", 0x2D); // mi_n_formicid.dbr
        baseNameMap.put("^us_e_.+\\.dbr$", 0x32); // us_e_001.dbr
        baseNameMap.put("^us_l_.+\\.dbr$", 0x38); // us_l_001.dbr
        baseNameMap.put("^us_n_.+\\.dbr$", 0x37); // us_n_001.dbr

        baseNameMap.put("^m_.+\\.dbr$", 0x2B); // m_e_arachnos.dbr
        baseNameMap.put("^egyptslavehat.*\\.dbr$", 0x2C); // egyptslavehat.dbr
        baseNameMap.put("^femalenpchair.*\\.dbr$", 0x2E); // femalenpchair01.dbr
        baseNameMap.put("^um_.+\\.dbr$", 0x32); // um_e_orpheusgarland.dbr
        baseNameMap.put("^usm_.+\\.dbr$", 0x36); // usm_e_raimentofthestorm.dbr
        baseNameMap.put("^u_.+_.+\\.dbr$", 0x33); // u_e_001.dbr
        baseNameMap.put("^z_santa.*\\.dbr$", 0x38); // z_santa01.dbr
        baseNameMap.put("^z_france.*\\.dbr$", 0x39); // z_france01.dbr
        baseNameMap.put("^z_germany.*\\.dbr$", 0x3A); // z_germany01.dbr
        baseNameMap.put("^u_[^_]+\\.dbr$", 0x40); // u_shield03prtdeco.dbr
    }

    /**
     * (x1, x2) <br>
     * (y1, y2) <br>
     * 
     * 0, 0, x1, x2, 7, 0, 0, 0 <br>
     * 0, 0, y1, y2 <br>
     * 
     * @param x1
     * @param x2
     * @param y1
     * @param y2
     */
    public void setPosition(Integer x1, Integer x2, Integer y1, Integer y2) {
        //
        x[2] = x1;
        x[3] = x2;
        //
        y[2] = y1;
        y[3] = y2;
    }

    public Integer getHead() {
        return head;
    }

    public void setHead(Integer head) {
        this.head = head;
    }

    public String getStackCount() {
        return stackCount;
    }

    public void setStackCount(String stackCount) {
        this.stackCount = stackCount;
    }

    public Integer[] getStack() {
        return stack;
    }

    public void setStack(Integer[] stack) {
        this.stack = stack;
    }

    public String getBeginBlock() {
        return beginBlock;
    }

    public void setBeginBlock(String beginBlock) {
        this.beginBlock = beginBlock;
    }

    public Integer[] getBegin() {
        return begin;
    }

    public void setBegin(Integer[] begin) {
        this.begin = begin;
    }

    public String getBaseName() {
        return baseName;
    }

    public void setBaseName(String baseName) {
        this.baseName = baseName;
    }

    public Integer[] getBase() {
        return base;
    }

    public void setBase(Integer[] base) {
        this.base = base;
    }

    public String getDbrFile() {
        return dbrFile;
    }

    /**
     * 设置dbr名称和baseName的第1个字段
     * 
     * @param dbrFile
     */
    public void setDbrFile(String dbrFile) {
        this.dbrFile = dbrFile;
        String fileName = dbrFile.split("\\\\")[dbrFile.split("\\\\").length - 1];
        if (dbrFile.toLowerCase().contains("xpack")) {
            // tqit
            for (String regex : itBaseNameMap.keySet()) {
                if (fileName.matches(regex)) {
                    this.base[0] = itBaseNameMap.get(regex);
                    break;
                }
            }
        } else {
            // tq
            for (String regex : baseNameMap.keySet()) {
                if (fileName.matches(regex)) {
                    this.base[0] = baseNameMap.get(regex);
                    break;
                }
            }
        }
        if (this.base[0].intValue() == 0) {
            throw new IllegalArgumentException("ERROR:{" + fileName + "} is an unexpected item file name.");
        }
    }

    public Integer getTail() {
        return tail;
    }

    public void setTail(Integer tail) {
        this.tail = tail;
    }

    public String getPrefixName() {
        return prefixName;
    }

    public void setPrefixName(String prefixName) {
        this.prefixName = prefixName;
    }

    public Integer[] getPrefix() {
        return prefix;
    }

    public void setPrefix(Integer[] prefix) {
        this.prefix = prefix;
    }

    public String getSuffixName() {
        return suffixName;
    }

    public void setSuffixName(String suffixName) {
        this.suffixName = suffixName;
    }

    public Integer[] getSuffix() {
        return suffix;
    }

    public void setSuffix(Integer[] suffix) {
        this.suffix = suffix;
    }

    public String getRelicName() {
        return relicName;
    }

    public void setRelicName(String relicName) {
        this.relicName = relicName;
    }

    public Integer[] getRelic() {
        return relic;
    }

    public void setRelic(Integer[] relic) {
        this.relic = relic;
    }

    public String getRelicBonus() {
        return relicBonus;
    }

    public void setRelicBonus(String relicBonus) {
        this.relicBonus = relicBonus;
    }

    public Integer[] getBonus() {
        return bonus;
    }

    public void setBonus(Integer[] bonus) {
        this.bonus = bonus;
    }

    public String getSeed() {
        return seed;
    }

    public void setSeed(String seed) {
        this.seed = seed;
    }

    public Integer[] getSd() {
        return sd;
    }

    public void setSd(Integer[] sd) {
        this.sd = sd;
    }

    public String getVar1() {
        return var1;
    }

    public void setVar1(String var1) {
        this.var1 = var1;
    }

    public Integer[] getVr() {
        return vr;
    }

    public void setVr(Integer[] vr) {
        this.vr = vr;
    }

    public String getEndBlock() {
        return endBlock;
    }

    public void setEndBlock(String endBlock) {
        this.endBlock = endBlock;
    }

    public Integer[] getEnd() {
        return end;
    }

    public void setEnd(Integer[] end) {
        this.end = end;
    }

    public String getxOffset() {
        return xOffset;
    }

    public void setxOffset(String xOffset) {
        this.xOffset = xOffset;
    }

    public Integer[] getX() {
        return x;
    }

    public void setX(Integer[] x) {
        this.x = x;
    }

    public String getyOffset() {
        return yOffset;
    }

    public void setyOffset(String yOffset) {
        this.yOffset = yOffset;
    }

    public Integer[] getY() {
        return y;
    }

    public void setY(Integer[] y) {
        this.y = y;
    }

}
