package com.itq.box;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.itq.box.domain.TQChestBox;
import com.itq.box.domain.TQChestWeapon;
import com.itq.box.util.PathUtil;
import com.itq.box.util.TQChestUtil;

public class CreateBatchTQChestBox {
    //
    // private static final String SCAN_DIRECTORY =
    // "D:\\game\\THQ\\database\\records\\xpack\\item\\equipmentweapons\\shield";
    //
    // private static final String PATH_PREFIX =
    // "C:\\Users\\shengjie\\Documents\\My Games\\Titan Quest - Immortal Throne\\SaveData\\Sys\\储物仓库\\shield\\tqit\\shield_";

    private static final String SCAN_DIRECTORY = "D:\\game\\THQ\\database\\records\\item\\equipmentshield";

    private static final String PATH_PREFIX    = "C:\\Users\\shengjie\\Documents\\My Games\\Titan Quest - Immortal Throne\\SaveData\\Sys\\储物仓库\\shield\\tq\\shield_";

    private static final String PATH_SUFFIX    = ".TQChest";

    public static void main(String[] args) {
        //
        Collection<String> records = PathUtil.getRecords(SCAN_DIRECTORY, false);
        //
        String[] result = new String[records.size()];
        records.toArray(result);
        //
        int index = 0;
        int batch = 0;
        List<String> dbrs = null;
        TQChestBox box = null;
        while (index < result.length) {
            //
            if (index % TQChestWeapon.SHIELD.getMax() == 0) {
                //
                if (dbrs != null) {
                    box = new TQChestBox();
                    box.addBatchItems(dbrs, TQChestWeapon.SHIELD);
                    File file = new File(PATH_PREFIX + batch + PATH_SUFFIX);
                    TQChestUtil.writeTQChestBoxBytes(file, box);
                    batch++;
                }
                //
                dbrs = new ArrayList<>();
            }
            //
            dbrs.add(result[index++]);
        }
        //
        if (!dbrs.isEmpty()) {
            box = new TQChestBox();
            box.addBatchItems(dbrs, TQChestWeapon.SHIELD);
            File file = new File(PATH_PREFIX + batch + PATH_SUFFIX);
            TQChestUtil.writeTQChestBoxBytes(file, box);
        }
    }
}
