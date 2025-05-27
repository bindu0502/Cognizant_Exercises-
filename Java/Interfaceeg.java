interface Playable{
    void play();
}
class Guitar implements Playable{
    public void play(){
        System.out.println("I am a Guitar !!");
    }
} 
class Piano implements Playable{
    public void play(){
        System.out.println("I am a Piano !!");
    }
}
class Interfaceeg{
    public static void main(String args[]){
        //Playable g=new Guitar();
        Guitar g= new Guitar();//Both are valid
        Playable p=new Piano();
        g.play();
        p.play();
    }
}