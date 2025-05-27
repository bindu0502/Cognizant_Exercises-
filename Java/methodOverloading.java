class methodOverloading {
    int add(int x,int y){
        return x+y;
    }
    double add(double x,double y){
        return x+y;
    }
    int add(int x,int y,int z){
        return x+y+z;
    }
    public static void main(String[] args) {
        methodOverloading a=new methodOverloading();
        System.out.println("2 int parameters "+a.add(12,18));
        System.out.println("2 double parameters "+a.add(23.8765,67.4261));
        System.out.println("3 int parameters "+a.add(23,57,12));

    }
    
}
