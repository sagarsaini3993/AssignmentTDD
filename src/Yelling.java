
public class Yelling {
	
	
	
	public String scream(String[] name) {
		
		String nam = "";
		//Nobody is yelling
		if (name[0] == "") {
			return "Nobody is yelling";
		}
		//Upper caes is yelling
		else if (name[0] == name[0].toUpperCase()) {
			return name[0]+" IS YELLING";			
		}
		
			//Two and more than two are yelling	
		else if (name.length >= 2) {
			String upper = "hola";
			System.out.println(name.length);
		
			for (int i = 0; i <name.length; i++) {
				System.out.println(name[i]);
				if (name[i] == name[i].toUpperCase()) {
					upper = name[i];
				System.out.println("Upper is "+upper);
				}
				
				nam = nam + name[i];
				if(i<(name.length)-1)
				{
					nam = nam + " , ";
				}
				if(i==(name.length)-2)
				{
					nam = nam + " and ";
				
				}
				
			}
			if(upper.toUpperCase() == upper)
			{
				return nam + " are yelling,So is "+upper;
			}
			return nam +" are yelling";
		}
		//One is yelling
		return name[0]+" is yelling";
	}

}
