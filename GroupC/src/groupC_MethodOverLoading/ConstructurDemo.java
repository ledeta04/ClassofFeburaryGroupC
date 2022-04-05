package groupC_MethodOverLoading;

class ConstructurDemo {
	
    double width;
    double height;                                                                
    double depth;
    
    ConstructurDemo(){
        width = 5;
        height = 10;
        depth = 3;
       }

    ConstructurDemo(double w,double h,double d){
        width = w;
        height = h;
        depth = d;
       }
    double volume(){
       return width * height * depth;
          }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructurDemo c = new ConstructurDemo();
		ConstructurDemo c1 = new ConstructurDemo(15,25,10);
		
		System.out.println(c.volume());
		System.out.println(c1.volume());
		
		
	}

}
