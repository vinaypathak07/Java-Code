// FunctionalInterface
interface Demo{
	public void myMeth(int x);
}
class FunctionalInterface{
	public static void main(String[] args){
		Demo d1,d2,d3;
		d1=(int x)->System.out.println("C");
		d2=(x)->System.out.println("C++");
		d3=x->System.out.println("Java");
		d1.myMeth(1);
		d2.myMeth(2);
		d3.myMeth(3);
	}
}