//overloading of append method 
class Test{
	public static void main(String[] args){
		StringBuffer sb = new StringBuffer();
		sb.append("The Pi Value is :");   // public StringBuffer append(String s);  
		sb.append(3.14);                   //public StringBuffer append(double d);   

		sb.append(" The value is ");		
		sb.append(true);					// public StringBuffer append(boolean b);
		System.out.println(sb); 
	}
}