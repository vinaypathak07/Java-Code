class Test{
	public static void main(String[] args){
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());  //default initial capacity is 16
 
		sb.append("abcdefghijklmnop");  // appending 16 characters
		System.out.println(sb.capacity());// capacity still 16

		sb.append("q");      // appending 17 character 
		System.out.println(sb.capacity());// new capacity = (initial capacity+1) * 2

		sb.append("abcdefghijklmnop");
		sb.append("qr");  // appending 18 characters
		System.out.println(sb.capacity()); // new capacity becomes 70
	}
}