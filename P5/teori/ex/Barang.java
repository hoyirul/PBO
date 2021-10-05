public class Barang{
    private String name, domisili;
    private Orang orang;

    public Barang(){}

    public Barang(String name, String domisili){
        this.name = name;
        this.domisili = domisili;
    }

    public void setOrang(Orang orang){
        this.orang = orang;
    }

    public Orang getOrang(){
        return orang;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setDomisili(String domisili){
        if(domisili.equalsIgnoreCase("malang")){
            this.domisili = domisili;
        }else{
            this.domisili = errors();
            
        }
    }

    public String getDomisili(){
        return domisili;
    }

    public String errors(){
        return "Maaf domisili harus malang gan!!";
    }

    public void info(){
        line(40);
        System.out.println("Nama  : " + getName());
        System.out.println(orang.info());
        if(domisili.equalsIgnoreCase("malang")){
            System.out.println("Kota : " + getDomisili());
        }else{
            System.out.println("Kota : " + errors());
        }
        line(40);
    }

    public void line(int x){
        for(int i=0;i<x;i++){
            System.out.print("-");
        }
        System.out.println();
    }
}