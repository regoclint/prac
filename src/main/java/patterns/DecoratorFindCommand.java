package patterns;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * In this technique the Filter interface is assigned to the base class of each FilterType
 * thus making it a must.
 * To have a constructor that takes an instance of the same abstract class, that's the recognition key of the decorator pattern
 **/


enum FileType {
    xml,
    log,
    java
}

enum Permission {
    READ_ONLY,
    WRITE_ONLY,
    EXEC_ONLY,
}

class File {
    String name;
    int size;
    FileType type;
    Permission perm;

    File(String name,
         int size,
         FileType type) {
        this.name = name;
        this.size = size;
        this.type = type;

    }
//    Boolean isDirectory(){}

    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", type=" + type +
                '}';
    }
}

interface Filter {
    List<File> listFiles();
}

//decorator class
abstract class FilterType implements Filter {
    Filter filter;

    public FilterType(Filter filter) {
        this.filter = filter;
    }

    @Override
    public List<File> listFiles() {
        return filter.listFiles();
    }

}

class NoFilter implements Filter {

    public List<File> listFiles() {
        File filea = new File("a", 7, FileType.xml);
        File fileb = new File("b", 8, FileType.log);
        File filec = new File("c", 2, FileType.xml);
        File filed = new File("d", 9, FileType.xml);
        File filee = new File("e", 10, FileType.java);
        ArrayList<File> fileList = new ArrayList<>();
        fileList.add(filea);
        fileList.add(fileb);
        fileList.add(filec);
        fileList.add(filed);
        fileList.add(filee);
        return fileList;
    }
}

class TypeFilter extends FilterType {
    HashSet<FileType> fileTypeSet;

    public TypeFilter(Filter filter, FileType... type) {
        super(filter);
        fileTypeSet = new HashSet<>();
        for (FileType fileType : type)
            fileTypeSet.add(fileType);
    }

    @Override
    public List<File> listFiles() {
        ArrayList<File> fileList = (ArrayList<File>) super.listFiles();
        if (fileTypeSet.size() == 0) return fileList;
        Iterator<File> itr = fileList.iterator();
        while (itr.hasNext()) {
            File file = itr.next();
            if (!(fileTypeSet.contains(file.type)))
                itr.remove();
        }
        return fileList;
    }
}

class SizeFilter extends FilterType {
    Integer size = 0;

    public SizeFilter(Filter filter, Integer size) {
        super(filter);
        this.size = size;
    }

    @Override
    public List<File> listFiles() {
        ArrayList<File> fileList = (ArrayList<File>) super.listFiles();
        if (size == null) return fileList;
        Iterator<File> itr = fileList.iterator();
        while (itr.hasNext()) {
            File file = itr.next();
            if (file.size <= size)
                itr.remove();
        }
        return fileList;
    }
}

class PermissionFilter extends FilterType {
    Permission perm;
    public PermissionFilter(Filter filter,Permission perm) {
        super(filter);
        this.perm=perm;
    }

    @Override
    public List<File> listFiles() {
        ArrayList<File> fileList = (ArrayList<File>) super.listFiles();
        if (perm == null) return fileList;
        Iterator<File> itr = fileList.iterator();
        while (itr.hasNext()) {
            File file = itr.next();
            if (file.perm.equals(Permission3.READ_ONLY))
                itr.remove();
        }
        return fileList;
    }

}

public class DecoratorFindCommand {
    public static void main(String[] args) throws IOException {

        DecoratorFindCommand decoratorFindCommand = new DecoratorFindCommand();
        System.out.println(decoratorFindCommand.find(7, null, FileType.log, FileType.xml));

        NoFilter noFilter = new NoFilter();
        System.out.println(noFilter.listFiles().stream()
                .filter(file -> file.size > 7)
                .filter(file -> file.type.equals(FileType.log) || file.type.equals(FileType.xml))
                .collect(Collectors.toList()));

    }

    public List<File> find(Integer size, Permission permission, FileType... type) {
        Filter filter = new NoFilter();
        filter = new SizeFilter(filter, size);
        filter = new TypeFilter(filter, type);
        filter = new PermissionFilter(filter,permission);
        return filter.listFiles();
    }
}
