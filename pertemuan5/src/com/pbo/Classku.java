package com.pbo;

public class Classku {
    public int x=5;//attribut ini tidak boleh diakses secara langsung dari lluar classku
    int y = 15;
    private int z = 20;

    //method
    public int tampilkanZ(){
        return this.z;
    }
}
