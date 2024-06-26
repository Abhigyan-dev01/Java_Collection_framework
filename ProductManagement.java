import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Productid
{
	int prod_id;
	String prod_name;
	String prod_type;
	int price;

  public Productid(int prod_id,String prod_name,String prod_type,int price)
		{
		this.prod_id=prod_id;
		this.prod_name=prod_name;
		this.prod_type=prod_type;
		this.price=price;
	}

	@Override
	public String toString() {
		return "[prod_id=" + prod_id + ", prod_name=" + prod_name + ", prod_type=" + prod_type + ", price="
				+ price + "]";
	}	
}

public class ProdcutManagenment {
	public static void main(String []args) throws Exception
	{

		List<Productid>  products = new ArrayList<>();
		products.add(new Productid(1,"prod1","type1",55));
		products.add(new Productid(2, "prod2" ,"type1",25));
		products.add(new Productid(3, "prod3" ,"type2",100));
		products.add(new Productid(4, "prod4" ,"type3",155));
		products.add(new Productid(5, "prod5" ,"type1",1));
		products.add(new Productid(6, "prod6" ,"type2",12));
		products.add(new Productid(7, "prod7" ,"type3",654));
		products.add(new Productid(8, "prod8" ,"type1",123));
		products.add(new Productid(9, "prod9" ,"type2",1));
		products.add(new Productid(10, "prod10" ,"type3",87));
		
		
		Map<String,List<Productid>> mappedProducts=new HashMap<>();
		
		for(int i=0;i<products.size();i++)
		{ if(products.get(i).price<100)
		{
			continue;
		}
			if(mappedProducts.containsKey(products.get(i).prod_type))
			{
				mappedProducts.get(products.get(i).prod_type).add(products.get(i));
			}
			else {
				ArrayList<Productid> temp = new ArrayList<>();
				temp.add(products.get(i));
				mappedProducts.put(products.get(i).prod_type,temp);
			}
		}
		for(String key: mappedProducts.keySet())
		{
		System.out.println("Product Type : "+key+" Products->"+mappedProducts.get(key).toString());
	}}

}
