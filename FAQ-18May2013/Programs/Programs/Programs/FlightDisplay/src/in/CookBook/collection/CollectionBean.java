package in.CookBook.collection;

public class CollectionBean implements Comparable<CollectionBean> {

private String id;
private String name;

public CollectionBean() {

}

public CollectionBean(String id, String name) {
this.id = id;
this.name = name;
}

public int compareTo(CollectionBean bean) {
// TODO Auto-generated method stub
if (!(bean instanceof CollectionBean)) {
throw new ClassCastException(
"Bean object is not a instance of CollecionBean");
}
return bean.getName().compareToIgnoreCase(this.name);
}/*Hi santhoskumara,

I observed that there is a fault in your CollectionBean class which is avoiding the list to 
find duplicates. Actually You overloaded the equals() and hashcode() methods,which are needs
 to override to avoid duplicate entries.

As per Java contract if two objects are said equal then the hashcode returned by the both 
object should be same.

I would recommend you to replace your equals() and hashCode() methods code with the following 
code then your application will execute.

public boolean equals(Object bean) {
if((bean instanceof CollectionBean)&&
(this.getId().equals(((CollectionBean)bean).getId( ))&
this.getName().equals(((CollectionBean)bean).getNa me())))
return true;
else
return false;
}

public int hashCode() {

int temp = (31) * 1
+ (this.getName() == null ? 0 : this.getName().hashCode())
+ (this.getId() == null ? 0 : this.getId().hashCode());
return temp;
}   Reply With Quote .
*/
public boolean equals(Object bean) {
	if((bean instanceof CollectionBean)&&
			(this.getId().equals(((CollectionBean)bean).getId( ))&
			this.getName().equals(((CollectionBean)bean).getName()))){
		//System.out.println("=========="+this.getId());
		//System.out.println("------------"+((CollectionBean)bean).getId());
			return true;}
			else
			return false;
			}
/*  previous code
 * public boolean equals(CollectionBean bean) {
System.out.println("idd--->" + bean.getId());
return(this.getId().equals(bean.getId())
&& this.getName().equalsIgnoreCase(bean.getName())) ;

}*/

public int hashCode(CollectionBean bean) {

int temp = (31) * 1
+ (bean.getName() == null ? 0 : bean.getName().hashCode())
+ (bean.getId() == null ? 0 : bean.getId().hashCode());
return temp;
}

public String getId() {
return id;
}

public void setId(String id) {
this.id = id;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

}

