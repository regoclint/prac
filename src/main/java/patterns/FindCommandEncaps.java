package patterns;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
In this technique the Filter interface is assigned in each FilterType
thus making it a responsibility of the person writing a new Filter type to assign Filter to it
This can make it error prone.
 **/
interface Filter3
{
    List<File3> listFiles();
}

enum FileType3 
{
    xml,
    log,
    java
}
enum Permission3 {
    READ_ONLY,
    WRITE_ONLY,
    EXEC_ONLY,
}

class File3 {
    String name;
    int size;
    FileType3 type;
    Permission3 perm;
    File3(String name,
          int size,
          FileType3 type){
        this.name=name;
        this.size=size;
        this.type=type;

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
class NoFilter3 implements Filter3 {
    public NoFilter3() {
    }

    public List<File3> listFiles(){
        File3 filea=new File3("a",7, FileType3.xml);
        File3 fileb=new File3("b",8, FileType3.log);
        File3 filec=new File3("c",2, FileType3.xml);
        File3 filed=new File3("d",9, FileType3.xml);
        File3 filee=new File3("e",10, FileType3.java);
        ArrayList<File3> file3List =new ArrayList<>();
        file3List.add(filea);
        file3List.add(fileb);
        file3List.add(filec);
        file3List.add(filed);
        file3List.add(filee);
        return file3List;
    }
}

class TypeFilter3 extends NoFilter3 {

    Filter3 filter;
    public TypeFilter3(Filter3 filter) {
        this.filter=filter;
    }

    @Override
    public List<File3> listFiles() {
        ArrayList<File3> file3List = (ArrayList<File3>) filter.listFiles();
        Iterator<File3> itr= file3List.iterator();
        while(itr.hasNext()){
            File3 file3 =itr.next();
            if(!(file3.type.equals(FileType3.xml) || file3.type.equals(FileType3.log)))
                itr.remove();
        }
        return file3List;
    }
}

class SizeFilter3 extends NoFilter3 {
    Filter3 filter;
    public SizeFilter3(Filter3 filter) {
        this.filter=filter;
    }

    @Override
    public List<File3> listFiles() {
        ArrayList<File3> file3List = (ArrayList<File3>) filter.listFiles();
        Iterator<File3> itr= file3List.iterator();
        while(itr.hasNext()){
            File3 file3 =itr.next();
            if(file3.size <=5)
                itr.remove();
        }
        return file3List;
    }
}

class PermissionFilter3 extends NoFilter3 {

    Filter3 filter;
    public PermissionFilter3(Filter3 filter) {
        this.filter=filter;
    }

    @Override
    public List<File3> listFiles() {
        ArrayList<File3> file3List = (ArrayList<File3>) filter.listFiles();
        Iterator<File3> itr= file3List.iterator();
        while(itr.hasNext()){
            File3 file3 =itr.next();
            if(file3.perm.equals(Permission3.READ_ONLY))
                itr.remove();
        }
        return file3List;
    }

}
public class FindCommandEncaps {
    public static void main(String[] args) {

        SizeFilter3 sizeFilter = new SizeFilter3(new NoFilter3());
        TypeFilter3 typeFilter = new TypeFilter3(sizeFilter);
        System.out.println(typeFilter.listFiles());
    }
}
