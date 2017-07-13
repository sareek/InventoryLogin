# InventoryLogin
Its a simple inventory system for record keeping of items purchased and available in different departments of a college. It can be used for inserting items, updating them also for searching items by name or faculty and to keep records of items purchased. It also has some other features you can check them out.



This inventory system uses mysql database and hence for its proper implementation one must have knowledge of its database and its design.
Basically, it uses database with name practise, yes i know correct spelling is practice but still database name is practise :) and it 
has two tables named items and purchased_items.


Now  I'm gonna give you a basic idea about the design of database you can follow this and set up your mysql database 
yourself, once you are done with that you can download the InventoryLogin save the file inside your projectsfile and open
it with JRE u r using, netbeans in this case.

items                                                                                                          
5 columns     type 						
1.index_no    int 							
2.item        string						
3.price       float														
4.quantity    int						
5.faculty     string						
								

purchased_item  
6 columns       type
1.index_no	int
2.item		string	
3.quantity	int
4.unit_price	float
5.total		float
6.datetime      DATETIME

Note: you can assign suitable size to these yourself. index_no is primary auto increment and not null.

THANK YOU HOPE THIS WILL BE HELPFUL.
If you need any help mail me at sareek007@gmail.com
