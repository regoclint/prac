package patterns;

import java.util.*;

//Inner classes
//Generics
//ArrayList wrapper to call iterator function
public class IteratorPattern {
    public static void main(String args[]) throws Exception {
        EmpList<Emp> empList = new EmpList<Emp>(new ArrayList<>());
        empList.add(new Emp(1));
        empList.add(new Emp(2));

        EmpList.EmpIterator itr = empList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        Emp emp4=new Emp(4);
        Emp emp5=new Emp(4);
        System.out.println(emp4.equals(emp5));
        System.out.println(emp4.hashCode());
        System.out.println(emp5.hashCode());
        System.out.println("------");
        HashSet hashSet=new HashSet();
        hashSet.add(emp4);
        hashSet.add(emp5);
        System.out.println(hashSet);
    }
}

class EmpList<T> {

    ArrayList<T> data;

    public EmpList(ArrayList<T> data) {
         this.data= data;
    }

    public void add(T emp) {
        data.add(emp);
    }

    public EmpIterator<T> iterator() {
        return new EmpIterator<T>();
    }

    class EmpIterator<T> implements Iterator<T> {
        int currentIndex = 0;//belongs to an iterator

        public boolean hasNext() {
            return currentIndex < data.size();
        }

        public T next() {
            return (T) data.get(currentIndex++);
        }

        //this is rubbish
        @Override
        public void remove() {
            if(data.size()>0) {
                if (currentIndex > 0)
                    data.remove(currentIndex - 1);
                if(currentIndex==0) data.remove(0);
            }
        }
    }
}

class Emp {
    int id;
    String firstName;
    String lastName;
    double salary;

    public Emp(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("equals");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return id == emp.id;
    }

    @Override
    public int hashCode() {
        System.out.println("hash");
        return Objects.hash(id);//if hash is different then equals is not checked
    }
}







