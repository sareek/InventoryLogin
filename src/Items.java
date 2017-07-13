
import java.sql.Timestamp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saree
 */
class Items {
    private int index_no, quantity;
    private String  item,faculty;
    private Float price,unitprice,total;
    java.sql.Timestamp datetime = new java.sql.Timestamp(new java.util.Date().getTime());
    
    public Items(int index_no, String item, Float price, int quantity, String faculty)
    {
        this.index_no=index_no;
        this.item=item;
        this.unitprice=unitprice;
        this.total=total;
        this.datetime=datetime;
        this.price=price;
        this.quantity=quantity;
        this.faculty=faculty;
    }

    Items(int aInt, String string, int aInt0, float aFloat, float aFloat0, Timestamp timestamp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getindex_no(){
        return index_no;
    }
     public String getitem(){
        return item;
    }
      public Float getprice(){
        return price;
    }
       public Float getunitprice(){
        return unitprice;
    }
       public Float gettotal(){
        return total;
    }
        public Timestamp getdatetime(){
        return datetime;
    }
       public int getquantity(){
        return quantity;
    }
        public String getfaculty(){
        return faculty;
    }
    
}
