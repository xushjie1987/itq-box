package com.itq.box.util;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

public class PathUtil {
    public static String getAbsolutePath(String path) {
        return new File(path).getAbsolutePath();
    }

    public static boolean isDirectory(String path) {
        return new File(path).getAbsoluteFile().isDirectory();
    }

    public static Collection<File> getFiles(String path, String[] extensions, boolean recursive) {
        if (isDirectory(path)) {
            return FileUtils.listFiles(new File(path).getAbsoluteFile(), extensions, recursive);
        } else {
            Collection<File> result = new ArrayList<File>();
            if (FilenameUtils.isExtension(new File(path).getAbsolutePath().toLowerCase(), extensions)) {
                result.add(new File(path).getAbsoluteFile());
                return result;
            } else {
                return result;
            }
        }
    }

    public static Collection<String> getAbsolutePaths(String path, String[] extensions, boolean recursive) {
        Collection<File> files = getFiles(path, extensions, recursive);
        Collection<String> paths = new ArrayList<String>();
        for (File f : files) {
            paths.add(f.getAbsolutePath());
        }
        return paths;
    }

    public static Collection<String> getRecords(String path, boolean recursive) {
        Collection<String> paths = getAbsolutePaths(path, new String[] { "dbr" }, recursive);
        Collection<String> records = new ArrayList<String>();
        for (String p : paths) {
            records.add(p.substring(p.toLowerCase().indexOf("records")));
        }
        return records;
    }
}
