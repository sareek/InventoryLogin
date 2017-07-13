
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
class Items2 {
    private int index_no, quantity;
    private String  item,faculty;
    private Float price,unit_price,total;
    java.sql.Timestamp datetime = new java.sql.Timestamp(new java.util.Date().getTime());
    
    public Items2(int index_no, String item, int quantity, Float unit_price, Float total, Timestamp datetime)
    {
        this.index_no=index_no;
        this.item=item;
        this.quantity=quantity;
        this.unit_price=unit_price;
        this.total=total;
        this.datetime=datetime;
      
    }
    
    public int getindex_no(){
        return index_no;
    }
     public String getitem(){
        return item;
    }
       public int getquantity(){
        return quantity;
    }
      
       public Float getunit_price(){
        return unit_price;
    }
       public Float gettotal(){
        return total;
    }
        public Timestamp getdatetime(){
        return datetime;
    }
     
     
}
