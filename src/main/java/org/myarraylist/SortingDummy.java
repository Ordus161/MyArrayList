package org.myarraylist;

public class SortingDummy implements Comparable<SortingDummy>{
    private int id;
    private String dummyName;

    public SortingDummy(int id) {
        this.id = id;
        this.dummyName = "Dummy " + this.id;
    }

    public int getId() {
        return id;
    }


    public String getDummyName() {
        return dummyName;
    }

    @Override
    public int compareTo(SortingDummy sortingDummy){
        int res = 0;
        if(this.id < sortingDummy.getId()) {
            res = -1;
        }
        if(this.id > sortingDummy.getId()) {
            res = 1;
        }
        return res;
    }

}
